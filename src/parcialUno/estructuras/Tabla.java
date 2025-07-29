package parcialUno.estructuras;

import java.util.Scanner;

public class Tabla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Imprimir tabla de un número");
            System.out.println("2. Imprimir tablas del 1 al 10");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Tabla de multiplicar del número: ");
                    int numero = scanner.nextInt();
                    imprimirTabla(numero, 1);
                    break;
                case 2:
                    imprimirTablaFor();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 0);

    }
    public static void imprimirTabla(int numero, int multiplicador) {
        if (multiplicador > 10) {
            return;
        }
        System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
        imprimirTabla(numero, multiplicador + 1);
    }
    public static void imprimirTablaFor() {
        for (int indice = 1; indice <=10 ; indice++) {
            imprimirTabla(indice, 1);
        }

    }
}
