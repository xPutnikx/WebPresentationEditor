<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>WebEditor: Presentation</title>

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

	<!-- Facebook -->
	<div id="fb-root"></div>
	<script>
		(function(d, s, id) {
			var js, fjs = d.getElementsByTagName(s)[0];
			if (d.getElementById(id))
				return;
			js = d.createElement(s);
			js.id = id;
			js.src = "//connect.facebook.net/en_US/all.js#xfbml=1";
			fjs.parentNode.insertBefore(js, fjs);
		}(document, 'script', 'facebook-jssdk'));
	</script>

	<div class="topbar">
		<div class="fill">
			<div class="container" style="width: 760px">
				<a class="brand" href="../editor.html">Web Editor</a>
				<ul class="nav">
					<li><a href="home"><spring:message code="btn.home" /></a></li>
					<li><a href="presentations"><spring:message
								code="btn.presentations" /></a></li>
					<li><a href="about"><spring:message code="btn.about" /></a></li>
				</ul>
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
	<div class="container" style="width: 520px">
		<section>
			<div class="page-header">
				<h1 style="margin-left: 20px">
					<spring:message code="lbl.presentation" />
					: ${presentationTitle}
				</h1>
			</div>
			<div class="well">
				<p>
					<b><spring:message code="lbl.title" />: </b>${presentationTitle}
				</p>
				<p>
					<b><spring:message code="lbl.author" />: </b>${presentationUser}
				</p>
				<p>
				<div style="float: left;">
					<b><spring:message code="lbl.tags" />:</b>&nbsp
				</div>
				<div>
					<ul style="display: inline; list-style-type: none;">
						<c:forEach items="${presentationTags}" var="tag">
							<li style="float: left"><a
								href="presentations?tag[]=${tag.name}">${tag.name}</a>&nbsp</li>
						</c:forEach>
					</ul>
				</div>
				</p>
				<div style="clear: both;">
					<a class="btn primary" style="margin-top: 10px;"
						href="../preview.jsp?id=${presentationId}" target="_blank" >Preview</a>
					<c:if test="${isAuthor}">
					   <a class="btn" style="margin-top: 10px;" onclick="del(${presentationId});" >Delete</a>
					</c:if>
				</div>
			</div>
			<p>
			<div class="fb-like" style="clear: both;"
				data-href="/presentation?id=${presentationId}" data-send="false"
				data-width="450" data-show-faces="false"></div>
			</p>
			<div class="fb-comments"
				data-href="/presentation?id=${presentationId}" data-num-posts="4"
				data-width="520"></div>

		</section>
	</div>
	<!-- /container -->

	<!-- Le javascript -->
	<script src="resources/assets/js/jquery.js"></script>
	<script src="resources/jquery.ba-dotimeout.js"></script>
	<script src="resources/assets/js/less-1.1.5.min.js"></script>
	<script src="resources/assets/js/bootstrap-alerts.js"></script>
	<script src="resources/assets/js/bootstrap-buttons.js"></script>
	<script src="resources/assets/js/bootstrap-dropdown.js"></script>
	<script src="resources/assets/js/bootstrap-modal.js"></script>
	<script src="resources/assets/js/bootstrap-scrollspy.js"></script>
	<script src="resources/assets/js/bootstrap-tabs.js"></script>
	<script src="resources/assets/js/bootstrap-twipsy.js"></script>
	<script src="resources/deletepresentation.js"></script>

</body>
</html>
