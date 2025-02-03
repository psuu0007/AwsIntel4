<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>웹 문서구조 CRUD2</title>

<style type="text/css">
#theBox {
	background-color: #ddd;
}
</style>

</head>
<body>
	<h1>문서 객체 조작</h1>
	
	<ul id="theList">
		<li>리스트2</li>
		<li>리스트3</li>
		<li>리스트4</li>
		<li title='복제는 과연'>리스트1</li>
	</ul>
</body>

<script type="text/javascript">
	var theList = document.getElementById("theList");
	var listAll = theList.getElementsByTagName("li");
	//1. <li>리스트1</li> 복제를 합니다.
	// 선택태그.clonwNode(true or false)
	// 선택 태그를 복제하는데 true인 경우 하위 태그까지 모두 복제
	// false 이면 자신만 복제
// 	var copyLi = listAll[3].cloneNode(true);
	var copyLi = listAll[3].cloneNode(false);

	//2.  기존 "list1" 삭제 합니다.
	theList.removeChild(listAll[3]);

	//3. "list2"이전에 복제 요소 추가
	// 선택 태그.insertBefore(새 태그, 선택 태그2--새 태그가 오게될 위치)
	// 선택 태그의 자식인 태그2 앞에 새로운 자식 태그 추가
	theList.insertBefore(copyLi, listAll[0]);
</script>

</html>