<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
li {
   font-size: 30px;
}
</style>

<script type="text/javascript">

	/*cloneNode(false)를 사용해보자*/

   window.onload = function() {
      
      var ulControlH1 = document.getElementById('updateBtn');
      
      ulControlH1.setAttribute('onclick', 'addFnc();');
      
   }
   
   
   function addFnc() {
      
      var bodyObj = document.getElementsByTagName('body')[0];
      
      //모든 ul태그
      var ulObj = document.getElementsByTagName('ul');
      
      //가장 마지막에 있는 오리지날 ul
      var originalUlObj = document.getElementsByTagName('ul')[ulObj.length-1];

      //오리지날 ul에서 list 뽑기
      var liObjList = originalUlObj.children;
      
      var ulCloneObj = originalUlObj.cloneNode(false);
      
      var liCloneObjList = [];
      liCloneObjList[0] = liObjList[3].cloneNode(true);
      liCloneObjList[1] = liObjList[0].cloneNode(true);
      liCloneObjList[2] = liObjList[1].cloneNode(true);
      liCloneObjList[3] = liObjList[2].cloneNode(true);
      
      for (var i = 0; i < 4; i++) {
         ulCloneObj.appendChild(liCloneObjList[i]);
      }

      bodyObj.insertBefore(ulCloneObj, ulObj[0]);

   }
</script>

</head>

<body>
   <h1 id='updateBtn'>문서 객체 조작 버튼</h1>

   <ul>
      <li>리스트2</li>
      <li>리스트3</li>
      <li>리스트4</li>
      <li>리스트1</li>
   </ul>

</body>
</html>




