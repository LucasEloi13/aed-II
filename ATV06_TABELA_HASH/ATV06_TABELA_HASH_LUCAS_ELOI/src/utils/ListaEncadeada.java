public class ListaEncadeada {
    private No inicio;

    public ListaEncadeada() {
        this.inicio = null;
    }

    public void inserir(String chave) {
        No novoNo = new No(chave);
        if (inicio == null) {
            inicio = novoNo;
        } else {
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }

    public boolean remover(String chave) {
        if (inicio == null) {
            return false;
        }

        if (inicio.chave.equals(chave)) {
            inicio = inicio.proximo;
            return true;
        }

        No atual = inicio;
        while (atual.proximo != null) {
            if (atual.proximo.chave.equals(chave)) {
                atual.proximo = atual.proximo.proximo;
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    public boolean buscar(String chave) {
        No atual = inicio;
        while (atual != null) {
            if (atual.chave.equals(chave)) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        No atual = inicio;
        while (atual != null) {
            sb.append(atual.chave).append(" -> ");
            atual = atual.proximo;
        }
        sb.append("null");
        return sb.toString();
    }
}