<html lang="en">
<head>
<meta charset="utf-8">
<title>PaintWeb simple demo</title>
<link rel="author" type="text/html" href="http://www.robodesign.ro"
	title="Marius and Mihai Şucan, ROBO Design">

<!-- $URL: http://code.google.com/p/paintweb $
         $Date: 2010-06-26 22:58:27 +0300 $ -->
<style type="text/css"></style>
<style type="text/css">
@media screen and (resolution:96dpi) {
	#paintweb_resInfo {
		width: 96px
	}
}

@media screen and (resolution:134dpi) {
	#paintweb_resInfo {
		width: 134px
	}
}

@media screen and (resolution:200dpi) {
	#paintweb_resInfo {
		width: 200px
	}
}

@media screen and (resolution:300dpi) {
	#paintweb_resInfo {
		width: 300px
	}
}

#paintweb_resInfo {
	display: block;
	height: 100%;
	left: -3000px;
	position: fixed;
	top: 0;
	visibility: hidden;
	z-index: -32
}
</style>
<link id="paintweb_style_defaultstyle" rel="stylesheet" type="text/css"
	media="screen, projection"
	href="http://www.robodesign.ro/paintweb/trunk/build/interfaces/default/style.css">
</head>
<body>
	<h1>PaintWeb simple demo</h1>
	<p>
		This is a demonstration page showing an image you can edit using <a
			href="http://code.google.com/p/paintweb">PaintWeb</a>.
	</p>

	<p>
		<a title="Freshalicious"
			href="http://www.robodesign.ro/marius/my-projects/images/freshalicious"><img
			id="editableImage" src="http://www.robodesign.ro/paintweb/trunk/demos/freshalicious.jpg" alt="Freshalicious"
			style="display: none;"></a>
	</p>

	<p>
		<button id="buttonEditImage" style="display: none;">Edit
			image!</button>
	</p>

	<div id="PaintWebTarget"
		style="display: none; width: 100%; position: relative;"
		class=" paintweb_placeholder" tabindex="1">
		<h1 class="paintweb_appTitle">PaintWeb</h1>
		<div data-pwtabpanel="main" data-pwtabdefault="main"
			class=" paintweb_tabPanel paintweb_tabPanel_main">
			<div data-pwtab="main" class=" paintweb_tab paintweb_main_main">
				<ul data-pwid="tools" class=" paintweb_tools">
					<li data-pwcommand="historyUndo"
						class=" paintweb_command paintweb_cmd_historyUndo paintweb_disabled"><a
						title="Undo [ Control Z ]" href="#">Undo [ Control Z ]</a></li>
					<li data-pwcommand="historyRedo"
						class=" paintweb_command paintweb_cmd_historyRedo paintweb_disabled"><a
						title="Redo [ Control Y ]" href="#">Redo [ Control Y ]</a></li>
					<li class="paintweb_toolSeparator">&nbsp;</li>
					<li data-pwcommand="imageClear"
						class=" paintweb_command paintweb_cmd_imageClear"><a
						title="Clear image [ Control N ]" href="#">Clear image [
							Control N ]</a></li>
					<li data-pwcommand="imageSave"
						class=" paintweb_command paintweb_cmd_imageSave"><a
						title="Save image [ Control S ]" href="#">Save image [ Control
							S ]</a></li>
					<li data-pwtool="insertimg"
						class=" paintweb_tool paintweb_tool_insertimg"><a
						title="Insert image [ I ]" href="#">Insert image [ I ]</a></li>
					<li class="paintweb_toolSeparator">&nbsp;</li>
					<li data-pwcommand="selectionCut"
						class=" paintweb_command paintweb_disabled paintweb_cmd_selectionCut"><a
						title="Cut selection [ Control X ] [ Shift Delete ]" href="#">Cut
							selection [ Control X ] [ Shift Delete ]</a></li>
					<li data-pwcommand="selectionCopy"
						class=" paintweb_command paintweb_disabled paintweb_cmd_selectionCopy"><a
						title="Copy selection [ Control C ]" href="#">Copy selection [
							Control C ]</a></li>
					<li data-pwcommand="clipboardPaste"
						class=" paintweb_command paintweb_disabled paintweb_cmd_clipboardPaste"><a
						title="Paste clipboard [ Control V ]" href="#">Paste clipboard
							[ Control V ]</a></li>
					<li class="paintweb_toolSeparator">&nbsp;</li>
					<li data-pwtool="cpicker"
						class=" paintweb_tool paintweb_tool_cpicker"><a
						title="Color picker [ C ]" href="#">Color picker [ C ]</a></li>
					<li data-pwtool="cbucket"
						class=" paintweb_tool paintweb_tool_cbucket"><a
						title="Color bucket [ F ]" href="#">Color bucket [ F ]</a></li>
					<li class="paintweb_toolsWrap">&nbsp;</li>
					<li data-pwtool="selection"
						class=" paintweb_tool paintweb_tool_selection"><a
						title="Rectangle selection [ S ]" href="#">Rectangle selection
							[ S ]</a></li>
					<li data-pwtool="hand" class=" paintweb_tool paintweb_tool_hand"><a
						title="Viewport drag [ H ]" href="#">Viewport drag [ H ]</a></li>
					<li class="paintweb_toolSeparator">&nbsp;</li>
					<li data-pwtool="rectangle"
						class=" paintweb_tool paintweb_tool_rectangle"><a
						title="Rectangle [ R ]" href="#">Rectangle [ R ]</a></li>
					<li data-pwtool="ellipse"
						class=" paintweb_tool paintweb_tool_ellipse"><a
						title="Ellipse [ E ]" href="#">Ellipse [ E ]</a></li>
					<li data-pwtool="polygon"
						class=" paintweb_tool paintweb_tool_polygon"><a
						title="Polygon [ G ]" href="#">Polygon [ G ]</a></li>
					<li data-pwtool="line"
						class=" paintweb_tool paintweb_tool_line paintweb_toolActive"><a
						title="Line [ L ]" href="#">Line [ L ]</a></li>
					<li data-pwtool="bcurve"
						class=" paintweb_tool paintweb_tool_bcurve"><a
						title="Bézier curve [ V ]" href="#">Bézier curve [ V ]</a></li>
					<li data-pwtool="text" class=" paintweb_tool paintweb_tool_text"><a
						title="Text [ T ]" href="#">Text [ T ]</a></li>
					<li data-pwtool="pencil"
						class=" paintweb_tool paintweb_tool_pencil"><a
						title="Pencil [ P ]" href="#">Pencil [ P ]</a></li>
					<li class="paintweb_toolSeparator">&nbsp;</li>
					<li data-pwtool="eraser"
						class=" paintweb_tool paintweb_tool_eraser"><a
						title="Eraser [ O ]" href="#">Eraser [ O ]</a></li>
					<li class="paintweb_toolSeparator">&nbsp;</li>
				</ul>
				<div class="paintweb_strokeFillStyles">
					<p class="paintweb_opt_fillStyle">
						Fill <span data-pwcolorinput="fillStyle"
							class=" paintweb_colorInput paintweb_fillStyle"><a
							style="background-color: rgb(0, 0, 0); opacity: 1;" href="#"
							title="Fill color">Click to pick color</a></span>
					</p>
					<p class="paintweb_opt_strokeStyle">
						Stroke <span data-pwcolorinput="strokeStyle"
							class=" paintweb_colorInput paintweb_strokeStyle"><a
							style="background-color: rgb(0, 0, 255); opacity: 1;" href="#"
							title="Stroke color">Click to pick color</a></span>
					</p>
				</div>
			</div>
			<div data-pwtab="line" data-pwtabhide="true"
				class=" paintweb_tab paintweb_main_line" style="display: none;">
				<p class="paintweb_opt_lineWidth" style="">
					<label>Line width:<input data-pwconfig="line.lineWidth"
						type="number" min="1" value="1" title="Line width:"
						class=" paintweb_cfg_line_lineWidth"></label>
				</p>
				<p class="paintweb_opt_miterLimit" style="">
					<label>Miter limit:<input data-pwconfig="line.miterLimit"
						type="number" min="1" value="10" title="Miter limit:"
						class=" paintweb_cfg_line_miterLimit"></label>
				</p>
				<div data-pwconfig="line.lineCap" title="Line cap"
					class=" paintweb_cfg_line_lineCap" style="">
					<p>Line cap</p>
					<div data-pwconfigvalue="butt"
						class=" paintweb_lineCap_butt paintweb_icon">
						<a href="#" title="Butt">Butt</a>
					</div>
					<div data-pwconfigvalue="square"
						class=" paintweb_lineCap_square paintweb_icon">
						<a href="#" title="Square">Square</a>
					</div>
					<div data-pwconfigvalue="round"
						class=" paintweb_lineCap_round paintweb_icon paintweb_configActive">
						<a href="#" title="Round">Round</a>
					</div>
				</div>
				<div data-pwconfig="line.lineJoin" title="Line join"
					class=" paintweb_cfg_line_lineJoin" style="">
					<p>Line join</p>
					<div data-pwconfigvalue="miter"
						class=" paintweb_lineJoin_miter paintweb_icon">
						<a href="#" title="Miter">Miter</a>
					</div>
					<div data-pwconfigvalue="round"
						class=" paintweb_lineJoin_round paintweb_icon paintweb_configActive">
						<a href="#" title="Round">Round</a>
					</div>
					<div data-pwconfigvalue="bevel"
						class=" paintweb_lineJoin_bevel paintweb_icon">
						<a href="#" title="Bevel">Bevel</a>
					</div>
				</div>
				<div data-pwconfig="shapeType" title="Shape type"
					class=" paintweb_cfg_shapeType" style="display: none;">
					<p>Shape type</p>
					<div data-pwconfigvalue="both"
						class=" paintweb_shapeType_both paintweb_icon paintweb_configActive">
						<a href="#" title="Both">Both</a>
					</div>
					<div data-pwconfigvalue="fill"
						class=" paintweb_shapeType_fill paintweb_icon">
						<a href="#" title="Fill">Fill</a>
					</div>
					<div data-pwconfigvalue="stroke"
						class=" paintweb_shapeType_stroke paintweb_icon">
						<a href="#" title="Stroke">Stroke</a>
					</div>
				</div>
			</div>
			<div data-pwtab="selection" data-pwtabhide="true"
				class=" paintweb_tab paintweb_main_selection" style="display: none;">
				<p data-pwid="selTab_selectionCut"
					class=" paintweb_selTab_selectionCut paintweb_disabled paintweb_command paintweb_cmd_selectionCut"
					data-pwcommand="selectionCut">
					<a title="Cut selection" href="#">Cut selection</a>
				</p>
				<p data-pwid="selTab_selectionCopy"
					class=" paintweb_selTab_selectionCopy paintweb_disabled paintweb_command paintweb_cmd_selectionCopy"
					data-pwcommand="selectionCopy">
					<a title="Copy selection" href="#">Copy selection</a>
				</p>
				<p data-pwid="selTab_clipboardPaste"
					class=" paintweb_selTab_clipboardPaste paintweb_disabled paintweb_command paintweb_cmd_clipboardPaste"
					data-pwcommand="clipboardPaste">
					<a title="Paste clipboard" href="#">Paste clipboard</a>
				</p>
				<p data-pwcommand="selectionCrop"
					class=" paintweb_command paintweb_disabled">Crop selection</p>
				<p data-pwcommand="selectionDelete"
					class=" paintweb_command paintweb_disabled">Delete selection</p>
				<p data-pwcommand="selectionFill"
					class=" paintweb_command paintweb_disabled">Fill selection</p>
				<p class="paintweb_opt_selectionTransparent">
					<label><input data-pwconfig="selection.transparent"
						type="checkbox" value="1" checked="checked"
						title="If checked, the background will remain transparent. If unchecked, the background will be filled with the current fill color."
						class=" paintweb_cfg_selection_transparent">Transparent
						selection</label>
				</p>
				<p class="paintweb_opt_selectionTransform">
					<label><input data-pwconfig="selection.transform"
						type="checkbox" value="1"
						title="If checked, the selected pixels will also be dragged/resized when you make changes to the selection. If unchecked, only the selection marquee will be dragged/resized - pixels will remain unaffected by any such changes."
						class=" paintweb_cfg_selection_transform">Image
						manipulation</label>
				</p>
			</div>
			<div data-pwtab="text" data-pwtabhide="true"
				class=" paintweb_tab paintweb_main_text" style="display: none;">
				<p class="paintweb_opt_fontFamily">
					<label for="paintweb49242_fontFamily">Font family:</label> <select
						id="paintweb49242_fontFamily" data-pwconfig="text.fontFamily"
						data-pwid="fontFamily" title="Font family:"
						class=" paintweb_cfg_text_fontFamily paintweb_fontFamily"><option
							value="sans-serif">sans-serif</option>
						<option value="serif">serif</option>
						<option value="cursive">cursive</option>
						<option value="fantasy">fantasy</option>
						<option value="monospace">monospace</option>
						<option value="+">Another font...</option></select>
				</p>
				<p class="paintweb_opt_fontSize">
					<label for="paintweb49242_fontSize">Font size:</label> <input
						id="paintweb49242_fontSize" data-pwconfig="text.fontSize"
						type="number" min="6" value="12" data-pwid="fontSize"
						title="Font size:"
						class=" paintweb_cfg_text_fontSize paintweb_fontSize">
				</p>
				<div data-pwconfigtoggle="text.bold"
					class=" paintweb_cfg_text_bold paintweb_icon">
					<a href="#" title="Bold">Bold</a>
				</div>
				<div data-pwconfigtoggle="text.italic"
					class=" paintweb_cfg_text_italic paintweb_icon">
					<a href="#" title="Italic">Italic</a>
				</div>
				<div data-pwconfig="text.textAlign" title="Text alignment"
					class=" paintweb_cfg_text_textAlign">
					<p>Text alignment</p>
					<div data-pwconfigvalue="left"
						class=" paintweb_textAlign_left paintweb_icon paintweb_configActive">
						<a href="#" title="Left">Left</a>
					</div>
					<div data-pwconfigvalue="center"
						class=" paintweb_textAlign_center paintweb_icon">
						<a href="#" title="Center">Center</a>
					</div>
					<div data-pwconfigvalue="right"
						class=" paintweb_textAlign_right paintweb_icon">
						<a href="#" title="Right">Right</a>
					</div>
				</div>
				<p class="paintweb_opt_textString">
					<label>String <textarea id="paintweb49242_textString"
							rows="2" cols="4" data-pwid="textString"
							class=" paintweb_textString">Hello   world!</textarea></label>
				</p>
			</div>
			<div data-pwtab="shadow" class=" paintweb_tab paintweb_main_shadow"
				style="display: none;">
				<p class="paintweb_opt_shadowEnable">
					<label><input data-pwconfig="shadow.enable" type="checkbox"
						value="1"
						title="If checked, a shadow will render after each drawing operation you do."
						class=" paintweb_cfg_shadow_enable">Enable shadows</label>
				</p>
				<p class="paintweb_opt_shadowColor">
					Color: <span data-pwcolorinput="shadow.shadowColor"
						class=" paintweb_colorInput paintweb_shadow_shadowColor"><a
						style="background-color: rgb(0, 0, 0); opacity: 1;" href="#"
						title="Shadow color">Click to pick color</a></span>
				</p>
				<p class="paintweb_opt_shadowOffsetX">
					<label>Distance X:<input
						data-pwconfig="shadow.shadowOffsetX" type="number" value="5"
						title="Distance X:" class=" paintweb_cfg_shadow_shadowOffsetX">
					</label>
				</p>
				<p class="paintweb_opt_shadowOffsetY">
					<label>Distance Y:<input
						data-pwconfig="shadow.shadowOffsetY" type="number" value="5"
						title="Distance Y:" class=" paintweb_cfg_shadow_shadowOffsetY">
					</label>
				</p>
				<p class="paintweb_opt_shadowBlur">
					<label>Blur:<input data-pwconfig="shadow.shadowBlur"
						type="number" value="5" min="0" title="Blur:"
						class=" paintweb_cfg_shadow_shadowBlur">
					</label>
				</p>
			</div>
			<p data-pwcommand="about"
				class=" paintweb_command paintweb_cmd_about">
				<a title="About PaintWeb [ F1 ]" href="#">About PaintWeb [ F1 ]</a>
			</p>
			<ul class="paintweb_tabsList">
				<li class="paintweb_tabActive"><a href="#" title="Main">Main</a></li>
				<li style=""><a href="#" title="Line">Line</a></li>
				<li style="display: none;"><a href="#" title="Selection">Selection</a></li>
				<li style="display: none;"><a href="#" title="Text">Text</a></li>
				<li><a href="#" title="Shadow">Shadow</a></li>
			</ul>
		</div>
		<div data-pwid="viewport" class=" paintweb_viewport"
			style="height: 400px;">
			<div data-pwid="canvasContainer" class="paintweb_canvasContainer"
				style="width: 650px; height: 503px;">
				<canvas width="650" height="503" class="paintweb_layerCanvas"
					style="width: 650px; height: 503px;"></canvas>
				<canvas width="650" height="503" class="paintweb_bufferCanvas"
					style="width: 650px; height: 503px;"></canvas>
				<div class="paintweb_mousekeysPointer" style="display: none;"></div>
			</div>
			<div data-pwid="canvasResizer" class=" paintweb_canvasResizer"
				title="Resize the image canvas." style="top: 503px; left: 650px;">Resize
				the image canvas.</div>
		</div>
		<div class="paintweb_statusbar">
			<p data-pwid="imageSize" class=" paintweb_imageSize">650x503</p>
			<p title="Zoom image" data-pwid="statusZoom"
				class=" paintweb_statusZoom">
				<label>Zoom:<input id="paintweb49242_imageZoom"
					type="number" min="20" max="400" value="100" step="5"
					data-pwid="imageZoom" class=" paintweb_imageZoom"></label>
			</p>
			<p data-pwid="statusMessage" class=" paintweb_statusMessage">Click
				anywhere to start drawing a line.</p>
			<p data-pwid="viewportResizer" class=" paintweb_viewportResizer"
				title="Resize the image viewport.">Resize the image viewport.</p>
		</div>
		<div data-pwfloatingpanel="colormixer" data-pwpanelhide="true"
			style="z-index: auto; display: none;"
			class=" paintweb_floatingPanel paintweb_floatingPanel_colormixer">
			<h1 class=" paintweb_floatingPanel_title">Color mixer</h1>
			<a href="#" title="Minimize" class="paintweb_floatingPanel_minimize">Minimize</a><a
				href="#" title="Close" class="paintweb_floatingPanel_close">Close</a>
			<div class=" paintweb_floatingPanel_content">
				<ol class="paintweb_colormixer_preview">
					<li data-pwid="colormixer_colorActive"
						class=" paintweb_colormixer_colorActive"><span>&nbsp;</span>
						Active</li>
					<li data-pwid="colormixer_colorOld"
						class=" paintweb_colormixer_colorOld"><span>&nbsp;</span> Old</li>
				</ol>
				<ol class="paintweb_colormixer_actions">
					<li data-pwid="colormixer_btn_accept"
						class=" paintweb_colormixer_btn_accept"><a href="#">Accept</a></li>
					<li data-pwid="colormixer_btn_cancel"
						class=" paintweb_colormixer_btn_cancel"><a href="#">Cancel</a></li>
					<li data-pwid="colormixer_btn_saveColor"
						class=" paintweb_colormixer_btn_saveColor"><a href="#">Save
							color</a></li>
					<li data-pwid="colormixer_btn_pickColor"
						class=" paintweb_colormixer_btn_pickColor"><a href="#">Pick
							color</a></li>
				</ol>
				<div data-pwtabpanel="colormixer_selector" data-pwtabdefault="mixer"
					class=" paintweb_tabPanel paintweb_tabPanel_colormixer_selector">
					<div data-pwtab="mixer"
						class=" paintweb_tab paintweb_colormixer_selector_mixer">
						<canvas width="200" height="195" data-pwid="colormixer_canvas"
							class=" paintweb_colormixer_canvas"
							style="width: 200px; height: 195px;">Your browser   does not support Canvas.</canvas>
						<div data-pwid="colormixer_controls"
							class=" paintweb_colormixer_controls"
							style="width: 200px; height: 195px;">
							<span data-pwid="colormixer_chartDot"
								class=" paintweb_colormixer_chartDot"></span> <span
								data-pwid="colormixer_slider"
								class=" paintweb_colormixer_slider"
								style="width: 20px; left: 178px;"></span>
						</div>
					</div>
					<div data-pwtab="cpalettes"
						class=" paintweb_tab paintweb_colormixer_selector_cpalettes"
						style="display: none;">
						<select id="paintweb49242_colormixer_cpaletteInput"
							data-pwid="colormixer_cpaletteInput"
							class=" paintweb_colormixer_cpaletteInput"><option
								value="_saved">Saved colors</option>
							<option value="windows">Windows</option>
							<option value="macos">Mac OS</option>
							<option value="web">Web safe</option></select>
						<div data-pwid="colormixer_cpaletteOutput"
							class=" paintweb_colormixer_cpaletteOutput"
							style="display: block;">
							<a href="#" style="background-color: rgb(0, 0, 0);">rgb(0,0,0)</a><a
								href="#" style="background-color: rgb(128, 0, 0);">rgb(128,0,0)</a><a
								href="#" style="background-color: rgb(0, 128, 0);">rgb(0,128,0)</a><a
								href="#" style="background-color: rgb(128, 128, 0);">rgb(128,128,0)</a><a
								href="#" style="background-color: rgb(0, 0, 128);">rgb(0,0,128)</a><a
								href="#" style="background-color: rgb(128, 0, 128);">rgb(128,0,128)</a><a
								href="#" style="background-color: rgb(0, 128, 128);">rgb(0,128,128)</a><a
								href="#" style="background-color: rgb(128, 128, 128);">rgb(128,128,128)</a><a
								href="#" style="background-color: rgb(192, 220, 192);">rgb(192,220,192)</a><a
								href="#" style="background-color: rgb(166, 202, 240);">rgb(166,202,240)</a><a
								href="#" style="background-color: rgb(42, 63, 170);">rgb(42,63,170)</a><a
								href="#" style="background-color: rgb(42, 63, 255);">rgb(42,63,255)</a><a
								href="#" style="background-color: rgb(42, 95, 0);">rgb(42,95,0)</a><a
								href="#" style="background-color: rgb(42, 95, 85);">rgb(42,95,85)</a><a
								href="#" style="background-color: rgb(42, 95, 170);">rgb(42,95,170)</a><a
								href="#" style="background-color: rgb(42, 95, 255);">rgb(42,95,255)</a><a
								href="#" style="background-color: rgb(42, 127, 0);">rgb(42,127,0)</a><a
								href="#" style="background-color: rgb(42, 127, 85);">rgb(42,127,85)</a><a
								href="#" style="background-color: rgb(42, 127, 170);">rgb(42,127,170)</a><a
								href="#" style="background-color: rgb(42, 127, 255);">rgb(42,127,255)</a><a
								href="#" style="background-color: rgb(42, 159, 0);">rgb(42,159,0)</a><a
								href="#" style="background-color: rgb(42, 159, 85);">rgb(42,159,85)</a><a
								href="#" style="background-color: rgb(42, 159, 170);">rgb(42,159,170)</a><a
								href="#" style="background-color: rgb(42, 159, 255);">rgb(42,159,255)</a><a
								href="#" style="background-color: rgb(42, 191, 0);">rgb(42,191,0)</a><a
								href="#" style="background-color: rgb(42, 191, 85);">rgb(42,191,85)</a><a
								href="#" style="background-color: rgb(42, 191, 170);">rgb(42,191,170)</a><a
								href="#" style="background-color: rgb(42, 191, 255);">rgb(42,191,255)</a><a
								href="#" style="background-color: rgb(42, 223, 0);">rgb(42,223,0)</a><a
								href="#" style="background-color: rgb(42, 223, 85);">rgb(42,223,85)</a><a
								href="#" style="background-color: rgb(42, 223, 170);">rgb(42,223,170)</a><a
								href="#" style="background-color: rgb(42, 223, 255);">rgb(42,223,255)</a><a
								href="#" style="background-color: rgb(42, 255, 0);">rgb(42,255,0)</a><a
								href="#" style="background-color: rgb(42, 255, 85);">rgb(42,255,85)</a><a
								href="#" style="background-color: rgb(42, 255, 170);">rgb(42,255,170)</a><a
								href="#" style="background-color: rgb(42, 255, 255);">rgb(42,255,255)</a><a
								href="#" style="background-color: rgb(85, 0, 0);">rgb(85,0,0)</a><a
								href="#" style="background-color: rgb(85, 0, 85);">rgb(85,0,85)</a><a
								href="#" style="background-color: rgb(85, 0, 170);">rgb(85,0,170)</a><a
								href="#" style="background-color: rgb(85, 0, 255);">rgb(85,0,255)</a><a
								href="#" style="background-color: rgb(85, 31, 0);">rgb(85,31,0)</a><a
								href="#" style="background-color: rgb(85, 31, 85);">rgb(85,31,85)</a><a
								href="#" style="background-color: rgb(85, 31, 170);">rgb(85,31,170)</a><a
								href="#" style="background-color: rgb(85, 31, 255);">rgb(85,31,255)</a><a
								href="#" style="background-color: rgb(85, 63, 0);">rgb(85,63,0)</a><a
								href="#" style="background-color: rgb(85, 63, 85);">rgb(85,63,85)</a><a
								href="#" style="background-color: rgb(85, 63, 170);">rgb(85,63,170)</a><a
								href="#" style="background-color: rgb(85, 63, 255);">rgb(85,63,255)</a><a
								href="#" style="background-color: rgb(85, 95, 0);">rgb(85,95,0)</a><a
								href="#" style="background-color: rgb(85, 95, 85);">rgb(85,95,85)</a><a
								href="#" style="background-color: rgb(85, 95, 170);">rgb(85,95,170)</a><a
								href="#" style="background-color: rgb(85, 95, 255);">rgb(85,95,255)</a><a
								href="#" style="background-color: rgb(85, 127, 0);">rgb(85,127,0)</a><a
								href="#" style="background-color: rgb(85, 127, 85);">rgb(85,127,85)</a><a
								href="#" style="background-color: rgb(85, 127, 170);">rgb(85,127,170)</a><a
								href="#" style="background-color: rgb(85, 127, 255);">rgb(85,127,255)</a><a
								href="#" style="background-color: rgb(85, 159, 0);">rgb(85,159,0)</a><a
								href="#" style="background-color: rgb(85, 159, 85);">rgb(85,159,85)</a><a
								href="#" style="background-color: rgb(85, 159, 170);">rgb(85,159,170)</a><a
								href="#" style="background-color: rgb(85, 159, 255);">rgb(85,159,255)</a><a
								href="#" style="background-color: rgb(85, 191, 0);">rgb(85,191,0)</a><a
								href="#" style="background-color: rgb(85, 191, 85);">rgb(85,191,85)</a><a
								href="#" style="background-color: rgb(85, 191, 170);">rgb(85,191,170)</a><a
								href="#" style="background-color: rgb(85, 191, 255);">rgb(85,191,255)</a><a
								href="#" style="background-color: rgb(85, 223, 0);">rgb(85,223,0)</a><a
								href="#" style="background-color: rgb(85, 223, 85);">rgb(85,223,85)</a><a
								href="#" style="background-color: rgb(85, 223, 170);">rgb(85,223,170)</a><a
								href="#" style="background-color: rgb(85, 223, 255);">rgb(85,223,255)</a><a
								href="#" style="background-color: rgb(85, 255, 0);">rgb(85,255,0)</a><a
								href="#" style="background-color: rgb(85, 255, 85);">rgb(85,255,85)</a><a
								href="#" style="background-color: rgb(85, 255, 170);">rgb(85,255,170)</a><a
								href="#" style="background-color: rgb(85, 255, 255);">rgb(85,255,255)</a><a
								href="#" style="background-color: rgb(127, 0, 0);">rgb(127,0,0)</a><a
								href="#" style="background-color: rgb(127, 0, 85);">rgb(127,0,85)</a><a
								href="#" style="background-color: rgb(127, 0, 170);">rgb(127,0,170)</a><a
								href="#" style="background-color: rgb(127, 0, 255);">rgb(127,0,255)</a><a
								href="#" style="background-color: rgb(127, 31, 0);">rgb(127,31,0)</a><a
								href="#" style="background-color: rgb(127, 31, 85);">rgb(127,31,85)</a><a
								href="#" style="background-color: rgb(127, 31, 170);">rgb(127,31,170)</a><a
								href="#" style="background-color: rgb(127, 31, 255);">rgb(127,31,255)</a><a
								href="#" style="background-color: rgb(127, 63, 0);">rgb(127,63,0)</a><a
								href="#" style="background-color: rgb(127, 63, 85);">rgb(127,63,85)</a><a
								href="#" style="background-color: rgb(127, 63, 170);">rgb(127,63,170)</a><a
								href="#" style="background-color: rgb(127, 63, 255);">rgb(127,63,255)</a><a
								href="#" style="background-color: rgb(127, 95, 0);">rgb(127,95,0)</a><a
								href="#" style="background-color: rgb(127, 95, 85);">rgb(127,95,85)</a><a
								href="#" style="background-color: rgb(127, 95, 170);">rgb(127,95,170)</a><a
								href="#" style="background-color: rgb(127, 95, 255);">rgb(127,95,255)</a><a
								href="#" style="background-color: rgb(127, 127, 0);">rgb(127,127,0)</a><a
								href="#" style="background-color: rgb(127, 127, 85);">rgb(127,127,85)</a><a
								href="#" style="background-color: rgb(127, 127, 170);">rgb(127,127,170)</a><a
								href="#" style="background-color: rgb(127, 127, 255);">rgb(127,127,255)</a><a
								href="#" style="background-color: rgb(127, 159, 0);">rgb(127,159,0)</a><a
								href="#" style="background-color: rgb(127, 159, 85);">rgb(127,159,85)</a><a
								href="#" style="background-color: rgb(127, 159, 170);">rgb(127,159,170)</a><a
								href="#" style="background-color: rgb(127, 159, 255);">rgb(127,159,255)</a><a
								href="#" style="background-color: rgb(127, 191, 0);">rgb(127,191,0)</a><a
								href="#" style="background-color: rgb(127, 191, 85);">rgb(127,191,85)</a><a
								href="#" style="background-color: rgb(127, 191, 170);">rgb(127,191,170)</a><a
								href="#" style="background-color: rgb(127, 191, 255);">rgb(127,191,255)</a><a
								href="#" style="background-color: rgb(127, 223, 0);">rgb(127,223,0)</a><a
								href="#" style="background-color: rgb(127, 223, 85);">rgb(127,223,85)</a><a
								href="#" style="background-color: rgb(127, 223, 170);">rgb(127,223,170)</a><a
								href="#" style="background-color: rgb(127, 223, 255);">rgb(127,223,255)</a><a
								href="#" style="background-color: rgb(127, 255, 0);">rgb(127,255,0)</a><a
								href="#" style="background-color: rgb(127, 255, 85);">rgb(127,255,85)</a><a
								href="#" style="background-color: rgb(127, 255, 170);">rgb(127,255,170)</a><a
								href="#" style="background-color: rgb(127, 255, 255);">rgb(127,255,255)</a><a
								href="#" style="background-color: rgb(170, 0, 0);">rgb(170,0,0)</a><a
								href="#" style="background-color: rgb(170, 0, 85);">rgb(170,0,85)</a><a
								href="#" style="background-color: rgb(170, 0, 170);">rgb(170,0,170)</a><a
								href="#" style="background-color: rgb(170, 0, 255);">rgb(170,0,255)</a><a
								href="#" style="background-color: rgb(170, 31, 0);">rgb(170,31,0)</a><a
								href="#" style="background-color: rgb(170, 31, 85);">rgb(170,31,85)</a><a
								href="#" style="background-color: rgb(170, 31, 170);">rgb(170,31,170)</a><a
								href="#" style="background-color: rgb(170, 31, 255);">rgb(170,31,255)</a><a
								href="#" style="background-color: rgb(170, 63, 0);">rgb(170,63,0)</a><a
								href="#" style="background-color: rgb(170, 63, 85);">rgb(170,63,85)</a><a
								href="#" style="background-color: rgb(170, 63, 170);">rgb(170,63,170)</a><a
								href="#" style="background-color: rgb(170, 63, 255);">rgb(170,63,255)</a><a
								href="#" style="background-color: rgb(170, 95, 0);">rgb(170,95,0)</a><a
								href="#" style="background-color: rgb(170, 95, 85);">rgb(170,95,85)</a><a
								href="#" style="background-color: rgb(170, 95, 170);">rgb(170,95,170)</a><a
								href="#" style="background-color: rgb(170, 95, 255);">rgb(170,95,255)</a><a
								href="#" style="background-color: rgb(170, 127, 0);">rgb(170,127,0)</a><a
								href="#" style="background-color: rgb(170, 127, 85);">rgb(170,127,85)</a><a
								href="#" style="background-color: rgb(170, 127, 170);">rgb(170,127,170)</a><a
								href="#" style="background-color: rgb(170, 127, 255);">rgb(170,127,255)</a><a
								href="#" style="background-color: rgb(170, 159, 0);">rgb(170,159,0)</a><a
								href="#" style="background-color: rgb(170, 159, 85);">rgb(170,159,85)</a><a
								href="#" style="background-color: rgb(170, 159, 170);">rgb(170,159,170)</a><a
								href="#" style="background-color: rgb(170, 159, 255);">rgb(170,159,255)</a><a
								href="#" style="background-color: rgb(170, 191, 0);">rgb(170,191,0)</a><a
								href="#" style="background-color: rgb(170, 191, 85);">rgb(170,191,85)</a><a
								href="#" style="background-color: rgb(170, 191, 170);">rgb(170,191,170)</a><a
								href="#" style="background-color: rgb(170, 191, 255);">rgb(170,191,255)</a><a
								href="#" style="background-color: rgb(170, 223, 0);">rgb(170,223,0)</a><a
								href="#" style="background-color: rgb(170, 223, 85);">rgb(170,223,85)</a><a
								href="#" style="background-color: rgb(170, 223, 170);">rgb(170,223,170)</a><a
								href="#" style="background-color: rgb(170, 223, 255);">rgb(170,223,255)</a><a
								href="#" style="background-color: rgb(170, 255, 0);">rgb(170,255,0)</a><a
								href="#" style="background-color: rgb(170, 255, 85);">rgb(170,255,85)</a><a
								href="#" style="background-color: rgb(170, 255, 170);">rgb(170,255,170)</a><a
								href="#" style="background-color: rgb(170, 255, 255);">rgb(170,255,255)</a><a
								href="#" style="background-color: rgb(212, 0, 0);">rgb(212,0,0)</a><a
								href="#" style="background-color: rgb(212, 0, 85);">rgb(212,0,85)</a><a
								href="#" style="background-color: rgb(212, 0, 170);">rgb(212,0,170)</a><a
								href="#" style="background-color: rgb(212, 0, 255);">rgb(212,0,255)</a><a
								href="#" style="background-color: rgb(212, 31, 0);">rgb(212,31,0)</a><a
								href="#" style="background-color: rgb(212, 31, 85);">rgb(212,31,85)</a><a
								href="#" style="background-color: rgb(212, 31, 170);">rgb(212,31,170)</a><a
								href="#" style="background-color: rgb(212, 31, 255);">rgb(212,31,255)</a><a
								href="#" style="background-color: rgb(212, 63, 0);">rgb(212,63,0)</a><a
								href="#" style="background-color: rgb(212, 63, 85);">rgb(212,63,85)</a><a
								href="#" style="background-color: rgb(212, 63, 170);">rgb(212,63,170)</a><a
								href="#" style="background-color: rgb(212, 63, 255);">rgb(212,63,255)</a><a
								href="#" style="background-color: rgb(212, 95, 0);">rgb(212,95,0)</a><a
								href="#" style="background-color: rgb(212, 95, 85);">rgb(212,95,85)</a><a
								href="#" style="background-color: rgb(212, 95, 170);">rgb(212,95,170)</a><a
								href="#" style="background-color: rgb(212, 95, 255);">rgb(212,95,255)</a><a
								href="#" style="background-color: rgb(212, 127, 0);">rgb(212,127,0)</a><a
								href="#" style="background-color: rgb(212, 127, 85);">rgb(212,127,85)</a><a
								href="#" style="background-color: rgb(212, 127, 170);">rgb(212,127,170)</a><a
								href="#" style="background-color: rgb(212, 127, 255);">rgb(212,127,255)</a><a
								href="#" style="background-color: rgb(212, 159, 0);">rgb(212,159,0)</a><a
								href="#" style="background-color: rgb(212, 159, 85);">rgb(212,159,85)</a><a
								href="#" style="background-color: rgb(212, 159, 170);">rgb(212,159,170)</a><a
								href="#" style="background-color: rgb(212, 159, 255);">rgb(212,159,255)</a><a
								href="#" style="background-color: rgb(212, 191, 0);">rgb(212,191,0)</a><a
								href="#" style="background-color: rgb(212, 191, 85);">rgb(212,191,85)</a><a
								href="#" style="background-color: rgb(212, 191, 170);">rgb(212,191,170)</a><a
								href="#" style="background-color: rgb(212, 191, 255);">rgb(212,191,255)</a><a
								href="#" style="background-color: rgb(212, 223, 0);">rgb(212,223,0)</a><a
								href="#" style="background-color: rgb(212, 223, 85);">rgb(212,223,85)</a><a
								href="#" style="background-color: rgb(212, 223, 170);">rgb(212,223,170)</a><a
								href="#" style="background-color: rgb(212, 223, 255);">rgb(212,223,255)</a><a
								href="#" style="background-color: rgb(212, 255, 0);">rgb(212,255,0)</a><a
								href="#" style="background-color: rgb(212, 255, 85);">rgb(212,255,85)</a><a
								href="#" style="background-color: rgb(212, 255, 170);">rgb(212,255,170)</a><a
								href="#" style="background-color: rgb(212, 255, 255);">rgb(212,255,255)</a><a
								href="#" style="background-color: rgb(255, 0, 85);">rgb(255,0,85)</a><a
								href="#" style="background-color: rgb(255, 0, 170);">rgb(255,0,170)</a><a
								href="#" style="background-color: rgb(255, 31, 0);">rgb(255,31,0)</a><a
								href="#" style="background-color: rgb(255, 31, 85);">rgb(255,31,85)</a><a
								href="#" style="background-color: rgb(255, 31, 170);">rgb(255,31,170)</a><a
								href="#" style="background-color: rgb(255, 31, 255);">rgb(255,31,255)</a><a
								href="#" style="background-color: rgb(255, 63, 0);">rgb(255,63,0)</a><a
								href="#" style="background-color: rgb(255, 63, 85);">rgb(255,63,85)</a><a
								href="#" style="background-color: rgb(255, 63, 170);">rgb(255,63,170)</a><a
								href="#" style="background-color: rgb(255, 63, 255);">rgb(255,63,255)</a><a
								href="#" style="background-color: rgb(255, 95, 0);">rgb(255,95,0)</a><a
								href="#" style="background-color: rgb(255, 95, 85);">rgb(255,95,85)</a><a
								href="#" style="background-color: rgb(255, 95, 170);">rgb(255,95,170)</a><a
								href="#" style="background-color: rgb(255, 95, 255);">rgb(255,95,255)</a><a
								href="#" style="background-color: rgb(255, 127, 0);">rgb(255,127,0)</a><a
								href="#" style="background-color: rgb(255, 127, 85);">rgb(255,127,85)</a><a
								href="#" style="background-color: rgb(255, 127, 170);">rgb(255,127,170)</a><a
								href="#" style="background-color: rgb(255, 127, 255);">rgb(255,127,255)</a><a
								href="#" style="background-color: rgb(255, 159, 0);">rgb(255,159,0)</a><a
								href="#" style="background-color: rgb(255, 159, 85);">rgb(255,159,85)</a><a
								href="#" style="background-color: rgb(255, 159, 170);">rgb(255,159,170)</a><a
								href="#" style="background-color: rgb(255, 159, 255);">rgb(255,159,255)</a><a
								href="#" style="background-color: rgb(255, 191, 0);">rgb(255,191,0)</a><a
								href="#" style="background-color: rgb(255, 191, 85);">rgb(255,191,85)</a><a
								href="#" style="background-color: rgb(255, 191, 170);">rgb(255,191,170)</a><a
								href="#" style="background-color: rgb(255, 191, 255);">rgb(255,191,255)</a><a
								href="#" style="background-color: rgb(255, 223, 0);">rgb(255,223,0)</a><a
								href="#" style="background-color: rgb(255, 223, 85);">rgb(255,223,85)</a><a
								href="#" style="background-color: rgb(255, 223, 170);">rgb(255,223,170)</a><a
								href="#" style="background-color: rgb(255, 223, 255);">rgb(255,223,255)</a><a
								href="#" style="background-color: rgb(255, 255, 85);">rgb(255,255,85)</a><a
								href="#" style="background-color: rgb(255, 255, 170);">rgb(255,255,170)</a><a
								href="#" style="background-color: rgb(204, 204, 255);">rgb(204,204,255)</a><a
								href="#" style="background-color: rgb(255, 204, 255);">rgb(255,204,255)</a><a
								href="#" style="background-color: rgb(51, 255, 255);">rgb(51,255,255)</a><a
								href="#" style="background-color: rgb(102, 255, 255);">rgb(102,255,255)</a><a
								href="#" style="background-color: rgb(153, 255, 255);">rgb(153,255,255)</a><a
								href="#" style="background-color: rgb(204, 255, 255);">rgb(204,255,255)</a><a
								href="#" style="background-color: rgb(0, 127, 0);">rgb(0,127,0)</a><a
								href="#" style="background-color: rgb(0, 127, 85);">rgb(0,127,85)</a><a
								href="#" style="background-color: rgb(0, 127, 170);">rgb(0,127,170)</a><a
								href="#" style="background-color: rgb(0, 127, 255);">rgb(0,127,255)</a><a
								href="#" style="background-color: rgb(0, 159, 0);">rgb(0,159,0)</a><a
								href="#" style="background-color: rgb(0, 159, 85);">rgb(0,159,85)</a><a
								href="#" style="background-color: rgb(0, 159, 170);">rgb(0,159,170)</a><a
								href="#" style="background-color: rgb(0, 159, 255);">rgb(0,159,255)</a><a
								href="#" style="background-color: rgb(0, 191, 0);">rgb(0,191,0)</a><a
								href="#" style="background-color: rgb(0, 191, 85);">rgb(0,191,85)</a><a
								href="#" style="background-color: rgb(0, 191, 170);">rgb(0,191,170)</a><a
								href="#" style="background-color: rgb(0, 191, 255);">rgb(0,191,255)</a><a
								href="#" style="background-color: rgb(0, 223, 0);">rgb(0,223,0)</a><a
								href="#" style="background-color: rgb(0, 223, 85);">rgb(0,223,85)</a><a
								href="#" style="background-color: rgb(0, 223, 170);">rgb(0,223,170)</a><a
								href="#" style="background-color: rgb(0, 223, 255);">rgb(0,223,255)</a><a
								href="#" style="background-color: rgb(0, 255, 85);">rgb(0,255,85)</a><a
								href="#" style="background-color: rgb(0, 255, 170);">rgb(0,255,170)</a><a
								href="#" style="background-color: rgb(42, 0, 0);">rgb(42,0,0)</a><a
								href="#" style="background-color: rgb(42, 0, 85);">rgb(42,0,85)</a><a
								href="#" style="background-color: rgb(42, 0, 170);">rgb(42,0,170)</a><a
								href="#" style="background-color: rgb(42, 0, 255);">rgb(42,0,255)</a><a
								href="#" style="background-color: rgb(42, 31, 0);">rgb(42,31,0)</a><a
								href="#" style="background-color: rgb(42, 31, 85);">rgb(42,31,85)</a><a
								href="#" style="background-color: rgb(42, 31, 170);">rgb(42,31,170)</a><a
								href="#" style="background-color: rgb(42, 31, 255);">rgb(42,31,255)</a><a
								href="#" style="background-color: rgb(42, 63, 0);">rgb(42,63,0)</a><a
								href="#" style="background-color: rgb(42, 63, 85);">rgb(42,63,85)</a><a
								href="#" style="background-color: rgb(255, 251, 240);">rgb(255,251,240)</a><a
								href="#" style="background-color: rgb(160, 160, 164);">rgb(160,160,164)</a><a
								href="#" style="background-color: rgb(128, 128, 128);">rgb(128,128,128)</a><a
								href="#" style="background-color: rgb(255, 0, 0);">rgb(255,0,0)</a><a
								href="#" style="background-color: rgb(0, 255, 0);">rgb(0,255,0)</a><a
								href="#" style="background-color: rgb(255, 255, 0);">rgb(255,255,0)</a><a
								href="#" style="background-color: rgb(0, 0, 255);">rgb(0,0,255)</a><a
								href="#" style="background-color: rgb(255, 0, 255);">rgb(255,0,255)</a><a
								href="#" style="background-color: rgb(0, 255, 255);">rgb(0,255,255)</a><a
								href="#" style="background-color: rgb(255, 255, 255);">rgb(255,255,255)</a>
						</div>
					</div>
					<ul class="paintweb_tabsList">
						<li class="paintweb_tabActive"><a href="#"
							title="Color space visualisation">Mixer</a></li>
						<li><a href="#" title="Predefined color palettes">Palettes</a></li>
					</ul>
				</div>
				<ol class="paintweb_colormixer_hexalpha">
					<li><label>Hex<input id="paintweb49242_ckey_hex"
							value="#RRGGBB" type="text" maxlength="7" pattern="#[a-f0-9]{6}"
							data-pwid="ckey_hex" class=" paintweb_ckey_hex"></label></li>
					<li><label>Alpha<input id="paintweb49242_ckey_alpha"
							value="100" type="number" min="0" max="100" step="1"
							data-pwid="ckey_alpha" class=" paintweb_ckey_alpha"></label></li>
				</ol>
				<form data-pwtabpanel="colormixer_inputs" data-pwtabdefault="rgb"
					class=" paintweb_tabPanel paintweb_tabPanel_colormixer_inputs">
					<ol data-pwtab="rgb"
						class=" paintweb_tab paintweb_colormixer_inputs_rgb">
						<li><input name="ckey" value="red" type="radio"> <label>Red<input
								name="ckey_red" value="0" type="number" min="0" max="255"
								step="1"></label></li>
						<li><input name="ckey" value="green" type="radio"> <label>Green<input
								name="ckey_green" value="0" type="number" min="0" max="255"
								step="1"></label></li>
						<li><input name="ckey" value="blue" type="radio"> <label>Blue<input
								name="ckey_blue" value="0" type="number" min="0" max="255"
								step="1"></label></li>
					</ol>
					<ol data-pwtab="hsv"
						class=" paintweb_tab paintweb_colormixer_inputs_hsv"
						style="display: none;">
						<li><input name="ckey" value="hue" type="radio"> <label>Hue<input
								name="ckey_hue" value="0" type="number" min="0" max="360"
								step="1"></label></li>
						<li><input name="ckey" value="sat" type="radio"> <label>Saturation<input
								name="ckey_sat" value="0" type="number" min="0" max="255"
								step="1"></label></li>
						<li><input name="ckey" value="val" type="radio"> <label>Value<input
								name="ckey_val" value="0" type="number" min="0" max="255"
								step="1"></label></li>
					</ol>
					<ol data-pwtab="lab"
						class=" paintweb_tab paintweb_colormixer_inputs_lab"
						style="display: none;">
						<li><input name="ckey" value="cie_l" type="radio"> <label>Lightness<input
								name="ckey_cie_l" value="0" type="number" min="0" max="100"
								step="1"></label></li>
						<li><input name="ckey" value="cie_a" type="radio"> <label>a*<input
								name="ckey_cie_a" value="0" type="number" min="-85" max="94"
								step="1"></label></li>
						<li><input name="ckey" value="cie_b" type="radio"> <label>b*<input
								name="ckey_cie_b" value="0" type="number" min="-109" max="95"
								step="1"></label></li>
					</ol>
					<ol data-pwtab="cmyk"
						class=" paintweb_tab paintweb_colormixer_inputs_cmyk"
						style="display: none;">
						<li><label>Cyan<input name="ckey_cyan" value="0"
								type="number" min="0" max="100" step="1"></label></li>
						<li><label>Magenta<input name="ckey_magenta"
								value="0" type="number" min="0" max="100" step="1"></label></li>
						<li><label>Yellow<input name="ckey_yellow" value="0"
								type="number" min="0" max="100" step="1"></label></li>
						<li><label>Key / Black<input name="ckey_black"
								value="0" type="number" min="0" max="100" step="1"></label></li>
					</ol>
					<ul class="paintweb_tabsList">
						<li class="paintweb_tabActive"><a href="#"
							title="sRGB: Standard Red, Green and Blue">RGB</a></li>
						<li><a href="#" title="Hue, Saturation and Value">HSV</a></li>
						<li><a href="#" title="CIE Lab: Standard observer 2° D65">Lab</a></li>
						<li><a href="#" title="Cyan, Magenta, Yellow and Key (Black)">CMYK</a></li>
					</ul>
				</form>
			</div>
		</div>
		<div data-pwfloatingpanel="about" data-pwpanelhide="true"
			style="z-index: auto; display: none;"
			class=" paintweb_floatingPanel paintweb_floatingPanel_about">
			<h1 class=" paintweb_floatingPanel_title">About PaintWeb</h1>
			<a href="#" title="Minimize" class="paintweb_floatingPanel_minimize">Minimize</a><a
				href="#" title="Close" class="paintweb_floatingPanel_close">Close</a>
			<div class=" paintweb_floatingPanel_content">
				<ul>
					<li data-pwid="version" class=" paintweb_version"><strong>Version:</strong>
						PaintWeb v0.9 (build 20100626)</li>
					<li><strong>Authors:</strong> <a
						href="http://www.robodesign.ro">Marius and Mihai Şucan (ROBO
							Design)</a></li>
					<li><strong>Project site:</strong> <a
						href="http://code.google.com/p/paintweb">code.google.com/p/paintweb</a></li>
					<li><strong>Code license:</strong> <a
						href="http://www.gnu.org/licenses/gpl-3.0.html"
						title="GNU General   Public License, version 3">GPLv3</a></li>
				</ul>
				<p>
					For user and developer documentation please check out the <a
						href="http://code.google.com/p/paintweb">project site</a>.
				</p>
			</div>
		</div>
	</div>

	<p>
		Do you have any feedback to provide? Please <a
			href="http://groups.google.com/group/paintweb">post it in the
			public mailing list</a>!
	</p>

	<!--[if lte IE 8]>
    <p>Please note that this application does not work in Internet Explorer 
    8. Please try this in Internet Explorer 9, or use any other modern web 
       browser: <a href="http://www.google.com/chrome">Chrome</a>, <a 
         href="http://www.mozilla.com">Firefox</a>, <a 
         href="http://www.apple.com/safari">Safari</a>, <a 
         href="http://www.opera.com">Opera</a> or <a 
         href="http://www.konqueror.org">Konqueror</a>.</p>
    <![endif]-->

	<script type="text/javascript" src="resources/painweb.js"></script>

	<script type="text/javascript">(function () {
  // Function called when the user clicks the "Edit image" button.
  function pwStart () {
    document.body.insertBefore(loadp, btn.parentNode);

    timeStart = (new Date()).getTime();
    pw.init(pwInit);
  };

  // Function called when the PaintWeb application fires the "appInit" event.
  function pwInit (ev) {
    var initTime = (new Date()).getTime() - timeStart,
        str = 'Demo: Yay, PaintWeb loaded in ' + initTime + ' ms! ' +
              pw.toString();

    document.body.removeChild(loadp);

    if (ev.state === PaintWeb.INIT_ERROR) {
      alert('Demo: PaintWeb initialization failed.');
      return;

    } else if (ev.state === PaintWeb.INIT_DONE) {
      if (window.console && console.log) {
        console.log(str);
      } else if (window.opera) {
        opera.postError(str);
      }

    } else {
      alert('Demo: Unrecognized PaintWeb initialization state ' + ev.state);

      return;
    }

    img.style.display = 'none';
    btn.style.display = 'none';
  };

  var img    = document.getElementById('editableImage'),
      btn    = document.getElementById('buttonEditImage'),
      target = document.getElementById('PaintWebTarget'),
      loadp  = document.createElement('p'),
      timeStart = null,

      // Create a PaintWeb instance.
      pw = new PaintWeb();

  pw.config.guiPlaceholder = target;
  pw.config.imageLoad      = img;
  pw.config.configFile     = 'config-example.json';
  loadp.appendChild(document.createTextNode('Loading, please wait...'));

  if (btn.addEventListener) {
    btn.addEventListener('click', pwStart, false);
  } else if (btn.attachEvent) {
    btn.attachEvent('onclick', pwStart);
  } else {
    btn.onclick = pwStart;
  }
})();
    --></script>

	<!-- vim:set spell spl=en fo=tcroqwanl1 tw=80 ts=2 sw=2 sts=2 sta et ai cin fenc=utf-8 ff=unix: -->

	<div id="paintweb_resInfo"></div>
</body>
</html>