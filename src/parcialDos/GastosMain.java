package parcialDos;

import java.util.Scanner;

public class GastosMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] costosServicios = new int[4][4];
        int[] sumaCostoPorMes = new int[4];
        int[] sumaCostoPorServicio = new int[4];
        String[] nombresServicios = {"Luz", "Agua", "Gas", "Internet"};
        String[] nombresMeses = {"Enero", "Febrero", "Marzo", "Abril"};

        for (int i = 0; i < costosServicios.length; i++) {
            System.out.println("\nIngrese los costos para el servicio: " + nombresServicios[i]);
            for (int j = 0; j < costosServicios[i].length; j++) {
                System.out.print("Costo de " + nombresMeses[j] + ": ");
                costosServicios[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\n--- Resumen de Costos de Servicios por Mes ---");
        System.out.printf("%-12s | %8s | %8s | %8s | %8s | %20s\n", "Servicio", nombresMeses[0], nombresMeses[1], nombresMeses[2], nombresMeses[3], "Total por servicio");
        System.out.println("--------------------------------------------------------------------------------");


        for (int i = 0; i < costosServicios.length; i++) {
            String servicioActual = nombresServicios[i];
            int totalServicio = 0;

            System.out.printf("%-12s |", servicioActual);

            for (int j = 0; j < costosServicios[i].length; j++) {
                int costoMes = costosServicios[i][j];
                System.out.printf(" %8d |", costoMes);
                totalServicio += costoMes;
                sumaCostoPorMes[j] += costoMes; // acumulamos aquí directamente
            }

            sumaCostoPorServicio[i] = totalServicio;
            System.out.printf(" %20d\n", totalServicio);
        }

        System.out.println("--------------------------------------------------------------------------------");

        System.out.printf("%-12s |", "Total mes");
        for (int j = 0; j < sumaCostoPorMes.length; j++) {
            System.out.printf(" %8d |", sumaCostoPorMes[j]);
        }
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------");

        scanner.close();

        Gastos gastos = new Gastos();
        int posMayorServicio = gastos.posicionNumeroMayor(sumaCostoPorServicio);
        int posMenorServicio = gastos.posicionNumeroMenor(sumaCostoPorServicio);

        int posMayorMes = gastos.posicionNumeroMayor(sumaCostoPorMes);
        int posMenorMes = gastos.posicionNumeroMenor(sumaCostoPorMes);

        System.out.println("El servicio con mayor gasto fue: " + nombresServicios[posMayorServicio] + " con $" + sumaCostoPorServicio[posMayorServicio]);
        System.out.println("El servicio con menor gasto fue: " + nombresServicios[posMenorServicio] + " con $" + sumaCostoPorServicio[posMenorServicio]);

        System.out.println("El mes con mayor gasto fue: " + nombresMeses[posMayorMes] + " con $" + sumaCostoPorMes[posMayorMes]);
        System.out.println("El mes con menor gasto fue: " + nombresMeses[posMenorMes] + " con $" + sumaCostoPorMes[posMenorMes]);
    }
}
