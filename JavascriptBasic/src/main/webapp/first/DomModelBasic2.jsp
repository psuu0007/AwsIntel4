<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>웹 문서구조2</title>

</head>
<body>
	<div>
		<h1 class='exam'>선택자</h1>
		<h2 id="title">
			원거리 선택자
		</h2>
		<ul>
			<li>
				getElementById
			</li>
			<li>
				getElementsByTagName
			</li>
		</ul>
		<h2 id="title2">
			근거리 선택자
		</h2>
		<ul id="list">
			<li class='exam'>
				parentNode
			</li>
			<li class='exam'>
				childNodes
			</li>
			<li>
				children
			</li>
			<li>
				firstChild
			</li>
			<li>
				previousSibling
			</li>
			<li>
				nextSibling
			</li>
		</ul>
	</div>
</body>

<script type="text/javascript">
	
	var myList = document.getElementsByTagName('ul');
	var myObj = myList[0].getElementsByTagName('li')[1];
	
	myObj.style.border = 'solid 2px #f00';

	var examList = document.getElementsByClassName('exam');
	
	var title2Obj = document.getElementById('title2');
	
	title2Obj.textContent = 'exam의 자식들 수: ' + examList.length;
	
</script>

</html>