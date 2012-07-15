<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Web Editor Home</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="by Putnik">

<link href="resources/assets/css/bootstrap.css" rel="stylesheet">
<link href="resources/ring/ring.css" rel="stylesheet">
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
						<li class="active"><a href="#">
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
							<li class="disabled"><a href="../j_spring_security_logout">
							<i class="icon-off"></i> Logout</a></li>
							
							</ul></li>
					</ul>
				
				</ul>
			</div>
		</div>
	</div>

	<div class="container">

		<h1>
			${controllerMessage}<br />
		</h1>
			
		<div id="item">
			${tagCloud}
			<li>Development</li>
			<li>ShavrtzMesser</li>
			<li>web</li>
			<li>Tutorial</li>
			<li>ASP</li>
			<li>CSS</li>
			<li>Design</li>
			<li>Flash</li>
			<li>Experimental</li>
			<li><a href=registrationform.html>Registration</a></li>
			<li><a href=loginform.html>Login</a></li>
			<li></li>
			<li><a href=contact.html>Contact</a></li>
			<li>3D</li>
			<li>Ajax</li>
			<li><a href=about.html>About</a></li>
			<li>Development</li>
			<li>web</li>
			<li>Tutorial</li>
			<li>ASP</li>
			<li>CSS</li>
			<li>Design</li>
			<li>Flash</li>
			<li>Experimental</li>
			<li><a href=registrationform.html>Registration</a></li>
			<li><a href=loginform.html>Login</a></li>
			<li></li>
			<li><a href=contact.html>Contact</a></li>
			<li>3D</li>
			<li>Ajax</li>
			<li><a href=about.html>About</a></li>
			<li>Development</li>
			<li>web</li>
			<li>Tutorial</li>
			<li>ASP</li>
			<li>CSS</li>
			<li>Design</li>
			<li>Flash</li>
			<li>Experimental</li>
			<li><a href=registrationform.html>Registration</a></li>
			<li><a href=loginform.html>Login</a></li>
			<li></li>
			<li><a href=contact.html>Contact</a></li>
			<li>3D</li>
			<li>Ajax</li>
			<li><a href=about.html>About</a></li>
			</ul>
		</div>
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
	<script type="text/javascript" src="resources/sphere/JQuery.js"></script>
	<script src="resources/sphere/3DEngine.js" type="text/javascript"
		charset="utf-8"></script>
	<script src="resources/sphere/Sphere.js" type="text/javascript"
		charset="utf-8"></script>
	<script type="text/javascript">
		//<![CDATA[
		
		$(document).ready(function() {

			var camera = new Camera3D();
			camera.init(0,0,0,300);
			
			var container = $("#item")
			
			var item = new Object3D(container);

			item.addChild(new Sphere(200,10,100));
			
			var scene = new Scene3D();
			scene.addToScene(item);
			
			
			var mouseX,mouseY = 0;
			var offsetX = $("#item").offset().left;
			var offsetY = $("#item").offset().top;
			var speed = 20000;
			
			$().mousemove(function(e){
				mouseX = e.clientX - offsetX - (container.width() / 2);
				mouseY = e.clientY - offsetY - (container.height() / 2);
			});
			
			var animateIt = function(){
				if (mouseX != undefined){
					axisRotation.y += (mouseX) / speed
				}
				if (mouseY != undefined){
					axisRotation.x -= mouseY / speed;
				}

				scene.renderCamera(camera);
				
			};
			
			
			setInterval(animateIt, 20);
			
			
			});
		//]]>
	</script>

</body>
</html>