package parcialUno.estructuras;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExamMethods examMethods = new ExamMethods();
        int[] arreglo = examMethods.llenaArreglo(5, scanner);
//        examMethods.imprimirArreglo(arreglo);
//        examMethods.imprimirArrayDescendente(arreglo);
        int[] arrayCuadrados = examMethods.imprimirCuadradosArreglo(arreglo);
        examMethods.imprimirArrayDescendente(arrayCuadrados);
    }


}
