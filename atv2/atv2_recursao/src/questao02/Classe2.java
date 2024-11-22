package questao02;


public class Classe2 {
    static int contador = 0;

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

        int countEsquerda = contarCaracteres(esquerda);
        int countDireita = contarCaracteres(direita);

        return countEsquerda + countDireita;
    }
}
