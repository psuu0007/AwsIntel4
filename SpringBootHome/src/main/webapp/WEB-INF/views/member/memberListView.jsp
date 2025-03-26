<%@ page language='java' contentType='text/html; charset=UTF-8'
	pageEncoding='UTF-8'%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>

<title>회원 목록</title>

</head>
<body>

	<jsp:include page="/WEB-INF/views/Header.jsp"/>
	<h1>회원목록</h1>

	<p>
		<a href="./add">신규 회원</a>
	</p>

	<c:forEach var="memberVo" items="${memberList}">
	
		${memberVo.memberNo},
		<a href="./update?no=${memberVo.memberNo}">
			${memberVo.memberName}
		</a>,
		${memberVo.email},
		${memberVo.createDate}
		<a href="./delete?no=${memberVo.memberNo}">[삭제]</a><br>
	
	</c:forEach>
	
	<jsp:include page="/WEB-INF/views/Tail.jsp"/>

</body>
</html>