<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<style >
body 
{
background: url('https://niamhennis.com/wp-content/uploads/2017/10/Book-Reading-1.jpeg') fixed;
background-size: cover;
 
 margin-top:0px; 
 margin-left:0px; 
 
}
</style>





</head>
<body>

<center>
<form action="perform_login" method="post">	
<h2>Sign In</h2>
<br>
Username<input placeholder="Username" required id="username" name="username" type="text" />
<br><br>

Password<input class="form-control" placeholder="Password" required name="password" type="password" title="Enter Valid credentials"/>
											<br><br><input style="background-color:purple" type="submit" value="Sign in">
						
						<a href="register">Register</a>
</center>
</body>
</html>