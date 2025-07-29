package parcialDos;

import java.util.Scanner;

public class AgregaElementosArray {

    private static final Scanner scanner = new Scanner(System.in);
    private static int indice = 0;

    public static void main(String[] args) {
        System.out.print("¿Cuántos elementos deseas en el arreglo?: ");
        int tamanio = scanner.nextInt();

        int[] arreglo = new int[tamanio];
        String respuesta;

        do {
            int opcion = mostrarMenu();
            switch (opcion) {
                case 1 -> ejecutarLlenado(arreglo);
                case 2 -> eliminarDatos(arreglo);
                default -> System.out.println("Opción no válida.");
            }

            System.out.print("\n¿Quieres regresar al menú? (Si/No): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("si"));

        System.out.println("Programa finalizado.");
    }

    private static int mostrarMenu() {
        System.out.println("\n--- Menú Principal ---");
        System.out.println("1 - Llenar arreglo");
        System.out.println("2 - Eliminar datos");
        System.out.print("Selecciona una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        return opcion;
    }

    private static void ejecutarLlenado(int[] arreglo) {
        String respuesta;

        do {
            System.out.print("Ingresa la posición a llenar (0 a " + (arreglo.length - 1) + "): ");
            int posicion = scanner.nextInt();

            System.out.print("Ingresa el valor para la posición " + posicion + ": ");
            int valor = scanner.nextInt();
            scanner.nextLine();

            llenarArreglo(arreglo, posicion, valor);

            System.out.print("¿Deseas agregar otro valor? (Si/No): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("si"));

        mostrarArreglo(arreglo);
    }

    private static void llenarArreglo(int[] arreglo, int posicion, int valor) {
        if (posicion >= 0 && posicion < arreglo.length) {
            arreglo[posicion] = valor;
            System.out.println("Valor agregado en la posición " + posicion + ".");
            if (posicion >= indice) {
                indice = posicion + 1;
            }
        } else {
            System.out.println("Posición inválida. No se agregó el valor.");
        }
    }

    private static void eliminarDatos(int[] arreglo) {
        System.out.println("\n--- Eliminar ---");
        System.out.println("1 - Eliminar todos");
        System.out.println("2 - Eliminar uno");
        System.out.print("Selecciona una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1 -> eliminarTodos(arreglo);
            case 2 -> eliminarUno(arreglo);
            default -> System.out.println("Opción no válida.");
        }
    }

    private static void eliminarTodos(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = 0;
        }
        indice = 0;
        System.out.println("\nSe eliminaron todos los valores.");
        mostrarArreglo(arreglo);
    }

    private static void eliminarUno(int[] arreglo) {
        if (indice > 0) {
            arreglo[indice - 1] = 0;
            indice--;
            System.out.println("\nSe eliminó el último valor ingresado.");
        } else {
            System.out.println("\nNo hay valores para eliminar.");
        }

        mostrarArreglo(arreglo);
    }

    private static void mostrarArreglo(int[] arreglo) {
        System.out.println("\nValores actuales del arreglo:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("A[" + i + "] = " + arreglo[i]);
        }
    }
}
