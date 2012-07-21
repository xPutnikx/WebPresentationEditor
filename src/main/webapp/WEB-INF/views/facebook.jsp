<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>fb</title>
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
<body>

<div id="fb-root"></div>
<script>(function(d, s, id) {
  var js, fjs = d.getElementsByTagName(s)[0];
  if (d.getElementById(id)) return;
  js = d.createElement(s); js.id = id;
  js.src = "//connect.facebook.net/en_US/all.js#xfbml=1&appId=330866890335618";
  fjs.parentNode.insertBefore(js, fjs);
}(document, 'script', 'facebook-jssdk'));</script>


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
    <h1>fb</h1>
    <p>${controllerMessage}</p>
    <div class="fb-like" data-href="http://localhost:8080/webeditor/social/facebook" data-send="true" data-width="450" data-show-faces="true"></div>
    <div class="fb-login-button" data-show-faces="true" data-width="200" data-max-rows="1"></div>
    <iframe src="https://www.facebook.com/plugins/registration?
             client_id=113869198637480&
             redirect_uri=https%3A%2F%2Fdevelopers.facebook.com%2Ftools%2Fecho%2F&
             fields=name,birthday,gender,location,email"
        scrolling="auto"
        frameborder="no"
        style="border:none"
        allowTransparency="true"
        width="100%"
        height="330">
</iframe>
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

</body>
</html>