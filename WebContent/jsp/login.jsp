
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	 "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="resources/css/bootstrap1.min.css">

<!-- jQuery library -->
<script src="resources/js/jquery1.min.js"></script>
<title>Spring MVC</title>
<style>
#resetBtn {
	background: transparent linear-gradient(#DC76B5, #C51B85) repeat scroll 0% 0%;
	border:none;
}
</style>
</head>
<script>

  $(document).ready(function(){
	  $("#diverror").hide();
	  $("#resetBtn").click(function(){
			 $.ajax({
		         url         : "checkUserStatus",		
		         type        : "POST",
		         data        : {aCode:$("#txtname").val(),apass:$("#txtpassword").val()},
		         success   	 : function(data){
				if(data=="true")
				window.location.href="dashboard";
				else
					 $("#diverror").show();
		         }
			 });
		});

});
  
	 
</script>
<body style="background:#F8F8F8">
	<center>
		
		
		<div class="panel panel-default" style="width: 30%; margin-top: 13%;">
			<div class="panel-body">
			
			<div class="pull-left">
				<h4>Login password</h4>	
			</div>
				
				<br><hr>
				<p id="diverror" style="text-align:left;color:red">
					Username or password invalid
				</p>
				<p>
				<p>
   				${error}
				</p>
				<p>
					<input type="text" class="form-control" id="txtname" placeholder="Name" name="txtname" size="65" />
					<input type="hidden" id="hiddenTxtname" name="hiddenTxtname">
				</p>
				<p>
					<input type="text" class="form-control" id="txtpassword" placeholder="Password" name="Password" size="65" />
					<input type="hidden" id="hiddenTxtpwd" name="hiddenTxtpwd">
				</p>
				<!-- <p id="diverror" style="text-align:left;color:red">
					Please enter user name and proceed.
				</p> -->
				<p>
					<button style="width:100%"  id="resetBtn" class="btn btn-primary">Login</button>
				</p>
				<div id="progress"></div>
			</div>
		</div>
		
	</center>
</body>
</html>