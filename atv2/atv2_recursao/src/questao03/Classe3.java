package questao03;

public class Classe3 {

    public static int calcularChocolates(int dinheiro, int unidade, int troca) {
        int chocolatesComprados = dinheiro / unidade;

        int chocolatesExtras = coletarBonus(chocolatesComprados, troca);

        return chocolatesComprados + chocolatesExtras;
    
    }
    
    public static int coletarBonus(int quantidade, int troca) {
        if (quantidade < troca) {
            return 0; 
        }
    
        int trocas = quantidade / troca;
        int resto = quantidade % troca;
    
        return trocas + coletarBonus(trocas + resto, troca);
    }
    
}   
