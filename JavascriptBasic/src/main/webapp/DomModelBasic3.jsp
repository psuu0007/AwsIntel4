<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>웹 문서구조3</title>

</head>
<body>
	<div>
		<h1>선택자</h1>
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
			<li>
				parentNode
			</li>
			<li>
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
	
	var listParentObj = document.getElementById('list').parentNode;
	
	alert('listParentObj.tagName: ' + listParentObj.tagName);
	
// 	var childNodeList = document.getElementById('list').childNodes;
	var childNodeList = document.getElementById('list').children;
	
	alert('childNodeList.length: ' + childNodeList.length);
	
	for (var i = 0; i < childNodeList.length; i++) {
		alert('childNodeList['+i+'].tagName: ' + childNodeList[i].tagName);
	}
	
	
</script>

</html>