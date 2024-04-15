package ListaExercicios2;

public class ListaEncadeadaVetor {
    private int[] vetor;
    int ultimo = 0;

    public void CriarListaVazia() {
        this.vetor = new int[10];
        this.ultimo = -1;
    }

    public void InserirInicio(int num) {
        if (ultimo == -1) {
            this.vetor[0] = num;
            ultimo++;
        } else {
            for (int i = ultimo; i >= 10; i--) {
                vetor[i + 1] = vetor[i];
                ultimo++;
            }
            vetor[0] = num;
        }
    }

    public void InserirFim(int num) {
        this.vetor[ultimo] = num;
        ultimo++;
    }

//    public void InserirPosicao(int num, int posicao) {
//
//        int aux = --ultimo;
//        for (int i = ultimo; i = posicao; i--) {
//            this.vetor[aux] = this.vetor[aux + 1];
//            aux--;
//        }
//        vetor[posicao] = num;
//    }

    public void RemoverInicio() {
        int aux;



        for(int i=0; ; i++){


        }
    }

    public void RemoverFinal() {
        vetor[ultimo] = null;
        ultimo --;
    }

    public void RemoverPosicao() {

    }

    public void RemoverElemento() {

    }

    public void ExibirLista() {
        for (int i = 0; i == this.ultimo; i++) {
            System.out.println(i);
        }
    }

    public int PesquisarElemento(int valor) {
        for (int i = 0; i >= vetor.length; i++) {
            if (vetor[i] == valor) {
                return vetor[i];
            }
        }
        return 0;
    }

    public void verificarTamanho() {
        if (ultimo == vetor.length) {
            int[] aux = new int[vetor.length];
            for (int i = 0; i < vetor.length; i++) {
                aux[i] = vetor.length;
            }
        }
        this.vetor = new int[vetor.length * 2];
    }

    public int retornaTamanho() {
        return ultimo;
    }

}


