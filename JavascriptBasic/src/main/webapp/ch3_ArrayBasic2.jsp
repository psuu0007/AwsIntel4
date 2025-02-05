<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>2차원 배열</title>

<style type="text/css">

</style>

<script type="text/javascript">

	var numArr = [];
	
	for (var i = 0; i < 3; i++) {
		
		numArr[i] = new Array();
		for (var n = 0; n < 4; n++) {
			numArr[i][n] = n;
		}
		
	}
	
// 	document.getElementById('demo').innerHTML = numArr;
	document.write(numArr);
	
// 	numArr[0] = new Array();
// 	numArr[1] = new Array();
	
</script>

</head>

<body id='demo'>


</body>
</html>