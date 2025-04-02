<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>463 jqueryBasic5</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js">
	
</script>

<style type="text/css">
.descendants * { 
  display: block;
  border: 2px solid lightgrey;
  color: lightgrey;
  padding: 5px;
  margin: 15px;
}

</style>

<script type="text/javascript">
	$(document).ready(function() {
// 		$("div").children('p').css("color", "red");

// 		$("div").children('span').css("border", "2px solid red");
		
		$("div").find('span').css({"color": "red", "border": "2px solid red"});
	});
</script>

</head>

<body>

	<div class="descendants" style="width: 500px;">
		div (current element)
		<p>
			p (child) <span>span (grandchild)</span>
		</p>
		<div>
			p (child) <span>span (grandchild)</span>
		</div>
	</div>

</body>
</html>