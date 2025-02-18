import utils.ListaEncadeada;

public class TabelaHash {
    private static final int TAMANHO_INICIAL = 15;
    private ListaEncadeada[] buckets;
    private int tamanho;
    private int numElementos;

    public TabelaHash() {
        this.tamanho = TAMANHO_INICIAL;
        this.buckets = new ListaEncadeada[TAMANHO_INICIAL];
        for (int i = 0; i < tamanho; i++) {
            buckets[i] = new ListaEncadeada();
        }
        this.numElementos = 0;
    }

    private int funcaoHash(String chave) {
        return Math.abs(chave.hashCode()) % tamanho;
    }

    public void inserir(String chave) {
        if ((double) numElementos / tamanho >= 0.7) {
            redimensionar();
        }

        int indice = funcaoHash(chave);
        if (buckets[indice].buscar(chave)) {
            System.out.println("Chave já existe: " + chave);
            return;
        }

        buckets[indice].inserir(chave);
        numElementos++;
    }

    public boolean remover(String chave) {
        int indice = funcaoHash(chave);
        boolean removido = buckets[indice].remover(chave);
        if (removido) {
            numElementos--;
        }
        return removido;
    }

    public String buscar(String chave) {
        int indice = funcaoHash(chave);
        boolean encontrado = buckets[indice].buscar(chave);
        return encontrado ? "Elemento encontrado no bucket " + indice : "Elemento não encontrado";
    }

    public void imprimir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Bucket " + i + ": ");
            System.out.println(buckets[i].imprimir());
        }
    }

    private void redimensionar() {
        System.out.println("Redimensionando a tabela hash...");
        int novoTamanho = tamanho * 2;
        ListaEncadeada[] novosBuckets = new ListaEncadeada[novoTamanho];
        for (int i = 0; i < novoTamanho; i++) {
            novosBuckets[i] = new ListaEncadeada();
        }

        for (int i = 0; i < tamanho; i++) {
            No atual = buckets[i].getInicio();
            while (atual != null) {
                int novoIndice = Math.abs(atual.chave.hashCode()) % novoTamanho;
                novosBuckets[novoIndice].inserir(atual.chave);
                atual = atual.proximo;
            }
        }

        this.buckets = novosBuckets;
        this.tamanho = novoTamanho;
    }

    public void inserirArquivo(String caminhoArquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                inserir(linha.trim());
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
