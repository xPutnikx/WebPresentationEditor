$('#title-text-area').textext({});

$('#tags-text-area').textext({
	plugins : 'autocomplete tags ajax',
	tagsItems : new String('${tagsAreaValue}').split(','),              
	ajax : {
		type : 'POST',
		url : 'presentations',
		dataType : 'json',
		dataCallback : function(query) {
			return {
				'query' : query
			}
		}
	}
});

$('#title-text-area').val('${titleAreaValue}');

$("#search-btn").click(
		function() {
			function buildTitleURI() {
				var titleParam = {
						title : JSON.parse('"' + titleText + '"')
				};
				return decodeURIComponent($.param(titleParam));
			}

			function buildTagsURI() {
				var tagsParam = {
						tag : JSON.parse(tagsText)
				};
				return decodeURIComponent($.param(tagsParam));
			}

			var titleTextArea = $("#title-text-area");
			var titleText = $.trim(titleTextArea.val());
			var tagsTextArea = $("#tags-text-area");
			var tagsText = $.trim(tagsTextArea.textext()[0].hiddenInput()
					.val());

			if (titleText.length != 0 && tagsText.length != 2) {
				window.location = 'presentations?' + buildTitleURI() + '&'
				+ buildTagsURI();
			} else if (titleText.length == 0 && tagsText.length != 2) {
				window.location = 'presentations?' + buildTagsURI();
			} else if (titleText.length != 0 && tagsText.length == 2) {
				window.location = 'presentations?' + buildTitleURI();
			} else {
				window.location = 'presentations';
			}

			return false;
		});