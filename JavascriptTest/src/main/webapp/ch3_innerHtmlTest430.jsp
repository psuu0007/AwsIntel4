<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>innerHTML 매우 중요</title>

<style type="text/css">
</style>
</head>

<body>

	<div id='demo' style="border: 1px solid black;">
		<h6>h6 재미있는 자바스크립트</h6>
		<h5>h5 재미있는 자바스크립트</h5>
		<h4>h4 재미있는 자바스크립트</h4>
		<h3>h3 재미있는 자바스크립트</h3>
		<h2>h2 재미있는 자바스크립트</h2>
		<h1>h1 재미있는 자바스크립트</h1>
	</div>

</body>

<script type="text/javascript">
	var demo = document.getElementById('demo');
	
	let htmlStr = '';
	
	for (var i = 6; i >= 1; i--) {
		htmlStr += '<h' + i + '>h' + i + ' 재미있는 자바스크립트</h' + i + '>';
	}
	
	demo.innerHTML = htmlStr;
	
</script>
</html>