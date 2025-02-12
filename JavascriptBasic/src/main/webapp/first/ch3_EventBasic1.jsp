<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>이벤트1</title>

<style type="text/css">
div{
	border: 1px solid black;
}
</style>

<script type="text/javascript">
	function testFnc() {
		alert(100);
	}
	
	
</script>

</head>

<body>

	<div id='demo' onclick="alert('첫번째 방식');">
		이벤트란 무엇인가
	</div>

	<br>

	<div id='demo2'>
		이벤트 공부
	</div>

</body>
<script type="text/javascript">

	var demo2Obj = document.getElementById('demo2');

	demo2Obj.onclick = testFnc;
	
		
</script>

</html>