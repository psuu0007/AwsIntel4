<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>이벤트 방지, 전파 예제1</title>
<style type="text/css">
#rootDiv {
	border: 5px solid red;
	padding: 30px;
}

#parentDiv {
	border: 5px solid green;
	padding: 30px;
}

#childLink{
	border: 5px solid black;
	padding: 10px;
}
</style>
<script type="text/javascript">

	window.onload = function() {
		
		var rootDivObj = document.getElementById('rootDiv');
		rootDivObj.addEventListener('click', rootDivFunc);
	
		var parentPObj = document.getElementById('parentP');
		parentPObj.addEventListener('click', parentPFunc);
	
		var childBtnObj = document.getElementById('childBtn');
		childBtnObj.addEventListener('click', childBtnFunc);
	
	
	};

	function rootDivFunc() {
		alert('rootDiv');
	}

	function parentPFunc() {
		alert('parentP');

	}

	function childBtnFunc() {
		alert("childBtn");
	}
</script>
</head>

<body>

	rootDiv
	<div id='rootDiv'>
		parentDiv
		<div id='parentDiv'>
			<a id="childLink" href="http://www.naver.com">버튼1</a>
			1.네이버로 이동이 불가능하도록 구현하시오
			대신, 버튼1 클릭을 하면 href 주소의 내용을 demo 태그에 출력하시오
			2.각각의 버튼을 누루면 다른 함수들이 출력되지 않게 방지하시오 
		</div>
		
	</div>
	
	<div id='demo'>
		
	</div>
	
</body>
</html>