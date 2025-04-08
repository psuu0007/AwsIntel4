<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>jsonBasic2</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js">
	
</script>

<style type="text/css">
</style>

<script type="text/javascript">
	var jsonArr = '{"emps" : [{"firstName" : "smith", "lastName" : "allen"},' + 
		'{"firstName" : "ward", "lastName" : "jpnes"},' + 
		'{"firstName" : "martin", "lastName" : "blake"}]}';
	
		
	let jsonObj = JSON.parse(jsonArr);
	
	alert(jsonObj.emps[0].firstName);

</script>

</head>

<body>

	

</body>
</html>