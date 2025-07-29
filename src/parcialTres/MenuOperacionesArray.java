package parcialTres;

import java.util.Scanner;

public class MenuOperacionesArray {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opcionMenu;
        int [] arreglo;
        OperacionesArray operaciones = new OperacionesArray();

        do {
            imprimeMenu();
            System.out.print("Ingrese su opción: ");
            opcionMenu = scanner.nextInt();

            switch (opcionMenu) {
                case 1 -> operaciones.llenaArregloFor();
                case 2 -> operaciones.llenaArregloWhile();
                case 3 -> {
                    arreglo = operaciones.llenaArregloFor();
                    operaciones.ordenaArregloFormaAscendenteFor(arreglo);
                }
                case 4 -> {
                    arreglo = operaciones.llenaArregloFor();
                    operaciones.ordenaArregloFormaDescendenteFor(arreglo);
                }
                case 5 -> {
                    arreglo = operaciones.llenaArregloFor();
                    operaciones.ordenaArregloFormaAscendenteWhile(arreglo);
                }
                case 6 -> {

                    arreglo = operaciones.llenaArregloFor();
                    operaciones.ordenaArregloFormaDescendenteWhile(arreglo);
                }
                case 7 -> operaciones.ordenaTabla();
                case 8 -> {
                    arreglo = operaciones.llenaArregloFor();
                    operaciones.eliminarElementoArray(arreglo);
                }
                case 0 -> System.out.println("Saliendo del programa. ¡Hasta luego!");
                default -> System.out.println("Opción inválida. Intente de nuevo.");
            }
            System.out.println();

        } while (opcionMenu != 0);

        scanner.close();
    }
    public static void imprimeMenu() {
        System.out.println("----- MENÚ DE OPERACIONES CON ARREGLOS -----");
        System.out.println("1. Llenar un arreglo (For)");
        System.out.println("2. Llenar un arreglo (While)");
        System.out.println("3. Ordenar arreglo (For - Ascendente)");
        System.out.println("4. Ordenar arreglo (For - Descendente)");
        System.out.println("5. Ordenar arreglo (While - Ascendente)");
        System.out.println("6. Ordenar arreglo (While - Descendente)");
        System.out.println("7. Ordenar una tabla");
        System.out.println("8. Eliminar elemento");
        System.out.println("0. Salir");
        System.out.println("------------------------------------------");
}
}
