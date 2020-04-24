//   자바스크립트도 외부로 꺼낼 수 있다(Ex6참조)

   window.onload = function() {
      var titleObj = document.getElementsByClassName('bigTitle')[0];
      titleObj.style.backgroundColor = 'gray';
      
      var lineObj = document.getElementsByClassName('setLine');      
      for (var i = 0; i < 2; i++) {
         lineObj[i].style.border = '2px solid blue';
         lineObj[i].style.backgroundColor = 'red';
      }      
      
      var colorObj = document.getElementsByClassName('setColor');     
      for (var i = 0; i < 5; i++) {
         colorObj[i].style.backgroundColor = 'green';
      }
      
      var fontObj = document.getElementsByClassName('setFont');     
      for (var i = 0; i < 3; i++) {
         fontObj[i].style.fontSize = (i+1)*10+5 + 'px';
         fontObj[i].style.backgroundColor = 'pink';
      }
         
   }
   
