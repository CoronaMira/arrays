package parcialTres;

import java.util.Arrays;
import java.util.Scanner;

public class OperacionesArrayBidimensional {
    static Scanner scanner = new Scanner(System.in);

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

    public void imprimirArreglo(int[][] arregloBidimencional) {
        if (arregloBidimencional == null || arregloBidimencional.length == 0) {
            System.out.println("El arreglo está vacío.");
            return;
        }
        System.out.println("--- Contenido del Arreglo ---");
        for (int[] fila : arregloBidimencional) {
            System.out.println(Arrays.toString(fila));
        }
        System.out.println("-----------------------------");
    }

    public int[][] llenaArregloFor() {
        int[] dims = obtenerDimensionesValidas();
        int[][] arregloBidimencional = new int[dims[0]][dims[1]];
        System.out.println("Llenando arreglo con bucles FOR:");
        for (int i = 0; i < arregloBidimencional.length; i++) {
            for (int j = 0; j < arregloBidimencional[i].length; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                arregloBidimencional[i][j] = scanner.nextInt();
            }
        }
        imprimirArreglo(arregloBidimencional);
        return arregloBidimencional;
    }

    public int[][] llenaArregloWhile() {
        int[] dims = obtenerDimensionesValidas();
        int[][] arregloBidimencional = new int[dims[0]][dims[1]];
        System.out.println("Llenando arreglo con bucles WHILE:");
        int i = 0;
        while (i < arregloBidimencional.length) {
            int j = 0;
            while (j < arregloBidimencional[i].length) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                arregloBidimencional[i][j] = scanner.nextInt();
                j++;
            }
            i++;
        }
        imprimirArreglo(arregloBidimencional);
        return arregloBidimencional;
    }

    public int[][] llenaArregloRecursivo() {
        int[] dims = obtenerDimensionesValidas();
        int[][] arregloBidimencional = new int[dims[0]][dims[1]];
        System.out.println("Llenando arreglo con RECURSIVIDAD:");
        llenaArregloRecursivoHelper(arregloBidimencional, 0, 0);
        imprimirArreglo(arregloBidimencional);
        return arregloBidimencional;
    }

    private void llenaArregloRecursivoHelper(int[][] arregloBidimencional, int fila, int col) {
        if (fila >= arregloBidimencional.length) return;
        System.out.print("Ingrese el valor para la posición [" + fila + "][" + col + "]: ");
        arregloBidimencional[fila][col] = scanner.nextInt();
        int siguienteCol = (col + 1) % arregloBidimencional[fila].length;
        int siguienteFila = (siguienteCol == 0) ? fila + 1 : fila;
        llenaArregloRecursivoHelper(arregloBidimencional, siguienteFila, siguienteCol);
    }


    public void ordenaArregloAscendenteFor(int[][] arregloBidimencional) {
        System.out.println("Ordenando cada fila de forma ascendente (FOR):");
        for (int[] fila : arregloBidimencional) {
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
        imprimirArreglo(arregloBidimencional);
    }

    public void ordenaArregloDescendenteFor(int[][] arregloBidimencional) {
        System.out.println("Ordenando cada fila de forma descendente (FOR):");
        for (int[] fila : arregloBidimencional) {
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
        imprimirArreglo(arregloBidimencional);
    }

    public void ordenaArregloAscendenteWhile(int[][] arregloBidimencional) {
        System.out.println("Ordenando cada fila de forma ascendente (WHILE):");
        for (int[] fila : arregloBidimencional) {
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
        imprimirArreglo(arregloBidimencional);
    }

    public void ordenaArregloDescendenteWhile(int[][] arregloBidimencional) {
        System.out.println("Ordenando cada fila de forma descendente (WHILE):");
        for (int[] fila : arregloBidimencional) {
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
        imprimirArreglo(arregloBidimencional);
    }



    public int[][] eliminarElementoArray(int[][] arregloBidimencional) {
        if (arregloBidimencional == null || arregloBidimencional.length == 0) {
            System.out.println("El arreglo está vacío, no se puede eliminar nada.");
            return arregloBidimencional;
        }

        String respuesta;
        do {
            if (arregloBidimencional.length == 0) {
                System.out.println("Ya no hay más elementos que eliminar.");
                break;
            }

            System.out.println("Arreglo actual:");
            imprimirArreglo(arregloBidimencional);
            System.out.print("Ingrese el elemento que desea eliminar (se reemplazará por 0): ");
            int elementoAEliminar = scanner.nextInt();

            boolean encontrado = false;
            for (int i = 0; i < arregloBidimencional.length; i++) {
                for (int j = 0; j < arregloBidimencional[i].length; j++) {
                    if (arregloBidimencional[i][j] == elementoAEliminar) {
                        arregloBidimencional[i][j] = 0;
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
            imprimirArreglo(arregloBidimencional);

            System.out.print("¿Desea eliminar otro elemento? (s/n): ");
            respuesta = scanner.next();

        } while (respuesta.equalsIgnoreCase("s"));

        return arregloBidimencional;
    }

    public int[][] eliminarTodosElementos(int[][] arregloBidimencional) {
        if (arregloBidimencional == null || arregloBidimencional.length == 0) {
            System.out.println("Advertencia: El arreglo ya está vacío, no hay elementos que eliminar.");
            return arregloBidimencional;
        }

        System.out.println("Eliminando todos los elementos del arreglo bidimensional...");
        arregloBidimencional = new int[0][0];
        System.out.println("Todos los elementos han sido eliminados.");
        imprimirArreglo(arregloBidimencional);
        return arregloBidimencional;
    }

}
