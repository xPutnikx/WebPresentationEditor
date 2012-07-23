<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>WebEditor: Registration</title>

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
	<div class="container" style="width: 800px">
		<form:form method="Post" action="register" commandName="registration"
			style="width: 230px; margin-left: auto; margin-right: auto;">
			<div class="well"
				style="color: black; width: 500px; height: 150px; margin-left: -150px;">
				<div style="margin-top:10px;">
				<b style="margin-right:40px;">User Name:</b>
				<form:input path="name" style="margin-right:5px;"/><font color="red"><form:errors path="name" /></font>
				</div>
		
				<div style="margin-top:10px;">
				<b  style="margin-right:49px;">Password:</b>
				<form:password path="password"  style="margin-right:5px;"/><font color="red"><form:errors
						path="password" /></font>
				</div>
			
				<div style="margin-top:10px;">
				<b>Confirm Password:</b>
				<form:password path="confirmPassword" style="margin-right:5px;"/>
				<font color="red"><form:errors
						path="confirmPassword" /></font>
				</div>
				<div style="margin-top:10px;">
				<b style="margin-right:74px;">Email:</b>
				<form:input path="email" style="margin-right:5px;" />
				<font color="red"><form:errors path="email" /></font>
				</div>
			</div>
			<input type="submit" class="btn primary" value="Submit"
				style="margin-left: 320px;" />
		</form:form>
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

</body>
</html>
