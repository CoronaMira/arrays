package parcialDos;
import java.util.Scanner;
public class ActividadUno {
   private int[] elementos;
   public int [] llenaArregloDesdeUsuario(int tamanioArreglo){
       Scanner scanner = new Scanner(System.in);
       int [] arreglo = new int [tamanioArreglo];
       for (int index = 0; index < arreglo.length; index++) {
           System.out.println("Ingresa el valor: ");

           arreglo[index] = scanner.nextInt();
       }
       return arreglo;
    }
    public void asignar(int indice, int valor, int []arreglo){
        arreglo[indice]= valor;

    }
public void imprimir(int[] arreglo){
        for (int index = 0; index < arreglo.length ; index++) {
            System.out.println("La posición " + index + " del arreglo es: " + arreglo[index]);
        }
    }

}

