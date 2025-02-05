<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>배열 test</title>

<style type="text/css">
</style>



</head>

<body>

	<div id='foodDemo' style="border: 1px solid black;">
		
	</div>	
	
	<div id='subwayDemo' style="border: 1px solid black;">
		
	</div>	

</body>

<script type="text/javascript">
	var theFoodArr = [ "짜장면", "냉면", "갈비탕", "돈까스", "삼겹살" ];
	
// 	역순 출력하기
	

	//2. 오름차순 정렬하기
	var theSubwayArr = [ "2호선", "9호선", "7호선", "4호선", "3호선" ];

	theSubwayArr.sort();
	console.log(theSubwayArr)

	//3 구구단 7단 결과값을 배열에 저장하고 
	// 경고창에 출력하기
// 	ex: 
// 		0 7
// 		1 14
// 		2 31
// 		,
// 		,
// 		8 63
	
</script>

</html>