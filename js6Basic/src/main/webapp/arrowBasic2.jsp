<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>arrowBasic2</title>

<style type="text/css">

</style>

<script type="text/javascript">
	
	const numArr = [1, 45, 9, 25];
	
	let str = '';
	
	for (var i = 0; i < numArr.length; i++) {
		console.log(numArr[i]);
	}

	console.log('=======================');
	
	for(let x in numArr){
		console.log(numArr[x]);
	}
	
	const carArr = ['a', '현대', '기아'];
	
	console.log('=======================');
	
	let carStr = '';
	for(let x of carArr){
		carStr += x + ', ';
	}
	
	console.log(carStr);
	
	console.log('=======================');
	const personObj = {
		fName: 'john', lName: 'conner', age: 25
	};
	
	let txt = '';
	for(let x in personObj){
		txt += x + " : " + personObj[x] + ', ';
	}
	
	console.log(txt);
	
	console.log('=======================');
	
	const numList = [11, 22, 44, 88];
	
	let numStr = '';
	numList.forEach(forTestFnc);
	
	function forTestFnc(item) {
		numStr += item + '<br>';
	}
</script>

</head>

<body>

	<div id='demo'></div>

</body>
<script type="text/javascript">
	document.getElementById('demo').innerHTML = numStr;
</script>
</html>