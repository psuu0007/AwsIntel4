<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>objectBasic2</title>

<style type="text/css">

</style>

<script type="text/javascript">

	let key = {
		name: '강의실 205호',
		cre_date: '2025-04-16',
		
		myInfo: function() {
			return '열쇠명: ' + this.name + ', 열쇠생성일: ' + this.cre_date;
		}
	};
	
	var person = {
		name: '커피',
		age: 24,
		myKey : key,
		printInfo: function() {
			alert('이름: ' + this.name + ', 나이: ' + this.age);
		}
	};

	console.log(person.name);
	console.log(person.age);
	
	person.printInfo();
	alert(person.myKey.name);
	
	person.name = '찬미 씨';
	person.age = 20;
	
	console.log(person.name);
	console.log(person.age);
	
	person.printInfo();
</script>

</head>

<body>



</body>
</html>