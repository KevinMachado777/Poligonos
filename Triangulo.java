package Ejercicio_basico_pilares_POO;

// Clase hija
public class Triangulo extends Poligono{
    // Atributos
    private double lado1;
    private double lado2;
    private double lado3;

    // Metodo constructor del triangulo sin la necesidad de contruir el numero de lados porque sabemos
    // que trabajeremos con 3 lados
    public Triangulo(double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Metodos Getters
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    // Sobre escribir el metodo toString
    @Override
    public String toString() {
        return "Triangulo: \n" + super.toString()+ // Mostrar el numero de lados que tiene el triangulo
                "\nlado1 = " + lado1 +
                ", lado2 = " + lado2 +
                ", lado3 = " + lado3;
    }

    // Metodo del area del triangulo sobre escrito
    @Override
    public double area() {
        // Formula de Heron
        double p = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt((p * (p - lado1) * (p - lado2) * (p - lado3)));
    }
}
