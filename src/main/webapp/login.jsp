<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>

<h1>Login</h1>
<br/>
<br/>
<form action="${pageContext.request.contextPath}/autenticar" method="post" >
    <input type="text" name="user"/>
    <input type="password" name="pass"/>
    <button type="submit"> Logar</button>
</form>

</body>
</html>
