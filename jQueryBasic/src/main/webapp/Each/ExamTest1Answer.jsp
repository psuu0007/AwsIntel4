<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>ExamTest1 문제</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js">
</script>

<style type="text/css">
ul {
	font-size: 18px;
	margin: 0;
}

span {
	color: blue;
	text-decoration: underline;
	cursor: pointer;
}

.example {
	font-style: italic;
}
</style>

<script type="text/javascript">
var onOffCheck = true;

$(document).ready(function() {
	 $("span").click(function() {
	        $("li").each(function() {
	            if (onOffCheck) {
	                $(this).addClass("example");
	            } else {
	                $(this).removeClass("example");
	            }
	        });
	        onOffCheck = !onOffCheck; // 상태 변경
	    });
});

</script>

</head>

<body>
	
	To do list:
	<span>(click here to change)</span>
	<ul>
		<li>Eat</li>
		<li>Sleep</li>
		<li>Be merry</li>
	</ul>

</body>
</html>