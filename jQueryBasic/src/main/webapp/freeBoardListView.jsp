<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

</head>
<body>



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
		<div>
			<span>
				<button onclick="">목록 페이지</button>
				<button>작성완료</button>
			</span>
		</div>
	
	</div>
	

</body>
</html>