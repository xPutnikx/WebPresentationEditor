
define(["vendor/amd/Handlebars"], function(Handlebars) {
	return {

		"Component": Handlebars.template(function (Handlebars,depth0,helpers,partials,data) {  helpers = helpers || Handlebars.helpers;  var buffer = "", stack1, foundHelper, self=this, functionType="function", helperMissing=helpers.helperMissing, undef=void 0, escapeExpression=this.escapeExpression;  buffer += "<div class=\"content-scale\"><div class=\"content\"></div></div><span class=\"topLabel label\" data-delta=\"skewX\">Skew X</span><span class=\"leftLabel label\" data-delta=\"skewY\">Skew Y</span><span class=\"rightLabel label\" data-delta=\"rotate\">Rotate</span><span class=\"scale label\" data-delta=\"scale\">Scale</span><span class=\"close-btn-red-20 removeBtn\" title=\"Remove\"></span><div class=\"positioningCtrls form-inline\">	<span class=\"label\">x</span>	<input class=\"position\" type=\"text\" data-option=\"x\" value=\"";  foundHelper = helpers['x'];  stack1 = foundHelper || depth0['x'];  if(typeof stack1 === functionType) { stack1 = stack1.call(depth0, { hash: {} }); }  else if(stack1=== undef) { stack1 = helperMissing.call(depth0, "x", { hash: {} }); }  buffer += escapeExpression(stack1) + "\"/>	<span class=\"label\">y</span>	<input class=\"position\" type=\"text\" data-option=\"y\" value=\"";  foundHelper = helpers['y'];  stack1 = foundHelper || depth0['y'];  if(typeof stack1 === functionType) { stack1 = stack1.call(depth0, { hash: {} }); }  else if(stack1=== undef) { stack1 = helperMissing.call(depth0, "y", { hash: {} }); }  buffer += escapeExpression(stack1) + "\"/> </div>";  return buffer;}),
		"Editor": Handlebars.template(function (Handlebars,depth0,helpers,partials,data) {  helpers = helpers || Handlebars.helpers;  var foundHelper, self=this;  return "<div class=\"navbar navbar-fixed-top menuBar\">  <div class=\"btn-inverse temp\">    <div class=\"container\">    	<a class=\"brand\" href=\"#\">Strut 0.2</a> 	<ul class=\"nav\">     		<li class=\"dropdown active\">     			<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">     				File<b class=\"caret\"></b>     			</a>     			<ul class=\"dropdown-menu\">     		 		<li data-option=\"new\"><a href=\"#\">New</a></li>     				<li data-option=\"open\"><a href=\"#\">Open...</a></li><!--     				<li data-option=\"openRecent\"><a href=\"#\">Open Recent...</a></li> -->     				<li data-option=\"save\"><a href=\"#\">Save</a></li>     				<li data-option=\"saveAs\"><a href=\"#\">Save As...</a></li>      			</ul>            <li class=\"dropdown active\">                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">                    Edit<b class=\"caret\"></b>                </a>                <ul class=\"dropdown-menu\">                    <li data-option=\"undo\"><a href=\"#\">Undo <span class=\"undoName label\"></span></a></li>                    <li data-option=\"redo\"><a href=\"#\">Redo <span class=\"redoName label\"></span></a></li>                    <li data-option=\"cut\"><a href=\"#\">Cut</a></li>                    <li data-option=\"copy\"><a href=\"#\">Copy</a></li>                    <li data-option=\"paste\"><a href=\"#\">Paste</a></li>                </ul>            </li>            <li class=\"dropdown active\">                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">                    Slideshow<b class=\"caret\"></b>                </a>                <ul class=\"dropdown-menu\">                    <li data-option=\"exportJSON\"><a href=\"#\">Export to JSON</a></li>                    <li data-option=\"importJSON\"><a href=\"#\">Import from JSON</a></li>                    <li class=\"divider\"></li>                    <li data-option=\"changeBackground\"><a href=\"#\">Change Background</a></li>                    <li class=\"divider\"></li>                   <!-- <li data-option=\"exportZIP\"><a href=\"#\">Zip Presentation</a></li> -->                </ul>            </li>     	</ul>    </div>  </div></div><div class=\"perspectives-container\"></div>";}),
		"SlideEditor": Handlebars.template(function (Handlebars,depth0,helpers,partials,data) {  helpers = helpers || Handlebars.helpers;  var foundHelper, self=this;  return "<div class=\"navbar\">  <div class=\"navbar-inner buttonBar\">    <div class=\"container\">    	<ul class=\"nav\">            <li style=\"width: 120px\">            	<div class=\"btn-group iconBtns newSlide\">            		<a class=\"btn btn btn-small menuBarOption\" data-option=\"createSlide\" href=\"#\"><i class=\"icon-plus\"></i>Slide</a>            	</div>            </li>            <li class=\"divider-vertical\">            </li>            <li>            	<div class=\"btn-group normalBtns\">            		<a class=\"btn btn-inverse dropdown-toggle btn-small disabled fontButton fontFamilyBtn\" data-toggle=\"dropdown\" title=\"Choose the font family\"><span class=\"text\">Lato</span><span class=\"caret\"></span></a>            		<ul class=\"dropdown-menu menuBarOption\" data-option=\"fontFamily\">            			<li>                                    <a class=\"lato\" href=\"#\" data-value=\"'Lato', sans-serif\">Lato</a>                                    <a class=\"ubuntu\" href=\"#\" data-value=\"'Ubuntu', sans-serif\">Ubuntu</a>                                    <a class=\"abril\" href=\"#\" data-value=\"'Abril Fatface', cursive\">Abril</a>                                    <a class=\"hammersmith\" href=\"#\" data-value=\"'Hammersmith One', sans-serif\">Hammersmith One</a>                                    <a class=\"fredoka\" href=\"#\" data-value=\"'Fredoka One', cursive\">Fredoka One</a>                                    <a class=\"gorditas\" href=\"#\" data-value=\"'Gorditas', cursive\">Gorditas</a>                                    <a class=\"pressstart\" href=\"#\" data-value=\"'Press Start 2P', cursive\">Press Start 2P</a>            			</li>            		</ul>            	</div>            </li>            <li>            	<div class=\"btn-group normalBtns\">            		<a class=\"btn btn-small btn-inverse dropdown-toggle disabled fontButton fontSizeBtn\" data-toggle=\"dropdown\" title=\"Choose the font size\"><span class=\"text\">72</span>            			<span class=\"caret\"></span></a>            		<ul class=\"dropdown-menu menuBarOption\" data-option=\"fontSize\">            			<li>                                    <a href=\"#\" data-value=\"144\">144</a>                                    <a href=\"#\" data-value=\"96\">96</a>                                    <a href=\"#\" data-value=\"72\">72</a>            				<a href=\"#\" data-value=\"64\">64</a>                                    <a href=\"#\" data-value=\"48\">48</a>                                    <a href=\"#\" data-value=\"36\">36</a>                                    <a href=\"#\" data-value=\"24\">24</a>                                    <a href=\"#\" data-value=\"16\">16</a>                                    <a href=\"#\" data-value=\"12\">12</a>                                    <a href=\"#\" data-value=\"8\">8</a>            			</li>            		</ul>            	</div>            </li>            <li>                  <div class=\"color-chooser normalBtns\"><div></div></div>            </li>            <li class=\"divider-vertical\">            </li>            <li>                  <div class=\"btn-group menuBarOption normalBtns\">                        <a class=\"btn btn-small btn-inverse disabled fontButton\" data-option=\"fontWeight\" data-value=\"bold\"><strong>B</strong></a>                        <a class=\"btn btn-small btn-inverse disabled fontButton\" data-option=\"fontStyle\" data-value=\"italic\"><em>I</em></a>                        <a class=\"btn btn-small btn-inverse underline disabled fontButton\" data-option=\"fontDecoration\" data-value=\"underline\">U</a>                  </div>            </li>            <li>                  <div class=\"btn-group menuBarOption normalBtns\">                        <a class=\"btn btn-small btn-inverse disabled fontButton\" data-option=\"textAlign\" data-value=\"left\"><i class=\"icon-align-left icon-white\"></i></a>                        <a class=\"btn btn-small btn-inverse disabled fontButton\" data-option=\"textAlign\" data-value=\"center\"><i class=\"icon-align-center icon-white\"></i></a>                        <a class=\"btn btn-small btn-inverse disabled fontButton\" data-option=\"textAlign\" data-value=\"right\"><i class=\"icon-align-right icon-white\"></i></a>                        <a class=\"btn btn-small btn-inverse disabled fontButton\" data-option=\"textAlign\" data-value=\"justify\"><i class=\"icon-align-justify icon-white\"></i></a>                  </div>            </li>            <li class=\"divider-vertical\">            </li>            <li>                  <div class=\"btn-group iconBtns\">                        <a class=\"btn menuBarOption\" data-option=\"textBox\"><i class=\"icon-text-width\"></i>Text</a>                        <a class=\"btn btn menuBarOption\" data-option=\"picture\"><i class=\"icon-picture\"></i>Image</a>                        <!-- <a class=\"btn btn menuBarOption\" data-option=\"table\"><i class=\"icon-th\"></i>Table</a>                        <a class=\"btn btn menuBarOption\" data-option=\"shapes\"><i class=\"icon-star\"></i>Shapes</a> -->                  </div>            </li>            <li class=\"divider-vertical\">            </li>        </ul>        <ul class=\"nav pull-right\">            <li>                  <div class=\"btn-group iconBtns\" style=\"display: inline-block\">                        <a class=\"btn transitionEditorBtn\" data-option=\"transitionEditor\"><i class=\"icon-th-large\"></i><span>Transitions</span></a>                  </div>                  <div class=\"btn-group iconBtns\" style=\"display: inline-block\">                        <a class=\"btn btn-success transitionEditorBtn\" data-option=\"preview\"><i class=\"icon-play icon-white\"></i><span>Present</span></a>                  </div>            </li>        </ul>    </div>  </div></div><div class=\"mainContent\"></div>";}),
		"SlideSnapshot": Handlebars.template(function (Handlebars,depth0,helpers,partials,data) {  helpers = helpers || Handlebars.helpers;  var foundHelper, self=this;  return "<canvas></canvas><span class=\"close-btn-red-20 removeBtn\" title=\"Remove\"></span><span class=\"badge badge-inverse\"></span>";}),
		"TransitionEditor": Handlebars.template(function (Handlebars,depth0,helpers,partials,data) {  helpers = helpers || Handlebars.helpers;  var foundHelper, self=this;  return "<div class=\"navbar\">  <div class=\"navbar-inner buttonBar\">    <div class=\"container\">      <ul class=\"nav cameraSettings\">        <li>         <!-- <div class=\"btn-group cameraControls\">            <button class=\"btn\"><i class=\"icon-camera\"></i></button>            <a class=\"btn active\" data-option=\"lookDownZ\">Z</a>            <a class=\"btn\" data-option=\"lookDownY\">Y</a>            <a class=\"btn\" data-option=\"lookDownX\">X</a>          </div> -->        </li>        <li class=\"divider-vertical\">        </li>        <li>          <span class=\"label label-inverse\">Interval:</span><input type=\"text\" data-option=\"interval\" value=\"0\"></input>        </li>      </ul>    	<ul class=\"nav pull-right\">    		<li>    			<div class=\"btn-group iconBtns\" style=\"display: inline-block\">                        <a class=\"btn menuBarOption\" data-option=\"slideEditor\"><i class=\"icon-th-list\"></i><span>Slides</span></a>          </div>          <div class=\"btn-group iconBtns\" style=\"display: inline-block\">                        <a class=\"btn btn-success menuBarOption\" data-option=\"preview\"><i class=\"icon-play icon-white\"></i><span>Present</span></a>          </div>    		</li>    	</ul>   	</div>  </div></div><div class=\"transitionSlides\"></div>";}),
		"TransitionSlideSnapshot": Handlebars.template(function (Handlebars,depth0,helpers,partials,data) {  helpers = helpers || Handlebars.helpers;  var buffer = "", stack1, foundHelper, self=this, functionType="function", helperMissing=helpers.helperMissing, undef=void 0, escapeExpression=this.escapeExpression;  buffer += "<div class=\"content\"><canvas></canvas></div><div class=\"topLabel form-inline\">	<span class=\"label\" data-delta=\"rotateY\">Rot. Y</span>	<input type=\"text\" data-option=\"rotateY\" value=\"";  foundHelper = helpers.rotateY;  stack1 = foundHelper || depth0.rotateY;  if(typeof stack1 === functionType) { stack1 = stack1.call(depth0, { hash: {} }); }  else if(stack1=== undef) { stack1 = helperMissing.call(depth0, "rotateY", { hash: {} }); }  buffer += escapeExpression(stack1) + "\"></input></div><div class=\"leftLabel form-inline\">	<span class=\"label\" data-delta=\"rotateX\">Rot. X</span>	<input type=\"text\" data-option=\"rotateX\" value=\"";  foundHelper = helpers.rotateX;  stack1 = foundHelper || depth0.rotateX;  if(typeof stack1 === functionType) { stack1 = stack1.call(depth0, { hash: {} }); }  else if(stack1=== undef) { stack1 = helperMissing.call(depth0, "rotateX", { hash: {} }); }  buffer += escapeExpression(stack1) + "\"></input></div><div class=\"rightLabel form-inline\">	<span class=\"label\" data-delta=\"rotateZ\">Rot. Z</span>	<input type=\"text\" data-option=\"rotateZ\" value=\"";  foundHelper = helpers.rotateZ;  stack1 = foundHelper || depth0.rotateZ;  if(typeof stack1 === functionType) { stack1 = stack1.call(depth0, { hash: {} }); }  else if(stack1=== undef) { stack1 = helperMissing.call(depth0, "rotateZ", { hash: {} }); }  buffer += escapeExpression(stack1) + "\"></input></div><div class=\"positioningCtrls form-inline\">	<span class=\"label\">z</span>	<input class=\"position\" type=\"text\" data-option=\"z\" value=\"";  foundHelper = helpers['z'];  stack1 = foundHelper || depth0['z'];  if(typeof stack1 === functionType) { stack1 = stack1.call(depth0, { hash: {} }); }  else if(stack1=== undef) { stack1 = helperMissing.call(depth0, "z", { hash: {} }); }  buffer += escapeExpression(stack1) + "\"/>	<span class=\"label\">scale</span>	<input class=\"position\" type=\"text\" data-option=\"scale\" value=\"";  foundHelper = helpers.impScale;  stack1 = foundHelper || depth0.impScale;  if(typeof stack1 === functionType) { stack1 = stack1.call(depth0, { hash: {} }); }  else if(stack1=== undef) { stack1 = helperMissing.call(depth0, "impScale", { hash: {} }); }  buffer += escapeExpression(stack1) + "\"/></div><span class=\"badge badge-inverse\"></span>";  return buffer;})
	}});