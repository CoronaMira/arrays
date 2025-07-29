package parcialTres;

import java.util.Scanner;

public class MenuOperacionesArray {
    static Scanner scanner = new Scanner(System.in);

    static OperacionesArray operacionesArray = new OperacionesArray();
    static OperacionesArrayBidimensional operacionesArrayBidimensional = new OperacionesArrayBidimensional();


    static int[] arregloUni = null;
    static int[][] arregloBidi = null;

    public static void main(String[] args) {
        int opcionMenuPrincipal;
        do {
            imprimeMenuPrincipal();
            System.out.print("Seleccione una opción: ");
            opcionMenuPrincipal = scanner.nextInt();

            switch (opcionMenuPrincipal) {
                case 1:
                    gestionarMenuUnidimensional();
                    break;
                case 2:
                    gestionarMenuBidimensional();
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
            System.out.println();
        } while (opcionMenuPrincipal != 0);
        scanner.close();
    }

    public static void imprimeMenuPrincipal() {
        System.out.println("\n====== MENÚ PRINCIPAL ======");
        System.out.println("1. Operaciones con Arreglos Unidimensionales");
        System.out.println("2. Operaciones con Arreglos Bidimensionales");
        System.out.println("0. Salir");
        System.out.println("============================");
    }

    public static void gestionarMenuUnidimensional() {
        int opcion;
        do {
            imprimeMenuUnidimensional();
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            // Valida si el arreglo unidimensional existe antes de intentar usarlo
            if (opcion >= 4 && opcion <= 10 && (arregloUni == null || arregloUni.length == 0)) {
                System.out.println("El arreglo está vacío. Por favor, llénelo primero (opciones 1, 2 o 3).");
                continue;
            }

            switch (opcion) {
                case 1 -> arregloUni = operacionesArray.llenaArregloFor();
                case 2 -> arregloUni = operacionesArray.llenaArregloWhile();
                case 3 -> arregloUni = operacionesArray.llenaArregloRecursivo();
                case 4 -> operacionesArray.ordenaArregloFormaAscendenteFor(arregloUni);
                case 5 -> operacionesArray.ordenaArregloFormaDescendenteFor(arregloUni);
                case 6 -> operacionesArray.ordenaArregloFormaAscendenteWhile(arregloUni);
                case 7 -> operacionesArray.ordenaArregloFormaDescendenteWhile(arregloUni);
                case 8 -> operacionesArray.ordenaTabla(); // Esta es independiente del arreglo principal
                case 9 -> arregloUni = operacionesArray.eliminarElementoArray(arregloUni);
                case 10 -> arregloUni = operacionesArray.eliminarTodosElementos(arregloUni);
                case 0 -> System.out.println("Volviendo al menú principal...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    public static void gestionarMenuBidimensional() {
        int opcion;
        do {
            imprimeMenuBidimensional();
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 4 && opcion <= 10 && (arregloBidi == null || arregloBidi.length == 0)) {
                System.out.println("El arreglo bidimensional está vacío. Llénalo primero (opciones 1, 2 o 3).");
                continue;
            }

            switch (opcion) {
                case 1 -> arregloBidi = operacionesArrayBidimensional.llenaArregloFor();
                case 2 -> arregloBidi = operacionesArrayBidimensional.llenaArregloWhile();
                case 3 -> arregloBidi = operacionesArrayBidimensional.llenaArregloRecursivo();
                case 4 -> operacionesArrayBidimensional.ordenaArregloAscendenteFor(arregloBidi);
                case 5 -> operacionesArrayBidimensional.ordenaArregloDescendenteFor(arregloBidi);
                case 6 -> operacionesArrayBidimensional.ordenaArregloAscendenteWhile(arregloBidi);
                case 7 -> operacionesArrayBidimensional.ordenaArregloDescendenteWhile(arregloBidi);
                case 8 -> arregloBidi = operacionesArrayBidimensional.eliminarElementoArray(arregloBidi);
                case 9 -> arregloBidi = operacionesArrayBidimensional.eliminarTodosElementos(arregloBidi);
                case 0 -> System.out.println("Volviendo al menú principal...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    public static void imprimeMenuUnidimensional() {
        System.out.println("\n----- MENÚ ARREGLO UNIDIMENSIONAL -----");
        System.out.println("1. Llenar (For)");
        System.out.println("2. Llenar (While)");
        System.out.println("3. Llenar (Recursivo)");
        System.out.println("4. Ordenar Ascendente (For)");
        System.out.println("5. Ordenar Descendente (For)");
        System.out.println("6. Ordenar Ascendente (While)");
        System.out.println("7. Ordenar Descendente (While)");
        System.out.println("8. Crear y ordenar una tabla (Independiente)");
        System.out.println("9. Eliminar un elemento");
        System.out.println("10. Eliminar todos los elementos");
        System.out.println("0. Volver al menú principal");
        System.out.println("------------------------------------------");
    }

    public static void imprimeMenuBidimensional() {
        System.out.println("\n----- MENÚ ARREGLO BIDIMENSIONAL -----");
        System.out.println("1. Llenar (For)");
        System.out.println("2. Llenar (While)");
        System.out.println("3. Llenar (Recursivo)");
        System.out.println("4. Ordenar Ascendente (For)");
        System.out.println("5. Ordenar Descendente (For)");
        System.out.println("6. Ordenar Ascendente (While)");
        System.out.println("7. Ordenar Descendente (While)");
        System.out.println("8. Eliminar un elemento (reemplaza con 0)");
        System.out.println("9. Eliminar todos los elementos");
        System.out.println("0. Volver al menú principal");
        System.out.println("------------------------------------------");
    }

}
