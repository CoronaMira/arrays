package parcialTres;

import java.util.Arrays;
import java.util.Scanner;

public class OperacionesArray {
    static Scanner scanner = new Scanner(System.in);
    public int[] llenaArregloFor() {
        int[] array;
        System.out.print("Ingrese el tamaño del arreglo: ");
        int size = scanner.nextInt();
        array = new int[size];
        System.out.println("Llenando arreglo con bucle FOR:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Arreglo llenado: " + Arrays.toString(array));
        return array;
    }

    public  int[] llenaArregloWhile() {
        int[] array;
        System.out.print("Ingrese el tamaño del arreglo: ");
        int size = scanner.nextInt();
        array = new int[size];
        System.out.println("Llenando arreglo con bucle WHILE:");
        int i = 0;
        while (i < array.length) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Arreglo llenado: " + Arrays.toString(array));
        return array;
    }

    public int[] llenaArregloRecursivo() {
        System.out.print("Ingrese el tamaño del arreglo para llenado recursivo: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Llenando arreglo con recursividad:");
        llenaArregloRecursivoHelper(array, 0); // Inicia el proceso recursivo desde el índice 0
        System.out.println("Arreglo llenado recursivamente: " + Arrays.toString(array));
        return array;
    }

    public int[] eliminarElementoArray(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("El arreglo está vacío, no se puede eliminar nada.");
            return array;
        }

        String respuesta;
        do {
            if (array.length == 0) {
                System.out.println("Ya no hay más elementos que eliminar.");
                break;
            }

            System.out.println("Arreglo actual: " + Arrays.toString(array));
            System.out.print("Ingrese el elemento que desea eliminar: ");
            int elementoAEliminar = scanner.nextInt();

            int indiceAEliminar = -1;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == elementoAEliminar) {
                    indiceAEliminar = i;
                    break;
                }
            }

            if (indiceAEliminar == -1) {
                System.out.println("El elemento no se encontró en el arreglo.");
            } else {
                int[] nuevoArray = new int[array.length - 1];
                for (int i = 0, k = 0; i < array.length; i++) {
                    if (i == indiceAEliminar) {
                        continue;
                    }
                    nuevoArray[k++] = array[i];
                }
                array = nuevoArray;
                System.out.println("Elemento eliminado. Arreglo resultante: " + Arrays.toString(array));
            }

            System.out.print("¿Desea eliminar otro elemento? (s/n): ");
            respuesta = scanner.next();

        } while (respuesta.equalsIgnoreCase("s"));

        return array;
    }

    public int[] eliminarTodosElementos(int[] array) {

        if (array == null || array.length == 0) {
            System.out.println("Advertencia: El arreglo ya está vacío, no hay elementos que eliminar.");
            return array;
        }

        System.out.println("Arreglo original: " + Arrays.toString(array));
        System.out.println("Eliminando todos los elementos uno por uno...");

        while(array.length > 0) {
            int[] nuevoArray = new int[array.length - 1];
            for (int i = 0; i < nuevoArray.length; i++) {
                nuevoArray[i] = array[i];
            }

            array = nuevoArray;

            System.out.println("... " + Arrays.toString(array));
        }

        System.out.println("Todos los elementos han sido eliminados. Arreglo resultante: " + Arrays.toString(array));

        return array;
    }

    private void llenaArregloRecursivoHelper(int[] array, int index) {
        // Caso base: si el índice es igual a la longitud del arreglo, la recursión termina.
        if (index == array.length) {
            return;
        }

        System.out.print("Ingrese el valor para la posición " + index + ": ");
        array[index] = scanner.nextInt();
        llenaArregloRecursivoHelper(array, index + 1);
    }



    public int[] ordenaArregloFormaAscendenteFor(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("El arreglo está vacío. Llénalo primero.");
            return array;
        }
        System.out.println("Arreglo original: " + Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Arreglo ordenado ascendentemente (FOR): " + Arrays.toString(array));
        return array;
    }

    public int[] ordenaArregloFormaDescendenteFor(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("El arreglo está vacío. Llénalo primero.");
            return array ;
        }
        System.out.println("Arreglo original: " + Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Arreglo ordenado descendentemente (FOR): " + Arrays.toString(array));
        return array;
    }

    public int[] ordenaArregloFormaAscendenteWhile(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("El arreglo está vacío. Llénalo primero.");
            return array;
        }
        System.out.println("Arreglo original: " + Arrays.toString(array));
        boolean swapped;
        int n = array.length;
        do {
            swapped = false;
            int i = 0;
            while (i < n - 1) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
                i++;
            }
            n--;
        } while (swapped);
        System.out.println("Arreglo ordenado ascendentemente (WHILE): " + Arrays.toString(array));
        return array;
    }

    public int[] ordenaArregloFormaDescendenteWhile(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("El arreglo está vacío. Llénalo primero.");
            return array;
        }
        System.out.println("Arreglo original: " + Arrays.toString(array));
        boolean swapped;
        int n = array.length;
        do {
            swapped = false;
            int i = 0;
            while (i < n - 1) {
                if (array[i] < array[i + 1]) { // Cambio de > a < para descendente
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
                i++;
            }
            n--;
        } while (swapped);
        System.out.println("Arreglo ordenado descendentemente (WHILE): " + Arrays.toString(array));
        return array;
    }

    public void ordenaTabla() {
        System.out.print("Ingrese el número de filas para la tabla: ");
        int rows = scanner.nextInt();
        System.out.print("Ingrese el número de columnas para la tabla: ");
        int cols = scanner.nextInt();

        int[][] table = new int[rows][cols];

        // Llenar la tabla
        System.out.println("Llenando la tabla:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                table[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nTabla original:");
        printTable(table);

        System.out.println("\nOrdenando la tabla (cada fila de forma ascendente):");
        for (int i = 0; i < rows; i++) {
            ordenaArregloFormaAscendenteFor(table[i]);
        }

        System.out.println("\nTabla ordenada:");
        printTable(table);
    }

    private void printTable(int[][] table) {
        if (table == null || table.length == 0) {
            System.out.println("La tabla está vacía.");
            return;
        }
        for (int i = 0; i < table.length; i++) {
            System.out.println(Arrays.toString(table[i]));
        }
    }
}
