<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>배열1</title>

<style type="text/css">

</style>

<script type="text/javascript">
// 	387
	
	var strArr = ['가', '나다', '라마바사', 4];
	
	for (var i = 0; i < strArr.length; i++) {
		console.log(strArr[i]);
	}
	
	for (var item in strArr) {
		document.write(item);
		document.write('<br/>');
	}
	
	document.write('<hr/>');
	
	for (var obj of strArr) {
		document.write(obj);
		document.write('<br/>');
	}
	
</script>

</head>

<body>


</body>
</html>