<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>이벤트 onload</title>

<style type="text/css">
#demo {
	border: 1px solid black;
}
</style>

<script type="text/javascript">

	window.onload = function() {
		
		let divTagObj = document.getElementById('demo');
		
		alert(divTagObj.innerHTML.trim());
	};
	
</script>

</head>

<body>

	<div id='demo'>
		드디어 익명함수를 하네
	</div>

</body>



</html>