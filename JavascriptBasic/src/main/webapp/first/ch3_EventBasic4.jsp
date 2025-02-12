<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>웹 표준 이벤트 등록</title>

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
	
	function primeFnc() {
		alert('엄청 중요한듯?');
	}
	
	var primeSubjectTag = document.getElementById('primeSubject');
	
	primeSubjectTag.addEventListener('click', primeFnc);
	
	
	
</script>


</html>