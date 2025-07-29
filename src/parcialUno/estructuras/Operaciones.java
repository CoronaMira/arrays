package parcialUno.estructuras;

import java.math.BigInteger;
import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        boolean continuarPrograma = false;

        do {

            opcion = mostrarMenu(scanner);

            switch (opcion) {
                case 1:
                    calcularFactorial(scanner);
                    break;
                case 2:
                    verificarParImpar(scanner);
                    break;
                case 5: // Opción Salir según la imagen
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    continuarPrograma = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción del menú.");
                    continuarPrograma = true;
                    break;
            }
            // Si la opción no es salir, preguntamos si quiere continuar
            if (opcion != 5) {
                System.out.print("\n¿Desea realizar otra operación? (s/n): ");
                String respuesta = scanner.next();
                continuarPrograma = respuesta.equalsIgnoreCase("s");
            }

        } while (continuarPrograma);

        scanner.close();
    }

    private static int mostrarMenu(Scanner scanner) {
        System.out.println("\n--- Elija una opción ---");
        System.out.println("1. Factorial");
        System.out.println("2. Par/Impar");
        System.out.println("5. Salir"); // Según la imagen proporcionada
        System.out.print("Su opción: ");
        return scanner.nextInt();
    }



    private static void calcularFactorial(Scanner scanner) {
        System.out.print("Ingrese un número entero no negativo para calcular su factorial: ");

        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            BigInteger resultado = factorialRecursivo(BigInteger.valueOf(num));
            System.out.println("El factorial de " + num + " es: " + resultado);
        }

    }

    private static BigInteger factorialRecursivo(BigInteger n) {
        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        } else {
            return n.multiply(factorialRecursivo(n.subtract(BigInteger.ONE)));
        }
    }

    private static void verificarParImpar(Scanner scanner) {
        System.out.print("Ingrese un número entero para verificar si es par o impar: ");
        int num = scanner.nextInt();
        if (esParRecursivo(num)) {
            System.out.println(num + " es un número PAR.");
        } else {
            System.out.println(num + " es un número IMPAR.");
        }

    }

    private static boolean esParRecursivo(int n) {
        // Caso base: 0 es par
        if (n == 0) {
            return true;
        }
        // Caso base: 1 es impar
        if (n == 1) {
            return false;
        }
        // Manejo de números negativos (opcional, si se permite)
        if (n < 0) {
            return esParRecursivo(-n); // Llamada recursiva con el valor absoluto
        }
        // Paso recursivo: n es par si n-2 es par
        return esParRecursivo(n - 2);
    }

}
