<%@ page language='java' contentType='text/html; charset=UTF-8'
	pageEncoding='UTF-8'%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>

<title>회원 목록</title>

<style type="text/css">
table, th, tr, td{
	border: 1px solid black;
	border-collapse: collapse;	
}

.aTagStyle{
	cursor: pointer;
}

.aTagStyle:hover {
	color: lightgreen;
	background: gray;
}
</style>

<script type="text/javascript">
function pageMoveMemberDetailFnc(tableTdTag) {
	let parentTr = tableTdTag.parentNode;
	
	let memberNoStr = parentTr.children[0].textContent;
	
	console.log(memberNoStr);
	
	let memberNoObj = document.getElementById('memberNo');
	memberNoObj.value = memberNoStr;
	
	let memberSelectOneFormObj = document.getElementById('memberSelectOneForm');
	memberSelectOneFormObj.submit();
} 
</script>


</head>
<body>

	<jsp:include page="/WEB-INF/views/Header.jsp"/>
	<h1>회원목록</h1>

	<p>
		<a href="./add">신규 회원</a>
	</p>
	
	<table>
		<tr>
			<th>번호</th><th>이름</th>
			<th>이메일</th><th>생성일</th><th>비고[삭제]</th>
		</tr>
	
	<c:forEach var="memberVo" items="${memberList}">
		<tr>
			<td>${memberVo.memberNo}</td>
			<td>
				${memberVo.memberName}
			</td>
			<td class="aTagStyle" onclick="pageMoveMemberDetailFnc(this);">
				${memberVo.email}
			</td>
			<td>
				<fmt:formatDate pattern="yyyy-MM-dd hh:mm:ss" 
					value="${memberVo.createDate}"/>
			</td>
			<td style="text-align: center;">
				<a href="#">
					[삭제]
				</a>
			</td>
		</tr>
	</c:forEach>
	
	</table>
	
	
	<jsp:include page="/WEB-INF/views/Tail.jsp"/>
	
	<form id='memberSelectOneForm' action="./detail" method="get">
		<input id='memberNo' type="hidden" name="memberNo" value="">
	</form>

</body>
</html>