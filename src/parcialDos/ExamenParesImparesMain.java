package parcialDos;

import java.util.Scanner;

public class ExamenParesImparesMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExamenParesImpares paresImpares = new ExamenParesImpares();

        String respuesta;

        do {
            System.out.print("Número de filas: ");
            int filas = scanner.nextInt();

            System.out.print("Número de columnas: ");
            int columnas = scanner.nextInt();

            int[][] arregloOriginal = new int[filas][columnas];
            int[][] arregloCopia = new int[filas][columnas];

            paresImpares.llenarArreglo(arregloOriginal);
            System.out.println("\nArreglo ingresado:");
            paresImpares.imprimirArreglo(arregloOriginal);
            System.out.println("");

            System.out.println("Realizando copia uno a uno\n");
            for (int i = 0; i < arregloOriginal.length; i++) {
                for (int j = 0; j < arregloOriginal[i].length; j++) {
                    paresImpares.llenarElementoArreglo(arregloCopia, i, j, arregloOriginal[i][j]);
                }
            }

            System.out.println("\nArreglo copia uno a uno:");
            paresImpares.imprimirArreglo(arregloCopia);
            System.out.println("");

            paresImpares.imprimeParesImpares(arregloCopia);

            System.out.print("¿Deseas realizar otro proceso? (Si/No): ");
            scanner.nextLine(); // Limpiar buffer
            respuesta = scanner.nextLine();

        } while (respuesta.equalsIgnoreCase("si"));

        System.out.println("Programa finalizado.");
    }
}
