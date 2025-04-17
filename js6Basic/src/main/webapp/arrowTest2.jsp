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
		  { title: "자바스크립트 입문", pages: 250 },
		  { title: "리액트 완벽 가이드", pages: 320 },
		  { title: "HTML과 CSS", pages: 150 },
		  { title: "노드.js 교과서", pages: 400 }
	];

	const bookListObj = document.getElementById("bookList");

	const filteredBooks = bookArr.filter(book => book.pages >= 300)
	  .map((book) => {return `<li>\${book.title} - \${book.pages}페이지</li>`});
	console.log(filteredBooks);
	
	var htmlStr = '';
	for (var i = 0; i < filteredBooks.length; i++) {
		htmlStr += filteredBooks[i];
	}
	
	bookListObj.innerHTML = htmlStr; 

</script>
</html>