<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>checkbox</title>
<!-- checkbox는 체크가 되면 true를 반환한다      -->
<script type="text/javascript">
   var chkList = '';
   window.onload = function(){
      chkList = document.getElementsByName('rain');
   }
   
   function allSel(){
      var allChkObj = document.getElementById('allChk'); 
//    alert(allChkObj.checked);
//	  allChk이랑 같은 상태로 해야되니까 다로 조건문이 필요없다
      for (var i = 0; i < chkList.length; i++) {
         chkList[i].checked = allChkObj.checked;
      }
   }
   
   function likeSong(){
      var resultStr = '';
      var listChk = false;
      for (var i = 0; i < chkList.length; i++) {
         if(chkList[i].checked){
            listChk = listChk || chkList[i].checked;
            	if (resultStr == '') {
            		 resultStr += ''+ chkList[i].value;
				}else {
					resultStr += ', '+ chkList[i].value;					
				}
//             resultStr += ((resultStr == '') ? '' : ', ') + chkList[i].value;            
         }
      }
      
      if(listChk == false){
         resultStr = '노래를 선택하세요';
      }
      
      alert(resultStr);
   }
</script>
<style type="text/css">
table ,tr, td{ 
    border: 1px solid;
    padding: 5px;
    border-spacing: 0px;
    
 } 
</style>
</head>
<body>
   <form>
      <table>
         <tr>
            <td>비오는 날 들으면 죽여주는 노래?</td>
         </tr>
         <tr>
            <td>
               <input type="checkbox" id='allChk' onclick="allSel();">전체선택<br>
               <!-- this는 자신의 값을 반환 -->
               <input type="checkbox" name="rain" value="비오는 날의 수채화">비오는 날의 수채화<br>
               <input type="checkbox" name="rain" value="사랑은 비를 타고">사랑은 비를 타고<br>
               <input type="checkbox" name="rain" value="rainism">rainism<br>
               <input type="checkbox" name="rain" value="비와당신">비와당신<br>
            </td>
         </tr>
         <tr>
            <td>
               <input type="button" value="노래목록!!" onclick="likeSong();">
            </td>
         </tr>
      </table>
   </form>
</body>
</html>