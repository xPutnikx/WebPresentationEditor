function del(id){
		var delet={json:id};
		$("#tr"+id).fadeOut('slow')
		 $.doTimeout(500, function(){
			 $.ajax({
		    	    type: 'POST',
		        	url: "listdelete", 
		        	data: delet,
		        	dataType: "json"
		            });
        	});
	}