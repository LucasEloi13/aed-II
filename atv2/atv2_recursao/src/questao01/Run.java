package questao01;

import java.io.IOException;
import utils.Arquivo;

public class Run {
    public static void main(String[] args) throws IOException {
        
        int[] lista_inteiros; 
        
        lista_inteiros = Arquivo.arqParaListaInt("arquivo1");

        for(int i : lista_inteiros){
            System.out.println(i);
        }
    }
}
