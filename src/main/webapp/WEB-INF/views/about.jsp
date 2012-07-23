<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>WebEditor: About</title>
<!-- Le styles -->
<link href="resources/assets/css/bootstrap.css" rel="stylesheet">
<link href="resources/ring/ring.css" rel="stylesheet">
<link href="resources/assets/css/bootstrap-responsive.css"
	rel="stylesheet">
<style type="text/css">
body {
	padding-top: 60px;
}
</style>
<style>
a {
	text-decoration: none;
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
					<li class="active"><a href="about"><spring:message
								code="btn.about" /></a></li>
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
	<div id="item">
			<c:forEach items="${tags}" var="tag">
				<li><a href="presentations?tag[]=${tag.name}"  style="color:rgb(162, 162, 162);">${tag.name}</a></li>
			</c:forEach>
		</div>
	<iframe src="http://mrdoob.com/lab/javascript/webgl/clouds/"
		width="1800" height="1240"
		style="margin-top: -250px; margin-left: -15px;"></iframe>

	<!-- Le javascript -->
<script src="resources/assets/js/jquery.js"></script>
	<script src="resources/assets/js/bootstrap-transition.js"></script>
	<script src="resources/assets/js/bootstrap-alert.js"></script>
	<script src="resources/assets/js/bootstrap-modal.js"></script>
	<script src="resources/assets/js/bootstrap-dropdown.js"></script>
	<script src="resources/assets/js/bootstrap-scrollspy.js"></script>
	<script src="resources/assets/js/bootstrap-tab.js"></script>
	<script src="resources/assets/js/bootstrap-tooltip.js"></script>
	<script src="resources/assets/js/bootstrap-popover.js"></script>
	<script src="resources/assets/js/bootstrap-button.js"></script>
	<script src="resources/assets/js/bootstrap-collapse.js"></script>
	<script src="resources/assets/js/bootstrap-carousel.js"></script>
	<script src="resources/assets/js/bootstrap-typeahead.js"></script>
	<script type="text/javascript" src="resources/sphere/JQuery.js"></script>
	<script src="resources/sphere/3DEngine.js" type="text/javascript"
		charset="utf-8"></script>
	<script src="resources/sphere/Sphere.js" type="text/javascript"
		charset="utf-8"></script>
	<script type="text/javascript">
		$(document).ready(function() {

			var camera = new Camera3D();
			camera.init(0, 0, 0, 150);

			var container = $("#item")

			var item = new Object3D(container);

			item.addChild(new Sphere(100, 10, 100));

			var scene = new Scene3D();
			scene.addToScene(item);

			var mouseX, mouseY = 0;
			var offsetX = $("#item").offset().left;
			var offsetY = $("#item").offset().top;
			var speed = 50000;

			$().mousemove(function(e) {
				mouseX = e.clientX - offsetX - (container.width() / 2);
				mouseY = e.clientY - offsetY - (container.height() / 2);
			});

			var animateIt = function() {
				if (mouseX != undefined) {
					axisRotation.y += (mouseX) / speed
				}
				if (mouseY != undefined) {
					axisRotation.x -= mouseY / speed;
				}

				scene.renderCamera(camera);

			};

			setInterval(animateIt, 20);

		});
	</script>
</body>
</html>