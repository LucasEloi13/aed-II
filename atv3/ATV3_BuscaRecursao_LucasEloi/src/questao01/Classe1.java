package questao01;

import utils.*;

public class Classe1 {
    public static <T> void bubbleSort (ListaEncadeadaDupla<T> lista){
        int n = lista.tamanho();
        boolean trocou = false;

        T primeiroElemento = lista.get(0);

        if (primeiroElemento instanceof Integer) {
            System.out.println("Ordenando lista de inteiros...");
            while (n >= 2 && trocou){
                for(int i=0; i < n-1; i++){
                    int j = i+1;
                    if((Integer) lista.get(j) < (Integer) lista.get(i)){
                        T aux = lista.get(i);
                        lista.set(i, lista.get(j));
                        lista.set(j, aux);
                        trocou = true;
                    }
                }
                n--;
            }
        } else{
            System.out.println("Ordenando lista de strings...");
            while (n >= 2 && trocou){
                for(int i=0; i < n-1; i++){
                    int j = i+1;
                    if(((Comparable) lista.get(j)).compareTo(lista.get(i)) < 0){
                        T aux = lista.get(i);
                        lista.set(i, lista.get(j));
                        lista.set(j, aux);
                        trocou = true;
                    }
                }
            }
        }
    }
}
