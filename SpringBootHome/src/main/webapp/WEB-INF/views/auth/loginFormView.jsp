<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>로그인</title>

<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
	
<style type="text/css">
.login-container {
	text-align: center;
	padding: 20px;
	background-color: white;
	border-radius: 8px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

.login-with-google-btn {
	background-color: #4285F4;
	color: white;
	font-size: 16px;
	border: none;
	padding: 15px 20px;
	border-radius: 5px;
	cursor: pointer;
	width: 250px;
	display: flex;
	justify-content: center;
	align-items: center;
	margin: 10px 0;
}

.login-with-google-btn:hover {
	background-color: #357ae8;
}

.login-with-google-btn i {
	margin-right: 10px;
}
</style>

</head>

<script type="text/javascript">
	
</script>

<body>

	<p>
		<a href='/member/add'>신규 회원</a>
	</p>

	<h2>사용자 로그인</h2>
	<form id="loginForm" action="/login" method="post">
		이메일: 	<input type="text" id="saveIdKeep" name=email value=""><br>
		암호: 	<input type="password" id="savePwdKeep" name="password" value=""><br>
		
		<input type="submit" value="로그인">
		
	</form>
	
	<h4>또는 소셜 로그인</h4>
    <div class="login-container">
        <form action="/oauth2/authorization/google" method="get">
            <button type="submit" class="login-with-google-btn">
                <i class="material-icons">account_circle</i> Sign in with Google
            </button>
        </form>
    </div>
	
	
	
</body>
</html>