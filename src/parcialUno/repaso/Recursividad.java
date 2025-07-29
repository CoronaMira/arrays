package parcialUno.repaso;

public class Recursividad {
    public static void main(String[] args) {
        String saludo = "Holaaaaa";
        int numero= 1;
        //saludar(saludo, numero);
        //saludarfor(saludo);
        imprimeForAnidado();

    }
    public static void saludar(String saludo, int numero){
        if (numero <= 5 ){
            System.out.println(saludo + numero);
            numero ++;
            saludar(saludo,numero);

        }

    }
    public static void saludarfor (String saludo){
        for (int index = 0; index <= 5; index++) {
            System.out.println(saludo + index);
        }
    }
    public static void imprimeForAnidado(){

        for (int index = 0; index < 10; index++) {
            for (int index2 = 0; index2 < 5; index2++) {
                System.out.println("Coordenada " + index + ","+ index2);

            }

        }

    }
}
