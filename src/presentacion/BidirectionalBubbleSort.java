package presentacion;

import java.util.Scanner;

public class BidirectionalBubbleSort {
    private static final int ARRAY_SIZE = 5;

    public static void main(String[] args) {
        int[] numbers = new int[ARRAY_SIZE];

        readArray(numbers);
        System.out.println("\nValores ingresados:");
        printArray(numbers);

        cocktailSortDescending(numbers);
        System.out.println("\n\nValores ordenados (descendente):");
        printArray(numbers);
    }

    // Método para leer los valores del usuario
    private static void readArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingresa el valor en la posición [" + i + "]: ");
            array[i] = scanner.nextInt();
        }
    }

    // Método para imprimir el arreglo
    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print("\t" + value);
        }
    }

    // Método para ordenar el arreglo de forma descendente con burbuja bidireccional
    private static void cocktailSortDescending(int[] array) {
        boolean swapped = true;
        int start = 0;
        int end = array.length - 1;

        while (swapped) {
            swapped = false;

            // Recorrido hacia la derecha
            for (int i = start; i < end; i++) {
                if (array[i] < array[i + 1]) {
                    swap(array, i, i + 1);
                    swapped = true;
                }
            }

            if (!swapped) break;

            swapped = false;
            end--;

            // Recorrido hacia la izquierda
            for (int i = end - 1; i >= start; i--) {
                if (array[i] < array[i + 1]) {
                    swap(array, i, i + 1);
                    swapped = true;
                }
            }

            start++;
        }
    }

    // Método auxiliar para intercambiar elementos
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}


