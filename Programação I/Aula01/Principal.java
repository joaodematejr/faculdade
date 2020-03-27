package faculdade;

public class Principal {

  public static void main(String args[]) {
    Peca novaPeca;
    novaPeca = new Peca();
    // SETANDO VALORES
    novaPeca.nome = "Escapamento";
    novaPeca.classificacao = "Esportivo";
    novaPeca.tamanho = "25cm";
    novaPeca.precoCusto = 100;
    novaPeca.tempoParaTroca = 30;
    novaPeca.percentualVenda = 10;
    // CHAMADA DOS VOIDS DO OUTRO ARQUIVO
    novaPeca.exibirInformacoes();
    novaPeca.calcularOprecoDeVenda(1);
  }

}
