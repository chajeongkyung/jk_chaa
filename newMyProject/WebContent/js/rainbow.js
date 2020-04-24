//
//	var divBackgroundColorBackUp = '';
//	
//	window.onload = function() {
//
//		var divObj = document.getElementsByTagName('div');
//		
//		for (var i = 0; i < divObj.length; i++) {
//			divObj[i].addEventListener('mouseover', function() {
//				orangeColor(this)
//			}, false);
//			divObj[i].addEventListener('mouseout', function() {
//				whiteColor(this)
//			}, false);
//		}
//	}
//
//	function orangeColor(thisDivObj) {
//		divBackgroundColorBackUp = thisDivObj.style.backgroundColor;
//		thisDivObj.style.backgroundColor = 'orange';
//	}
//
//	function whiteColor(thisDivObj) {
//		thisDivObj.style.backgroundColor = divBackgroundColorBackUp;
//	}
var divBackgroundColorBackUp = '';
window.onload = function(){
   divList = document.getElementsByTagName('div');
   
   for (var i = 0; i < divList.length; i++) {
      divList[i].addEventListener('mouseenter', changeGrayFnc);
      divList[i].addEventListener('mouseleave', changeWhiteFnc);
   }
}

function changeGrayFnc(){
	divBackgroundColorBackUp = this.style.backgroundColor;
   this.style.backgroundColor = 'gray';
}

function changeWhiteFnc(){
   this.style.backgroundColor = divBackgroundColorBackUp;
}




