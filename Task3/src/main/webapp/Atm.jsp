<body>
<form method="post" onSubmit="return transcation()">
  <input type="radio" id="option1" name="option" value="option1">
  <label for="option1">Withdraw Amount</label><br>
  <input type="radio" id="option2" name="option" value="option2">
  <label for="option2">Deposit Amount</label><br>
  <input type="radio" id="option3" name="option" value="option3">
  <label for="option3">Check Balance</label><br>
  <input type="radio" id="option4" name="option" value="option4">
  <label for="option4">Exit</label><br>
  <input type="submit"  value="Submit Transcation Type""/>
</form>  
<form action="/Atm_Interface/Atm" method="post" id="f"><div id="inputs"></div></form>
  <script>
  document.getElementById("f").addEventListener("submit",function(){
	  setTimeout(function(){
	      window.location.href = "Atm.jsp";
	  }, 1000); 
  })
  	  function transcation(){
		var opt=document.querySelector('input[name="option"]:checked');
		if(opt.value==="option1" || opt.value==="option2"){
	      var o = document.createElement("input");  
		  o.type = "text";
		  o.name = "opti"; 
		  o.value=opt.value;
		  o.readOnly=true;
		  document.getElementById("inputs").appendChild(o);
		  var label1=document.createElement("label");
		  label1.textContent="Enter the Amount:";
		  document.getElementById("inputs").appendChild(label1);
		  var money = document.createElement("input");  
		  money.type = "number";
		  money.name = "amount"; 
		  document.getElementById("inputs").appendChild(money	);
		  var subm = document.createElement("input");  
		  subm.type = "submit";
		  subm.name = "sub"; 
		  document.getElementById("inputs").appendChild(subm);
		  var br = document.createElement("br");
		  document.getElementById("inputs").appendChild(br);
		  return false;
	  }
		if(opt.value==="option3" ){
		      var o = document.createElement("input");  
			  o.type = "text";
			  o.name = "opti"; 
			  o.value=opt.value;
			  o.readOnly=true;
			  document.getElementById("inputs").appendChild(o);
			  var subm = document.createElement("input");  
			  subm.type = "submit";
			  subm.name = "sub"; 
			  document.getElementById("inputs").appendChild(subm);
			  var br = document.createElement("br");
			  document.getElementById("inputs").appendChild(br);
			  return false;
		  }
		if(opt.value==="option4"){
			
			window.close();
		}
		
	  else{
		  return false;
	  }  
	  }
  </script>
 </body>



