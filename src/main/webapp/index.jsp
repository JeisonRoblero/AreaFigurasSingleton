<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculadora de áreas y perímetros</title>
</head>
<body>
<h1>Calculadora de áreas y perímetros</h1>
<form action="CalculadoraServlet" method="post">
    <label for="figura">Seleccione la figura:</label>
    <select name="figura" id="figura">
        <option value="triangulo">Triángulo</option>
        <option value="cuadrado">Cuadrado</option>
        <option value="rombo">Rombo</option>
        <option value="trapecio">Trapecio</option>
        <option value="circulo">Círculo</option>
        <option value="rectangulo">Rectángulo</option>
    </select>
    <br><br>
    <label for="base">Base:</label>
    <input type="number" name="base" id="base" required>
    <br><br>
    <label for="altura">Altura:</label>
    <input type="number" name="altura" id="altura" required>
    <br><br>
    <label for="opcion">Seleccione la operación:</label>
    <select name="opcion" id="opcion">
        <option value="area">Calcular Área</option>
        <option value="perimetro">Calcular Perímetro</option>
    </select>
    <br><br>
    <input type="submit" value="Calcular">
</form>
</body>
</html>

