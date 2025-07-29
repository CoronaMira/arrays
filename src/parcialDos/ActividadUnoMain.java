package parcialDos;
import java.util.Scanner;
public class ActividadUnoMain {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ActividadUno actividadUno = new ActividadUno();

    int numeroElementos;
    System.out.println("¿Cuántos elementos tendra el arreglo?");
    numeroElementos = scanner.nextInt();
    int [] arregloUsuario = actividadUno.llenaArregloDesdeUsuario(numeroElementos);
    int[] copiaArreglo = new int[arregloUsuario.length];
    for (int index = 0; index < arregloUsuario.length; index++) {
        actividadUno.asignar(index,arregloUsuario[index],copiaArreglo);
    }
    actividadUno.imprimir(copiaArreglo);
}
}
