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
        	$("#"+id).text("false").toggleClass("btn-success btn-danger");
        	}
        else{
        	$("#"+id).text("true").toggleClass("btn-danger btn-success");
        }
        $.doTimeout(1000, function(){
        	 window.location.replace("list");
        	});
       
        
      
	;};
	