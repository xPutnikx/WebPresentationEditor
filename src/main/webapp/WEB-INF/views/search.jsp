<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<style>
   a { 
    text-decoration: none;
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
			</a> <a class="brand" href="../editor"> <i
				class="icon-white icon-edit"></i> Web Editor
			</a>
			<div class="nav-collapse">
				<ul class="nav">
					<li><a href="home"> <i class="icon-white icon-home"></i>
							Home
					</a></li>
					<li><a href="about"> <i
							class="icon-white icon-book"></i> About
					</a></li>
					<li><a href="contact"> <i
							class="icon-white icon-pencil"></i> Contact
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
					<a class="btn dropdown-toggle" data-toggle="dropdown">
						<i class="icon-user"></i> Account <span class="caret"></span>
					</a>
					<ul class="dropdown-menu">
						<li><a href="registrationform">Registration</a></li>
						<li><a href="loginform">Login</a></li>
						<li><a href="userpage"> <i class="icon-cog"></i>
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

<div class="container" style="margin-top: 20px;">

	<h1>Search</h1>
	<br />
	<div style="width: 255px; float: left; color:black;">
		<form class="well">
			<label>Title: </label>
			<textarea id="title-text-area" rows="1"></textarea>
			<br /> <label>Tags: </label>
			<textarea id="tags-text-area" rows="3"></textarea>
			<br />
			<button id="search-btn" type="submit" class="btn">Search</button>
		</form>
	</div>
	<div style="float: left; margin-left: 20px">
		<table class="table table-striped"
			style="width: 875px; margin-top: -10px;">
			<thead>
				<tr>
					<th style="width: 300px">Title</th>
					<th style="width: 495px">Description</th>
					<th style="width: 80px">Preview</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${presentations}" var="presentation">
					<tr id="${presentation.id}">
						<td>${presentation.title}</td>
						<td>${presentation.description}</td>
						<td><button class="btn btn-success"
								onclick="previewPresentation(${presentation.id})">
								Preview</button></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>


</div>

<!-- /container -->
<p> ${result}</p>

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
	function previewPresentation(id) {
		alert("preview " + id);
	}

	$('#title-text-area').textext({});

	$('#tags-text-area').textext({
		plugins : 'autocomplete tags ajax',
		tagsItems : new String('${tagsAreaValue}').split(','),				
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
		
	$('#title-text-area').val('${titleAreaValue}');

	$("#search-btn").click(
			function() {
				function buildTitleURI() {
					var titleParam = {
						title : JSON.parse('"' + titleText + '"')
					};
					return decodeURIComponent($.param(titleParam));
				}

				function buildTagsURI() {
					var tagsParam = {
						tag : JSON.parse(tagsText)
					};
					return decodeURIComponent($.param(tagsParam));
				}

				var titleTextArea = $("#title-text-area");
				var titleText = $.trim(titleTextArea.val());
				var tagsTextArea = $("#tags-text-area");
				var tagsText = $.trim(tagsTextArea.textext()[0].hiddenInput()
						.val());

				if (titleText.length != 0 && tagsText.length != 2) {
					window.location = 'search?' + buildTitleURI() + '&'
							+ buildTagsURI();
				} else if (titleText.length == 0 && tagsText.length != 2) {
					window.location = 'search?' + buildTagsURI();
				} else if (titleText.length != 0 && tagsText.length == 2) {
					window.location = 'search?' + buildTitleURI();
				} else {
					window.location = 'search';
				}
				
				return false;
			});
</script>

</body>
</html>