<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>arrowBasic5</title>

<style type="text/css">

</style>

<script type="text/javascript">
	const numList = [1, 2, 3, 4, 5, 6];

	const numListFilterling = numList.filter(function(elt, i, arr) {
		if(elt > 3){
			alert(i + ' : ' + arr);
			return true;
		}else{
			return false;
		}
	});
	
	
</script>
</head>

<body>
	<div id='demo'></div>
</body>
<script type="text/javascript">
	document.getElementById('demo').innerHTML = numListFilterling;
</script>
</html>