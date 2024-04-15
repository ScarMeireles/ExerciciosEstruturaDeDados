package ListaExercicios3;

public class ListaEncadeadaRef {
    private Nodo ultimo;
    private Nodo primeiro;

    public void CriarListaVazia() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public Boolean ListaVazia() {
        if (this.primeiro == null) {
            return true;
        } else {
            return false;
        }
    }

    public void InsereInicio(int valor) {
        Nodo n = new Nodo(valor);
        if (ListaVazia()) {
            this.primeiro = n;
            this.ultimo = n;
//            System.out.println("primeiro: " + primeiro.valor);
//            System.out.println("ultimo: " + ultimo.valor);
        } else {
            n.proximo = this.primeiro;
            primeiro = n;
//            System.out.println("valor n: " + n.valor);
//            System.out.println("primeiro: " + primeiro.valor);
//            System.out.println("ultimo: " + ultimo.valor);
        }
    }

    public void RetornarLista() {
        Nodo aux;
        aux = primeiro;

        if (ListaVazia()) {
            System.out.println("A Lista está Vazia.");
        } else {
//        System.out.println("aux.valor: " + aux.valor);
            while (aux != null) {
                System.out.println(aux.valor);
//            System.out.println("aux.proximo: " + aux.proximo);
                aux = aux.proximo;
//            System.out.println("aux.valor: " + aux.valor);
            }
        }
    }

    public void InsereFinal(int valor) {
        Nodo n = new Nodo(valor);
        if (ListaVazia()) {
            this.primeiro = n;
            this.ultimo = n;
        } else {
            this.ultimo.proximo = n;
            this.ultimo = n;
        }
    }

    public void InsereAposValor(int posicao, int valor) {
        Nodo n = new Nodo(valor);
        Nodo aux;
        if (ListaVazia()) {
            System.out.println("A Lista está Vazia.");
            this.primeiro = n;
            this.ultimo = n;
        } else {
            aux = this.primeiro;
            while (aux.valor != posicao && aux != null) {
                aux = aux.proximo;
            }
            if (aux == null) {
                System.out.println("O elemento não existe na lista!");
            } else {
                n.proximo = aux.proximo;
                aux.proximo = n;
            }
        }
    }

    public void InserePosicao(int posicao) {

    }

    public void RemoveInicio() {

    }

    public void RemoveFinal() {
    }

    public void RemovePosicao() {

    }

    public void RemoveElemento() {

    }

    public void ExibeLista() {

    }

    public int PesquisaElemento() {
        return 0;
    }

    public int TamanhoLista() {
        return 0;
    }


}
