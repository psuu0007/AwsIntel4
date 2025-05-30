<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />

<title>로그아웃 중...</title>

<script type="text/javascript">
	var logoutWin = null;

	function logoutAndRedirect() {
		var logoutURL = "https://accounts.google.com/Logout";
		var redirectURL = "/auth/login";

		// 구글 로그아웃 페이지를 새 창에서 열기
        logoutWin = window.open(logoutURL, "_blank", "width=500,height=500,left=500,top=300");

        // 팝업이 차단되었는지 확인
        if (!logoutWin) {
            alert("팝업 차단이 감지되었습니다. 구글 계정에서 직접 로그아웃해 주세요.");
            
			var htmlStr = '';
			
			htmlStr = '"<p>팝업이 차단되었습니다. <br>';
			htmlStr += '<a href="' + logoutURL + '" target="_blank">여기를 눌러 구글에서 로그아웃</a>한 후, <br>';
			htmlStr += '<a href="' + redirectURL + '">여기를 눌러 다시 로그인</a>해 주세요.</p>';
			
			document.getElementById("container").innerHTML = htmlStr;
            return;
        }else{
        	var htmlStr = '';
        	
        	htmlStr = '<button onclick="closePopup()">로그인 페이지 이동</button>';
        	
        	document.getElementById("container").innerHTML = htmlStr;
        }

        // 일정 시간 후 새 창을 닫고 리디렉션
        setTimeout(function() {
            logoutWin.close(); // 새 창을 닫음
            window.location.href = redirectURL; // 로그인 페이지로 이동
        }, 5000); // 5초 후 창 닫기
		
		
	}


	function closePopup() {
		if (logoutWin != null) {
			logoutWin.close(); // 수동으로 팝업 닫기
		}
		window.location.href = "/auth/login"; // 로그인 페이지로 이동
	}

	window.onload = function() {
		logoutAndRedirect();
	};
</script>

</head>
<body>
	<h2>로그아웃 중입니다. 잠시만 기다려 주세요...</h2>
	<div id='container'>
	
	</div>
</body>

</html>