<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

	function spaceFnc(spaceNum) {
		var spaceStr = '';

		for (var i = 0; i < spaceNum; i++) {
			spaceStr = spaceStr + '&nbsp;';
		}

		return spaceStr;
	}

	var firstProduct = '';
	var secondProduct = '';

	firstProduct = {
		num : 100,
		name : '커피',
		price : 1000
		
	}
	
	var str = '';
	
	str = str + firstProduct.num + '\n';
	str = str + firstProduct.name + '\n';
	str = str + firstProduct.price + '\n';

	alert(str);

	secondProduct = {
		num : 101,
		name : '우유',
		price : 1500
		
	}
	alert(secondProduct.num);
	alert(secondProduct.name);
	alert(secondProduct.price);
	
</script>

</head>

<body>



</body>
</html>