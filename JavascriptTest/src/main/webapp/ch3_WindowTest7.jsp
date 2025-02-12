<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>BOM6 - parent</title>

<style type="text/css">
</style>

<script type="text/javascript">
	
	window.onload = function() {
		let parentInfoObj = document.getElementById('parentInfo');
		
		var windowOptinoStr = '';
		windowOptinoStr += 'width=500px, height=200px';
		windowOptinoStr += ', left=750px, top=400px';
		
		parentInfoObj.addEventListener('blur', function(e) {
			window.open('./ch3_WindowTest7_popup.jsp','popup', windowOptinoStr);
		});
	};
	
</script>

</head>

<body>

	<h1>부모, 자식 정보 교환1</h1>
	<pre>
		나이를 입력한다
		그러면 팝업창에서는 몇 년도 생인지 
		출생년도를 출력해준다
	</pre>
	
	<form action="">
		나이: <input id='parentInfo' type="text" value="">	
	</form>

	<hr>
	
	<span id='tinyGroup'>
		<input type="email" value="" placeholder="아이디@megaStudy.edu 형식으로 처리">
		<input type="button" value="자식창 아이디 받기 버튼">
	</span>
	
	
	
	<div>자식창 닫기 버튼</div>
	
</body>

</html>