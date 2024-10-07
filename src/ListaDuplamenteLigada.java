public class ListaDuplamenteLigada<T> {
    private No<T> inicio;
    private No<T> fim;

    public ListaDuplamenteLigada() {
        this.inicio = null;
        this.fim = null;
    }

    public void adicionaFim(T dado) {
        No<T> novoNo = new No<>(dado);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
    }

    public void adicionaInicio(T elemento) {
        No<T> novoNo = new No<>(elemento);
        if (this.inicio == null) {
            this.inicio = novoNo;
            this.fim = novoNo;
        } else {
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }
    }

    public void remover(T dado) {
        if (inicio == null) return;

        No<T> atual = inicio;
        while (atual != null) {
            if (atual.dado.equals(dado)) {
                if (atual == inicio) {
                    inicio = atual.proximo;
                    if (inicio != null) inicio.anterior = null;
                }

            }else if (atual == fim) {
                fim = atual.anterior;
                if (fim != null) fim.proximo = null;
            } else {
                atual.anterior.proximo = atual.proximo;
                atual.proximo.anterior = atual.anterior;
            }
            return;
        }
        atual = atual.proximo;
    }

    public boolean contem(T dado) {
        No<T> atual = inicio;
        while (atual != null) {
            if (atual.dado.equals(dado)) return true;
            atual = atual.proximo;
        }
        return false;
    }

    public void imprimirLista() {
        No<T> atual = inicio;
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "ListaDuplamenteLigada{" +
                "inicio=" + inicio +
                ", fim=" + fim +
                '}';
    }
}

