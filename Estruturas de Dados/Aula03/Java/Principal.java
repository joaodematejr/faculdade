import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Principal {
  Scanner ler = new Scanner(System.in);
  int opcaoMenu = 0;

  public int renderMenu() {
    System.out.printf(
        "Aula 3: Métodos de Ordenação \nEscolha uma opção  \n1 –Faça um programa que leia 13 nomes definido pelo usuário, inserindo-os em um vetor e que os ordene utilizando a ideia do algoritmo da inserção. No final, o programa deve mostrar todos os nomes ordenados alfabeticamente. \n2 - Dados três vetores de 5 posições ordenados, implemente uma função que intercala e retorne o vetor resultante ordenado. Implemente uma função merge sort, que faça ordenação em um vetor utilizando a sua função de intercalação (sugestão: se baseie no algoritmo do merge-sort original). \n3 - Considere a seguinte estrutura: typedef struct pessoa {string nome; unsigned int Matricula; float Nota; } Aluno; \n");
    opcaoMenu = ler.nextInt();
    return opcaoMenu;
  }

  public void funcaoOrdenacao() {
    ArrayList<String> nomesLista = new ArrayList();
    String nome;
    int limiteMaximo = 13;
    int posicao = 0;
    while (posicao < limiteMaximo) {
      posicao += 1;
      System.out.printf("Digite um nome para adicionar na lista :\n");
      nome = ler.nextLine();
      nomesLista.add(nome);
    }
    int i;
    int n = nomesLista.size();
    for (i = 0; i < n; i++) {
      System.out.printf("%s", nomesLista.get(i));
    }
  }

  void merge(int arr[], int l, int m, int r) {
    int n1 = m - l + 1;
    int n2 = r - m;

    int L[] = new int[n1];
    int R[] = new int[n2];

    for (int i = 0; i < n1; ++i)
      L[i] = arr[l + i];
    for (int j = 0; j < n2; ++j)
      R[j] = arr[m + 1 + j];

    int i = 0, j = 0;

    int k = l;
    while (i < n1 && j < n2) {
      if (L[i] <= R[j]) {
        arr[k] = L[i];
        i++;
      } else {
        arr[k] = R[j];
        j++;
      }
      k++;
    }

    while (i < n1) {
      arr[k] = L[i];
      i++;
      k++;
    }

    while (j < n2) {
      arr[k] = R[j];
      j++;
      k++;
    }
  }

  void sort(int arr[], int l, int r) {
    if (l < r) {
      int m = (l + r) / 2;
      sort(arr, l, m);
      sort(arr, m + 1, r);
      merge(arr, l, m, r);
    }
  }

  static void imprimirArrayList(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; ++i)
      System.out.print(arr[i] + " ");
    System.out.println();
  }

  static void imprimirArrayList(String arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; ++i)
      System.out.print(arr[i] + " ");
    System.out.println();
  }

  public static void main(String[] args) {

    Principal p = new Principal();

    if (p.renderMenu() == 1) {
      p.funcaoOrdenacao();
    } else if (p.renderMenu() == 2) {
      int vetor1[] = { 12, 11, 13, 5, 6, 7 };
      String vetor2[] = { "Gisele", "Daniel", "Joao", "Bruna", "Ana" };
      String vetor3[] = { "12", "11", "13", "5", "6", "7" };
      System.out.println("Original");
      imprimirArrayList(vetor1);
      imprimirArrayList(vetor2);
      imprimirArrayList(vetor3);
      p.sort(vetor1, 0, vetor1.length - 1);
      System.out.println("\nFunção Sorte");
      imprimirArrayList(vetor1);
    } else if (p.renderMenu() == 3) {
      System.out.println("NÃO ENTENDI !!!");
    } else {
      System.out.println("Opção invalida escola de 1 a 3 !!!");
    }

  }

}