<%@ page language='java' contentType='text/html; charset=UTF-8'
    pageEncoding='UTF-8'%>
<!DOCTYPE html>
<html>
<head>

<meta charset='UTF-8'>
<title>Insert title here</title>
<script type='text/javascript'>

	window.onload = function() {
		
		var divObj = document.getElementById('bodyDiv');
		
		var tableTag = document.createElement('table');
		tableTag.style.border = '1px solid black';
		
		var trTadList = [];		
		for (var i = 0; i < 4; i++) {
			trTadList[i] = document.createElement('tr');
		}
		
		var tdTadList = [];		
		for (var i = 0; i < 4; i++) {
			tdTadList[i] = document.createElement('td');
		}
		
		var textList = [];		
		for (var i = 0; i < 4; i++) {
			textList[i] = document.createTextNode(i+1);
		}
		
		for (var i = 0; i < trTadList.length; i++) {
			tdTadList[i].appendChild(textList[i]);
			trTadList[i].appendChild(tdTadList[i]);
			tableTag.appendChild(trTadList[i]);		
			
		}
		
		divObj.appendChild(tableTag);
		
	}
	
/* 찬양이 코드
	   window.onload = function() {
		      
		      var divObj = document.getElementById('numTable');
		   
		      var tableObj = document.createElement('table');
		      tableObj.style.border = '1px solid black';
		      tableObj.style.borderCollapse = 'collapse';
		      
		      var trObjList = [];
		      
		      trObjList[0] = document.createElement('tr');
		      var tdObjList = document.createElement('td');
		      trObjList[0].appendChild(tdObjList);
		      tableObj.appendChild(trObjList[0]);
		      
		      for (var i = 1; i < 4; i++) {
		         trObjList[i] = trObjList[0].cloneNode(true);
		         tableObj.appendChild(trObjList[i]);
		      }
		      
		      for (var i = 0; i < 4; i++) {
		         trObjList[i].children[0].innerHTML = i+1;
		      }

		      divObj.appendChild(tableObj);
		   
		   }
*/

</script>

</head>

<body>

	<div id='bodyDiv'>
		<table style='border: 1px solid black; border-collapse: collapse;'>
			<tr>
				<td>1</td>
			</tr>
			<tr>
				<td>2</td>
			</tr>
			<tr>
				<td>3</td>
			</tr>
			<tr>
				<td>4</td>
			</tr>
		</table>	
	</div>

	

</body>

</html>