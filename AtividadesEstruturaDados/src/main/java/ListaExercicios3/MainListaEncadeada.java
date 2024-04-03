package ListaExercicios3;

public class MainListaEncadeada extends ListaEncadeada {
    public static void main(String[] args) {

        ListaEncadeada Lista = new ListaEncadeada();
        Lista.CriarListaVazia();
//        Lista.InsereInicio(50);
//        Lista.InsereInicio(40);
//        Lista.InsereInicio(30);
//        Lista.InsereInicio(20);
//        Lista.InsereInicio(10);
//        Lista.InsereFinal(70);
        Lista.InserePosicao(10, 11);
        Lista.RetornarLista();
    }
}
