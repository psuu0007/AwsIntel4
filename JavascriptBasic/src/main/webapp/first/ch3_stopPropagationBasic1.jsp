<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>이벤트 전파 막기</title>

<style type="text/css">
div {
	padding: 50px;
	background-color: rgba(255, 0, 0, 0.2);
	text-align: center;
	cursor: pointer;
}
</style>

<script type="text/javascript">
	
</script>

</head>

<body>

	<h1>The stopPropagation() Method</h1>

	<p>Click DIV 1:</p>
	
	<div onclick="func2()">
		DIV 2
		<div onclick="func1(event)">DIV 1</div>
	</div>

	Stop propagation:
	<input type="checkbox" id="check">

	<p></p>

	<p>
		Because DIV 1 is inside Div 2, both DIVs get clicked when you
		click on DIV 1.
	</p>
	<p>Check the stop propagation checkbox, and try again.</p>
	<p>
		The stopPropagation() method allows you to prevent propagation
		of the current event.
	</p>

</body>
<script type="text/javascript">
	function func1(event) {
		alert("DIV 1");
		if (document.getElementById("check").checked) {
			event.stopPropagation();
		}
	}

	function func2() {
		alert("DIV 2");
	}

	function humanInfoFnc() {

		document.body.setAttribute('id', 'trueBody');
		var bodyObj = document.getElementById('trueBody');

		var stuNameObj = document.getElementById('stuName');
		var stuAgeObj = document.getElementById('stuAge');
		var stuMoneyObj = document.getElementById('stuMoney');

		var infoTextDiv = '';

		infoTextDiv = '<div>이름: ' + stuNameObj.value + ' / 나이: '
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