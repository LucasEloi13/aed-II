package questao03;

import java.io.IOException;
import java.util.LinkedList;

import utils.Arquivo;
import utils.ListaEncadeadaDupla;

public class Run {
    public static void main(String[] args) throws IOException {
        ListaEncadeadaDupla<Integer> listaInteiros = new ListaEncadeadaDupla<>();

        listaInteiros = Arquivo.arqParaListaInt("arquivoQ3");

        int dinheiro = listaInteiros.get(0);
        int unidade = listaInteiros.get(1);
        int troca = listaInteiros.get(2);

        System.out.println(Classe3.calcularChocolates(dinheiro, unidade, troca));
    }
}
