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
		<h1>요소 생성 연습</h1>
	</div>
</body>

<script type="text/javascript">
	var newPtag = document.createElement("p");
	var newButton1 = document.createElement("button");
	var newButton2 = document.createElement("button");
	var text1 = document.createTextNode("버튼1");
	var text2 = document.createTextNode("버튼2");

// 	newButton1.id = 'bnt1'; 비객체지향
	newButton1.setAttribute("id", "bnt1");
	newButton2.setAttribute("id", "bnt2");

	newButton1.appendChild(text1);
	newButton2.appendChild(text2);
	newPtag.appendChild(newButton1);
	newPtag.appendChild(newButton2);

	var theObj = document.getElementById("theBox");
	theObj.appendChild(newPtag);
</script>

</html>