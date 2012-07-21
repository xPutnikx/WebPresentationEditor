<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
<meta charset="utf-8">
<title>User Page</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="by Putnik">

<!-- Le styles -->
<link href="resources/assets/css/bootstrap.css" rel="stylesheet">
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
<link rel="stylesheet" href="../res/css/jquery.ui.all.css">
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
<body>
	<div class="navbar navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container">
				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a> <a class="brand" href="../editor.html"> <i
					class="icon-white icon-edit"></i> Web Editor
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
				<!--/.nav-collapse -->
				<form class="navbar-search pull-left" action="">
					<i class="icon-white icon-search"></i><input id="searchbox"
						type="text" data-provide="typeahead" class="search-query span2"
						placeholder="Search">
				</form>
				<ul class="nav pull-right">
					<ul class="nav">
						<a class="btn dropdown-toggle" data-toggle="dropdown"> <i
							class="icon-user"></i> ${username} <span class="caret"></span>
						</a>
						<ul class="dropdown-menu">
							<li><a href="registrationform">Registration</a></li>
							<li><a href="loginform">Login</a></li>
							<li><a href="userpage"> <i class="icon-cog"></i> Profile
							</a></li>
							<li><a href="../j_spring_security_logout"> <i
									class="icon-off"></i> Logout
							</a></li>
							<c:if test="${userrole=='ROLE_ADMIN'}">
								<div>
									<p>
									<li><a href="list">Administration tools</a></li>
								</div>
							</c:if>

						</ul>
						</li>
					</ul>

				</ul>
			</div>
		</div>
	</div>

	<div class="container" style="margin-top: 20px;">


		<h1>Welcome ${username}</h1>
		<p></p>
		<p></p>
		<div class="demo">

			<div id="accordion"
				class="ui-accordion ui-widget ui-helper-reset ui-accordion-icons"
				role="tablist">
				<h3
					class="ui-accordion-header ui-helper-reset ui-state-active ui-corner-top"
					role="tab" aria-expanded="true" aria-selected="true" tabindex="0">
					<span class="ui-icon ui-icon-triangle-1-s"></span><a href="#">Information</a>
				</h3>
				<div
					class="ui-accordion-content ui-helper-reset ui-widget-content ui-corner-bottom ui-accordion-content-active"
					style="height: 103px; display: block; overflow: auto; padding-top: 11px; padding-bottom: 11px; color: transpanent;"
					role="tabpanel">

					<p style="color: white;">Nickname : ${username}</p>
					<p style="color: white;">Role : ${userrole}</p>
				</div>
				<h3
					class="ui-accordion-header ui-helper-reset ui-state-default ui-corner-all"
					role="tab" aria-expanded="false" aria-selected="false"
					tabindex="-1">
					<span class="ui-icon ui-icon-triangle-1-e"></span><a href="#">Storage</a>
				</h3>
				<div
					class="ui-accordion-content ui-helper-reset ui-widget-content ui-corner-bottom"
					style="height: 103px; overflow: auto; display: none; padding-top: 11px; padding-bottom: 11px; color: transpanent;"
					role="tabpanel">
					<a href="mypresentations" class="btn btn-danger" rel="popover"
						data-content="And here's some amazing content. It's very engaging. right?"
						data-original-title="A Title">Go to storage</a>
				</div>
				<h3
					class="ui-accordion-header ui-helper-reset ui-state-default ui-corner-all"
					role="tab" aria-expanded="false" aria-selected="false"
					tabindex="-1">
					<span class="ui-icon ui-icon-triangle-1-e"></span><a href="#">Change
						Password</a>
				</h3>
				<div
					class="ui-accordion-content ui-helper-reset ui-widget-content ui-corner-bottom"
					style="height: 103px; overflow: auto; display: none; padding-top: 11px; padding-bottom: 11px; color: transpanent;"
					role="tabpanel">
					<a href="changepassword" class="btn btn-danger" rel="popover"
						data-content="And here's some amazing content. It's very engaging. right?"
						data-original-title="A Title">Accept</a>
				</div>
			</div>

		</div>


	</div>
	<script src="resources/assets/js/jquery.js"></script>
	<script src="resources/jquery-ui-1.8.21.custom.min.js"></script>
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
	<script>
	$(function() {
		$( "#accordion" ).accordion({
			event: "mouseover"
		});
	});
	</script>

</body>
</html>