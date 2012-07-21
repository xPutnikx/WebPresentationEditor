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
</head>

<body>
	<div class="topbar">
		<div class="fill">
			<div class="container" style="width: 760px">
				<a class="brand" href="../editor.html">Web Editor</a>
				<ul class="nav">
					<li><a href="home">Home</a></li>
					<li><a href="presentation/show">Presentations</a></li>
					<li><a href="about">About</a></li>
				</ul>
				<form class="navbar-search pull-left" action="presentations/show?title=asd">
                    <input type="text" class="search-query" style="margin-top:3px;width:120px" placeholder="Search">
                </form>				
				<c:choose>
					<c:when test="${authenticated}">
						<form class="pull-right">
							<button class="btn" type="submit"
								onClick="window.location='../j_spring_security_logout'; return false;">Log
								out</button>
						</form>
						<p class="pull-right" style="margin-right: 10px">
							Logged in as <a href="#">${userName}</a>
						</p>
					</c:when>
					<c:otherwise>
						<form class="pull-right">
							<button class="btn" type="submit"
								onClick="window.location='login'; return false;">Log in</button>
							<button class="btn" type="submit"
								onClick="window.location='register'; return false;">Register</button>
						</form>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
	</div>

	<div class="container" style="width: 800px">
		<form name='f' action="<c:url value='../j_spring_security_check' />"
			method='POST'
			style="width: 360px; margin-left: auto; margin-right: auto;">
			<div style="margin-left: -60px">
				<br />
				<p>
					<label>Username:</label> <input type='text' name='j_username'
						style="margin-left: 10px" />
				</p>
				<br />
				<p>
					<label>Password:</label> <input type='password' name='j_password'
						style="margin-left: 10px" />
				</p>
				<br />
				<div style="float: right; margin-right: 60px;">
					<input name="submit" class="btn primary" type="submit"
						value="Log in" />
				</div>
			</div>
		</form>
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
