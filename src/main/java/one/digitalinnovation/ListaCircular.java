package one.digitalinnovation;

public class ListaCircular<T> {

    private No<T> cabeça;
    private No<T> calda;
    private int tamanhoLista;

    public boolean isEmpty() {
        return this.tamanhoLista == 0 ? true : false;
    }

    public int size() {
        return this.tamanhoLista;
    }


}
