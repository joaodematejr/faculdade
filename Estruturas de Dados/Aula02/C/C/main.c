//
//  main.c
//  C
//
//  Created by João Dematé Jr 🤠 on 05/04/20.
//  Copyright © 2020 João Dematé Jr 🤠. All rights reserved.
//

#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#include <time.h>

// RENDER MENU
int renderMenu() {
  int opcaoMenu;
  printf("Aula 2: Algoritmos de Ordenação e Busca \nEscolha uma opção \n1) 1.4 - Vetor Valores INT: \n2) 2.4 - Vetor Valores CHAR: \n3) 3.4 - Vetor Valores STRING: \n");
  scanf("%d", & opcaoMenu);
  return opcaoMenu;
}


// RENDER MENU
int renderMenuINT() {
  int opcaoMenu;
  printf("1.Vetor Valores INT: \nEscolha uma opção \n1) 1.1 Ordenação Bubble Sort - Vetor com valores Int 3.000 e 5.000 números – controle de comparações, troca e tempo execução – gerar de forma randômica: \n2) 1.2 Ordenação Bubble Sort - 1ª versão Melhorado - Vetor com valores Int 3.000 e 5.000 números – controle de comparações, troca e tempo execução – gerar de forma randômica: \n3) 1.3 Ordenação Bubble Sort - 2ª versão Melhorado - Vetor com valores Int 3.000 e 5.000 números – controle de comparações, troca e tempo execução – gerar de forma randômica: \n");
  scanf("%d", & opcaoMenu);
  return opcaoMenu;
}


// RENDER MENU CHAR
int renderMenuCHAR() {
  int opcaoMenu;
  printf("1.Vetor Valores CHAR: \nEscolha uma opção \n1) 2.1 Ordenação Bubble Sort - Vetor com valores char 156 e 256 caracteres – controle de comparações, troca e tempo execução – gerar de forma randômica: \n2) 1.2 Ordenação Bubble Sort - 1ª versão Melhorado - Vetor com valores char 156 e 256 caracteres – controle de comparações, troca e tempo execução – gerar de forma randômica: \n3) 1.3 Ordenação Bubble Sort - 2ª versão Melhorado - Vetor com valores char 156 e 256 caracteres – controle de comparações, troca e tempo execução – gerar de forma randômica: \n");
  scanf("%d", & opcaoMenu);
  return opcaoMenu;
}
         
         
        
// RENDER MENU STRING
int renderMenuSTRING() {
  int opcaoMenu;
  printf("1.Vetor Valores STRING: \nEscolha uma opção \n1) 2.1 Ordenação Bubble Sort - Vetor com valores strings 30 e 300 strings – controle de comparações, troca e tempo execução – gerar de forma randômica: \n2) 1.2 Ordenação Bubble Sort - 1ª versão Melhorado - Vetor com valores strings 30 e 300 strings – controle de comparações, troca e tempo execução – gerar de forma randômica: \n3) 1.3 Ordenação Bubble Sort - 2ª versão Melhorado - Vetor com valores strings 30 e 300 strings – controle de comparações, troca e tempo execução – gerar de forma randômica: \n");
  scanf("%d", & opcaoMenu);
  return opcaoMenu;

}

void swap(int *ap, int *bp){
      int temp = *ap;
      *ap = *bp;
      *bp = temp;
}

void bubbleSort(int arr[], int size){
      time_t start,end;
      start=clock();
      int i,j;
      for(i = 0; i < size; i++){
            //last elements already in place
            for(j = 0; j < size-i-1; j++){
                  if(arr[j] > arr[j+1])
                        swap(&arr[j], &arr[j+1]);
            }
      }
      end=clock();
}

void printArray(int arr[], int size){
      int i;
      for(i = 0; i < size ; i++){
              printf("%d ",arr[i]);
      }
}

