<%@ page language='java' contentType='text/html; charset=UTF-8'
    pageEncoding='UTF-8'%>
<!DOCTYPE html>
<html>
<head>

<meta charset='UTF-8'>
<title>Insert title here</title>
<script type='text/javascript'>

	function makeTableFnc() {

		var divObj = document.getElementsByTagName('div')[2];
		
		var tableTag = document.createElement('table');
		tableTag.style.border = '1px solid black';
		tableTag.style.borderCollapse = 'collapse';
		
		var trTagList = [];		
		for (var i = 0; i < 2; i++) {
			trTagList[i] = document.createElement('tr');
			trTagList[i].style.border = '1px solid black';
		}
		
		var tdTagList = [];		
		for (var i = 0; i < 4; i++) {
			tdTagList[i] = document.createElement('td');
			tdTagList[i].style.border = '1px solid black';
		}
		
		var inputName = document.getElementsByTagName('input')[0];
		var inputNickName = document.getElementsByTagName('input')[1];
		
		tdTagList[0].innerHTML = '이름';
		tdTagList[1].innerHTML = inputName.value;
		tdTagList[2].innerHTML = '별명';
		tdTagList[3].innerHTML = inputNickName.value;
		
		
		for (var i = 0; i < trTagList.length; i++) {
			tableTag.appendChild(trTagList[i]);
			for (var n = 0; n < trTagList.length; n++) {
				trTagList[i].appendChild(tdTagList[i*2+n]);
			}
		}
				
		divObj.appendChild(tableTag);
	}
</script>

</head>

<body>

	<div>
		이름: <input type="text" value="">
	</div>

	<div>
		별명: <input type="text" value="">
	</div>
	
	<div>
		<table style="border: 1px solid black; border-collapse: collapse;">
			<tr style="border: 1px solid black;">
				<td style="border: 1px solid black;">이름</td>
				<td style="border: 1px solid black;">차정경</td>
			</tr>
			<tr style="border: 1px solid black;">
				<td style="border: 1px solid black;">별명</td>
				<td style="border: 1px solid black;">교수</td>
			</tr>
		</table>
	</div>
	
	<button onclick="makeTableFnc();">날 누르면 테이블이 만들어져</button>
	
</body>

</html>