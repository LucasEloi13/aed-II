package questao02;

import java.util.LinkedList;

public class Classe2 {
    static int contador = 0;

//    public static int contarCaracteres(String string, int index){
//        if (index >= string.length()) {
//            return 1;
//        }
//        contador++;
//        contarCaracteres(string, index + 1);
//
//        return contador;
//    }

    public static int contarCaracteres(String string){
        if (string == null || string.isEmpty()) {
            return 0;
        }
        if (string.length() == 1) {
            return 1;
        }

        int metade = string.length() / 2;
        String esquerda = string.substring(0, metade);
        String direita = string.substring(metade);

        // Conquista: conta os caracteres nas duas metades
        int countEsquerda = contarCaracteres(esquerda);
        int countDireita = contarCaracteres(direita);


        return countEsquerda + countDireita;
    }
}
