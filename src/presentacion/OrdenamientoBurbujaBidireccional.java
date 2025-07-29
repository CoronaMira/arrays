package presentacion;

import java.util.Scanner;

public class OrdenamientoBurbujaBidireccional {
        public static void main (String[] args) {
            Scanner in = new Scanner(System.in);
            int arr[]=new int [5];
            //llena el arreglo por el usuario
            for(int uni=0; uni<5;uni++){
                System.out.println ("ingresa en la posicion [" + uni + " ]");
                arr[uni]=in.nextInt();
            }
            //termina de llenar

            //recorre el arreglo solo para mostrarlo desordenado
            for(int uni=0; uni<5;uni++){
                System.out.print ("\t " + arr[uni]);
            }


            //inicia el ordenamiento
            int tam=5;
            int temp2;
            for(int indiceExterno=1 ; indiceExterno< tam ; indiceExterno++){
                for(int indiceInterno = tam-1 ; indiceInterno >= indiceExterno; indiceInterno--){
                    if(arr[indiceInterno] > arr[indiceInterno-1]){
                        temp2= arr[indiceInterno];
                        arr[indiceInterno]= arr[indiceInterno-1];
                        arr[indiceInterno-1]= temp2;
                    }
                }
            }

            //termina

            System.out.println ("  ");
            for(int uni=0; uni<5;uni++){
                System.out.print ("\t " + arr[uni]);
            }
        }

}
