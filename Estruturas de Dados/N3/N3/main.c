//
//  main.c
//  N3
//
//  Created by João Dematé Jr 🤠 on 20/06/20.
//  Copyright © 2020 João Dematé Jr 🤠. All rights reserved.
//

#include <stdio.h>

#define TAMANHO 10
//PILHA
int ids[TAMANHO] = {};
char nomes[TAMANHO] = {};
int notas[TAMANHO] = {};
//FILA
int ids_fila[TAMANHO] = {};
int notas_fila[TAMANHO] = {};
//CONFIGURAÇÕES
int topo = 0;
int contador = 0;

int proximo = 0; //PRÓXIMO A SER ATENDIDO;
int ultimo = 0; //ÚLTIMO DA FILA;

void listar_alunos_pilha (){
    printf("\n ===================  PILHA ATUAL  =================== \n");
    for (int i = 0; i < TAMANHO; i++) {
        printf("\n-");
        printf("|Id: %d|", ids[i]);
        printf("|Nota: %d|", notas[i]);
        printf("|Nome: |");
        printf("-");
    }
    printf("\n\nTopo: %d", topo);
    printf("\n \n");
}

void opcao_1(){
    int nota;
    char nome;
    contador = contador + 1;
    printf("Digite o nome do aluno: ");
    scanf("%s", &nome);
    printf("Digite a nota do aluno: ");
    scanf("%d", &nota);
    if (topo < TAMANHO) {
        ids[topo] = contador;
        nomes[topo] = nome;
        notas[topo] = nota;
        topo = topo + 1;
        listar_alunos_pilha();
    }else{
        printf("Pilha cheia... \n");
    }
}

void listar_alunos_fila(){
    printf("\n ============== FILA ATUAL ==============\n ");
    for (int i = 0; i < TAMANHO; i++) {
        printf("-");
        printf("|Id: %d|", ids_fila[i]);
        printf("|Nota: %d|", notas_fila[i]);
        printf("-");
    }
    printf("\nProximo: %d \n", proximo);
    printf("Ultimo: %d \n", ultimo);
}

void opcao_2(){
    int id;
    int nota;
    if (ultimo < TAMANHO) {
        printf("Digite o numero do aluno: ");
        scanf("%d", &id);
        printf("Digite a nota do aluno: ");
        scanf("%d", &nota);
        ids_fila[ultimo] = id;
        notas_fila[ultimo] = nota;
        ultimo = ultimo + 1;
        listar_alunos_fila();
    }else{
        printf("A fila está cheia... \n");
    }
}

void opcao_3(){
    int id;
    printf("Digite o numero do aluno: ");
    scanf("%d", &id);
    listar_alunos_pilha();
}

void opcao_4(){
    printf("Todos os Alunos estão com nota!!! ");
}

void opcao_5(){
    if (topo >= 0) {
        ids[topo - 1] = 0;
        nomes[topo - 1] = 0;
        notas[topo - 1] = 0;
        topo = topo - 1;
        listar_alunos_pilha();
    } else {
        printf("Pilha vazia... \n");
    }
}

void opcao_6(){
    if (proximo < ultimo) {
        ids_fila[proximo] = 0;
        notas_fila[proximo] = 0;
        proximo = proximo  + 1;
        listar_alunos_fila();
    }else{
        printf("A fila está vazia... \n");
    }
}

void menu(){
    int opcao;
       do {
           printf("MENU \n\n");
           printf("1) Cadastrar Aluno\n");
           printf("2) Cadastrar Nota\n");
           printf("3) Calcular Média\n");
           printf("4) Listar os Nomes dos Alunos sem Nota\n");
           printf("5) Excluir Aluno\n");
           printf("6) Excluir Nota\n");
           printf("7) Sair \n");
           printf("... ");
           scanf("%d", & opcao);
           switch (opcao) {
               case 1:
                   opcao_1();
                   break;
               case 2:
                   opcao_2();
                   break;
               case 3:
                   opcao_3();
                   break;
               case 4:
                   opcao_4();
                   break;
               case 5:
                   opcao_5();
                   break;
               case 6:
                   opcao_6();
                   break;
               case 7:
                   break;
               default:
                   printf("Opção Invalida.\n");
           }
       } while (opcao != 7);
            printf("Programa Encerrado com Sucesso !!!\n");
            printf("Obrigado por usar nosso software faça uma doação para ajudar a manter esse programador vivo. \n"); 
}

int main(int argc, const char * argv[]) {
    menu();
    return 0;
}
