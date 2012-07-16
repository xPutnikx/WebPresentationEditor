function del(id,name){
		var delet={json:id};
		 $.ajax({
	    	    type: 'POST',
	        	url: "listdelete", 
	        	data: delet,
	        	dataType: "json"
	            });
	}