package questao01;

import java.io.IOException;

import utils.Arquivo;
import utils.ListaEncadeadaDupla;

public class Run1 {
    public static void main(String[] args) throws IOException {

        ListaEncadeadaDupla<Integer> lista = new ListaEncadeadaDupla<>(); 
        
        lista = Arquivo.arqParaLista("arquivoQ1");

        //lista.imprimir();

        lista.set(2, 100);

        lista.imprimir();
    }
}
