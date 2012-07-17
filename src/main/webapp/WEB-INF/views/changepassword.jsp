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
<style>
body {
	padding-top: 60px;
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
					<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
						<i class="icon-user"></i> ${username} <span class="caret"></span>
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
<div class="container">
	<h1> ${username} change your password</h1>
	<p id = "userId" >${id}</p>
	<p id ="userPassword">${password}</p>
	<form>
		<div class="well">
			Current password<br /> <input type="password" id="currentpassword" />
		</div>
		<div class="well">
			New password<br /> <input type="password" id="newpassword" />
		</div>
		<div class="well">
			Confirm password<br /> <input type="password" id="confirmpassword" />
		</div>
		<input class="btn" value="Save" onclick="sub()"/>
	</form>
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
<script>$(function(){
	document.getElementById("userId").style.display='none';
	document.getElementById("userPassword").style.display='none';
}) </script>
<script>
function sub(){
	var newpas=$("#newpassword").val();
	var confpas=$("#confirmpassword").val();
	var enterpas=$("#currentpassword").val();
	var Idu=$("#userId").text();
	var currentpas=$("#userPassword").text();
	if(enterpas == currentpas){
		if(newpas == confpas){
			var newpassword={password:newpas,id:Idu};
			$.ajax({
	    		type: 'POST',
    			url: "changepassword", 
    			data: newpassword,
    			dataType: "json"
        	});
			alert("Success!");
		}
		else{
			alert ("Error!");
		}
	}
	else{
		alert ("Error!");
	}
}
</script>
</body>
</html>