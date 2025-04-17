<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>arrowTest1</title>

<style type="text/css">

</style>

<script type="text/javascript">
// 	우리반 6명의 이름을 배열로 만든다
	
// 	이름에서 찬이 들어가는 문자열만 

//  찬이 들어간 친구들은 이름뒤에 고수라는 문자열을 붙여서 demo에 출력하시오 
	
// 	ex: 임찬정 고수
	const names = ["John", "Jane", "Jake", "Jill"];
    const htmlStr = names.filter(name => name.indexOf('o') != -1);
//     console.log(htmlStr);

</script>
</head>

<body>
	<div id='demo'></div>
</body>
<script type="text/javascript">
	document.getElementById('demo').innerHTML = htmlStr;
</script>
</html>