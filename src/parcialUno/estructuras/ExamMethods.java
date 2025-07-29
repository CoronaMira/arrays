package parcialUno.estructuras;

import java.util.Scanner;

public class ExamMethods {
    public int[] llenaArreglo(int n, Scanner scanner) {
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor para la posición " + (i + 1) + ":");
            arreglo[i] = scanner.nextInt();
        }
        return arreglo;
    }

    public void imprimirArreglo(int[] arreglo) {
        System.out.println("Contenido del arreglo:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Posicion " + (i + 1) + ": valor = " + arreglo[i]);
        }
    }

    public int[] imprimirCuadradosArreglo(int[] arreglo) {
        int[] arrayCuadrados = new int[arreglo.length];
        System.out.println("Cuadrados del arreglo:");
        for (int i = 0; i < arreglo.length; i++) {
            int cuadrado = arreglo[i]*arreglo[i];
            System.out.println("Valor " + arreglo[i] + ": Cuadrado = " + cuadrado);
            arrayCuadrados[i] = cuadrado;
        }
        return arrayCuadrados;
    }

    public void imprimirArrayDescendente(int[] arreglo) {
        System.out.println("Arreglo en orden descendente:");
        for (int i = arreglo.length - 1; i >= 0; i--) {
            System.out.println("Posicion " + (i + 1) + ": valor = " + arreglo[i]);
        }
    }
}
