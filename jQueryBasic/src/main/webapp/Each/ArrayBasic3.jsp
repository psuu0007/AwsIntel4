<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>483 ArrayBasic3.jsp</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js">
</script>

<style type="text/css">
.high-light-0{
	background: red;
}
.high-light-1{
	background: orange;
}
.high-light-2{
	background: yellow;
}
.high-light-3{
	background: green;
}
.high-light-4{
	background: blue;
}
</style>

<script type="text/javascript">

	$(document).ready(function() {
	
		$('h1').each(function(i, item) {

			$(item).addClass('high-light-' + i);
			
		});

	});

</script>

</head>

<body>
	
	<h1>item-0</h1>
	<h1>item-1</h1>
	<h1>item-2</h1>
	<h1>item-3</h1>
	<h1>item-4</h1>
	

</body>
</html>