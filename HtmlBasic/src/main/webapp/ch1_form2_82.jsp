<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 입력 속성</title>

<style type="text/css">
</style>

</head>
<body>

	<form>
		<fieldset>
			<legend>필드에 입력형식 힌트주기</legend>
			<p>
				<label for="id">아이디</label>
				<input type="text" id="id" placeholder="영어만 입력가능" 
					title="아이디 입력">
					<input type="text" id="id"  
					title="아이디 입력">
			</p>
			<p>
				<label for="pw">비밀번호</label>
				<input type="password" id="pw" placeholder="비밀번호" 
					title="비밀번호 입력">
			</p>
		</fieldset>
	</form>

</body>
</html>