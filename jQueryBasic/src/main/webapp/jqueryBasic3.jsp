<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>447 jqueryBasic3</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js">
	
</script>

<style type="text/css">
</style>

<script type="text/javascript">

	$(document).ready(function() {
		$('h1, p').css('color', 'orange');
		
		$('#p2').css('background', 'blue');
	});
</script>

</head>

<body>

	<h1>기본 선택자 배우기1</h1>
	<p>태그 선택자1</p>
	<h1>기본 선택자 배우기2</h1>
	<p id='p2'>태그 선택자2</p>

</body>
</html>