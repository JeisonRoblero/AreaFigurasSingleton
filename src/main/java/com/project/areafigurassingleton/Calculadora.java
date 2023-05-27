package com.project.areafigurassingleton;

public class Calculadora {
    private static Calculadora instancia = null;

    private Calculadora() {
        // Constructor privado para evitar instanciación directa
    }

    public static Calculadora getInstancia() {
        if (instancia == null) {
            instancia = new Calculadora();
        }
        return instancia;
    }

    // Métodos para calcular el área de las figuras

    /**
     * Calcula el área de un triángulo dado la longitud de la base y la altura.
     *
     * @param base   La longitud de la base del triángulo.
     * @param altura La altura del triángulo.
     * @return El área del triángulo.
     */
    public double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    /**
     * Calcula el área de un cuadrado dado la longitud de un lado.
     *
     * @param lado La longitud de un lado del cuadrado.
     * @return El área del cuadrado.
     */
    public double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }

    /**
     * Calcula el área de un rombo dado las longitudes de las diagonales mayor y menor.
     *
     * @param diagonalMayor La longitud de la diagonal mayor del rombo.
     * @param diagonalMenor La longitud de la diagonal menor del rombo.
     * @return El área del rombo.
     */
    public double calcularAreaRombo(double diagonalMayor, double diagonalMenor) {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    /**
     * Calcula el área de un trapecio dado la longitud de la base mayor, la base menor y la altura.
     *
     * @param baseMayor  La longitud de la base mayor del trapecio.
     * @param baseMenor  La longitud de la base menor del trapecio.
     * @param altura     La altura del trapecio.
     * @return El área del trapecio.
     */
    public double calcularAreaTrapecio(double baseMayor, double baseMenor, double altura) {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    /**
     * Calcula el área de un círculo dado el radio.
     *
     * @param radio El radio del círculo.
     * @return El área del círculo.
     */
    public double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    /**
     * Calcula el área de un rectángulo dado la longitud de la base y la altura.
     *
     * @param base   La longitud de la base del rectángulo.
     * @param altura La altura del rectángulo.
     * @return El área del rectángulo.
     */
    public double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    // Métodos para calcular el perímetro de las figuras

    /**
     * Calcula el perímetro de un triángulo dado las longitudes de los tres lados.
     *
     * @param lado1 El valor del lado 1 del triángulo.
     * @param lado2 El valor del lado 2 del triángulo.
     * @param lado3 El valor del lado 3 del triángulo.
     * @return El perímetro del triángulo.
     */
    public double calcularPerimetroTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }

    /**
     * Calcula el perímetro de un cuadrado dado la longitud de un lado.
     *
     * @param lado La longitud de un lado del cuadrado.
     * @return El perímetro del cuadrado.
     */
    public double calcularPerimetroCuadrado(double lado) {
        return 4 * lado;
    }

    /**
     * Calcula el perímetro de un rombo dado la longitud de un lado.
     *
     * @param lado La longitud de un lado del rombo.
     * @return El perímetro del rombo.
     */
    public double calcularPerimetroRombo(double lado) {
        return 4 * lado;
    }

    /**
     * Calcula el perímetro de un trapecio dado las longitudes de los cuatro lados.
     *
     * @param lado1 El valor del lado 1 del trapecio.
     * @param lado2 El valor del lado 2 del trapecio.
     * @param lado3 El valor del lado 3 del trapecio.
     * @param lado4 El valor del lado 4 del trapecio.
     * @return El perímetro del trapecio.
     */
    public double calcularPerimetroTrapecio(double lado1, double lado2, double lado3, double lado4) {
        return lado1 + lado2 + lado3 + lado4;
    }

    /**
     * Calcula el perímetro de un círculo dado el radio.
     *
     * @param radio El radio del círculo.
     * @return El perímetro del círculo.
     */
    public double calcularPerimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }

    /**
     * Calcula el perímetro de un rectángulo dado la longitud de la base y la altura.
     *
     * @param base   La longitud de la base del rectángulo.
     * @param altura La altura del rectángulo.
     * @return El perímetro del rectángulo.
     */
    public double calcularPerimetroRectangulo(double base, double altura) {
        return 2 * (base + altura);
    }
}
