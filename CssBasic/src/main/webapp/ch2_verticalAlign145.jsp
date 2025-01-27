<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>요소간의 세로 정렬</title>


<style type="text/css"> /*내부 스타일*/


div, p, a, span{
	border: 1px solid black;
	text-align: center;
}

</style>

</head>

<body>
	<div style="display: block;">블록1 div</div>

	<p style="display: block;">블록2 p</p>
	
	<a href="" style="display: inline; width: 1000px;">인라인1 a</a>

	<span style="display: inline;">인라인2 span</span>

	<br/>
	<hr/>
	<br/>
	
	<div style="display: none;">블록3 div</div>

	<p style="display: inline;">블록4 p</p>
	
	<a href="" style="display: block;">인라인3 a</a>

	<span style="display: block;">인라인4 span</span>	
	<span style="display: inline-block; width: 1000px;">인라인4 span</span>

</body>
</html>


