package com.project.areafigurassingleton;

public class Calculadora {
    private static Calculadora instancia = null;

    // Constructor privado para evitar la creación directa de instancias
    private Calculadora() {
    }

    // Método estático para obtener la instancia única de la Calculadora
    public static Calculadora getInstancia() {
        if (instancia == null) {
            instancia = new Calculadora();
        }
        return instancia;
    }

    /**
     * Calcula el área de un triángulo dado la base y la altura.
     *
     * @param base   La base del triángulo.
     * @param altura La altura del triángulo.
     * @return El área del triángulo.
     */
    public double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    /**
     * Calcula el área de un cuadrado dado el valor de un lado.
     *
     * @param lado El valor del lado del cuadrado.
     * @return El área del cuadrado.
     */
    public double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }

    /**
     * Calcula el área de un rombo dado la longitud de la diagonal mayor y la diagonal menor.
     *
     * @param diagonalMayor La longitud de la diagonal mayor.
     * @param diagonalMenor La longitud de la diagonal menor.
     * @return El área del rombo.
     */
    public double calcularAreaRombo(double diagonalMayor, double diagonalMenor) {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    /**
     * Calcula el área de un trapecio dado la longitud de la base mayor, la base menor y la altura.
     *
     * @param baseMayor La longitud de la base mayor.
     * @param baseMenor La longitud de la base menor.
     * @param altura    La altura del trapecio.
     * @return El área del trapecio.
     */
    public double calcularAreaTrapecio(double baseMayor, double baseMenor, double altura) {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    /**
     * Calcula el área de un círculo dado el valor del radio.
     *
     * @param radio El valor del radio del círculo.
     * @return El área del círculo.
     */
    public double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    /**
     * Calcula el área de un rectángulo dado la base y la altura.
     *
     * @param base   La base del rectángulo.
     * @param altura La altura del rectángulo.
     * @return El área del rectángulo.
     */
    public double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }
}
