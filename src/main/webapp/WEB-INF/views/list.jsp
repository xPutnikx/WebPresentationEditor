<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Web Editor List</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="by Putnik">
<link href="resources/assets/css/bootstrap.css" rel="stylesheet">
<style>
body {
	padding-top: 60px;
	/* 60px to make the container go all the way to the bottom of the topbar */
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
						<li><a href="home.html">
						<i class="icon-white icon-home"></i> Home</a></li>
						<li><a href="about.html">
						<i class="icon-white icon-book"></i> About</a></li>
						<li><a href="contact.html">
						<i class="icon-white icon-pencil"></i> Contact</a></li>
						<li><a href="listOfPresentations.html">
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
						<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
             			 <i class="icon-user"></i> Username
             			 <span class="caret"></span>
           				 </a>
							<ul class="dropdown-menu">
							<li><a href="registrationform.html">Registration</a></li>
							<li><a href="loginform.html">Login</a></li>
							<li><a href="userpage.html">
							<i class="icon-cog"></i> Profile</a></li>
							<li><a href="../j_spring_security_logout">
							<i class="icon-off"></i> Logout</a></li>
							
							</ul></li>
					</ul>
				
				</ul>
			</div>
		</div>
	</div>

	<div class="container">
		<h1>Listing People</h1>
		<div id="content" style="padding: 30px">
			<c:forEach items="${people}" var="v_person">
				<a href="edit?id=${v_person.id}">${v_person.id} -
					${v_person.name} ${v_person.password} ${v_person.email} </a>
				<br />
			</c:forEach>
			</br> </br> <a href="edit"> Add Person</a>
		</div>
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
</body>
</html>
