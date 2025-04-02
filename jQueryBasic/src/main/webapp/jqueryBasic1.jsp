<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>440 jqueryBasic1</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js">
	
</script>

<style type="text/css">
</style>

<script type="text/javascript">
	window.onload = function() {
		alert('첫 onload문');
	};

	$(document).ready(function() {
		alert('첫 ready문');
	});

	window.onload = function() {
		alert('2 onload문');
	};

	$(document).ready(function() {
		alert('2 ready문');
		
		$('#demo').html('오 신기하다');
	});
</script>

</head>

<body>

	<div id='demo'>안녕</div>

</body>
</html>