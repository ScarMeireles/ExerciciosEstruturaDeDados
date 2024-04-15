package ListaExercicios2;

public class MainListaVet {
    public static void main(String[] args) {
        ListaEncadeadaVetor Lista = new ListaEncadeadaVetor();
        Lista.CriarListaVazia();
        Lista.ExibirLista();

        Lista.InserirInicio(1);
        Lista.ExibirLista();
        Lista.retornaTamanho();
        Lista.PesquisarElemento(1);
    }
}
