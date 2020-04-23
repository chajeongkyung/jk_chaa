<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
   table{
      border-collapse: collapse;
      width: 300px;
   }
   
   table, tr, th, td{
      border: 1px solid black;
   }
   
   
</style>

<script type="text/javascript">

//테이블만들기
	window.onload = function() {
		//태그생성
		var newDivTag = document.createElement('div');
		var newDivTag2 = document.createElement('div');
		var newBtn = document.createElement('button');
		var newInput = document.createElement('input');
		
	
		var newDivText = document.createTextNode('요소(태그) 생성 연습');
		var newBtnText = document.createTextNode('버튼1');
		
		//속성 추가
		newDivTag.setAttribute('id', 'theBox');
		newDivTag.setAttribute('style', 'height: 80px; background-color: silver;');		
		
		newBtn.setAttribute('id', 'btn1');
		
		//관계 설정
		newDivTag.appendChild(newDivText);
		newDivTag.appendChild(newDivTag2);
		newDivTag2.appendChild(newBtn);
		newBtn.appendChild(newBtnText);
		
		
		//테이블 생성
		var newTableTag = document.createElement('table'); 
		newTableTag.setAttribute('style', 'border-collapse: collapse; width: 300px; border: 1px solid black;');	
		
		var newTrTag1 = document.createElement('tr'); 
		var newTrTag2 = document.createElement('tr'); 
		var newTrTag3 = document.createElement('tr'); 
		var newTrTag4 = document.createElement('tr'); 
		
		var newThTag1 = document.createElement('th'); 
		var newThTag2 = document.createElement('th'); 
		var newThTag3 = document.createElement('th'); 
		
		var newTdTag1 = document.createElement('td'); 
		var newTdTag2 = document.createElement('td'); 
		var newTdTag3 = document.createElement('td'); 
		var newTdTag4 = document.createElement('td'); 
		var newTdTag5 = document.createElement('td'); 
		var newTdTag6 = document.createElement('td'); 
		var newTdTag7 = document.createElement('td'); 
		var newTdTag8 = document.createElement('td'); 
		var newTdTag9 = document.createElement('td'); 

		newTrTag1.appendChild(newThTag1);
		newTrTag1.appendChild(newThTag2);
		newTrTag1.appendChild(newThTag3);
		
		var newThText1 = document.createTextNode('제목1');
		var newThText2 = document.createTextNode('제목2');
		var newThText3 = document.createTextNode('제목3');
		
		newThTag1.appendChild(newThText1);
		newThTag2.appendChild(newThText2);
		newThTag3.appendChild(newThText3);
		
		newTrTag2.appendChild(newTdTag1);
		newTrTag2.appendChild(newTdTag2);
		newTrTag2.appendChild(newTdTag3);

		newTrTag3.appendChild(newTdTag4);
		newTrTag3.appendChild(newTdTag5);
		newTrTag3.appendChild(newTdTag6);
		
		newTrTag4.appendChild(newTdTag7);
		newTrTag4.appendChild(newTdTag8);
		newTrTag4.appendChild(newTdTag9);
		
		var newTdText1 = document.createTextNode('1');
		var newTdText2 = document.createTextNode('2');
		var newTdText3 = document.createTextNode('3');
		var newTdText4 = document.createTextNode('44');
		var newTdText5 = document.createTextNode('55');
		var newTdText6 = document.createTextNode('66');
		var newTdText7 = document.createTextNode('77');
		var newTdText8 = document.createTextNode('88');
		var newTdText9 = document.createTextNode('99');
		
		newTdTag1.appendChild(newTdText1);
		newTdTag2.appendChild(newTdText2);
		newTdTag3.appendChild(newTdText3);
		newTdTag4.appendChild(newTdText4);
		newTdTag5.appendChild(newTdText5);
		newTdTag6.appendChild(newTdText6);
		newTdTag7.appendChild(newTdText7);
		newTdTag8.appendChild(newTdText8);
		newTdTag9.appendChild(newTdText9);
		
		newTableTag.appendChild(newTrTag1);
		newTableTag.appendChild(newTrTag2);
		newTableTag.appendChild(newTrTag3);
		newTableTag.appendChild(newTrTag4);
		
		var divTag = document.createElement('div');
		
		
		//body에 출력
		var bodyTag = document.getElementsByTagName('body')[0];
		
		bodyTag.appendChild(newDivTag);	
		bodyTag.appendChild(divTag);
		
		newBtn.addEventListener('click', showTableFnc, false);
		
		function showTableFnc () {			
			divTag.appendChild(newTableTag);				
		}
		
	}
	
	
		
</script>

</head>

<body>

   <div id='theBox' style="background-color: silver; height: 80px;">
      요소(태그) 생성 연습
      <div>
         <button id='btn1'>버튼1</button>
      </div>
   </div>
   
   <br>
   
   <div id='abc'>
      <table>
      <tr>
         <th>제목1</th>
         <th>제목2</th>
         <th>제목3</th>
      </tr>
      <tr>
         <td>1</td>
         <td>2</td>
         <td>3</td>
      </tr>
      <tr>
         <td>44</td>
         <td>55</td>
         <td>66</td>
      </tr>
      <tr>
         <td>77</td>
         <td>88</td>
         <td>99</td>
      </tr>
   </table>
   </div>
   

</body>
</html>

