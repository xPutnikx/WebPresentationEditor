function check(id,enabled){
		var Ide={json:id,enable:enabled};
        $.ajax({
    	    type: 'POST',
        	url: "list", 
        	data: Ide,
        	dataType: "json"
            })
        if(enabled)
        	{
        	$("#"+id).text("false").toggleClass("success danger");
        	}
        else{
        	$("#"+id).text("true").toggleClass("danger success");
        }
        $.doTimeout(1000, function(){
        	 window.location.replace("list");
        	});
	;};
	