<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>this</title>
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
	
	function rootDivFunc() {
		alert('rootDiv');
		alert(this.title);
	}

	function parentDivFunc(obj) {
		alert('parentDiv');

		alert(this.title);
		alert(obj.title);
		
	}

	function childBtnFunc() {
		alert("childBtn");
// 		alert(this);  // Window 객체다
		alert(this.title);
	}
	
	window.onload = function() {
		
		let rootDivObj = document.getElementById('rootDiv');
		rootDivObj.addEventListener('click', rootDivFunc);
		
		let demoObj = document.getElementById('demo');
		demoObj.addEventListener('click', function(e) {
			
			alert(this.id);
			
		});
	};
</script>
</head>

<body>
	rootDiv
	<div id='rootDiv' title="난 최상위 Div야">
		parentDiv
		<div id='parentDiv' title='난 첫번째 부모DIv야' onclick="parentDivFunc(this);">
			<button id="childBtn" title='난 첫번째 부모의 자식Button이야'
				onclick="childBtnFunc();">버튼1</button>
		</div>
	</div>
	
	<div id='demo'>
		이게 최신 방식
	</div>
</body>
</html>