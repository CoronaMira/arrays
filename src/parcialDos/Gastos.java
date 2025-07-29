package parcialDos;

public class Gastos {

    public int determinaNumeroMayor(int[] array){
        int numeroMayor = 0;
        for (int index = 0; index < array.length; index++) {

            if(array[index]>numeroMayor){
                numeroMayor = array[index];
            }

        }

        return numeroMayor;
    }


    public int determinaNumeroMenor(int[] array){
        int numeroMenor = 0;
        for (int index = 0; index < array.length; index++) {

            if(array[index]<numeroMenor){
                numeroMenor= array[index];
            }
        }
        return numeroMenor;
    }
    public int posicionNumeroMayor(int[] array) {
        int pos = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[pos]) {
                pos = i;
            }
        }
        return pos;
    }

    public int posicionNumeroMenor(int[] array) {
        int pos = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[pos]) {
                pos = i;
            }
        }
        return pos;
    }

}
