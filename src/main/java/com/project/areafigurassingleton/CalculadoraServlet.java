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
        String opcion = request.getParameter("opcion");
        double resultado = 0;

        // Calcular el área o el perímetro según la figura seleccionada
        Calculadora calculadora = Calculadora.getInstancia();
        switch (figura) {
            case "triangulo":
                if (opcion.equals("area")) {
                    resultado = calculadora.calcularAreaTriangulo(base, altura);
                } else if (opcion.equals("perimetro")) {
                    // Obtener la longitud de los otros dos lados del triángulo
                    double lado2 = Double.parseDouble(request.getParameter("lado2"));
                    double lado3 = Double.parseDouble(request.getParameter("lado3"));
                    resultado = calculadora.calcularPerimetroTriangulo(base, lado2, lado3);
                }
                break;
            case "cuadrado":
                if (opcion.equals("area")) {
                    resultado = calculadora.calcularAreaCuadrado(base);
                } else if (opcion.equals("perimetro")) {
                    resultado = calculadora.calcularPerimetroCuadrado(base);
                }
                break;
            case "rombo":
                if (opcion.equals("area")) {
                    resultado = calculadora.calcularAreaRombo(base, altura);
                } else if (opcion.equals("perimetro")) {
                    resultado = calculadora.calcularPerimetroRombo(base);
                }
                break;
            case "trapecio":
                double baseMenor = Double.parseDouble(request.getParameter("baseMenor"));
                if (opcion.equals("area")) {
                    resultado = calculadora.calcularAreaTrapecio(base, baseMenor, altura);
                } else if (opcion.equals("perimetro")) {
                    // Obtener la longitud de la base menor y los otros dos lados del trapecio
                    baseMenor = Double.parseDouble(request.getParameter("baseMenor"));
                    double lado2 = Double.parseDouble(request.getParameter("lado2"));
                    double lado3 = Double.parseDouble(request.getParameter("lado3"));
                    resultado = calculadora.calcularPerimetroTrapecio(base, baseMenor, lado2, lado3);
                }
                break;
            case "circulo":
                if (opcion.equals("area")) {
                    resultado = calculadora.calcularAreaCirculo(base);
                } else if (opcion.equals("perimetro")) {
                    resultado = calculadora.calcularPerimetroCirculo(base);
                }
                break;
            case "rectangulo":
                if (opcion.equals("area")) {
                    resultado = calculadora.calcularAreaRectangulo(base, altura);
                } else if (opcion.equals("perimetro")) {
                    resultado = calculadora.calcularPerimetroRectangulo(base, altura);
                }
                break;
        }

        // Pasar el resultado a la página JSP para mostrarlo
        request.setAttribute("resultado", resultado);
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}