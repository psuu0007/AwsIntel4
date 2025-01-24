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

	<div class="aBox">
		<p>7월의 여행지</p>
		<p>8월의 여행지</p>
		<ul>
			<li><p id='first'>자식 선택자로 글자색 원하는거</p></li>
			<li><p id='second'>자식 선택자로 글자 크기 20px</p></li>
		</ul>
	</div>
	
	<p>내년의 여행지</p>
	
	<div id='container'>
		<div class="bBox">
			<p>나 경계선 빨간색 난 자유롭게 선택</p>
			<p>나 경계선 빨간색 난 자유롭게 선택</p>
			<ul>
				<li><p class='exam'>하위 선택자로 경계선 파란색</p></li>
				<li><p>ㅁㅁㅁ</p></li>
			</ul>
		</div>
		
		<p>글자 진하게, 기울임</p>
	</div>

</body>
</html>