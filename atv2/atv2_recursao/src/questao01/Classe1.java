package questao01;

//  import utils.*;

import java.util.LinkedList;

public class Classe1 {
    static int soma_pares = 0;
    static int soma_impares = 0;

    public static int processar(LinkedList<Integer> list, int index, int somaPares, int somaImpares){
        if (index >= list.size()) {
            return somaPares * somaImpares;
        }

        int numero = list.get(index);
        if (numero % 2 == 0) {
            somaPares += numero;
        } else {
            somaImpares += numero;
        }

        return processar(list, index + 1, somaPares, somaImpares);
    }

    public static int calcularSoma(LinkedList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        if (list.size() == 1) {
            int num = list.get(0);
            if (num % 2 == 0) {
                soma_pares += num;
            } else {
                soma_impares += num;
            }
            return 0;
        }


        int mid = list.size() / 2;


        LinkedList<Integer> left = new LinkedList<>(list.subList(0, mid));
        LinkedList<Integer> right = new LinkedList<>(list.subList(mid, list.size()));


        calcularSoma(left);
        calcularSoma(right);

        return soma_pares * soma_impares;
    }
}
