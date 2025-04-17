<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>arrowBasic3</title>

<style type="text/css">

</style>

<script type="text/javascript">
// 	호이스팅?
	
	let hoisting = ''; 

	hoisting = testFnc();
	
	function testFnc() {
		return '거의 프론트 취업할려면 90퍼 확률로 묻는 설명하기 난해한 개념';
	}
</script>
</head>

<body>
	<div id='demo'></div>
</body>
<script type="text/javascript">
	document.getElementById('demo').innerHTML = hoisting;
</script>
</html>