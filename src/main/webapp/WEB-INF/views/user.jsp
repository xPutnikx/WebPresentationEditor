<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>WebEditor: User</title>

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
					<li><a href="presentations"><spring:message
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

	<div class="container" style="width: 520px">
		<section>
			<div class="page-header">
				<h1 style="margin-left: 20px">
					<spring:message code="lbl.user" />
					: ${userName}
				</h1>
			</div>
			<p>
				<b><spring:message code="lbl.user" />: </b>${userName}
			</p>
			<p>
				<b><spring:message code="lbl.presentationcount" />: </b>${userPresentationCount}
			</p>
			<table class="table table-striped" style="width: 520;">
				<thead>
					<tr>
						<th style="width: 190px"><spring:message code="lbl.title" /></th>
						<th style="width: 330px"><spring:message
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
		</section>
	</div>
	<!-- /container -->

	<!-- Le javascript -->
	<jsp:include page="scripts.jsp"></jsp:include>

</body>
</html>
