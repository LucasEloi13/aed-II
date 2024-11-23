package utils;


public class ListaEncadeadaDupla<T> {
    private Node<T> head;
    private Node<T> last;

    public ListaEncadeadaDupla() {
        head = null;
        last = null;
    }

    public void inserir(T item){
        Node<T> newNode = new Node<>(item);
        if (head == null){
            head = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }
    }

    public boolean buscar(T item) {
        Node<T> tmpNode = head;
        while (tmpNode != null) {
            if (tmpNode.data.equals(item)) return true;
            tmpNode = tmpNode.next;
        }
        return false;
    }

    public boolean remover(T item) {
        Node<T> tmpNode = head;
        while (tmpNode != null){
            if(tmpNode.data.equals(item)){
                if (tmpNode.prev != null) tmpNode.prev.next = tmpNode.next;
                if (tmpNode.next != null) tmpNode.next.prev = tmpNode.prev;
                if (tmpNode == head) head = tmpNode.next;
                return true;
            }
            tmpNode = tmpNode.next;
        }
        return false;
    }

    public void imprimir() {
        Node<T> tmpNode = head;
        while (tmpNode != null) {
            System.out.println(tmpNode.data + " ");
            tmpNode = tmpNode.next;
        }
    }

    public int tamanho(){
        Node<T> tmpNode = head;
        int count = 0;
        while (tmpNode != null) {
            count++;
            tmpNode = tmpNode.next;
        }
        return count;
    }

    public T get(int index) {
        Node<T> tmpNode = head;
        int count = 0;
        while (tmpNode != null) {
            if (count == index) return tmpNode.data;
            count++;
            tmpNode = tmpNode.next;
        }
        return null;
    }

    public ListaEncadeadaDupla<T> subLista(int inicio, int fim) {
        ListaEncadeadaDupla<T> subLista = new ListaEncadeadaDupla<>();
        Node<T> atual = head;
        int index = 0;

        while (atual != null) {
            if (index >= inicio && index < fim) {
                subLista.inserir(atual.data);
            }
            atual = atual.next;
            index++;
        }

        return subLista;
    }


    public boolean estaVazia(){
        return head == null;
    }

}
