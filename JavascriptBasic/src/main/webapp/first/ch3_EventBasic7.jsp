<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>이벤트 버블링, 캡처링</title>

<style type="text/css">
body * {
	margin: 15px;
	border: 1px solid green;
}
</style>

<script type="text/javascript">
	
	window.onload = function () {
		var formObj = document.getElementById('formObj');
		formObj.addEventListener('click', function() {
			alert('formObj');
		});
		
		var divObj = document.getElementById('divObj');
		divObj.addEventListener('click', function() {
			alert('divObj');
		}, true);
		
		var childObj = document.getElementById('childObj');
		childObj.addEventListener('click', function() {
			alert('childObj');
		}, true);
	};
	
</script>

</head>

<body>

	<form id='formObj'>
		FORM
		<div id='divObj'>
			DIV
			<p id='childObj'>
				P
			</p>
		</div>
	</form>

</body>

<script type="text/javascript">
	
</script>


</html>