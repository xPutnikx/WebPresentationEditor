<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Web Editor Registration</title>
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
					<i class="icon-white icon-search"></i><input type="text"
						class="search-query span2" placeholder="Search">
				</form>
				<ul class="nav pull-right">
					<ul class="nav">
						<a class="btn dropdown-toggle" data-toggle="dropdown"> <i
							class="icon-user"></i> Account <span class="caret"></span>
						</a>
						<ul class="dropdown-menu">
							<li><a href="loginform">Login</a></li>
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
 <div class="container" style="width:500px;">

		<h3>mail with a unique key to confirm the registration be sent to
			your e-mail</h3>
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