char *randChar(size_t length) {
    static char charset[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789,.-#'?!";
    char *randomString = NULL;
    if (length) {
        randomString = malloc(sizeof(char) * (length +1));
        if (randomString) {
            for (int n = 0;n < length;n++) {
                int key = rand() % (int)(sizeof(charset) -1);
                randomString[n] = charset[key];
            }
            randomString[length] = '\0';
        }
    }
    printf(randomString);
    printf("\n");
    return randomString;
}

char *randString(size_t length) {
    static char charset[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789,.-#'?!";
    char *randomString = NULL;
    if (length) {
        randomString = malloc(sizeof(char) * (length +1));
        if (randomString) {
            for (int n = 0;n < length;n++) {
                int key = rand() % (int)(sizeof(charset) -1);
                randomString[n] = charset[key];
            }
            randomString[length] = '\0';
        }
    }
    printf(randomString);
    printf("\n");
    return randomString;
}



int main(int argc, const char * argv[]) {
    
    if (renderMenu() == 1) {
        if (renderMenuINT() == 1) {
            int i, n=3000, arr[n];
            for (i=0; i<n; i++)
                arr[i]=rand()%n;
            int a = sizeof(arr)/sizeof(arr[n]);
            int x, inicio=5000, arrr[inicio];
               for (x=0; x<inicio; x++)
                   arrr[x]=rand()%inicio;
            int contador = sizeof(arrr)/sizeof(arrr[inicio]);
            bubbleSort(arr,a);
            printArray(arr,a);
            //FUNÇÃO 5000
            bubbleSort(arrr,contador);
            printArray(arrr,contador);
            printf("\n");
        }else if (renderMenuINT() == 2){
            int i, n=3000, arr[n];
            for (i=0; i<n; i++)
                arr[i]=rand()%n;
            int a = sizeof(arr)/sizeof(arr[n]);
            int x, inicio=5000, arrr[inicio];
               for (x=0; x<inicio; x++)
                   arrr[x]=rand()%inicio;
            int contador = sizeof(arrr)/sizeof(arrr[inicio]);
            bubbleSort(arr,a);
            printArray(arr,a);
            //FUNÇÃO 5000
            bubbleSort(arrr,contador);
            printArray(arrr,contador);
            printf("\n");
        }else if (renderMenuINT() == 3) {
            int i, n=3000, arr[n];
            for (i=0; i<n; i++)
                arr[i]=rand()%n;
            int a = sizeof(arr)/sizeof(arr[n]);
            int x, inicio=5000, arrr[inicio];
               for (x=0; x<inicio; x++)
                   arrr[x]=rand()%inicio;
            int contador = sizeof(arrr)/sizeof(arrr[inicio]);
            bubbleSort(arr,a);
            printArray(arr,a);
            //FUNÇÃO 5000
            bubbleSort(arrr,contador);
            printArray(arrr,contador);
            printf("\n");
        } else {
            printf("Opção Invalida !!!");
        }
    }
    // ORDENAÇÃO DE VETOR COM VALORES CHAR
    else if (renderMenu() == 2) {
      if (renderMenuCHAR() == 1) {
          randChar(156);
          randChar(256);
      }else if (renderMenuCHAR() == 2){
          randChar(156);
          randChar(256);
      }else if (renderMenuCHAR() == 3) {
          randChar(156);
          randChar(256);
      } else {
        printf("Opção Invalida !!!");
      }
    }
    // ORDENAÇÃO DE VETOR COM VALORES STRING
    else if (renderMenu() == 3) {
      if (renderMenuSTRING() == 1) {
          randString(30);
          randString(300);
      }else if (renderMenuSTRING() == 2){
          randString(30);
          randString(300);
      }else if (renderMenuSTRING() == 3) {
          randString(30);
          randString(300);
      } else {
        printf("Opção Invalida !!!");
      }
    } else {
      printf("Opção invalida escolha de 1 a 3 \n");
    }
    return (0);
}
