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
window.onload = function() {
	var newDiv = document.createElement('div');
	var newP = document.createElement('p');
	var textP = document.createTextNode('안녕');
	var textSpan1 = document.createTextNode('1');
	var textSpan2 = document.createTextNode('2');
	var newSpan1 = document.createElement('span');
	var newSpan2 = document.createElement('span');
	
/* 	newDiv.getAttribute('id'); */
	newDiv.setAttribute('id', 'crudDiv');
	
// 	newSpan1.getAttribute('class');
	newSpan1.setAttribute('class', 'spanGroup');
// 	newSpan2.getAttribute('class');
	newSpan2.setAttribute('class', 'spanGroup');

	
	newDiv.appendChild(newP);
	newDiv.appendChild(newSpan1);
	newDiv.appendChild(newSpan2);
	
	newP.appendChild(textP);
	newP.style.border = '1px solid black';
	
	newSpan1.appendChild(textSpan1);
	newSpan1.style.color = 'red';
	
	newSpan2.appendChild(textSpan2);
	newSpan2.style.color = 'red';
	
	//id theBox에 p태그를 자식으로
	var theObj = document.getElementById("theBox");
	
	theObj.style.border = '1px solid black';
	theObj.style.backgroundColor = '#ddd';
	
	newSpan1.style.border = '1px solid black';
	newSpan2.style.border = '1px solid black';
	
	theObj.appendChild(newDiv);
}

	
</script>

</html>