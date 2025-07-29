package parcialUno.estructuras;

import java.util.Scanner;

public class ArrayInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos del array: ");
        int tamanioArray = scanner.nextInt();
        int[] array =  crearArray(tamanioArray,scanner);
        imprimirArray(array);


    }

    private static int[] crearArray(int tamanioArray,Scanner scanner) {

        int[] array = new int[tamanioArray];

        for (int i = 0; i < tamanioArray; i++) {
            System.out.println("Ingrese el valor "+ i +" del array: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }
    private static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("El elemento "+i+" del array es: " + array[i]);
        }
    }
}
