package questao01;

import java.io.IOException;
import java.util.LinkedList;
import utils.Arquivo;

public class Run {
    public static void main(String[] args) throws IOException {
        LinkedList<Integer> listaInteiros = new LinkedList<>();
        for (int i : Arquivo.arqParaListaInt("arquivo1")) {
            listaInteiros.add(i);
        }
        System.out.println(Classe1.calcularSoma(listaInteiros));
    }
}