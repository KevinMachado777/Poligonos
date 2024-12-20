package Ejercicio_basico_pilares_POO;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    // Arreglo dinamico (no tengo que especificar cuantos elementos quiero almacenar dentro del el)
    static ArrayList<Poligono> poligonos = new ArrayList<Poligono>();

    // Clase Scanner por fuera de tod0s los metodos (global) para que nos funcione en tod0s los metodos
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        // Metodo de llenar un poligono
        llenarPoligono();

        // Mostrar los datos y el area de cada poligono
        mostrarResultados();
    }

    public static void llenarPoligono(){
        int opcion;
        char respuesta;
        // do while externo
        do {
            // do while interno
            do {
                System.out.println("Digite que poligono desea");
                System.out.println("1. Triangulo");
                System.out.println("2. Rectangulo");
                System.out.print("Opcion: ");
                opcion = entrada.nextInt();
            }while (opcion < 1 || opcion > 2);

            switch (opcion){
                case 1: // Llenar un triangulo
                        llenarTriangulo();
                        break;

                case 2: // LLenar un rectangulo
                        llenarRectangulo();
                        break;
            }
            System.out.print("\nDesea introducir otro poligono(s/n): ");
            respuesta = entrada.next().charAt(0);
            System.out.println("");
        }while (respuesta == 's' || respuesta == 'S');
    }

    // Metodo de llenar un triangulo
    public static void llenarTriangulo(){
        double lado1, lado2, lado3;
        System.out.print("\nDigite el lado 1 del triangulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el lado 2 del triangulo: ");
        lado2 = entrada.nextDouble();
        System.out.print("Digite el lado 3 del triangulo: ");
        lado3 = entrada.nextDouble();

        // Crear un objeto triangulo de la Clase Triangulo
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        // Almacenar ese objeto triangulo en mi arreglo dinamico 'poligonos'
        poligonos.add(triangulo);
    }

    // Metodo de llenar un rectangulo
    public static void llenarRectangulo(){
        double lado1, lado2;

        System.out.print("\nDigite el lado 1 del rectangulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el lado 2 del rectangulo: ");
        lado2 = entrada.nextDouble();

        // Crear un objeto rectangulo de la clase 'Rectangulo'
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);

        // Almacenar ese objeto rectangulo a mi arreglo dinamico 'poligonos'
        poligonos.add(rectangulo);
    }

    public static void mostrarResultados(){
        // Bucle foreach con un objeto de la clase padre que recorrera el arreglo de poligonos
        for (Poligono poli: poligonos){
            System.out.println(poli.toString());
            System.out.println("Area: "+poli.area());
            System.out.println("");
        }
    }
}
