package faculdade;

public class Peca {
  // ATRIBUTOS DA PEÇA
  String nome;
  String classificacao;
  String tamanho;
  double precoCusto;
  int tempoParaTroca;
  int percentualVenda;

  // CALCULAR VALOR DA VENDA
  void calcularOprecoDeVenda(final int percentualVenda) {
    final double percentual = percentualVenda / precoCusto;
    final double calcularPorcentagem = precoCusto + (percentual * precoCusto);
    System.out.println("Porcentual da Venda: " + percentualVenda + "%");
    System.out.println("Valor final com % " + calcularPorcentagem);
  }

  // IMPRIMIR OS VALORES
  public void exibirInformacoes() {
    System.out.println("Nome da Peça: " + nome);
    System.out.println("Classificação: " + classificacao);
    System.out.println("Tamanho: " + tamanho);
    System.out.println("Preço de Custo: " + precoCusto);
    System.out.println("Tempo para Troca " + tempoParaTroca + " minutos");

  }
}
