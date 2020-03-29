//
//  main.c
//  C
//
//  Created by João Dematé Jr 🤠 on 29/03/20.
//  Copyright © 2020 João Dematé Jr 🤠. All rights reserved.
//

#include <stdio.h>

// RENDER MENU
int renderMenu()
{
    int opcaoMenu;
    printf("Programa para Ordenação de Vetores \nEscolha uma opção \n1 - Ordenação de Vetor com valores Int \n2 - Ordenação de Vetor com valores char \n3 - Ordenação de Vetor com valores Nomes \n");
    scanf("%d", &opcaoMenu);
    return opcaoMenu;
}

// RENDER FUNCAO DAS OPÇÃO
int renderOpcaoOrdenacao()
{
    int opcaoOrdenacao;
    printf("Exibir em \n1 - Decrescente \n2 - Crescente \n");
    scanf("%d", &opcaoOrdenacao);
    return opcaoOrdenacao;
}

// ORDENAÇÃO DE VETOR COM VALORES INT
int renderVetorInt()
{
    return 0;
}


int main(int argc, const char * argv[]) {
    // ORDENAÇÃO DE VETOR COM VALORES INT
    if (renderMenu() == 1)
    {
        if (renderOpcaoOrdenacao() == 1)
        {
            renderVetorInt();
        }
        else if (renderOpcaoOrdenacao() == 2)
        {
            renderVetorInt();
        }
        else {
            printf("Opção invalida \n");
        }
    }
    // ORDENAÇÃO DE VETOR COM VALORES CHAR
    else if (renderMenu() == 2)
    {
        if (renderOpcaoOrdenacao() == 1)
        {
            printf("1 \n");
        }
        else if (renderOpcaoOrdenacao() == 2)
        {
          printf("2 \n");
        }
        else {
            printf("Opção invalida \n");
        }
    }
    // ORDENAÇÃO DE VETOR COM VALORES STRING
    else if (renderMenu() == 3)
    {
        if (renderOpcaoOrdenacao() == 1)
        {
            printf("1 \n");
        }
        else if (renderOpcaoOrdenacao() == 2)
        {
          printf("2 \n");
        }
        else {
            printf("Opção invalida \n");
        }
    }
    else{
        printf("Opção invalida escola de 1 a 3 \n");
    }
    return(0);
}
