<html>
<head>
<title>Login</title>
</head>
<body>
<style> 
body {
 font-size: 25px;
}
form{
  width: 35%;
  margin: 0px auto;
}
input[type=text] {
  width: 100%;
  box-sizing: border-box;
  border: 2px solid blue;
  border-radius: 10px;
  font-size: 16px;
  background-color: white;
  padding: 15px 25px 12px 55px;
  margin: 5px;
}
input[type=password] {
  width: 100%;
  box-sizing: border-box;
  border: 2px solid blue;
  border-radius: 10px;
  font-size: 16px;
  background-color: white;
  padding: 15px 25px 12px 55px;
  margin: 5px;
}
input[type=submit] {
  width: 100%;
  box-sizing: border-box;
  border: 2px solid blue;
  border-radius: 10px;
  font-size: 16px;
  background-color: black;
  color: white;
  padding: 15px 25px 12px 55px;
  cursor: pointer;
  text-align: center;
}
.error{
  text-color: red;
}
</style>


<form action="login" method="post">
  <b>Login Page : </b>
  <input type="text" name="userName" placeholder="Enter Your Name">
  <input type="password" name="password" placeholder="Enter Your Password">
  <input type="submit" name="Login" value="Login">
</form>

</body>
</html>
