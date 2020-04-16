<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8">
   <title>Insert title here</title>
   
<script type="text/javascript">

   var gugudanTitle = new Array();
   var gugudanVal = new Array();
   
   
   // 헤더 입력
   for (var i = 0; i < 8; i++) {
      gugudanTitle[i] = (i+2) + '단' + '&nbsp;';
   }
   
   // 구구단 내용 입력
   var cnt = 0;
   for (var i = 0; i < 9; i++) {
      for (var n = 2; n <= 9; n++) {
         gugudanVal[cnt] = n * (i+1);
         cnt++;
      }
   }
   
   // 구구단 헤더 출력문
    for (var i = 0; i < 8; i++) {
       document.write(gugudanTitle[i] + spaceFnc(2));
   }
    document.write('<br/>');
   
   // 구구단 내용 출력문
    cnt = 0;
    for (var i = 0; i < 9; i++) {
       for (var n = 2; n <= 9; n++) {
          document.write(gugudanVal[cnt] + spaceFnc(7));
          cnt++;
       }
       document.write('<br/>');
    }
   
   // html에서 뛰워쓰기를 해준다.
   function spaceFnc(spaceNum) {
      var spaceStr = '';
      
      for (var i = 0; i < spaceNum; i++) {
         spaceStr = spaceStr + '&nbsp;';
      }
      
      return spaceStr;
   }

</script>

</head>

<body>

   
   
</body>
</html>