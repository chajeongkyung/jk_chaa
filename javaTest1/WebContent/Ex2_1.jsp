<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

</style>

<script type="text/javascript">
   
//    아름언니 객체지향적인 코드 
   window.onload =  function () {

      //전체 div
      var containertDiv = document.getElementById('containertDiv');
      
      //자식div 생성
      var newDivObj = null;
      var divNum = 4;
//       //자식span 생성      //-> for문 바깥에 선언해주면 계속 덮어씌우면되니까 속도 측에서 빠르다
//       var newSpanObj = null;
//       var spanNum = 2;
      
      for(var i=0; i<divNum; i++){
         newDivObj = document.createElement('div');
         
         //-> for문 안쪽에 변수선언해주면 속도는 느리나 메모리절약이 된다. (스마트 기기 같은 경우)
         var spanNum = 5;
         createSpanFnc(spanNum, i, newDivObj);
      
         containertDiv.appendChild(newDivObj);
      }

      containertDiv.setAttribute("style", "border:1px solid black;");
      
   }
   
   function createSpanFnc(spanNum, i, newDivObj){
   
      for(var j=0; j<spanNum; j++){
         var newSpanObj = document.createElement('span');
         
         newSpanObj.setAttribute("style", "border:1px solid black;");
         
         var spanText = i+1;
         newSpanObj.innerHTML = spanText;
         
         newDivObj.appendChild(newSpanObj);
      }
      
   }
</script>

</head>

<body>

   <div id='containertDiv'>
<!--          <div> -->
<!--             <span style="border:1px solid black;">1</span> -->
<!--             <span style="border:1px solid black;">1</span> -->
<!--          </div> -->
<!--          <div> -->
<!--             <span style="border:1px solid black;">2</span> -->
<!--             <span style="border:1px solid black;">2</span> -->
<!--          </div> -->
<!--          <div> -->
<!--             <span style="border:1px solid black;">3</span> -->
<!--             <span style="border:1px solid black;">3</span> -->
<!--          </div> -->
<!--          <div> -->
<!--             <span style="border:1px solid black;">4</span> -->
<!--             <span style="border:1px solid black;">4</span> -->
<!--          </div> -->
   </div>
   
   

</body>

</html>