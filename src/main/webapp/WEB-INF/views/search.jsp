<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>About</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="by Putnik">

<!-- Le styles -->
<link href="resources/assets/css/bootstrap.css" rel="stylesheet">
<style>
body {
	padding-top: 60px;
	/* 60px to make the container go all the way to the bottom of the topbar */
}
</style>
<link href="resources/assets/css/bootstrap-responsive.css"
	rel="stylesheet">

<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

<!-- Le fav and touch icons -->
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
				class="icon-white icon-edit"></i> Web Editor
			</a>
			<div class="nav-collapse">
				<ul class="nav">
					<li><a href="home.html"> <i class="icon-white icon-home"></i>
							Home
					</a></li>
					<li class="active"><a href="#"> <i
							class="icon-white icon-book"></i> About
					</a></li>
					<li><a href="contact.html"> <i
							class="icon-white icon-pencil"></i> Contact
					</a></li>
					<li><a href="listOfPresentations.html"> <i
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
					<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
						<i class="icon-user"></i> Account <span class="caret"></span>
					</a>
					<ul class="dropdown-menu">
						<li><a href="registrationform.html">Registration</a></li>
						<li><a href="loginform.html">Login</a></li>
						<li><a href="userpage.html"> <i class="icon-cog"></i>
								Profile
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

	<h1>Search</h1>
	<br />
	<div style="width: 260px; float: left;">
		<form class="well">
			<label>Title: </label>
			<textarea id="textarea" rows="1"></textarea>
			<br /> <label>Tags: </label>
			<textarea id="textarea2" rows="2"></textarea>
			<br />
			<button type="submit" class="btn">Submit</button>
		</form>
	</div>
	<div style="float: left; margin-left: 10px">
		<p>LIST OF PRESENTATIONS</p>
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
<script src="resources/assets/js/jquery-textext-1.3.0.js"></script>

<script type="text/javascript">
	$('#textarea').textext({
		plugins : 'autocomplete ajax',
		ajax : {
			type : 'POST',
			url : 'search',
			dataType : 'json',
			dataCallback : function(query) {
				return {
					'query' : query
				}
			}
		}
	});
	$('#textarea2').textext({
		plugins : 'autocomplete filter tags ajax',
		ajax : {
			type : 'POST',
			url : 'search',
			dataType : 'json',			
			dataCallback : function(query) {
                return {
                    'query' : query
                }
            }
		}
	});
</script>

</body>
</html>