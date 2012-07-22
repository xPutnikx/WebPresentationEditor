<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Change Password</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="by Putnik">
<link href="resources/assets/css/bootstrap.css" rel="stylesheet">
<link rel="stylesheet" href="../res/css/jquery.ui.all.css">
<style>
body {
	padding-top: 60px;
}
</style>
<style>
a {
	text-decoration: none;
}
</style>
<link href="resources/assets/css/bootstrap-responsive.css"
	rel="stylesheet">
<link rel="shortcut icon" href="resources/assets/ico/favicon.ico">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="resources/assets/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="resources/assets/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="resources/assets/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="resources/assets/ico/apple-touch-icon-57-precomposed.png">
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
							onClick="window.location='login'; return false;">Log in</button>
						<button class="btn" type="submit"
							onClick="window.location='register'; return false;">Register</button>
					</form>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
</div>

<div class="container" style="width: 500px;">
	<h1>${username} change your password</h1>
	<input type=hidden id="userPassword" name="userPassword"
		value="${password}" /> <input type=hidden id="userId" name="userId"
		value="${id}" />
	<form:form method="Post" action="changepassword"
		commandName="changepassword" style="margin-top:40px;">
		<div class="well" style="color: black; width: 500px; height: 40px;">
			<div style="float: left;">
				Current password<br /> <input type="password" id="currentpassword"
					style="margin-top: 10px;" />
			</div>
			<div style="float: left; margin-top: 25px;" id="currentlabel"></div>
		</div>
		<div class="well" style="color: black; width: 500px; height: 40px;">
			<div style="float: left;">
				New password<br /> <input type="password" id="newpassword"
					style="margin-top: 10px;" />
			</div>
			<div style="float: left; margin-top: 25px;" id="newtlabel"></div>
		</div>
		<div class="well" style="color: black; width: 500px; height: 40px;">
			<div style="float: left;">
				Confirm password<br /> <input type="password" id="confirmpassword"
					style="margin-top: 10px;" />
			</div>
			<div style="float: left; margin-top: 25px;" id="confirmlabel"></div>
		</div>
		<input class="btn" value="Save" onclick="sub()" style="width: 60px;" />
	</form:form>
</div>
<script src="resources/assets/js/jquery.js"></script>
<script src="resources/assets/js/bootstrap-transition.js"></script>
<script src="resources/assets/js/bootstrap-alert.js"></script>
<script src="resources/assets/js/bootstrap-modal.js"></script>
<script src="resources/assets/js/bootstrap-dropdown.js"></script>
<script src="resources/assets/js/bootstrap-scrollspy.js"></script>
<script src="resources/assets/js/bootstrap-tab.js"></script>
<script src="resources/assets/js/bootstrap-tooltip.js"></script>
<script src="resources/assets/js/bootstrap-twipsy.js"></script>
<script src="resources/assets/js/bootstrap-popover.js"></script>
<script src="resources/assets/js/bootstrap-button.js"></script>
<script src="resources/assets/js/bootstrap-collapse.js"></script>
<script src="resources/assets/js/bootstrap-carousel.js"></script>
<script src="resources/assets/js/bootstrap-typeahead.js"></script>
<script src="resources/changepassword.js"></script>
<script src="resources/jquery.ui.core.js"></script>
<script src="resources/jquery.ui.widget.js"></script>
<script src="resources/jquery.ui.mouse.js"></script>
<script src="resources/jquery.ui/jquery.ui.button.js"></script>
<script src="resources/jquery.ui/jquery.ui.draggable.js"></script>
<script src="resources/jquery.ui/jquery.ui.position.js"></script>
<script src="resources/jquery.ui/jquery.ui.resizable.js"></script>
<script src="resources/jquery.ui/jquery.ui.dialog.js"></script>
<script src="resources/jquery.ui/jquery.effects.core.js"></script>
<script src="resources/jquery-ui-1.8.21.custom.min.js"></script>
<script src="resources/assets/js/less-1.1.5.min.js"></script>
<script src="resources/assets/js/bootstrap-buttons.js"></script>
<script src="resources/assets/js/bootstrap-modal.js"></script>
<script src="resources/assets/js/bootstrap-tabs.js"></script>
<script src="resources/jquery.ba-dotimeout.js"></script>

</body>
</html>