<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>이벤트3 & 벨리데이션</title>

<style type="text/css">
div{
	border: 1px solid black;
}
</style>

<script type="text/javascript">
	
	
</script>

</head>

<body>

	<div id='container'>
		
		<form action="">
		
			숫자1: <input id='num1' type="text" name="num1">
			<br> 
			숫자2: <input id='num2' type="text" name="num2">
			
			 
			<input id='numSum' type="button" value="두 숫자 더한 결과는?">
			<input id='numReset' type="reset" value="초기화 같은 느낌?">
		</form>
		
		
	</div>
	
	<div>숫자 결과: 0</div>

</body>
<script type="text/javascript">

// 	태그 건드려도 됨 필요하면

// 	두 숫자를 더한다 numSum에 마우스를 올리면...
	
// 	그리고 div 태그의 배경색을 황금색으로 변경한다
// 	만약 1, 2를 입력했다면
// 	내용은 숫자 결과: 3
// 	이라고 변경한다	
// 단, 숫자가 하나라도 부족하면
// 1, 누락인 경우
// 	div 내용을 숫자 결과: 1
// 누락, 5인 경우
// 	숫자 결과: 5
// 로 표현하시오
</script>

</html>