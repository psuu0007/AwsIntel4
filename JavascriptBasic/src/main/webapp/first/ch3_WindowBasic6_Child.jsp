<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>팝업창</title>

<style type="text/css">
* {
	margin: 0;
	padding: 0;
}
</style>

<script type="text/javascript">
	window.onload = function() {
		var childCloseObj = window.document.getElementById('childClose');
		
		childCloseObj.addEventListener('click', function(e) {
			window.close();
		});
		
		var parentInfoTag = window.opener.document.getElementById('parentInfo');
		var childInfoTag = document.getElementById('childInfo'); 
		childInfoTag.innerHTML = parentInfoTag.value;
	};
	
	
</script>

</head>

<body>

	<p>
		<img src="images/popup.jpg" alt="이달에 새로나온책" usemap="#pop" />
	</p>
	<map name="pop" id="pop">
		<area id='childClose' shape="rect" coords="228,371,294,399" href="#"
			alt="창 닫기" />
	</map>
	
	<div>
		<span id='childInfo'></span>
		<span id='sendInfo'><input type="text" value="부모님 안녕하세요?"></span>
	</div>

</body>

</html>