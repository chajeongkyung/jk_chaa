<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>select 활용</title>
<style type="text/css">
	table, tr, td{
		border: 1px solid black;
	}
	img {
		width: 50px;
		height: 50px;
	}
</style>
<script type="text/javascript">
	var imgTag = '';
	window.onload = function(){
		var imgBox = document.getElementById('im');
		
		imgTag = document.createElement('img');
		imgBox.appendChild(imgTag);
	}
	function selimg() {
		var selectBox = document.getElementById('sel');
		
		if (selectBox.selectedIndex == 0) {
			imgTag.src = './image/cha.png';		
		}else if (selectBox.selectedIndex == 1) {
			imgTag.src = './image/jo.jpg';
		}else if (selectBox.selectedIndex == 2) {
			imgTag.src = './image/chae.png';
		}
	}
	
	function selStar() {
		var nameStr = '';
		var selectBox = document.getElementById('sel');
		
		if (selectBox.selectedIndex == -1) {
			return;
		}
		for (var i = 0; i < selectBox.length; i++) {
		
			if (selectBox.options[i].selected) {
				nameStr += selectBox.options[i].value + ' ';
			}			
		}
		alert(nameStr);
		
	}
</script>
</head>
<body>
	<table>
		<tr>
			<td style="width:50px;">
				<select id="sel" size="4" multiple>
					<option value="차은우">1)차은우</option>
					<option value="조정석">2)조정석</option>
					<option value="채송화">3)채송화</option>
				
				</select>
			</td>
			<td style="width:100px;">
				<span id="im"><!-- 여기에 선택한 연예인의 이미지를 출력한다 --></span>
				
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="button" value="좋아하는 연예인은?(이미지)" onclick="selimg();">
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="button" value="좋아하는 연예인은?(중복가능)" onclick="selStar();">
				<!-- 버튼 클릭시 다중 선택한 연예인의 이름을 알림창으로 한번만 출력한다 -->
			</td>
		</tr>
	</table>
</body>
</html>