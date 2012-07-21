<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>About</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="by Putnik">
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
					<li class="active"><a href="#"> <i
							class="icon-white icon-book"></i> About
					</a></li>
					<li><a href="contact"> <i class="icon-white icon-pencil"></i>
							Contact
					</a></li>
					<li><a href="listOfPresentations"> <i
							class="icon-white icon-picture"></i> List of Presentations
					</a></li>
					<li><a class="btn dropdown-toggle " data-toggle="dropdown" data-option="shapes" style="background-color:rgba(142, 241, 35, 0.73)">
					<i class="icon-star"></i>Shapes <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a onclick="rectangle()">Rectangle</a></li>
						<li><a onclick="elipse()">Elipse</a></li>
						<li><a onclick="poligon()">Poligon</a></li>
						<li><a onclick="line()">Line</a></li>
					</ul>
					</li>
			</ul>
		</div>
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
					<li><a href="registrationform">Registration</a></li>
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

<div class="container" style="margin-top: 20px;">
	<h1>About</h1>
	<p>${controllerMessage}</p>
</div>

<canvas id='draw'></canvas>
<script src="resources/processing.js"></script>
<script src="resources/processing-api.js"></script>
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
<script type='text/javascript'>
function rectangle(){
var canvas=document.getElementById("draw")
var x=canvas.getContext("2d");
x.strokeRect(getRandomArbitary(70, 200),getRandomArbitary(50, 100),getRandomArbitary(40, 70),getRandomArbitary(40, 70));}
function elipse(){
	var canvas=document.getElementById("draw")
	var x=canvas.getContext("2d");
	x.beginPath();
	x.arc(event.clientY,event.clientX,50,0,Math.PI*2,true);
	x.stroke();
}
</script>
<script type='text/javascript'>
function poligon(){
	var canvas=document.getElementById("draw")
	var x=canvas.getContext("2d");
x.beginPath();
x.moveTo(75,25);
x.quadraticCurveTo(25,25,25,62.5);
x.quadraticCurveTo(25,100,50,100);
x.quadraticCurveTo(50,120,30,125);
x.quadraticCurveTo(60,120,65,100);
x.quadraticCurveTo(125,100,125,62.5);
x.quadraticCurveTo(125,25,75,25);
x.stroke();}
</script>
<script type="text/javascript">
function getRandomArbitary(min, max)
{
  return Math.random() * (max - min) + min;
}
</script>
</body>
</html>