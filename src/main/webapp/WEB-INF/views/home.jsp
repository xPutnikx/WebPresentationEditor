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
					<li class="active"><a href="home">Home</a></li>
					<li><a href="presentations">Presentations</a></li>
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

		<!-- Main hero unit for a primary marketing message or call to action -->
		<div class="hero-unit" style="">
			<h1>Web Editor</h1>
			<p>This project allows you to create an extensible, maintainable,
				and clean presentations based on ImpressJS engine.</p>
			<p>
				<a href="https://github.com/xPutnikx/WebPresentationEditor"
					class="btn primary large">Visit the github project &raquo;</a>
			</p>
		</div>

		<!-- Example row of columns -->
		<div class="row">
			<div class="span-one-third" style="width: 250px">
				<h2>Based on Bootstrap</h2>
				<p>Bootstrap is based on Twitter's excellent Bootstrap, as the
					name might indicate.</p>
				<p>
					<a class="btn" href="http://twitter.github.com/bootstrap">View
						details &raquo;</a>
				</p>
			</div>
			<div class="span-one-third" style="width: 250px">
				<h2>Built with Strut</h2>
				<p>Strut is a powerfull tool for creating presentations with ImpressJS.</p>
				<p>
                    <a class="btn" href="https://github.com/tantaman/Strut">View
                        details &raquo;</a>
                </p>
			</div>
			<div class="span-one-third" style="width: 250px">
                <h2>Try it</h2>
                <p>You can easily run preview for presentations. Choose your favorite one and enjoy.</p>
                <p><a class="btn primary" href="presentation/show">Presentations &raquo;</a></p>
            </div>
			
		</div>

		<footer>
			<p>&copy; Web Editor 2012</p>
		</footer>

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
