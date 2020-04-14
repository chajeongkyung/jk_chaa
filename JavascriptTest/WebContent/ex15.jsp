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
   
   </div>

</body>

<script type="text/javascript">
 /*찬양님거 분석해보기*/  
   var questionStr = '';
   questionStr = 'Iam can eat ban all day';
   
   var strList = new Array();
   var tempStr = '';
   var count = 0;

   for (var i = 0; i < questionStr.length; i++) {
      tempStr = tempStr + questionStr.substring(i, i+1);
      
      if((questionStr.substring(i, i+1) == ' ')) {
         strList[count] = tempStr;
         tempStr = '';
         count++;   
         
      } else if (questionStr.substring(i, i+1) == questionStr.substring(questionStr.length-1, questionStr.length)) {
         strList[count] = tempStr; 
      }
      
   }
   
   var solutionStr = '';
   
   strList[0] = strList[0].toLowerCase();
   strList[4] = strList[4].substring(0, 1).toUpperCase() + strList[4].substring(1);
   strList[5] = strList[5] + ' ';
   
   solutionStr += strList[4];
   solutionStr += strList[5];
   solutionStr += strList[2];
   solutionStr += strList[1];
   solutionStr += strList[3];
   solutionStr += strList[0];

   
   
   /* var solutionStr = 'All eat can day bananas i';*/      
   
        
    document.getElementById('demo').innerHTML = solutionStr; 
   
</script>

</html>






