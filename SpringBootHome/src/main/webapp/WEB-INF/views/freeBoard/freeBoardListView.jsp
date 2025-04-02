<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자유게시판 목록</title>

<style type="text/css">
table, th, tr, td{
	border: 1px solid black;
	border-collapse: collapse;	
}

tr > th{
	background: gray;
}

.aTagStyle{
	cursor: pointer;
}

.aTagStyle:hover {
	color: lightgreen;
	background: gray;
}
</style>

</head>
<body>


	<jsp:include page="/WEB-INF/views/Header.jsp"/>
	<h1>자유게시판 목록</h1>

	<p>
		<a href="./add">자유게시판 글쓰기</a>
	</p>
	
	<table>
		<tr>
			<th>번호</th><th>주제</th><th>작성자</th>
			<th>생성날짜</th><th>수정날짜</th><th>비고[삭제]</th>
		</tr>
	
	<c:forEach var="freeBoardVo" items="${freeBoardList}">
		<tr>
			<td>${freeBoardVo.freeBoardId}</td>
			<td class='aTagStyle'>
				${freeBoardVo.freeBoardTitle}
			</td>
			<td>
				${freeBoardVo.memberName}
			</td>
			<td>
				<fmt:formatDate pattern="yyyy-MM-dd hh:mm:ss" 
					value="${freeBoardVo.createDate}"/>
			</td>
			<td>
				${freeBoardVo.updateDate}
			</td>
			<td style="text-align: center;">
				[삭제]
			</td>
		</tr>
	</c:forEach>
	
	</table>
	
	<jsp:include page="/WEB-INF/views/common/Paging.jsp">
		<jsp:param value="${pagingMap}" name="pagingMap"/>
	</jsp:include>
		
	<jsp:include page="/WEB-INF/views/Tail.jsp"/>
	
	<form action="./list" id="pagingForm" method="post">
		<input type="hidden" id="curPage" name="curPage"
		   value="${pagingMap.pagingVo.curPage}">
	</form>

</body>
</html>