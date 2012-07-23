function del(presentationId) {
	$.ajax({
		type : 'POST',
		url : "presentation/delete",
		data : {
			id : presentationId
		},
		dataType : "json"
	});
	$.doTimeout(500, function() {
		window.location = "presentations"
	});
}