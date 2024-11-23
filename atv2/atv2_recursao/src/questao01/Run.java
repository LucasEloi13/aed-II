package questao01;

import java.io.IOException;
import java.util.LinkedList;
import utils.Arquivo;
import utils.ListaEncadeadaDupla;

public class Run {
    public static void main(String[] args) throws IOException {
        ListaEncadeadaDupla<Integer> listaInteiros = new ListaEncadeadaDupla<>();
        
        System.out.println(Classe1.calcularSoma(Arquivo.arqParaListaInt("arquivoQ1")));
    }
}