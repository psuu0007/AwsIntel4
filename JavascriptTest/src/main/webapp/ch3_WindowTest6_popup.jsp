<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>팝업창</title>

<style type="text/css">

</style>

<script type="text/javascript">
		
	
</script>

</head>

<body>

	<pre>
		부모태그에서 입력한 값이 1이면
		2024 으로 input 창에 뜨면 ok
		그리고 input 배경색 노란색으로 변경하자
		닫기 버튼 누르면 역시 자식창 닫게 하는데
		닫기 전에 2024같은 출생년도 정보 경고창에 뛰우고 닫게 하기
	</pre>
	
	<form action="">
		출생년도: <input type="text" value="" placeholder="ex: 1987">
	</form>

	<input id='childClose' type="button" value="창 닫기" />

</body>

</html>