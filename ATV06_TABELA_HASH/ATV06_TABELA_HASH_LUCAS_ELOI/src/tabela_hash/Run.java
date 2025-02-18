//package tabela_hash;

public class Run {
    public static void main(String[] args) {
        TabelaHash tabela = new TabelaHash();

        // Exemplo de uso
        tabela.inserir("chave1");
        tabela.inserir("chave2");
        tabela.inserir("chave3");
        tabela.inserir("chave4");
        tabela.inserir("chave5");
        tabela.inserir("chave6");
        tabela.inserir("chave7");
        tabela.inserir("chave8");
        tabela.inserir("chave9");
        tabela.inserir("chave10");
        tabela.inserir("chave11");
        tabela.inserir("chave12");
        tabela.inserir("chave13");
        tabela.inserir("chave14");
        tabela.inserir("chave15");
        tabela.inserir("chave16"); // Força redimensionamento

        tabela.imprimir();

        System.out.println(tabela.buscar("chave10"));
        System.out.println(tabela.remover("chave10"));
        System.out.println(tabela.buscar("chave10"));

        tabela.imprimir();

        // Inserir de um arquivo
        // tabela.inserirArquivo("src/arquivos/entrada.txt");
        // tabela.imprimir();
    }
}