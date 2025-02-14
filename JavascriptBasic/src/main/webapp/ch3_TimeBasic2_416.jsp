<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>setInterval 메서드</title>

<style type="text/css">
</style>

<script type="text/javascript">
	var i = 0;
	setInterval(function() {
		i++;
		alert('2초 마다 실행' + i);
	}, 2000);
</script>

</head>

<body>


</body>
</html>