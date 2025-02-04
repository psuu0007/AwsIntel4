<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>비교 연산자</title>

<style type="text/css">

</style>

<script type="text/javascript">
	
	let num = 10;
	let str = '10';
	
	var str2 = 1 + '0';
	
	document.write('num == str: ' + (num == str));
	document.write('<br>');
	document.write('num === str: ' + (num === str));
	document.write('<br>');
	document.write('num == str2: ' + (num == str2));
	document.write('<br>');
	document.write('num === str2: ' + (num === str2));
	document.write('<br>');
	document.write('str == str2: ' + (str == str2));
	document.write('<br>');
	document.write('str === str2: ' + (str === str2));
	document.write('<br>');
	
</script>

</head>

<body>


</body>
</html>