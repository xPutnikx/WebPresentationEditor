function sub(){
	var newpas=$("#newpassword").val();
	var confpas=$("#confirmpassword").val();
	var enterpas=$("#currentpassword").val();
	var Idu=$("#userId").val();
	var currentpas=$("#userPassword").val();
	if(enterpas == currentpas){
		if(newpas == confpas){
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
			errordialog();
			$( "#dialog" ).text("Password and Confirm Password Not match.")
			$( "#dialog" ).dialog( "open" );
		}
	}
	else{
		errordialog();
		$( "#dialog" ).text(" The Current Password is not Correct.")
		$( "#dialog" ).dialog( "open" );
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