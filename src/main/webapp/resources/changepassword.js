function sub(){
	var newpas=$.trim($("#newpassword").val());
	var confpas=$.trim($("#confirmpassword").val());
	var enterpas=$.trim($("#currentpassword").val());
	var Idu=$("#userId").val();
	var currentpas=$("#userPassword").val();
	if(enterpas == currentpas && (currentpas != "" && confpas != "")){
		if(newpas == confpas && newpas != "" && confpas != ""){
			var newpassword={password:newpas,id:Idu};
			$.ajax({
	    		type: 'POST',
    			url: "changepassword", 
    			data: newpassword,
    			dataType: "json"
        	});
			window.location.replace("userpage");
		}
		else{
			$("#confirmlabel").toggleClass("clearfix error");
			$("#confirmlabel").html('<span class="help-inline" id="errorconfirm" >Confirm password is not match</span>');
			 $.doTimeout(2000, function(){
				 $("#confirmlabel").toggleClass("clearfix error");
				 $("#errorconfirm").remove();
			 });
		}
	}
	else{
		$("#currentlabel").toggleClass("clearfix error");
		$("#currentlabel").html('<span class="help-inline" id="error" >Wrong password</span>');
		 $.doTimeout(2000, function(){
			 $("#currentlabel").toggleClass("clearfix error");
			 $("#error").remove();
        	});
	}
	}
function errordialog() {
	
	$.fx.speeds._default = 1000;
		$( "#dialog" ).dialog({
			autoOpen: false,
			show: "blind",
			hide: "explode"
		});
	
};
