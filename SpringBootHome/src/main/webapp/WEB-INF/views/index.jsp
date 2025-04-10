<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Hello Spring</title>

<script type="text/javascript" src="/js/jquery-3.7.1.min.js"></script>

</head>

<body>

<!-- 	<img alt="과연" src="./images/test.jpg"> -->
	<img alt="과연" src="/images/test.jpg">
	Hello Spring Projects..
	
	<div>
		<a href="./member/login">
			회원 목록 이동
		</a>
	</div>

	<div id='demo'></div>
	
	
</body>

<script type="text/javascript">
	var str = '연습';
	var tagStr = `
		<input type="text" value="\${str}">
	`;
	document.getElementById('demo').innerHTML = tagStr;
	
	$('*').css('border', '1px solid black');
</script>

</html>