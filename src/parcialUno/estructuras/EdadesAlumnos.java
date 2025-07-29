package parcialUno.estructuras;

import java.util.Scanner;

public class EdadesAlumnos {

    private static final int NUMERO_ALUMNOS = 15;
    private static final int EDAD_MINIMA = 18;
    private static final int EDAD_MAXIMA = 50;

    private static int sumaEdades;
    private static int edadMayor;
    private static int edadMenor;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ejecutarDeNuevo;

        do {
            //siempre se reinician las variables globales para no sumar numeros de intentos anteriores.
            sumaEdades = 0;
            edadMayor = EDAD_MINIMA;
            edadMenor = EDAD_MAXIMA;

            pedirEdadRecursivo(1, scanner);

            System.out.println("\n--- Resultados ---");
            if (sumaEdades > 0) {
                double promedio = (double) sumaEdades / NUMERO_ALUMNOS;
                System.out.printf("Promedio de edades: %.2f años\n", promedio);
                System.out.println("Edad mayor: " + edadMayor + " años");
                System.out.println("Edad menor: " + edadMenor + " años");
            } else {
                System.out.println("No se pudieron calcular los resultados porque no se ingresaron edades válidas.");
            }

            System.out.print("\n¿Desea ejecutar el programa de nuevo? (s/n): ");
            String respuesta = scanner.next();
            ejecutarDeNuevo = respuesta.equalsIgnoreCase("s");

        } while (ejecutarDeNuevo);

        System.out.println("¡Programa finalizado!");
        scanner.close();
    }

    private static void pedirEdadRecursivo(int numeroAlumno, Scanner scanner) {

        if (numeroAlumno > NUMERO_ALUMNOS) { //Valida que no se ingresen más de 15 alumnos y rompe la recursividad para no ser infinita
            return;
        }

        System.out.print("Ingrese la edad del alumno " + numeroAlumno + " (entre " + EDAD_MINIMA + " y " + EDAD_MAXIMA + " años): ");
        int edad;
            edad = scanner.nextInt();

            if (edad >= EDAD_MINIMA && edad <= EDAD_MAXIMA) { //Aquí se valida el rango de edades
                sumaEdades += edad; //Se suma la edad ingresada a la variable `sumaEdades` que es global para que este metodo no este devolviendo enteros
                if (edad > edadMayor) {
                    edadMayor = edad; // la edad mas grande se guarda aquí
                }
                if (edad < edadMenor) {
                    edadMenor = edad; // la edad mas pequeña se guarda aquí
                }
                pedirEdadRecursivo(numeroAlumno + 1, scanner); //Si el rango de edades es correcto se aumenta en uno el numero del alumno `numeroAlumno + 1`
            } else {
                System.out.println("Edad inválida. Por favor, ingrese una edad entre " + EDAD_MINIMA + " y " + EDAD_MAXIMA + ".");
                pedirEdadRecursivo(numeroAlumno, scanner); //Si no esta en el rango de edades la invocacion es la misma sin aumentar el numero del alumno, ejemplo
                                                           //si el alumno 1 ingresa una edad inválida, se vuelve a pedir la edad del alumno 1
            }
    }
}
