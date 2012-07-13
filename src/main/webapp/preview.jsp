<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<META HTTP-EQUIV="Cache-Control" CONTENT="max-age=0">
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache">
<META http-equiv="expires" content="0">
<META HTTP-EQUIV="Expires" CONTENT="Tue, 01 Jan 1980 1:00:00 GMT">
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
<title>Strut - ALPHA</title>
<link rel="stylesheet" href="res/css/close-btn.css"></link>
<link rel="stylesheet" href="res/css/bootstrap.css"></link>
<link rel="stylesheet" href="res/css/main.css"></link>
<link rel="stylesheet" href="res/css/mainPreview.css"></link>
<link rel="stylesheet"
	href="res/jqplugins/colorpicker/css/colorpicker.css" type="text/css" />
<link rel="stylesheet"
	href="res/jqplugins/gradient_picker/jquery.gradientPicker.css"
	type="text/css" />
<link href='preview_export/css/web-fonts.css' rel='stylesheet'
	type='text/css'>
<script type="text/javascript" src="scripts/vendor/A-jquery-1.7-matt.js"></script>
<script type="text/javascript" src="scripts/vendor/B-jqueryUI.js"></script>
<script type="text/javascript" src="scripts/vendor/C-underscore.js"></script>
<script type="text/javascript" src="scripts/vendor/D-bootstrap.js"></script>
<script type="text/javascript"
	src="scripts/vendor/E-bootstrapDropdown.js"></script>
<script type="text/javascript"
	src="res/jqplugins/colorpicker/js/colorpicker.js"></script>
<script type="text/javascript"
	src="res/jqplugins/gradient_picker/jquery.gradientPicker.js"></script>
<style>
.disp-none {
	display: none;
}

.underline {
	text-decoration: underline;

}

html,body,.editor {
	height: 100%;
	background: #222;
}
</style>
<script>
    	jQuery.fn.selectText = function(){
		    var doc = document;
		    var element = this[0];
		    if (doc.body.createTextRange) {
		        var range = document.body.createTextRange();
		        range.moveToElementText(element);
		        range.select();
		    } else if (window.getSelection) {
		        var selection = window.getSelection();        
		        var range = document.createRange();
		        range.selectNodeContents(element);
		        selection.removeAllRanges();
		        selection.addRange(range);
		    }
		    return this;
		};
    	</script>

<script type="text/javascript" data-main="scripts/main"
	src="scripts/require.js"></script>
<script type="text/javascript" src="preview_export/scripts/impress.js"></script>
<script>$(document).ready(function (){
	      var getId=window.location.href.split("=")[1];
	      var Ide={json:getId};
	        $.ajax({
        	    type: 'POST',
	        	    url: "/webeditor/spring/jsons/", 
	        	    data: Ide,
	        	    dataType: "json",
	        	    success: function(data){
	        	    	localStorage.setItem("open",JSON.stringify(data));
	          		}
	            });
});</script>
</head>
<body onload=$("#present").click();>
</body>
</html>