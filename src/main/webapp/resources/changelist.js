function change(id){
		var selected=$("#span"+id+" option:selected").text();
		var roles={json:id,role:selected};
		$.ajax({
    	    type: 'POST',
        	url: "listrole", 
        	data: roles,
        	dataType: "json"
            });
	}