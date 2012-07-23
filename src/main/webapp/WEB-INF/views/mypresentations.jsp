<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>My Presentations</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="by Putnik">
<style>
   a { 
    text-decoration: none;
   } 
  </style>
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
<div class="topbar">
		<div class="fill">
			<div class="container" style="width: 760px">
				<a class="brand" href="../editor.html">Web Editor</a>
				<ul class="nav">
					<li class="active"><a href="home"><spring:message code="btn.home"/></a></li>
					<li><a href="presentations"><spring:message code="btn.presentations"/></a></li>
					<li><a href="about"><spring:message code="btn.about"/></a></li>
				</ul>
				<c:choose>
					<c:when test="${authenticated}">
						<form class="pull-right">
							<button class="btn" type="submit"
								onClick="window.location='../j_spring_security_logout'; return false;"><spring:message code="btn.logout"/></button>
						</form>
						<p class="pull-right" style="margin-right: 10px">
							<spring:message code="lbl.loggedinas"/><a href="userpage">${userName}</a>
						</p>
					</c:when>
					<c:otherwise>
						<form class="pull-right">
							<button class="btn" type="submit"
								onClick="window.location='login'; return false;"><spring:message code="btn.login"/></button>
							<button class="btn" type="submit"
								onClick="window.location='register'; return false;"><spring:message code="btn.registration"/></button>
						</form>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
	</div>

<div class="container">
	<h1>My Presentations</h1>
	<div class="tabbable" style="margin-bottom: 18px;">
			<ul class="nav nav-tabs">
				<li class="active"><a href="#tab1" data-toggle="tab">
						Presentations</a></li>
			</ul>
			<div class="tab-content"
				style="padding-bottom: 9px; border-bottom: 1px solid #ddd;">
				<div class="tab-pane active" id="tab1">
					<div class="span9">

						<ul class="thumbnails">
						<div class="span9">
						<ul class="thumbnails">
							<c:forEach items="${presentation}" var="v_present">
							<c:if test="${v_present.userId==id}">
								<li class=span3><a
									href="/webeditor/preview.jsp?id=${v_present.id}" class=thumbnail>
										<img
										src=http://icons.iconarchive.com/icons/zyotism/digital-video-techniques/128/Slide-Show-icon.png
										alt="">
								</a></li>
								</c:if>
							</c:forEach>
							
						</ul>
					</div>
						
							</ul>
					</div>
				</div>
			</div>
		</div>
</div>


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