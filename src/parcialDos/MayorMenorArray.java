package parcialDos;

import java.util.Scanner;

public class MayorMenorArray {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String respuesta;

        do {
            int cantidad = solicitarCantidadNumeros();
            int[] numeros = llenarArreglo(cantidad);

            System.out.println("\n--- Arreglo Original ---");
            mostrarArreglo(numeros);

            numeros = intercambiarMayorYMenor(numeros);

            System.out.println("\n--- Arreglo Modificado ---");
            mostrarArreglo(numeros);

            respuesta = solicitarRepeticion();

        } while (respuesta.equalsIgnoreCase("si"));

        System.out.println("Programa finalizado.");
    }

    private static int solicitarCantidadNumeros() {
        System.out.print("¿Cuántos números deseas ingresar?: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada inválida. Ingresa un número entero: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static int[] llenarArreglo(int cantidad) {
        int[] arreglo = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el valor para la posición " + i + ": ");
            while (!scanner.hasNextInt()) {
                System.out.print("Entrada inválida. Ingresa un número entero: ");
                scanner.next();
            }
            arreglo[i] = scanner.nextInt();
        }
        return arreglo;
    }

    private static void mostrarArreglo(int[] arreglo) {
        System.out.print("Arreglo: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) System.out.print(", ");
        }
        System.out.println();
    }

    private static int[] intercambiarMayorYMenor(int[] arreglo) {
        if (arreglo.length < 2) return arreglo.clone();

        int[] resultado = arreglo.clone();
        int indiceMayor = 0;
        int indiceMenor = 0;

        for (int i = 1; i < resultado.length; i++) {
            if (resultado[i] > resultado[indiceMayor]) {
                indiceMayor = i;
            }
            if (resultado[i] < resultado[indiceMenor]) {
                indiceMenor = i;
            }
        }

        resultado = intercambiar(resultado, 0, indiceMayor);

        if (indiceMenor == 0) {
            indiceMenor = indiceMayor;
        }

        resultado = intercambiar(resultado, resultado.length - 1, indiceMenor);

        return resultado;
    }

    private static int[] intercambiar(int[] arreglo, int i, int j) {
        int[] copia = arreglo.clone();
        int temp = copia[i];
        copia[i] = copia[j];
        copia[j] = temp;
        return copia;
    }

    private static String solicitarRepeticion() {
        System.out.print("\n¿Deseas repetir el proceso? (Si/No): ");
        return scanner.next();
    }

}
