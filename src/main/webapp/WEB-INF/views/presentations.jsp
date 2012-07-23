<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>WebEditor: Presentations</title>

<!-- Le styles -->
<link href="resources/assets/css/bootstrap.css" rel="stylesheet">
<style type="text/css">
body {
	padding-top: 60px;
}
</style>

<!-- Le fav and touch icons -->
<link rel="shortcut icon" href="resources/assets/ico/favicon.ico">
<link rel="apple-touch-icon"
	href="resources/assets/ico/apple-touch-icon.png">
<link rel="apple-touch-icon" sizes="72x72"
	href="resources/assets/ico/apple-touch-icon-72x72.png">
<link rel="apple-touch-icon" sizes="114x114"
	href="resources/assets/ico/apple-touch-icon-114x114.png">
</head>

<body>
	<div class="topbar">
		<div class="fill">
			<div class="container" style="width: 760px">
				<a class="brand" href="../editor.html">Web Editor</a>
				<ul class="nav">
					<li><a href="home"><spring:message code="btn.home" /></a></li>
					<li class="active"><a href="presentations"><spring:message
								code="btn.presentations" /></a></li>
					<li><a href="about"><spring:message code="btn.about" /></a></li>
				</ul>
				<form class="navbar-search pull-left" action="presentations">
                    <input type="text" class="search-query" id="search-input" name="title"
                        style="margin-top: 3px; width: 120px" placeholder="Search">
                </form>
				<c:choose>
					<c:when test="${authenticated}">
						<form class="pull-right">
							<button class="btn" type="submit"
								onClick="window.location='../j_spring_security_logout'; return false;">
								<spring:message code="btn.logout" />
							</button>
						</form>
						<p class="pull-right" style="margin-right: 10px">
							<spring:message code="lbl.loggedinas" />
							<a href="userpage">${userName}</a>
						</p>
					</c:when>
					<c:otherwise>
						<form class="pull-right">
							<button class="btn" type="submit"
								onClick="window.location='login'; return false;">
								<spring:message code="btn.login" />
							</button>
							<button class="btn" type="submit"
								onClick="window.location='register'; return false;">
								<spring:message code="btn.registration" />
							</button>
						</form>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
	</div>

	<div class="container" style="width: 800px">
		<div style="width: 255px; float: left; color: black;">
			<form class="well">
				<label style="width: 0"><spring:message code="lbl.title" />:</label><br />
				<br />
				<textarea id="title-text-area" rows="1"></textarea>
				<br /> <label style="width: 0"><spring:message
						code="lbl.tags" />:</label><br />
				<br />
				<textarea id="tags-text-area" rows="3"></textarea>
				<br />
				<button id="search-btn" type="submit" class="btn primary">
					<spring:message code="btn.search" />
				</button>
			</form>
		</div>
		<div style="float: left; margin-left: 20px">
			<table class="table table-striped"
				style="width: 460; margin-top: -10px;">
				<thead>
					<tr>
						<th style="width: 160px"><spring:message code="lbl.title" /></th>
						<th style="width: 300px"><spring:message
								code="lbl.description" /></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${presentations}" var="presentation">
						<tr>
							<td><a href="presentation?id=${presentation.id}">${presentation.title}</a></td>
							<td>${presentation.description}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	<!-- /container -->

	<!-- Le javascript -->
	<script src="resources/assets/js/jquery.js"></script>
	<script src="resources/assets/js/less-1.1.5.min.js"></script>
	<script src="resources/assets/js/bootstrap-alerts.js"></script>
	<script src="resources/assets/js/bootstrap-buttons.js"></script>
	<script src="resources/assets/js/bootstrap-dropdown.js"></script>
	<script src="resources/assets/js/bootstrap-modal.js"></script>
	<script src="resources/assets/js/bootstrap-scrollspy.js"></script>
	<script src="resources/assets/js/bootstrap-tabs.js"></script>
	<script src="resources/assets/js/bootstrap-twipsy.js"></script>
	<script src="resources/assets/js/jquery-textext-1.3.0.js"></script>

	<script type="text/javascript">
		$('#title-text-area').textext({});

		$('#tags-text-area').textext({
			plugins : 'autocomplete tags ajax',
			tagsItems : new String('${tagsAreaValue}').split(','),
			ajax : {
				type : 'POST',
				url : 'presentations',
				dataType : 'json',
				dataCallback : function(query) {
					return {
						'query' : query
					}
				}
			}
		});

		$('#title-text-area').val('${titleAreaValue}');

		$("#search-btn").click(
				function() {
					function buildTitleURI() {
						var titleParam = {
							title : JSON.parse('"' + titleText + '"')
						};
						return decodeURIComponent($.param(titleParam));
					}

					function buildTagsURI() {
						var tagsParam = {
							tag : JSON.parse(tagsText)
						};
						return decodeURIComponent($.param(tagsParam));
					}

					var titleTextArea = $("#title-text-area");
					var titleText = $.trim(titleTextArea.val());
					var tagsTextArea = $("#tags-text-area");
					var tagsText = $.trim(tagsTextArea.textext()[0]
							.hiddenInput().val());

					if (titleText.length != 0 && tagsText.length != 2) {
						window.location = 'presentations?' + buildTitleURI()
								+ '&' + buildTagsURI();
					} else if (titleText.length == 0 && tagsText.length != 2) {
						window.location = 'presentations?' + buildTagsURI();
					} else if (titleText.length != 0 && tagsText.length == 2) {
						window.location = 'presentations?' + buildTitleURI();
					} else {
						window.location = 'presentations';
					}

					return false;
				});
	</script>
</body>
</html>
