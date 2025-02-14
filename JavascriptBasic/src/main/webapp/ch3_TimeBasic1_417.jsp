<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>clearInterval 메서드</title>

<style type="text/css">
</style>

<script type="text/javascript">
	window.onload = function() {
		
		var bt = document.getElementById('bt');
		var i = 0;
		
		var increase = setInterval(function() {
			i++;
			alert(i);
		}, 2000);
		
		bt.onclick = function() {
			clearInterval(increase);
		};
	};
</script>

</head>

<body>

	<button id="bt">멈춤</button>

</body>
</html>