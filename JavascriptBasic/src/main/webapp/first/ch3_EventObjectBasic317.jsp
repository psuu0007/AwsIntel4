<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>이벤트 객체2</title>

<style type="text/css">
</style>

<script type="text/javascript">
	document.onkeydown = function(e) {
		var theEvent = e ? e : window.event;
		var theKey1 = theEvent.keyCode;
		var theKey2 = theEvent.shiftKey;

		// shift + h
		if (theKey1 == 72 && theKey2) {
			alert("단축키 완성")
		}
	}
</script>

</head>

<body>


</body>

</html>