<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>이벤트2</title>

<style type="text/css">
div{
	border: 1px solid black;
}
</style>

<script type="text/javascript">
	
	
</script>

</head>

<body>

	<div id='container'>
		
		<form action="">
		
			<input id='stuName' type="text" name="stuName" value="">
			<input id='stuAge' type="text" name="stuAge" value="">
			<input id='stuMoney' type="text" name="stuMoney" value="">
		
			<input id='submitBtn' type="button" value="제출">
		</form>
		
		
	</div>
	
</body>
<script type="text/javascript">

	function humanInfoFnc() {
		
		document.body.setAttribute('id', 'trueBody');
		var bodyObj = document.getElementById('trueBody');
		
		var stuNameObj = document.getElementById('stuName');
		var stuAgeObj = document.getElementById('stuAge');
		var stuMoneyObj = document.getElementById('stuMoney');
		
		
		var infoTextDiv = '';
		
		infoTextDiv = '<div>이름: ' + stuNameObj.value 	+ ' / 나이: ' 
			+ stuAgeObj.value + ' / 소지금: ' + stuMoneyObj.value + '</div>';
		
		bodyObj.innerHTML += infoTextDiv;
		
	}
		
	var submitBtn = document.getElementById('submitBtn');
	
	submitBtn.ondblclick = humanInfoFnc;
	
	//------------------------
	
// 	기본 함수 배우기
	let str1 = '98.12';
	
	let num1 = 100;
	
	let sum = str1 + num1;
	
	console.log(sum);
	
	sum = parseInt(str1) + num1;
	console.log('parseInt: ' + sum);
	
	sum = parseFloat(str1) + num1;
	console.log('parseFloat: ' + sum);
	
	sum = Number(str1) + num1;
	console.log('Number: ' + sum);	
</script>

</html>