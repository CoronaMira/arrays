package parcialUno.repaso;

import java.util.Scanner;

public class Ejercicio1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String opcion = "";
        do {
            System.out.println("Elije una opción");
            System.out.println("1.Sumar numeros");
            System.out.println("2.Obtener numeros ");
            System.out.println("3.Mostrar número mayor");
            System.out.println("4.Contabilizar pares e impares");
            System.out.println("5.Salir");
            opcion = scanner.next();
            switch (opcion){
                case "1" -> sumarNumeros();
                case "2" -> obtenerPromedio();
                case "3" -> numeroMayor();
                case "4" -> contarParesImpares();
            }

        }while (!opcion.equals("5"));


    }
    public static void sumarNumeros(){
        int numero = 0;
        for (int index = 0; index < 10; index++) {
            System.out.println("Ingresa el número entero " + (index+1));
            numero = numero + scanner.nextInt();
        }
        System.out.println("La suma es: " + numero);
    }
    public static void obtenerPromedio(){

    }
    public static void numeroMayor(){

    }
    public static void contarParesImpares(){

    }
}
