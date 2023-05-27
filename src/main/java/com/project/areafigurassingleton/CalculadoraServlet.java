package com.project.areafigurassingleton;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "CalculadoraServlet", value = "/CalculadoraServlet")
public class CalculadoraServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtener los parámetros del formulario
        String figura = request.getParameter("figura");
        double base = Double.parseDouble(request.getParameter("base"));
        double altura = Double.parseDouble(request.getParameter("altura"));
        double resultado = 0;

        // Calcular el área según la figura seleccionada
        Calculadora calculadora = Calculadora.getInstancia();
        switch (figura) {
            case "triangulo":
                resultado = calculadora.calcularAreaTriangulo(base, altura);
                break;
            case "cuadrado":
                resultado = calculadora.calcularAreaCuadrado(base);
                break;
            case "rombo":
                resultado = calculadora.calcularAreaRombo(base, altura);
                break;
            case "trapecio":
                double baseMenor = Double.parseDouble(request.getParameter("baseMenor"));
                resultado = calculadora.calcularAreaTrapecio(base, baseMenor, altura);
                break;
            case "circulo":
                resultado = calculadora.calcularAreaCirculo(base);
                break;
            case "rectangulo":
                resultado = calculadora.calcularAreaRectangulo(base, altura);
                break;
        }

        // Pasar el resultado a la página JSP para mostrarlo
        request.setAttribute("resultado", resultado);
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}