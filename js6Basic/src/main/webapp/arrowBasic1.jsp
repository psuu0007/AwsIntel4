<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>arrowBasic1</title>

<style type="text/css">

</style>

<script type="text/javascript">
/*
	이름있는 함수
	이름없는 함수
	
	ES6에서 소개됨
	화살표 함수(Arrow Function)
*/
	const addFnc = function(a, b) {
		return a + b;
	};
	
	alert('익명함수: ' + addFnc(1, 2));
	
	const add = (a, b) => a + b;
	
	alert('애로우함수: ' + add(10, 20));
/*	
	함수 표기법의 특징
	전통적 함수 선언식
	function 키워드 사용, 명시적이고 가독성이 높음, 상대적으로 긴 코드, this 이슈
	
	arrow 함수 
	=> 구문으로 작성, 상대적으로 간결하고, this 이슈 해결, 복잡한 함수 구조에는 부적합함
	(가독성 부분에 대해서 그렇다는 거지, 로직의 복잡함과는 다름)
*/	
</script>

</head>

<body>



</body>
</html>