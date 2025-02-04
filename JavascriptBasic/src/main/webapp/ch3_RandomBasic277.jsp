<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>random</title>

<style type="text/css">
</style>

<script type="text/javascript">
	var imgNum = Math.floor(Math.random() * 3) + 1;
	document.write("<img src=' images/img"+imgNum+".jpg ' alt='랜덤이미지' />");
</script>

</head>

<body>


</body>
</html>