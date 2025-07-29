package parcialDos;

import java.util.Scanner;

public class ExamenParesImpares {

    private static final Scanner scanner = new Scanner(System.in);


    public void llenarArreglo(int[][] arreglo) {
        System.out.println("\n--- Llenar arreglo ---");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.print("Ingresa valor para posición [" + i + "][" + j + "]: ");
                arreglo[i][j] = scanner.nextInt();
            }
        }
    }

    public void llenarElementoArreglo(int[][] arreglo, int fila, int columna, int valor) {
        if (fila >= 0 && fila < arreglo.length && columna >= 0 && columna < arreglo[0].length) {
            arreglo[fila][columna] = valor;
            System.out.println("Valor " + valor + " asignado a [" + fila + "][" + columna + "] correctamente.");
        } else {
            System.out.println("Posición inválida: fuera de rango.");
        }
    }

    public void imprimirArreglo(int[][] matriz) {
        System.out.println();
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.printf("%5d", valor);
            }
            System.out.println();
        }
    }

    public void imprimeParesImpares(int[][] array) {
        int[] pares = obtenerNumerosPares(array);
        System.out.println("\nNúmeros pares encontrados: " + pares.length);
        imprimirArregloUnidimensional(pares);
        System.out.println("");

        int[] impares = obtenerNumerosImpares(array);
        System.out.println("\nNúmeros impares encontrados: " + impares.length);
        imprimirArregloUnidimensional(impares);
        System.out.println("");
    }


    public int[] obtenerNumerosPares(int[][] matriz) {
        int total = contarCondicion(matriz, true);
        int[] pares = new int[total];
        int index = 0;

        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor % 2 == 0) {
                    pares[index++] = valor;
                }
            }
        }

        return pares;
    }

    public int[] obtenerNumerosImpares(int[][] matriz) {
        int total = contarCondicion(matriz, false);
        int[] impares = new int[total];
        int index = 0;

        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor % 2 != 0) {
                    impares[index++] = valor;
                }
            }
        }

        return impares;
    }

    private int contarCondicion(int[][] matriz, boolean buscarPares) {
        int contador = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (buscarPares && valor % 2 == 0) {
                    contador++;
                } else if (!buscarPares && valor % 2 != 0) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public void imprimirArregloUnidimensional(int[] arreglo) {
        if (arreglo.length == 0) {
            System.out.println("[Vacío]");
        } else {
            for (int valor : arreglo) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
