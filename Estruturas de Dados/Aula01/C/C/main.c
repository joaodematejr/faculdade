//
//  main.c
//  C
//
//  Created by João Dematé Jr 🤠 on 29/03/20.
//  Copyright © 2020 João Dematé Jr 🤠. All rights reserved.
//

#include <string.h>

#include <stdio.h>

#include <stdlib.h>

// RENDER MENU
int renderMenu() {
  int opcaoMenu;
  printf("Programa para Ordenação de Vetores \nEscolha uma opção \n1 - Ordenação de Vetor com valores Int \n2 - Ordenação de Vetor com valores Char \n3 - Ordenação de Vetor com valores Nomes \n");
  scanf("%d", & opcaoMenu);
  return opcaoMenu;
}

// RENDER FUNCAO DAS OPÇÃO
int renderOpcaoOrdenacao() {
  int opcaoOrdenacao;
  printf("Exibir em \n1 - Decrescente \n2 - Crescente \n");
  scanf("%d", & opcaoOrdenacao);
  return opcaoOrdenacao;
}

void swap(int * xp, int * yp) {
  int temp = * xp;
  * xp = * yp;
  * yp = temp;
}

//ORDERNAR NUMEROS
void selectionSort(int arr[], int n) {
  int i, j, min_idx;
  for (i = 0; i < n - 1; i++) {
    min_idx = i;
    for (j = i + 1; j < n; j++)
      if (arr[j] < arr[min_idx])
        min_idx = j;
    swap( & arr[min_idx], & arr[i]);
  }
}

int myCompare(const void * a,
  const void * b) {
  const char * pa = * (const char ** ) a;
  const char * pb = * (const char ** ) b;

  return strcmp(pa, pb);
}

// ORDENAÇÃO DE VETOR COM VALORES INT
int renderVetorInt(int modoExibicao) {
  if (modoExibicao == 1) {
    return 0;
  } else if (modoExibicao == 2) {

    int numeros[15] = {
      13,
      8,
      9,
      1,
      10,
      4,
      6,
      15,
      3,
      14,
      7,
      11,
      2,
      12,
      5
    };
    int loop;
    int n = sizeof(numeros) / sizeof(numeros[0]);
    printf("Original: ");
    for (loop = 0; loop < 15; loop++)
      printf("%d ", numeros[loop]);
    printf("\n");
    printf("Ordenadas: ");
    selectionSort(numeros, n);
    int i;
    for (i = 0; i < n; i++)
      printf("%d ", numeros[i]);
    printf("\n");
    return 0;
  } else {
    printf("Opção invalida \n");
    return 0;
  }
}

// ORDENAÇÃO DE VETOR COM VALORES CHAR
int renderVetorChar(int modoExibicao) {
  if (modoExibicao == 1) {
    return 0;
  } else if (modoExibicao == 2) {
    const char * letras[] = {
      "C",
      "J",
      "D",
      "B",
      "G",
      "H",
      "E",
      "A",
      "F",
      "I"
    };
    int i;
    int stringLen = sizeof(letras) / sizeof(char * );
    qsort(letras, stringLen, sizeof(char * ), myCompare);
    for (i = 0; i < stringLen; ++i)
      printf("%s", letras[i]);
    printf("\n");
    return 0;
  } else {
    printf("Opção invalida \n");
    return 0;
  }
}

// ORDENAÇÃO DE VETOR COM VALORES STRING
int renderVetorNomes(int modoExibicao) {
  if (modoExibicao == 1) {
    return 0;
  } else if (modoExibicao == 2) {
    const char * nomes[] = {
      "Ana ",
      "Joao ",
      "Daniel ",
      "Bruna ",
      "Guilherme ",
      "Helena ",
      "Eduarda ",
      "Aline ",
      "Felipe ",
      "Ian ",
      "Maria "
    };
    int i;
    int stringLen = sizeof(nomes) / sizeof(char * );
    qsort(nomes, stringLen, sizeof(char * ), myCompare);
    printf("Ordenada: ");
    for (i = 0; i < stringLen; ++i)
      printf("%s", nomes[i]);
    printf("\n");
    return 0;
  } else {
    printf("Opção invalida \n");
    return 0;
  }
}

int main(int argc,
  const char * argv[]) {
  // ORDENAÇÃO DE VETOR COM VALORES INT
  if (renderMenu() == 1) {
    if (renderOpcaoOrdenacao() == 1) {
      renderVetorInt(1);
    } else if (renderOpcaoOrdenacao() == 2) {
      renderVetorInt(2);
    } else {
      printf("Opção invalida \n");
    }
  }
  // ORDENAÇÃO DE VETOR COM VALORES CHAR
  else if (renderMenu() == 2) {
    if (renderOpcaoOrdenacao() == 1) {
      renderVetorChar(1);
    } else if (renderOpcaoOrdenacao() == 2) {
      renderVetorChar(2);
    } else {
      printf("Opção invalida \n");
    }
  }
  // ORDENAÇÃO DE VETOR COM VALORES STRING
  else if (renderMenu() == 3) {
    if (renderOpcaoOrdenacao() == 1) {
      renderVetorNomes(1);
    } else if (renderOpcaoOrdenacao() == 2) {
      renderVetorNomes(2);
    } else {
      printf("Opção invalida \n");
    }
  } else {
    printf("Opção invalida escolha de 1 a 3 \n");
  }
  return (0);
}
