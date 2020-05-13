<%@ page language='java' contentType='text/html; charset=UTF-8'
    pageEncoding='UTF-8'%>
<!DOCTYPE html>
<html>
<head>

<meta charset='UTF-8'>
<title>Insert title here</title>
<script type='text/javascript'>

	window.onload = function() {
		
		var content = document.getElementById('content');
		content.style.border = '1px solid black';
		content.style.width = '38px';
		
		//div태그를 4개 만든다
		var divTagList = [];		
		for (var i = 0; i < 4; i++) {
			divTagList[i] = document.createElement('div');
			
			
		}
		//span태그를 8개 만든다
		var spanTagList = [];
		for (var i = 0; i < 8; i++) {
			spanTagList[i] = document.createElement('span');
			spanTagList[i].style.border = '1px solid black';
		}
		
		var textList = [];
		for (var i = 0; i < divTagList.length; i++) {			
			for (var n = 0; n < 2; n++) {
				textList[i] = document.createTextNode(i+1);
				spanTagList[i*2+n].appendChild(textList[i]);
				divTagList[i].appendChild(spanTagList[i*2+n]);
			}
		}
		
		
		for (var i = 0; i < divTagList.length; i++) {
			content.appendChild(divTagList[i]);
		}
	}//window 종료

	
	/*//홍님 코드	
	// 객체 생성부
      var tableDivObj = document.getElementById('content');
      var tableObj = document.createElement('table');
      var trObjArr = [];
      var tdObjArr = [];
      var tdTextObjArr = {};
      
      var trNum = 4;      
      for (var i = 0; i < trNum; i++) {         
         trObjArr[i] = document.createElement('tr');            
         tdObjArr[i] = document.createElement('td');
         tdTextObjArr[i] = document.createTextNode(i+1);
      }
      
      //속성 설정부
      tableObj.setAttribute('style', 'border: 1px solid black; border-collapse: collapse;');
         
      //객체 연결부
      tableDivObj.appendChild(tableObj);
      for (var i = 0; i < trNum; i++) {
         tdObjArr[i].appendChild(tdTextObjArr[i]);
         
         tableObj.appendChild(trObjArr[i]);   
         trObjArr[i].appendChild(tdObjArr[i]);   
      }
         
   }
   
   */
</script>

</head>

<body>
	<div id='content'>
	
	</div>


<!-- 	<div id='content' style="border: 1px solid black; width 38px;"> -->
<!-- 		<div> -->
<!-- 			<span style="border: 1px solid black;">1</span> -->
<!-- 			<span style="border: 1px solid black;">1</span> -->
<!-- 		</div> -->
<!-- 		<div> -->
<!-- 			<span style="border: 1px solid black;">2</span> -->
<!-- 			<span style="border: 1px solid black;">2</span>		</div> -->
<!-- 		<div> -->
<!-- 			<span style="border: 1px solid black;">3</span> -->
<!-- 			<span style="border: 1px solid black;">3</span> -->
<!-- 		</div> -->
<!-- 		<div> -->
<!-- 			<span style="border: 1px solid black;">4</span> -->
<!-- 			<span style="border: 1px solid black;">4</span> -->
<!-- 		</div> -->
<!-- 	</div> -->

</body>

</html>