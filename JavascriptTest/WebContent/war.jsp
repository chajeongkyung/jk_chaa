<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>



</head>

<body>
   <div id='demo'>
      I can eat bananas all day
   </div>
   
   <input onclick="txtChangeFnc();" type="button" value="실행">

</body>

<script type="text/javascript">
   
   /* 13_2 수정  */
   function txtChangeFnc(){
      var questionStr = '';
      questionStr = 'Iam can eat ban all day';

      var solutionStr = '';
      var txtList = new Array(6);
      
      for(var i=0; i<txtList.length; i++){
         txtList[i] = questionStr.substring(0+(i*3)+i, 3+(i*3)+i);
      }
      
      //i 소문자화
      txtList[0] = txtList[0].charAt(0).toLowerCase()+ txtList[0].substring(1, txtList[0].length);
      //a만 대문자화
      txtList[4] = txtList[4].charAt(0).toUpperCase() + txtList[4].substring(1, txtList[4].length);
   
      solutionStr += txtList[4] + ' ';
      solutionStr += txtList[2] + ' ';
      solutionStr += txtList[1] + ' ';
      solutionStr += txtList[5] + ' ';
      solutionStr += txtList[3] + ' ';
      solutionStr += txtList[0];


      //원하는 출력
      //var solutionStr = 'All eat can day bananas i';
      document.getElementById('demo').innerHTML = solutionStr;
   }
   
   
</script>

</html>





