package ListaExercicios2;

public class ListaEncadeada {
    int ultimo = 0;
    int aux;
    private int[] vetor;

    public void ListaVazia() {
        int[] vetor = new int[10];
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

    public  void InserirPosicao(int num, int posicao) {
        aux = --ultimo;
        for (int i = ultimo; i = posicao; i--){
            this.vetor[aux] = this.vetor[aux+1];
            aux --;
        }
        vetor[posicao] = num;
    }


}


