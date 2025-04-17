<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>arrowTest3</title>

<style type="text/css">

</style>

<script type="text/javascript">

</script>
</head>

<body>

	<ul id="bookList">
		
	</ul>

</body>
<script type="text/javascript">
	const bookArr = [
		{title: "자바스크립트 입문", page: 250},
		{title: "리액트 가이드", page: 320},
		{title: "노드.js", page: 150},
	];

	const bookListObj = document.getElementById('bookList');
	
// 	const filterBookArr = bookArr.filter(book => book.page >= 200)
// 		.map(book => `<li>\${book.title} - \${book.page}페이지</li>`);
	
	const filterBookArr = bookArr.filter(book => book.page >= 200)
		.map((book) => {
			if(book.page == 250){
				book.page = book.page * 10;
			}
			return `<li>\${book.title} - \${book.page}페이지</li>`;
	});
	
	console.log(filterBookArr);
	
	var htmlStr = '';
	for (var i = 0; i < filterBookArr.length; i++) {
		htmlStr += filterBookArr[i];
	}
	
	bookListObj.innerHTML = htmlStr;
</script>
</html>