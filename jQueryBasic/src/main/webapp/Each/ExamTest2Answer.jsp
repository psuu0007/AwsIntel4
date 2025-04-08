<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>502 EventBasic1.jsp</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js">
</script>

<style type="text/css">
</style>

<script type="text/javascript">

$(document).ready(function(){
	var liObjArr = $('div > ol > li');

	liObjArr.each(function(index, item){
		$(item).css({
			'color': 'white',
			'background-color' : 'black',
			'border' : ((index+1)*3) + 'px solid yellow'
		});
	});
});

</script>

</head>

<body>
	
	<div>
		<ol>
			<li value="아이템0">border 3</li>
			<li value="아이템1">border 6</li>
			<li value="아이템2">border 9</li>
			<li value="아이템3">border 12</li>
		</ol>
	</div>

</body>
</html>