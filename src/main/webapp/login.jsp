
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login page</title>
</head>
<body>
<h2>Вход</h2>
<form action="login" method="post">
    <input type="text" name="email" placeholder="Email"><br>
    <input type="password" name="password" placeholder="Пароль"><br>
    <button type="submit">Войти</button>
</form>

<%
    String errorMessage = (String) request.getAttribute("errorMessage");
    if (errorMessage != null && !errorMessage.isEmpty()) {
%>
<p><%= errorMessage %></p>
<%
    }
%>

</body>
</html>
