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
			alert ("New Password and Confirm Password Not match.");
		}
	}
	else{
		alert ("Entered passwords do not match!");
	}
}