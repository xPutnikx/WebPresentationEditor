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
<link rel="stylesheet" href="../res/css/jquery.ui.all.css">
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
<link rel="shortcut icon" href="resources/assets/ico/favicon.ico">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="resources/assets/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="resources/assets/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="resources/assets/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="resources/assets/ico/apple-touch-icon-57-precomposed.png">
<link rel="stylesheet" href="../res/css/jquery.ui.all.css">
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

						</ul>
						</li>
					</ul>

				</ul>
			</div>
		</div>
	</div>

	<div class="container" style="margin-top: 20px;">
		<h1>Listing People</h1>
		<div id="content" style="padding: 30px">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Id</th>
						<th>Name</th>
						<th>Email</th>
						<th>Enabled</th>
						<th>User Role</th>
					</tr>
				</thead>
				<tbody id="tbody">
					<c:forEach items="${people}" var="v_person">

						<tr id="tr${v_person.id}">
							<td><span class="badge badge-info"><a
									style="color: #ffffff">${v_person.id}</a></span></td>
							<td>${v_person.name}</td>

							<td>${v_person.email}</td>
							<td><c:if test="${v_person.enabled}">
									<button class="btn btn-success" id=${v_person.id
										}
										value=${v_person.enabled
										}
										onclick="check(${v_person.id},${v_person.enabled})">
										${v_person.enabled}</button>
								</c:if> <c:if test="${!v_person.enabled}">
									<button class="btn btn-danger" id=${v_person.id
										}
										value=${v_person.enabled
										}
										onclick="check(${v_person.id},${v_person.enabled})">
										${v_person.enabled}</button>
								</c:if></td>

							<td><select class="span2" id="span${v_person.id}"
								onclick="change(${v_person.id})">
									<option>User</option>
									<option>Admin</option>
							</select></td>
							<td><button class="btn btn-danger" id="del${v_person.id}"
									onclick="del(${v_person.id})">
									<i class="icon-remove-sign"></i>
								</button></td>

						</tr>
					</c:forEach>
				</tbody>
			</table>
			<p>
				<a class="btn" id="edit">Add Person →</a>
			</p>
		</div>
	</div>
	<div
		style="display: none; z-index: 1002; outline: 0px; position: absolute; height: auto; width: 350px; top: 217px; left: 660px;"
		class="ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable"
		tabindex="-1" role="dialog"
		aria-labelledby="ui-dialog-title-dialog-form">
		<div
			class="ui-dialog-titlebar ui-widget-header ui-corner-all ui-helper-clearfix">
			<span class="ui-dialog-title" id="ui-dialog-title-dialog-form"> Create
				new user</span><a href="#" class="ui-dialog-titlebar-close ui-corner-all"
				role="button"><span class="ui-icon ui-icon-closethick">close</span></a>
		</div>
		<div id="dialog-form"
			style="width: auto; min-height: 0px; height: 216px;"
			class="ui-dialog-content ui-widget-content" scrolltop="0"
			scrollleft="0">
			<p class="validateTips" style="color:transpanent"></p>

			<form>
				<fieldset>
					<label for="name">Name</label> <input type="text" name="name"
						id="name" class="text ui-widget-content ui-corner-all"> <label
						for="email">Email</label> <input type="text" name="email"
						id="email" value="" class="text ui-widget-content ui-corner-all">
					<label for="password">Password</label> <input type="password"
						name="password" id="password" value=""
						class="text ui-widget-content ui-corner-all">
				</fieldset>
			</form>
		</div>
		<div class="ui-resizable-handle ui-resizable-n" style="z-index: 1000;"></div>
		<div class="ui-resizable-handle ui-resizable-e" style="z-index: 1000;"></div>
		<div class="ui-resizable-handle ui-resizable-s" style="z-index: 1000;"></div>
		<div class="ui-resizable-handle ui-resizable-w" style="z-index: 1000;"></div>
		<div
			class="ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se ui-icon-grip-diagonal-se"
			style="z-index: 1000;"></div>
		<div class="ui-resizable-handle ui-resizable-sw"
			style="z-index: 1000;"></div>
		<div class="ui-resizable-handle ui-resizable-ne"
			style="z-index: 1000;"></div>
		<div class="ui-resizable-handle ui-resizable-nw"
			style="z-index: 1000;"></div>
		<div class="ui-dialog-buttonpane ui-widget-content ui-helper-clearfix">
			<div class="ui-dialog-buttonset">
				<button type="button"
					class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only"
					role="button" aria-disabled="false">
					<span class="ui-button-text">Create an account</span>
				</button>
				<button type="button"
					class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only"
					role="button" aria-disabled="false">
					<span class="ui-button-text">Cancel</span>
				</button>
			</div>
		</div>
	</div>

	<script src="resources/assets/js/jquery.js"></script>
	<script src="resources/jquery-ui-1.8.21.custom.min.js"></script>
	<script src="resources/createuserdialog.js"></script>
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
	<script src="resources/deletelist.js"></script>
	<script src="resources/checklist.js"></script>
	<script src="resources/changelist.js"></script>
	<script src="resources/jquery.ba-dotimeout.js"></script>
	<script src="resources/jquery.ui.core.js"></script>
	<script src="resources/jquery.ui.widget.js"></script>
	<script src="resources/jquery.ui.mouse.js"></script>
	<script src="resources/jquery.ui/jquery.ui.button.js"></script>
	<script src="resources/jquery.ui/jquery.ui.draggable.js"></script>
	<script src="resources/jquery.ui/jquery.ui.position.js"></script>
	<script src="resources/jquery.ui/jquery.ui.resizable.js"></script>
	<script src="resources/jquery.ui/jquery.ui.dialog.js"></script>
	<script src="resources/jquery.ui/jquery.effects.core.js"></script>
</body>
</html>
