<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>이벤트 표준과 비표준의 차이</title>

<style type="text/css">
div{
	border: 1px solid black;
}
</style>

<script type="text/javascript">
	
	
</script>

</head>

<body>
	
	<div id='standardDemo'>표준</div>
	
	<br>
	
	<div id='unstandardDemo'>비표준</div>
	
</body>

<script type="text/javascript">

	var standardDemoObj = document.getElementById('standardDemo');
	
	standardDemoObj.addEventListener('click', function() {
		alert('난 표준1');
	});
	
	standardDemoObj.addEventListener('click', function() {
		alert('난 표준2');
	});


	function testFnc() {
		alert('비표준 1');
	}

	function testFnc2() {
		alert('비표준 2');
	}
	
	var unstandardDemoObj = document.getElementById('unstandardDemo');
	unstandardDemoObj.onclick = testFnc;
	
	unstandardDemoObj.onclick = testFnc2;
	
	
	
	
</script>


</html>