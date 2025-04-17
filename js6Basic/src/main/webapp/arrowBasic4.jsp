<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>arrowBasic4</title>

<style type="text/css">

</style>

<script type="text/javascript">
	const numArr = [1, 2, 3, 4, 5, 6];
// 	[2, 4, 6]
	const evenNumArr = numArr.filter(num => num % 2 === 0);
	
	let htmlStr = '';
	
// 	htmlStr = evenNumArr;
	
	//////////////////
// 	[10, 20, ,,,, 60]
	const numArr2 = numArr.map(num => num * 10);
// 	htmlStr = numArr2;
	/////////////////////////
	const numArr3 = numArr.map(num => num * 10).filter(num => num % 20 === 0);
	htmlStr = numArr3;
	
	
</script>
</head>

<body>
	<div id='demo'></div>
</body>
<script type="text/javascript">
	document.getElementById('demo').innerHTML = htmlStr;
</script>
</html>