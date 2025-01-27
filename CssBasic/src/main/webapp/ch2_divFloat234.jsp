<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>div, float1</title>

<style type="text/css">
#container {
	width: 600px;
	height: 400px;
	background: green;
	border: 1px solid #000;
}

#container > div{
	width: 100px;
	height: 100px;
	border: 1px solid #000;
}

#container2 {
	width: 400px;
	height: 400px;
	border: 1px solid #000;
}

#container2 > div{
	width: 100px;
	height: 100px;
	border: 1px solid #000;
}
</style>

</head>
<body>

<!-- 	<div id="container"> -->
<!-- 		<div style="float: inline;">1</div> -->
<!-- 		<div style="float: inline;">2</div> -->
<!-- 		<div style="float: inline;">3</div> -->
<!-- 	</div> -->
	
<!-- 	<div id="container2"> -->
<!-- 		<div style="float: inline;">2_1</div> -->
<!-- 		<div style="float: inline;">2_2</div> -->
<!-- 		<div style="float: inline;">2_3</div> -->
<!-- 	</div> -->
	
	<div id="container">
		<div style="float: left;">1</div>
		<div style="float: left;">2</div>
		<div style="float: left;">3</div>
	</div>
	
	<div id="container2">
		<div style="float: right;">2_1</div>
		<div style="float: right;">2_2</div>
		<div style="float: right;">2_3</div>
	</div>
	
	
	
</body>
</html>