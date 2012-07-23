<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
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
</head>
<body>
	<div class="topbar">
		<div class="fill">
			<div class="container" style="width: 760px">
				<a class="brand" href="../editor.html">Web Editor</a>
				<ul class="nav">
					<li class="active"><a href="home"><spring:message
								code="btn.home" /></a></li>
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
	<div class="container" style="width: 800px">

		<!-- Main hero unit for a primary marketing message or call to action -->
		<div class="hero-unit" style="">
			<h1>Web Editor</h1>
			<p>
				<spring:message code="text.createproject" />
			</p>
			<p>
				<a href="https://github.com/xPutnikx/WebPresentationEditor"
					class="btn primary large"><spring:message
						code="text.visitthegithub" /> &raquo;</a>
			</p>
		</div>

		<!-- Example row of columns -->
		<div class="row">
			<div class="span-one-third" style="width: 250px">
				<h2>
					<spring:message code="text.basedonbootstrap" />
				</h2>
				<p>
					<spring:message code="text.aboutbootstrap" />
				</p>
				<p>
					<a class="btn" href="http://twitter.github.com/bootstrap"><spring:message
							code="btn.viewdetails" /> &raquo;</a>
				</p>
			</div>
			<div class="span-one-third" style="width: 250px">
				<h2>
					<spring:message code="btn.builtwithStrut" />
				</h2>
				<p>
					<spring:message code="lbl.Strut" />
				</p>
				<p>
					<a class="btn" href="https://github.com/tantaman/Strut"><spring:message
							code="btn.viewdetails" /> &raquo;</a>
				</p>
			</div>
			<div class="span-one-third" style="width: 250px">
				<h2>
					<spring:message code="btn.tryit" />
				</h2>
				<p>
					<spring:message code="lbl.createyourpresentations" />
					.
				</p>
				<p>
					<a class="btn primary" href="presentation/show"><spring:message
							code="btn.presentations" /> &raquo;</a>
				</p>
			</div>

		</div>

		<footer>

			<div style="float: left">&copy; Web Editor 2012</div>
			<div style="float: right">
				Language: <a href="?lang=en">English</a> | <a href="?lang=ru">Russian</a></span>
			</div>

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
