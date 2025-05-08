<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ApplePear</title>

<style type="text/css">

.main{
	border: 1px solid black;
	width: 18.3%;
}

.text .apple{
	font-size: 20px;
}
.text .price{
	font-size: 40px;
}


</style>
</head>
<body>
	<div class="main">
		<div class="img">
			<img src="/apple.jfif">
		</div>
		
		<div class="text">
			<p class="apple">${fruTitle}</p>
			<p class="price">${fruPrice}</p>
				
		</div>
	</div>
</body>
</html>