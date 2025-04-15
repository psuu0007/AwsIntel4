<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<script type="text/javascript">
	function pageMoveMemberListFnc() {
		location.href = '/member/list';
	}
	
	function pageMoveFreeBoardListFnc(curPage) {
		if(curPage){
			location.href = '/freeBoard/list?curPage=' + curPage;
		}else{
			location.href = '/freeBoard/list';		
		}
		
	}
</script>

<div style="background-color:#DD7C73; color:#fff; 
	height:20px; padding: 5px;">
	SPMS(Simple Project Management System)
	
	<span style="border: 1px solid black;" onclick="pageMoveMemberListFnc();">회원</span>
	<span style="border: 1px solid black;" onclick="pageMoveFreeBoardListFnc();">
		자유게시판
	</span>
	
	<c:if test="${sessionScope.member ne null}">
	
	<span style="float:right;">
		${member.memberName}
		
		<input type="hidden" id="inputMemberNo" value="${member.memberNo}">
		
		<c:choose>
			<c:when test="${member.provider eq 'google'}">
			<a style="color:white;" 
				href='<c:url value="/auth/logout"/>'>로그아웃</a>
			</c:when>
			
			<c:otherwise>
			<a style="color:white;" 
				href='<c:url value="/member/logout"/>'>로그아웃</a>
			</c:otherwise>
			
		</c:choose>
		
		
	</span>
	
	</c:if>

</div>


