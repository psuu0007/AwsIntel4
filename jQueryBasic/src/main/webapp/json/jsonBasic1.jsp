<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>jsonBasic1</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js">
	
</script>

<style type="text/css">
</style>

<script type="text/javascript">
	var jsonStr = '{"firstName" : "ara"}';
	
// 	alert(jsonStr);
	
	var jsonObj = JSON.parse(jsonStr);
// 	alert(jsonObj);
// 	alert(jsonObj.firstName);
	
	var jsonStr2 = '{"firstName" : "ara", "lastName" : "IRaSa"}';
	
	var jsonObj2 = JSON.parse(jsonStr2);
	
	alert(jsonObj2.lastName);
	
	jsonObj2.lastName = '이랏샤이마세';
	
	alert(jsonObj2.lastName);
</script>

</head>

<body>

	

</body>
</html>