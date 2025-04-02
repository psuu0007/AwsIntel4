<%@ page language='java' contentType='text/html; charset=UTF-8'
	pageEncoding='UTF-8'%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<script type="text/javascript" 
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

<style type="text/css">
nav > ul {
	list-style-type: none;
    padding: 0px;
    overflow: hidden;
    background-color: #333333;
/*     width: 1000px; */ /* 넓이를 주면 고정  */
    display: table; /* table을 주면  요소의 내용에 맞게 자동으로 크기 */
    margin-left: auto;
    margin-right: auto;
    
}

nav > ul > li {
	float: left;
}

nav > ul > li > a {
    display: block;
    color: white; 
    text-align: center;
    padding: 16px;
    text-decoration: none;
}

nav > ul > li > a:hover {
    color: #FFD9EC;
    background-color: #5D5D5D;
    font-weight: bold;
}

.active{
	color: #FFD9EC;
    background-color: #5D5D5D;
    font-weight: bold;
}
</style>

<script type="text/javascript">
// 	function goPage(pageNumber) {
// 		var curPage = document.getElementById('curPage');
		
// 		curPage.value = pageNumber;
		
// 		var pagingFormObj = document.getElementById('pagingForm');
// 		pagingFormObj.submit();
// 	}

	function goPage(pageNumber) {
		var curPage = $("#curPage");
		curPage.val(pageNumber);
		
		alert('???');
		
		$("#pagingForm").submit();
	}
	
	window.onload = function() {
		var curPageDoc = document.getElementById('curPage');
		var id = 'pageButton' + curPageDoc.value;
		
		var pageButtonTag = document.getElementById(id);
		pageButtonTag.className = 'active';
	}
</script>

	<nav>
		<ul>
		<c:if test="${pagingMap.pagingVo.prevBlock ne 1}">
			<li>
				<a href="#" onclick="goPage(${pagingMap.pagingVo.prevBlock});">
					<span>≪</span>
				</a>
			</li>
		</c:if>
			
		<c:forEach var="num" begin="${pagingMap.pagingVo.blockBegin}" 
			end="${pagingMap.pagingVo.blockEnd}">
			<li id="pageButton${num}">
				<a href="#" onclick="goPage(${num});">
					<c:out value="${num}"/>
				</a>
			</li>
		</c:forEach>	
			
		<c:if test="${pagingMap.pagingVo.curBlock < pagingMap.pagingVo.totBlock}">
			<li>
				<a href="#" onclick="goPage(${pagingMap.pagingVo.nextBlock});">
					<span>≫</span>
				</a>
			</li>			
		</c:if>
			
		</ul>
	</nav>