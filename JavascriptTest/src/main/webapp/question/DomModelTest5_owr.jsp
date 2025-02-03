<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>웹 문서구조 CRUD</title>

<style type="text/css">
</style>

</head>
<body>
	<div id="theBox">
		<h1>요소 생성 연습</h1>
		
	</div>
</body>

<script type="text/javascript">
	
	var theBoxObj = document.getElementById('theBox');
	
	theBoxObj.style.backgroundColor = '#ddd';
	theBoxObj.style.border = '1px solid black';

	
	
	var newPTag = document.createElement('p');
	
	newPTag.textContent = '안녕';
	newPTag.style.border = '1px solid black';
	theBoxObj.appendChild(newPTag);
	
	var newSpanTag1 = document.createElement('span');
	var newSpanTag2 = document.createElement('span');
	
	newSpanTag1.textContent = 1;
	newSpanTag2.textContent = 2;

	
	theBoxObj.appendChild(newSpanTag1);
	theBoxObj.appendChild(newSpanTag2);
	
	newSpanTag1.setAttribute('class', 'spanGroup');
	newSpanTag2.setAttribute('class', 'spanGroup');
	
	
	
	spanGroupList = document.getElementsByClassName('spanGroup');
	
/* 	for (var i = 0; i < spanGroupList.length; i++) {
		spanGroupList[i].style.color = 'red';
		spanGroupList[i].style.border = '1px solid black';
		
	} */
	for (var i = 0; i < spanGroupList.length; i++) {
		spanGroupList[i].setAttribute('style', 
			'border: 1px solid black; color: red');
		
	} 
	
	
</script>

</html>