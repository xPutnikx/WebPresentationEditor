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
	<div id="item">
			<ul>
			<c:forEach items="${tags}" var="tag">
				<li><a href="presentations?tag[]=${tag.name}"  style="color:rgb(162, 162, 162);">${tag.name}</a></li>
			</c:forEach>
		</ul>
		</div>
	<iframe src="http://mrdoob.com/lab/javascript/webgl/clouds/"
		width="2400" height="1240"
		style="margin-top: -250px; margin-left: -15px;"></iframe>

	<!-- Le javascript -->
	<jsp:include page="scripts.jsp"></jsp:include>
	<script type="text/javascript" src="resources/ring/jquery.js"></script>
	<script src="resources/ring/3DEngine.js" type="text/javascript"
		charset="utf-8"></script>
	<script src="resources/ring/Ring.js" type="text/javascript"
		charset="utf-8"></script>
		<script type="text/javascript">
		//<![CDATA[
		
		$(document).ready(function() {

			var camera = new Camera3D();
			camera.init(0,0,0,300);
			
			var container = $("#item");
			
			var item = new Object3D(container);

			item.addChild(new Ring(200, $("#item ul li").length));
			
			var scene = new Scene3D();
			scene.addToScene(item);
			
			
			var mouseX,mouseY = 0;
			var offsetX = $("#item").offset().left;
			var offsetY = $("#item").offset().top;
			var speed = 12000;
			
			$().mousemove(function(e){
				mouseX = e.clientX - offsetX - (container.width() / 2);
				mouseY = e.clientY - offsetY - (container.height() / 2);
			});
			
			axisRotation.x = 1.5;
			
			var animateIt = function(){
				if (mouseX != undefined){
					axisRotation.y += (mouseX) / speed;
				}
				
				scene.renderCamera(camera);
				
			};
			
			
			setInterval(animateIt, 20);
			
			
			});
		//]]>
	</script>
</body>
</html>