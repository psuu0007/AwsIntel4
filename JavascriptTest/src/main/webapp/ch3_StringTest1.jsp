<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>문자열 예제 풀기</title>

<style type="text/css">
</style>



</head>

<body>

	<div id='demo' style="border: 1px solid black; font-size: 30px;">

	</div>

</body>
<script type="text/javascript">
	var demo = document.getElementById('demo');

	var noChangeStr1 = '자바를 자바라';
	
	var findStr = '자바';
	
	var findPositionNum = noChangeStr1.indexOf(findStr);
	
	findPositionNum = noChangeStr1.indexOf(findStr, findPositionNum+1);
	
	var firstStr = noChangeStr1.substring(0, findPositionNum);
	var changeStr = noChangeStr1.substring(findPositionNum, findPositionNum + findStr.length);
	var lastStr = noChangeStr1.substring(findPositionNum + findStr.length);
	
	changeStr = changeStr.replace(findStr, '잡아');
	
	demo.innerHTML = firstStr + changeStr + lastStr;
</script>

</html>