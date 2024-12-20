package Ejercicio_basico_pilares_POO;

// Clase hija
public class Rectangulo extends Poligono{
    // Atributos
    private double lado1;
    private double lado2;

    // Constructor de rectangulo sin necesidad de volver a construir el numero de lados porque solo
    // Trabajaremos con dos lados
    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Metodos Getters de la clase rectangulo
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    // Sobre escribir el metodo toString de la clase padre que es poligono
    @Override
    public String toString() {
        return "Rectangulo: \n" + super.toString()+ // Esto para mostrar el numero de lados ya que en la clase padre es lo
                // que hace este metodo
                "\nlado1 = " + lado1 +
                ", lado2 = " + lado2;
    }

    // Metodo del area del rectangulo sobre escrito
    @Override
    public double area() {
        return lado1 * lado2;
    }
}
