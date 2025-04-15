<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구글 연동 테스트</title>

<style type="text/css">
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f9;
	margin: 0;
	padding: 0;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

.container {
	text-align: center;
	padding: 20px;
	background-color: #fff;
	border-radius: 10px;
	box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
	width: 300px;
}

h1 {
	color: #333;
	font-size: 24px;
	margin-bottom: 20px;
}

.profile {
	display: flex;
	flex-direction: column;
	align-items: center;
}

.user-photo {
	width: 100px;
	height: 100px;
	border-radius: 50%;
	margin-bottom: 20px;
}

.user-details p {
	font-size: 16px;
	color: #555;
}
</style>

</head>
<body>

	<div class="container">
		<h1>Welcome, ${userName}!</h1>
		<div class="profile">
			<img src="${userPhoto}" alt="User Photo" class="user-photo">
			<div class="user-details">
				<p>
					<strong>Email:</strong> ${userEmail}
				</p>
			</div>
		</div>
	</div>

	<div>
	 	<a href="./login">로그인 화면으로 이동</a>
	</div>

</body>
</html>