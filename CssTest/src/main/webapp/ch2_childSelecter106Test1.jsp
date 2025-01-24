<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>하위, 자식 선택자</title>


<style type="text/css"> 

</style>

</head>
  
<body>

	<p>나는 자유롭게 선택자 선택해서 글자 진하게, 가운데 정렬시켜줘</p>
	
	<div id='container'>
		<div class="divBox">
			<p>나 경계선 빨간색 난 자식선택으로</p>
			<p>나 경계선 빨간색 난 자식선택으로</p>
			<ul>
				<li class='exam'><p>하위 선택자로 글자 크기 20px</p></li>
				<li class='exam'><p>하위 선택자로 글자 크기 20px</p></li>
			</ul>
		</div>
		
		<p id='lastPTag'>글자 진하게, 기울임</p>
	</div>

</body>
</html>