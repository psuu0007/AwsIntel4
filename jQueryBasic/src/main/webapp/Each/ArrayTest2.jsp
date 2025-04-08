<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>468 ArrayTest2.jsp</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js">
</script>

<style type="text/css">
</style>

<script type="text/javascript">
// 	var obj = {num : 1, test: '설마'};
	
// 	alert(obj);
// 	alert(obj.num);
	
	var linkArr = [
		{name: 'naver', link: 'https://www.naver.com/'},
		{name: 'daum', link: 'https://www.daum.net/'},
		{name: 'google', link: 'https://www.google.co.kr/?hl=ko'}
	]; 

	$.each(linkArr, function(index, item) {
		alert(index + " : " + item.name);
		alert(index + " : " + item.link);
	});
	

// 	$(document).ready(function() {
// 		var htmlStr = '';
// 		$.each(cityArr, function(index, item) {
			
// 			htmlStr += '<a href="#' + index + '" style="font-size: 14px">';
// 			htmlStr += item;
// 			htmlStr += '</a>';
// 			htmlStr += '<br/>';
// 		});
		
// // 		document.getElementById('demo').innerHTML = htmlStr;
// 		$('#demo').html(htmlStr);
// 	});
</script>

</head>

<body>

	<div id='demo'>
		
		
	</div>

</body>
</html>