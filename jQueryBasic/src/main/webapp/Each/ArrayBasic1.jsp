<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>468 ArrayBasic1.jsp</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js">
</script>

<style type="text/css">
</style>

<script type="text/javascript">
	var cityArr = ["서울", "대구", "부산"];

// 	$.each(cityArr, function(index, item) {
// 		alert(index + " : " + item);
// 	});
	
	
	
	$(document).ready(function() {
		var htmlStr = '';
		$.each(cityArr, function(index, item) {
			
			htmlStr += '<a href="#' + index + '" style="font-size: 14px">';
			htmlStr += item;
			htmlStr += '</a>';
			htmlStr += '<br/>';
		});
		
// 		document.getElementById('demo').innerHTML = htmlStr;
		$('#demo').html(htmlStr);
	});
</script>

</head>

<body>

	<div id='demo'>
		
		
	</div>

</body>
</html>