package questao01;

//  import utils.*;

import utils.ListaEncadeadaDupla;

public class Classe1 {
    static int soma_pares = 0;
    static int soma_impares = 0;

    public static int processar(ListaEncadeadaDupla<Integer> list, int index, int somaPares, int somaImpares) {
        if (index >= list.tamanho()) {
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

    public static int calcularSoma(ListaEncadeadaDupla<Integer> list) {
        if (list == null || list.estaVazia()) {
            return 0;
        }
        if (list.tamanho() == 1) {
            int num = list.get(0);
            if (num % 2 == 0) {
                soma_pares += num;
            } else {
                soma_impares += num;
            }
            return 0;
        }

        int mid = list.tamanho() / 2;

        // Divide a lista em duas partes
        ListaEncadeadaDupla<Integer> left = list.subLista(0, mid);
        ListaEncadeadaDupla<Integer> right = list.subLista(mid, list.tamanho());

        calcularSoma(left);
        calcularSoma(right);

        return soma_pares * soma_impares;
    }
}
