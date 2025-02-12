<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>innerHTML 매우 중요</title>

<style type="text/css">

#demo > div{
	font-size: 20px;
}

</style>
</head>

<body>

	<div id='demo' style="border: 1px solid black;">
	
	</div>

</body>

<script type="text/javascript">
	var demoTag = document.getElementById('demo');
	
	demoTag.innerHTML = '<div>1</div>' + '<div>2</div>' + '<div>3</div>';
	
</script>
</html>