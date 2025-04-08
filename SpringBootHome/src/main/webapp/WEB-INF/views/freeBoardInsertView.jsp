<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>freeBoardInsertView</title>

<script src="https://code.jquery.com/jquery-3.7.1.js" 
	integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" 
	crossorigin="anonymous"></script>

<style type="text/css">
table, th, tr, td{
	border: 1px solid black;
	border-collapse: collapse;	
}

#container{
	border: 1px solid black;
}

#container > tr{
	width: 980px;
}

.tableSubject{
	width: 245px;
	background-color: gray;
}

.tableValue{
	width: 245px;
}
</style>

<script type="text/javascript">
	$(function(){
		var freeBoardContentTag = $('#freeBoardContent');
		
		freeBoardContentTag.text('');
		
		
	});
</script>

</head>
<body>


	<jsp:include page="/WEB-INF/views/Header.jsp"/>

	<div id="container">

		<table style="width: 1000px;">
			<tr>
				<td class="tableSubject">주제</td>
				<td style="width: 735px;">
					<input type="text" name="freeBoardTitle" value="" size="100px">
				</td>
			</tr>
			<tr>
				<td class="tableSubject">작성자</td>
				<td class="tableValue">${freeBoardVo.memberName}</td>
			</tr>
			<tr>
				<td class="tableSubject">이메일</td>
				<td class="tableValue">${freeBoardVo.email}</td>
			</tr>
			<tr>
				<td style="width: 980px;" colspan="2">
					<textarea id="freeBoardContent" name="freeBoardContent" 
						rows="10" cols="100" style="width: 990px;">
					</textarea>
				</td>
			</tr>	
		</table>
		
<div id="fileContainer" style="border: 1px solid black;">
<label for="inputFreeBoardFile">파일</label>
<input type="file" id="inputFreeBoardFile" name="freeBoardFileList" multiple>
<ul id="fileList" class="fileUploadList"></ul>
</div>
		
		<div>
			<span>
				<button onclick="">목록 페이지</button>
				<button>작성완료</button>
			</span>
		</div>
	</div>
	
	<jsp:include page="/WEB-INF/views/Tail.jsp"/>

</body>
</html>