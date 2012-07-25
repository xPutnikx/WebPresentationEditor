<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>WebEditor: Home</title>

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
<link rel="apple-touch-icon" sizes="114x114"
	href="resources/assets/img/glyphicons-halfings.png">
</head>

<body>
	<div class="topbar">
		<div class="fill">
			<div class="container" style="width: 760px">
				<a class="brand" href="../editor.html"><spring:message
						code="btn.webeditor" /></a>
				<ul class="nav">
					<li><a href="home"><spring:message code="btn.home" /></a></li>
					<li><a href="presentation/show"><spring:message
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
								onClick="window.location='../j_spring_security_logout'; return false;">
								<spring:message code="btn.logout" />
							</button>
						</form>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
	</div>
	<div class="container" style="width: 500px;">
		<section>
			<div class="page-header">
				<h1 style="margin-left: 20px">
					<spring:message code="lbl.information" />
				</h1>
			</div>
			<div class="well">
				<p style="color: #1D2A5B">
					<spring:message code="lbl.nickname" />
					: ${userName}
				</p>
				<p style="color: #1D2A5B">
					<spring:message code="lbl.role" />
					: ${userrole}
				</p>
			</div>
			<div class="well">
				<p style="font-size: 13px;">
					<spring:message code="lbl.listwithmypresentations" />
					: <a href="user?id=${userId}" class="btn"><spring:message
							code="btn.mypresentations" /></a>
				</p>
			</div>

			<div class="well">

				<p style="font-size: 13px;">
					<spring:message code="lbl.changepassword" />
					: <a href="changepassword" class="btn"><spring:message
							code="btn.accept" /></a>
				</p>
			</div>
		</section>
		<div class="page-header"></div>
		<c:if test="${userrole=='ROLE_ADMIN'}">
			<div>
				<p>
					<button class="btn" type="submit"
						onClick="window.location='list'; return false;">
						<spring:message code="btn.administrationtools" />
					</button>
			</div>
		</c:if>
	</div>
	<jsp:include page="scripts.jsp"></jsp:include>
	<script src="resources/jquery-ui-1.8.21.custom.min.js"></script>
</body>
</html>