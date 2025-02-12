<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>BOM6 - parent</title>

<style type="text/css">
#openTest{
	border: 1px solid black;
}
</style>

<script type="text/javascript">
	var windowOptionStr = '';
	windowOptionStr += 'width=400px, height=500px';
	windowOptionStr += ', left=200px, top=20px';
	windowOptionStr += ', scrollbars=no, toolbar=no, location=no';
	
	let childWindowObj = null;
	
	window.onload = function() {
		let openTestTag = document.getElementById('openTest');
		
		openTestTag.addEventListener('mouseleave', function(e) {
			childWindowObj = window.open("./ch3_WindowBasic6_Child.jsp", "myHtml"
				, windowOptionStr);
		});
	};
	
	function receiveChildInfoFnc() {
		
		let childInputTag = childWindowObj.document
			.querySelectorAll('#sendInfo > input[type]')[0];
		
// 		alert(childInputTag.value);

		document.getElementById('receiveInfo').innerHTML = childInputTag.value;
		
		childWindowObj.close();
	}
</script>

</head>

<body>

	<h1 id='openTest'>오프너페이지</h1>

	<input id='parentInfo' type="text" value="">
	
	<button onclick="receiveChildInfoFnc();">
		나 누르면 자식 정보 가져옴
	</button>
	
	<p id='receiveInfo'></p>
	
</body>

</html>