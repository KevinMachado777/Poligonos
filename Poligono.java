package Ejercicio_basico_pilares_POO;

// Clase padre
public abstract class Poligono {
    // Atributos
    protected int numero_lados;

    // Constructor
    public Poligono(int numero_lados) {
        this.numero_lados = numero_lados;
    }

    // Metodo Getter
    public int getNumero_lados() {
        return numero_lados;
    }

    // El override es porque estamos sobre escribiendo el toString que hereda de la clase Object --> Clase de Java
    @Override
    public String toString() {
        return "numero lados = " + numero_lados;
    }

    // Metodo abstracto del area
    public abstract double area();
}
