<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>random</title>

<style type="text/css">
body, p, h1, h2, h3, h4, h5, h5, ul, ol, li, dl, dt, dd, table, caption,
	form, fieldset, legend {
	margin: 0;
	padding: 0;
}

li {
	list-style-type: none;
}

img, fieldset {
	border: 0;
}

.hdd {
	font-size: 0;
	width: 0;
	height: 0;
	line-height: 0;
	position: absolute;
	left: -9999px;
}
</style>

<script type="text/javascript">
	document.write("<h3>문자치환</h3>");
	var theText1 = "img2_out.jpg";
	theText1 = theText1.replace("out.jpg", "over.jpg");
	document.write(theText1 + "<br />");

	document.write("<h3>문자추출</h3>");
	var theText2 = "images/img10.jpg";
	theText2 = theText2.split("/")[1];
	theText2 = theText2.substring(3);
	theText2 = parseInt(theText2);
	document.write(theText2 + "<br />");

	document.write("<h3>마지막 문자 추출</h3>");
	var theText3 = "hello javascript";
	var lastIndex = theText3.length - 1;
	theText3 = theText3.charAt(lastIndex);
	document.write(theText3 + "<br />")
</script>

</head>

<body>


</body>
</html>