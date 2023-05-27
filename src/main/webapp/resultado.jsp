<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Calculadora de áreas - Resultado</title>
</head>
<body>
<h1>Resultado</h1>
<p>El área calculada es: <%= request.getAttribute("resultado") %></p>
</body>
</html>