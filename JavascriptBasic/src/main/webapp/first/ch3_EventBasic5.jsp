<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>웹 표준 이벤트 등록2</title>

<style type="text/css">
div{
	border: 1px solid black;
}
</style>

<script type="text/javascript">
	
	
</script>

</head>

<body>
	
	<div id='primeSubject'>앞으론 이것만 써야함</div>
	
</body>

<script type="text/javascript">
// 	공통단
	function primeFnc() {
		alert('엄청 중요한듯?');
	}
	
	var primeSubjectTag = document.getElementById('primeSubject');
	
// 	primeSubjectTag.addEventListener('click', primeFnc);
	
// 	이것 전용
	primeSubjectTag.addEventListener('click', function() {
		alert('익명함수의 일반적인 사용법');
	});
	
	
</script>


</html>