<!DOCTYPE html>
<html lang="en">
<head>
  <title>Signup</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  <style>

.form {
     margin: 5em !important;
    width: 110%;
    
}
button{
 width:100%;
  height:100%;
}
        
   input {
  font-size:12px;
  display:block;
  width:100%;
  height:35px;
  padding:5px 20px;


  
  border-radius:25px 0px 35px 0px;
/*   transition:border-color .25s ease, box-shadow .25s ease;
 */ 
}
  
  .btn-success{
  background-color:#ff0066;}   
     .field-wrap {
  position:relative;
  margin-bottom:5px;
}   
label {
 
  transition:all 0.25s ease;
  -webkit-backface-visibility: hidden;

  font-size:14px;
  
}
.wq{
background-image: url("/home/daemonsoft/Desktop/cricket.jpg");
background-repeat:no-repeat;
background-size: cover;
overflow:hidden; 
}


</style>
</head>
<body class="img1">
	<div class="wq"> 
		<div class="form">
		<div>
			<h2 style="margin-left: 40px;">Registration Form</h2>
		</div>
		<div  style="border-radius:15px;padding: 15px;opacity:1;width: 25%;margin-left: 25px;box-shadow: 5px -3px 10px #2f6847">
			<form action="Register" method="post" commandName="User">

 				<div class="field-wrap">
  					<div class="row">
  						<p>
   				${error}
				</p>
  						<div class="col-sm-6">
   							<label id="label" >First Name</label>
   							<input type="text" id="firstName" name="firstName" placeholder="First Name" required>
  						</div>
   						<div class="col-sm-6">
   							<label id="label">Last Name</label>
   							<input type="text" id="lastName" name="lastName" placeholder="Last Name" required>
  						</div>
 					</div>
 				</div>
 
 				<div class="field-wrap">
  					<label id="label"> UserName</label>
  					<input type="text" id="username" name="username" placeholder="Username" required>
 				</div>
 
 				<div class="field-wrap">
 					 <label id="label">Email</label>
					 <input type="email" id="email" name="email" placeholder="Email" required>
 				</div>
 
 				<div class="field-wrap">
  					<label id="label">Password</label>
  					<input type="password" id="password" name="password" placeholder="password" required>
 				</div>
 
 				<div class="field-wrap">
  					<label id="label">Confirm Password</label>
  					<input type="password" id="c_pass" name="c_pass" placeholder="confirm password" required>
 				</div>

 				<div class="field-wrap" style="margin-top:20px;">
  					<div class="row">
   						<div class="col-sm-6">  
   							<button type="submit" id="cancel" class="btn btn-primary">Cancel</button>
   						</div>
   
   						<div class="col-sm-6">
     						<button type="submit" id="submit" class="btn btn-success" value="Register">SignUp</button>
   						</div>
  					</div>
 				</div>
			</form>&nbsp
</div>
</div>
</body>
</html>

