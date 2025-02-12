<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>웹 문서구조 CRUD</title>

<style type="text/css">
#theBox {
	background-color: #ddd;
}
</style>

</head>
<body>
	<div id="theBox">
		<h1 id='drop'>요소 생성 연습</h1>
	</div>
</body>

<script type="text/javascript">
	var newPtag = document.createElement("p");
	var newButton1 = document.createElement("button");
	var newButton2 = document.createElement("button");
	var text1 = document.createTextNode("버튼1");
	

// 	newButton1.id = 'bnt1'; 비객체지향
	newButton1.setAttribute("id", "bnt1");
	newButton2.setAttribute("id", "bnt2");

	newButton1.appendChild(text1);
	newPtag.appendChild(newButton1);
	newPtag.appendChild(newButton2);
	
	var text2 = document.createTextNode(newButton2.getAttribute('id'));
	newButton2.appendChild(text2);

	newButton1.removeAttribute('id');
	
	var theObj = document.getElementById("theBox");
	theObj.appendChild(newPtag);
	
	var dropH1Obj = document.getElementById('drop');
	theObj.removeChild(dropH1Obj);
</script>

</html>