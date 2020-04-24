<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.democlass {
  color: red;
  font-style: italic;
  font-family: fantasy;
}
</style>

<script type="text/javascript">
   
   var pBtnStyle = '';
   
   window.onload = function() {
	var pBtn = document.getElementsByTagName('button')[1];

	pBtn.setAttribute('onclick', 'changeSet();');	
	
	var pTag = document.getElementsByTagName("p")[0];
	
	pBtnStyle = pTag.getAttribute('style');
   }
   
   function myFunction() {	 
	var hTag = document.getElementsByTagName('h1')[0];
	
	hTag.style.textAlign = 'center';
	hTag.removeAttribute("id");
	   
	}
   
   function changeSet() {	   
	   var pTag = document.getElementsByTagName("p")[0];
	   
// 	   getAttribute('style') != null
// 	   hasAttribute('style')
	   if (pTag.hasAttribute('style')) {
			pTag.removeAttribute('style');
		}else{			
			pTag.setAttribute('style', pBtnStyle);
		}
	   
	}
</script>

</head>

<body>
   <h1 id='democlass' class="democlass">Hello World</h1>

   <p id="demo" style="background-color: black; color: white;">
      Click the button to remove the class attribute from
      the h1 element.
   </p>

   <button onclick="myFunction();">Try it h1</button>
   <button>Try it p</button>

</body>
</html>


