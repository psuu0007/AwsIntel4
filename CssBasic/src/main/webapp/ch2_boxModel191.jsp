<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Box 모델 개념</title>


<style type="text/css"> /*내부 스타일*/
#childDiv {
   background-color: lightgrey;
   width: 500px;
   border: 15px solid green;
    padding: 10px; 
/*    padding: 10px 20px 30px 80px; */
/*    padding: 10px 80px; */
   margin: 10px 20px 30px 80px;
}

#parentDiv{
   border: 1px solid black;
}

p{
   border: 5px solid purple;
}

#firstP{
   width: 200px;
   margin: 10px 400px; /* 가운데 정렬  */
}
</style>

</head>

<body>

   <h2>Demonstrating the Box Model</h2>
<div>
   <p id="firstP">
      The CSS box model is essentially a box that wraps around every
      HTML element. It consists of: borders, padding, margins, and the
      actual content.
   </p>
</div>
   

   <div id='childDiv'>
      This text is the content of the box. We have added a 50px
      padding, 20px margin and a 15px green border. 
      Ut enim ad minim veniam,
      quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea
      commodo consequat. Duis aute irure dolor in reprehenderit 
      in voluptate velit esse cillum dolore eu fugiat nulla pariatur. 
      Excepteur sint occaecat cupidatat non proident, 
      sunt in culpa qui officia deserunt mollit anim id est laborum.
   </div>

<!-- <div id='parentDiv'> -->
<!--    <div id='childDiv'> -->
<!--       This text is the content of the box. We have added a 50px -->
<!--       padding, 20px margin and a 15px green border.  -->
<!--       Ut enim ad minim veniam, -->
<!--       quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea -->
<!--       commodo consequat. Duis aute irure dolor in reprehenderit  -->
<!--       in voluptate velit esse cillum dolore eu fugiat nulla pariatur.  -->
<!--       Excepteur sint occaecat cupidatat non proident,  -->
<!--       sunt in culpa qui officia deserunt mollit anim id est laborum. -->
<!--    </div> -->
   
<!-- </div> -->

   

</body>
</html>


