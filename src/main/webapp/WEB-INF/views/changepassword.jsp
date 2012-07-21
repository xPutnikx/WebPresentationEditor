<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
</head>

<div class="navbar navbar-fixed-top">
	<div class="navbar-inner">
		<div class="container">
			<a class="btn btn-navbar" data-toggle="collapse"
				data-target=".nav-collapse"> <span class="icon-bar"></span> <span
				class="icon-bar"></span> <span class="icon-bar"></span>
			</a> <a class="brand" href="../editor.html"> <i
				class="icon-white icon-edit"></i> Web editor
			</a>
			<div class="nav-collapse">
				<ul class="nav">
					<li><a href="home"> <i class="icon-white icon-home"></i>
							Home
					</a></li>
					<li><a href="about"> <i class="icon-white icon-book"></i>
							About
					</a></li>
					<li><a href="contact"> <i class="icon-white icon-pencil"></i>
							Contact
					</a></li>
					<li><a href="listOfPresentations"> <i
							class="icon-white icon-picture"></i> List of Presentations
					</a></li>
				</ul>
			</div>
			<form class="navbar-search pull-left" action="">
				<i class="icon-white icon-search"></i><input type="text"
					class="search-query span2" placeholder="Search">
			</form>
			<ul class="nav pull-right">
				<ul class="nav">
					<a class="btn dropdown-toggle" data-toggle="dropdown"> <i
						class="icon-user"></i> ${username} <span class="caret"></span>
					</a>
					<ul class="dropdown-menu">
						<li><a href="userpage"> <i class="icon-cog"></i> Profile
						</a></li>
						<li><a href="../j_spring_security_logout"> <i
								class="icon-off"></i> Logout
						</a></li>
					</ul>
					</li>
				</ul>
			</ul>
		</div>
	</div>
</div>
<div class="container" style="margin-top: 20px;">
	<h1>${username} change your password</h1>
	<input type=hidden id="userPassword" name="userPassword"
		value="${password}" /> <input type=hidden id="userId" name="userId"
		value="${id}" />
	<form:form method="Post" action="changepassword"
		commandName="changepassword" style="margin-top: 40px;">
		<div class="well" style="color: black;">
			Current password<br /> <input type="password" id="currentpassword" />
		</div>
		<div class="well" style="color: black;">
			New password<br /> <input type="password" id="newpassword" />
		</div>
		<div class="well" style="color: black;">
			Confirm password<br /> <input type="password" id="confirmpassword" />
		</div>
		<input class="btn" value="Save" onclick="sub()" />
	</form:form>
</div>
<div
	style="display: none; z-index: 1000; outline: 0px; position: absolute; background-color: whiteSmoke;"
	class="ui-dialog ui-widget ui-widget-content-error ui-corner-all ui-draggable ui-resizable"
	tabindex="-1" role="dialog" aria-labelledby="ui-dialog-title-dialog">
	<div
		class="ui-dialog-titlebar ui-widget-header ui-corner-all ui-helper-clearfix" >
		<span class="ui-dialog-title" id="ui-dialog-title-dialog">Basic
			dialog</span><a href="#" class="ui-dialog-titlebar-close ui-corner-all"
			role="button"><span class="ui-icon ui-icon-closethick">close</span></a>
	</div>
	<div id="dialog" style="" class="ui-dialog-content ui-widget-content" style="background-color: whiteSmoke;">
		<p></p>
	</div>
	<div class="ui-resizable-handle ui-resizable-n" style="z-index: 1000;"></div>
	<div class="ui-resizable-handle ui-resizable-e" style="z-index: 1000;"></div>
	<div class="ui-resizable-handle ui-resizable-s" style="z-index: 1000;"></div>
	<div class="ui-resizable-handle ui-resizable-w" style="z-index: 1000;"></div>
	<div
		class="ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se ui-icon-grip-diagonal-se"
		style="z-index: 1000;"></div>
	<div class="ui-resizable-handle ui-resizable-sw" style="z-index: 1000;"></div>
	<div class="ui-resizable-handle ui-resizable-ne" style="z-index: 1000;"></div>
	<div class="ui-resizable-handle ui-resizable-nw" style="z-index: 1000;"></div>
</div>
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
</body>
</html>