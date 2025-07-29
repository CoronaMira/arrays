package parcialTres;

import java.util.Arrays;
import java.util.Scanner;

public class OperacionesArrayBidimensional {
    static Scanner scanner = new Scanner(System.in);

    /**
     * Pide al usuario las dimensiones para un arreglo 2D, validando que estén entre 3 y 5.
     * @return Un arreglo de int con las dimensiones [filas, columnas].
     */
    private int[] obtenerDimensionesValidas() {
        int rows, cols;
        do {
            System.out.print("Ingrese el número de filas (entre 3 y 5): ");
            rows = scanner.nextInt();
            if (rows < 3 || rows > 5) {
                System.out.println("Número de filas inválido. Intente de nuevo.");
            }
        } while (rows < 3 || rows > 5);

        do {
            System.out.print("Ingrese el número de columnas (entre 3 y 5): ");
            cols = scanner.nextInt();
            if (cols < 3 || cols > 5) {
                System.out.println("Número de columnas inválido. Intente de nuevo.");
            }
        } while (cols < 3 || cols > 5);

        return new int[]{rows, cols};
    }

    /**
     * Imprime una matriz (arreglo 2D) en la consola.
     * @param matriz La matriz a imprimir.
     */
    public void imprimirArreglo(int[][] matriz) {
        if (matriz == null || matriz.length == 0) {
            System.out.println("El arreglo está vacío.");
            return;
        }
        System.out.println("--- Contenido del Arreglo ---");
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }
        System.out.println("-----------------------------");
    }

    public int[][] llenaArregloFor() {
        int[] dims = obtenerDimensionesValidas();
        int[][] matriz = new int[dims[0]][dims[1]];
        System.out.println("Llenando arreglo con bucles FOR:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        imprimirArreglo(matriz);
        return matriz;
    }

    public int[][] llenaArregloWhile() {
        int[] dims = obtenerDimensionesValidas();
        int[][] matriz = new int[dims[0]][dims[1]];
        System.out.println("Llenando arreglo con bucles WHILE:");
        int i = 0;
        while (i < matriz.length) {
            int j = 0;
            while (j < matriz[i].length) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                j++;
            }
            i++;
        }
        imprimirArreglo(matriz);
        return matriz;
    }

    public int[][] llenaArregloRecursivo() {
        int[] dims = obtenerDimensionesValidas();
        int[][] matriz = new int[dims[0]][dims[1]];
        System.out.println("Llenando arreglo con RECURSIVIDAD:");
        llenaArregloRecursivoHelper(matriz, 0, 0);
        imprimirArreglo(matriz);
        return matriz;
    }

    private void llenaArregloRecursivoHelper(int[][] matriz, int fila, int col) {
        if (fila >= matriz.length) return;
        System.out.print("Ingrese el valor para la posición [" + fila + "][" + col + "]: ");
        matriz[fila][col] = scanner.nextInt();
        int siguienteCol = (col + 1) % matriz[fila].length;
        int siguienteFila = (siguienteCol == 0) ? fila + 1 : fila;
        llenaArregloRecursivoHelper(matriz, siguienteFila, siguienteCol);
    }


    public void ordenaArregloAscendenteFor(int[][] matriz) {
        System.out.println("Ordenando cada fila de forma ascendente (FOR):");
        for (int[] fila : matriz) {
            for (int i = 0; i < fila.length - 1; i++) {
                for (int j = 0; j < fila.length - 1 - i; j++) {
                    if (fila[j] > fila[j + 1]) {
                        int temp = fila[j];
                        fila[j] = fila[j + 1];
                        fila[j + 1] = temp;
                    }
                }
            }
        }
        imprimirArreglo(matriz);
    }

    public void ordenaArregloDescendenteFor(int[][] matriz) {
        System.out.println("Ordenando cada fila de forma descendente (FOR):");
        for (int[] fila : matriz) {
            for (int i = 0; i < fila.length - 1; i++) {
                for (int j = 0; j < fila.length - 1 - i; j++) {
                    if (fila[j] < fila[j + 1]) {
                        int temp = fila[j];
                        fila[j] = fila[j + 1];
                        fila[j + 1] = temp;
                    }
                }
            }
        }
        imprimirArreglo(matriz);
    }

    public void ordenaArregloAscendenteWhile(int[][] matriz) {
        System.out.println("Ordenando cada fila de forma ascendente (WHILE):");
        for (int[] fila : matriz) {
            boolean swapped;
            int n = fila.length;
            do {
                swapped = false;
                int i = 0;
                while (i < n - 1) {
                    if (fila[i] > fila[i + 1]) {
                        int temp = fila[i];
                        fila[i] = fila[i + 1];
                        fila[i + 1] = temp;
                        swapped = true;
                    }
                    i++;
                }
                n--;
            } while (swapped);
        }
        imprimirArreglo(matriz);
    }

    public void ordenaArregloDescendenteWhile(int[][] matriz) {
        System.out.println("Ordenando cada fila de forma descendente (WHILE):");
        for (int[] fila : matriz) {
            boolean swapped;
            int n = fila.length;
            do {
                swapped = false;
                int i = 0;
                while (i < n - 1) {
                    if (fila[i] < fila[i + 1]) {
                        int temp = fila[i];
                        fila[i] = fila[i + 1];
                        fila[i + 1] = temp;
                        swapped = true;
                    }
                    i++;
                }
                n--;
            } while (swapped);
        }
        imprimirArreglo(matriz);
    }



    public int[][] eliminarElementoArray(int[][] matriz) {
        if (matriz == null || matriz.length == 0) {
            System.out.println("El arreglo está vacío, no se puede eliminar nada.");
            return matriz;
        }

        String respuesta;
        do {
            if (matriz.length == 0) {
                System.out.println("Ya no hay más elementos que eliminar.");
                break;
            }

            System.out.println("Arreglo actual:");
            imprimirArreglo(matriz);
            System.out.print("Ingrese el elemento que desea eliminar (se reemplazará por 0): ");
            int elementoAEliminar = scanner.nextInt();

            boolean encontrado = false;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] == elementoAEliminar) {
                        matriz[i][j] = 0;
                        encontrado = true;
                    }
                }
            }

            if (encontrado) {
                System.out.println("Se reemplazaron todas las ocurrencias de '" + elementoAEliminar + "' por 0.");
            } else {
                System.out.println("El elemento no se encontró en el arreglo.");
            }

            System.out.println("Arreglo resultante:");
            imprimirArreglo(matriz);

            System.out.print("¿Desea eliminar otro elemento? (s/n): ");
            respuesta = scanner.next();

        } while (respuesta.equalsIgnoreCase("s"));

        return matriz;
    }

    public int[][] eliminarTodosElementos(int[][] matriz) {
        if (matriz == null || matriz.length == 0) {
            System.out.println("Advertencia: El arreglo ya está vacío, no hay elementos que eliminar.");
            return matriz;
        }

        System.out.println("Eliminando todos los elementos del arreglo bidimensional...");
        matriz = new int[0][0];
        System.out.println("Todos los elementos han sido eliminados.");
        imprimirArreglo(matriz);
        return matriz;
    }

}
