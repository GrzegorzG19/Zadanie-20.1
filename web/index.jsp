<%--
  Created by IntelliJ IDEA.
  User: Grzegorz
  Date: 12.07.2019
  Time: 12:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>Przelicznik miary</h1>

<form method="post" action="/CalcServlet">

    <input type="text" name="metr"/> <br/>
    <input type="text" name="cent"/><br/>
    <input type="text" name="mili"/><br/>
    <input type="submit" value="Oblicz"/>

</form>
</body>
</html>
