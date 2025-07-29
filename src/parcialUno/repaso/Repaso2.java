package parcialUno.repaso;

import java.util.Scanner;

public class Repaso2 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int numero=1;
        imprimir(numero);
    }

    public static void imprimir(int numero){
        if(numero<=10){
            System.out.println (numero);
            numero ++;
            imprimir(numero);
        }
    }
}
