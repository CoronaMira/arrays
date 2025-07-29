package parcialUno.estructuras;

import java.util.Scanner;

public class CrearArrays {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        boolean continuarPrograma;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            System.out.print("Ingrese el tamaño del arreglo (entre 7 y 12): ");
            int tamanioArray = scanner.nextInt();
            if (tamanioArray < 7 || tamanioArray > 12) {
                System.out.println("Tamaño de arreglo inválido. Debe estar entre 7 y 12.");
                continuarPrograma = true;
                continue;
            }

            switch (opcion) {
                case 1 -> {
                    int[] arrayFor = creaArrayFor(tamanioArray);
                    imprimeArray(arrayFor);
                    continuarPrograma = true;
                }
                case 2 -> {
                    int[] arrayWhile = creaArrayWhile(tamanioArray);
                    imprimeArray(arrayWhile);
                    continuarPrograma = true;
                }
                case 3 -> {
                    int[] arrayRecursivo = crearArrayRecursivo(tamanioArray);
                    imprimeArray(arrayRecursivo);
                    continuarPrograma = true;
                }
                
                case 4 -> {
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    continuarPrograma = false;
                }
                default -> {
                    System.out.println("Opción no válida. Por favor, elija una opción del menú.");
                    continuarPrograma = true;
                }
            }

            // Preguntar si desea realizar otra operación, a menos que la opción sea salir
            if (opcion != 4 && continuarPrograma) {
                System.out.print("\n¿Desea realizar otra operación? (s/n): ");
                String respuesta = scanner.next();
                continuarPrograma = respuesta.equalsIgnoreCase("s");
            }

        } while (continuarPrograma);

        scanner.close();
    }

    private static int[] creaArrayFor(int tamanioArray) {
        int[] array = new int[tamanioArray];
        for (int i = 0; i < tamanioArray; i++) {
            System.out.print("Ingrese el valor para el elemento [" + i + "]: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int[] crearArrayRecursivo(int tamanioArray) {
        return llenarArrayRecursivo(new int[tamanioArray], 0);
    }

    private static int[] llenarArrayRecursivo(int[] array, int index) {
        if (index == array.length) {
            return array; // Caso base: el arreglo está lleno
        }
        System.out.print("Ingrese el valor para el elemento [" + index + "]: ");
        array[index] = scanner.nextInt();
        return llenarArrayRecursivo(array, index + 1); // Llamada recursiva para el siguiente elemento
    }

    private static int[] creaArrayWhile(int tamanioArray) {
        int contador = 0;
        int[] array = new int[tamanioArray];
        while (contador < tamanioArray) {
            System.out.print("Ingrese el valor para el elemento [" + contador + "]: ");
            array[0] = scanner.nextInt();
            contador++;
        }
        return array;
    }

    private static void imprimeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemento [" + i + "]: " + array[i]);
        }
    }


    /**
     * Muestra las opciones del menú al usuario.
     */
    private static void mostrarMenu() {
        System.out.println("\n--- Elija una opción para operaciones con arreglos ---");
        System.out.println("1. Llenar e Imprimir (usando FOR)");
        System.out.println("2. Llenar e Imprimir (usando WHILE)");
        System.out.println("3. Llenar e Imprimir (usando RECURSIVO)");
        System.out.println("4. Salir");
        System.out.print("Su opción: ");
    }


}
