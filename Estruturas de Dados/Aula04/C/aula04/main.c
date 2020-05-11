//
//  main.c
//  aula04
//
//  Created by João Dematé Jr 🤠 on 10/05/20.
//  Copyright © 2020 João Dematé Jr 🤠. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    
    int lista_codigo_produto[5];
    int lista_preco_produto[5];
    int lista_preco_produto_desconto[5];
    int lista_quantidade_estoque[5];
    
    int limiteMaximo = 5;
    int posicao = 0;
    int porcetagem;

    while (posicao < limiteMaximo) {
        int codigo;
        int preco;
        int quantidade;
        printf("Digite o codigo do produto : ");
        scanf("%d", & codigo);
        lista_codigo_produto[posicao] = codigo;
        printf("Digite o preco do produto : ");
        scanf("%d", & preco);
        lista_preco_produto[posicao] = preco;
        printf("Digite a quantidade de produto em estoque : ");
        scanf("%d", & quantidade);
        lista_quantidade_estoque[posicao] = quantidade;
        posicao++;
    }
    
    printf("Digite a porcetagem a aplicar na lista : ");
    scanf("%d", & porcetagem);
    int loop;
    for (int loop = 0; loop < 5; ++loop) {
        int formula = porcetagem * lista_preco_produto[loop];
        int resultado = formula / 100;
        lista_preco_produto_desconto[loop] = resultado;
        for (int loop = 0; loop < 5; ++loop) {
            if (lista_quantidade_estoque[loop] > 500) {
                 for (int loop = 0; loop < 5; ++loop) {
                    printf("Quantidade em Estoque %d \n", lista_quantidade_estoque[loop]);
                    printf("Codigo do produto %d \n", lista_codigo_produto[loop]);
                    printf("Preço com Desconto %d \n", lista_preco_produto_desconto[loop]);
                }
            }
           ;
        }
    }

    return 0;
}
