package ListaExercicios2;

public class ListaEncadeada {
    int ultimo = 0;
    private int[] vetor;

    public void ListaEncadeada() {
        int[] vetor = new int[10];
        ultimo = 0;
    }

    public void InserirInicio(int num) {
        if (ultimo == 0) {
            this.vetor[ultimo] = num;
            ultimo++;
        } else {
            for (int i = 0; i < 10; i++) {

            }
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


}


