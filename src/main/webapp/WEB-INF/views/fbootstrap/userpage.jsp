<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
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
				<a class="brand" href="../editor.html">Web Editor</a>
				<ul class="nav">
					<li class="active"><a href="home">Home</a></li>
					<li><a href="presentation/show">Presentations</a></li>
					<li><a href="about">About</a></li>
				</ul>
				<c:choose>
					<c:when test="${authenticated}">
						<form class="pull-right">
							<button class="btn" type="submit"
								onClick="window.location='../j_spring_security_logout'; return false;">Log
								out</button>
						</form>
						<p class="pull-right" style="margin-right: 10px">
							Logged in as <a href="userpage">${userName}</a>
						</p>
					</c:when>
					<c:otherwise>
						<form class="pull-right">
							<button class="btn" type="submit"
								onClick="window.location='../j_spring_security_logout'; return false;">Logout</button>
						</form>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
	</div>


	<div class="container" style="width:500px;">
		<section>
			<div class="page-header">
				<h1 style="margin-left: 20px">Information</h1>
			</div>
			<div class="well">
			<p style="color: #1D2A5B">Nickname : ${userName}</p>
			<p style="color: #1D2A5B">Role : ${userrole}</p>
			</div>
			<div class="well">
			<p style="font-size: 13px;">
				List with My Presentations: <a href="mypresentations" class="btn">My
					Presentations</a>
			</p>
			</div>
			
			<div class="well">

			<p style="font-size: 13px;">
				Change password: <a href="changepassword" class="btn">Accept</a>
			</p>
			</div>
		</section>
		<div class="page-header" ></div>
		<c:if test="${userrole=='ROLE_ADMIN'}">
			<div>
				<p>
					<button class="btn" type="submit"
						onClick="window.location='list'; return false;">Administration
						tools</button>
			</div>
		</c:if>
	</div>
	<script src="resources/assets/js/jquery.js"></script>
	<script src="resources/jquery-ui-1.8.21.custom.min.js"></script>
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