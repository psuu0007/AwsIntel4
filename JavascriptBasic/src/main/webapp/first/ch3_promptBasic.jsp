<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>프롬프트</title>

<style type="text/css">

</style>

<script type="text/javascript">
	
	let gender = prompt("당신의 성별은?", '여성');
	let age = prompt('나이는?');
	
	let resultStr = age >= 20 && age < 30 && gender == '여성';
	
	alert(resultStr);
	
</script>

</head>

<body>


</body>
</html>