<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<style type="text/css">
#rootDiv {
	border: 5px solid red;
	padding: 30px;
}

#parentDiv {
	border: 5px solid green;
	padding: 30px;
}

#childBtn{
	border: 5px solid black;
	padding: 30px;
}

#parentDiv2 {
	border: 5px solid green;
	padding: 30px;
	margin-top: 10px;
}

#childBtn2 {
	border: 5px solid black;
	padding: 30px;
}
</style>
<script type="text/javascript">
	window.onload = function() {

// 		버튼1은 태그에 더블클릭을 적용하는데
// 		this를 활용해서 버튼의 넓이를 10px씩 늘리시오
		
// 		버튼2는 listner를 click으로 적용해서 
// 		어떤 태그가 이벤트 시작 태그이고 (콘솔 표현)
// 		버튼2의 배경색을 변경하시오
		
	};

	
</script>
</head>

<body>
	rootDiv
	<div id='rootDiv' title="난 최상위 Div야">
		parentDiv
		<div id='parentDiv' title='난 첫번째 부모DIv야'>
			<button id="childBtn" title='난 첫번째 부모의 자식Button이야'>버튼1</button>
		</div>
		
		parentDiv2
		<div id='parentDiv2' title="난 두번째 부모 Div야">
			<button id="childBtn2" title="난 두번째 부모의 자식Button이야">버튼2</button>
		</div>
	</div>
</body>
</html>