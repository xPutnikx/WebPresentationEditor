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
				</a> <a class="brand" href="../editor.html">
				<i class="icon-white icon-edit"></i> Web Editor</a>
				<div class="nav-collapse">
					<ul class="nav">
						<li><a href="home">
						<i class="icon-white icon-home"></i> Home</a></li>
						<li><a href="about">
						<i class="icon-white icon-book"></i> About</a></li>
						<li><a href="contact">
						<i class="icon-white icon-pencil"></i> Contact</a></li>
						<li><a href="listOfPresentations">
						<i class="icon-white icon-picture"></i>
						List of Presentations</a></li>
					</ul>
				</div>
				<!--/.nav-collapse -->
				<form class="navbar-search pull-left" action="">
					<i class="icon-white icon-search"></i><input type="text" class="search-query span2" placeholder="Search">
				</form>
				<ul class="nav pull-right">
					<ul class="nav">
						<a class="btn dropdown-toggle" data-toggle="dropdown">
             			 <i class="icon-user"></i> Account
             			 <span class="caret"></span>
           				 </a>
							<ul class="dropdown-menu">
							<li><a href="loginform">Login</a></li>
							<li><a href="userpage">
							<i class="icon-cog"></i> Profile</a></li>
							<li><a href="../j_spring_security_logout">
							<i class="icon-off"></i> Logout</a></li>
							
							</ul></li>
					</ul>
				
				</ul>
			</div>
		</div>
	</div>
	<div class="container" style="margin-top: 20px;">
		<form:form method="Post" action="registrationform"
			commandName="registration">
			<table>
				<tr>
					<td>User Name:<FONT color="red"><form:errors
								path="name" /></FONT></td>
				</tr>
				<tr>
					<td><form:input path="name" /></td>
				</tr>

				<tr>
					<td>Password:<FONT color="red"><form:errors
								path="password" /></FONT></td>
				</tr>
				<tr>
					<td><form:password path="password" /></td>
				</tr>

				<tr>
					<td>Confirm Password:<FONT color="red"><form:errors
								path="confirmPassword" /></FONT></td>
				</tr>
				<tr>
					<td><form:password path="confirmPassword" /></td>
				</tr>

				<tr>
					<td>Email:<FONT color="red"><form:errors path="email" /></FONT></td>
				</tr>
				<tr>
					<td><form:input path="email" /></td>
				</tr>
				<tr>
					<td><input type="submit" class="btn" value="Submit" /></td>
				</tr>
			</table>
		</form:form>

	</div>
	
	<!-- /container -->


	<!-- Le javascript
================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
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

</body>
</html>