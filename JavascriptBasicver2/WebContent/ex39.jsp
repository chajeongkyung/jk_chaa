<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8">
   <title>Insert title here</title>   

</head>

<body>
   
   <input id='yourNumber1' type="text" value="">+
   <input id='yourNumber2' type="text" value="">
   =
   <input id='result' type="text" value="">
   
   <div>
   		<button onclick="plusFnc();">+</button>
         버튼을 클릭하면 사용자가 입력한 두 숫자를 더해서 input 태그에 결과값을 출력한다.
   </div>
   
</body>
   <script type="text/javascript">
   
		function plusFnc() {
			var inputObj1 = document.getElementById('yourNumber1');
			var inputObj2 = document.getElementById('yourNumber2');
			var resultObj = document.getElementById('result');

			var numVal1 =  inputObj1.value;
			var numVal2 =  inputObj2.value;

			var sum = Number(numVal1) + Number(numVal2);			
			
			resultObj.value = sum;
			
		}
	 </script>
   
</html>