//
//  main.c
//  aula04
//
//  Created by João Dematé Jr 🤠 on 10/05/20.
//  Copyright © 2020 João Dematé Jr 🤠. All rights reserved.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int limiteMaximo = 1;
    int posicao = 0;
    int codigo_produto[4];
    int preco_produto[4];
    int preco_produto_desconto[4];
    int quantidade_estoque[4];

    
    while (posicao < limiteMaximo) {
        int codigo;
        int preco;
        int quantidade;
        printf("Digite o codigo do produto : ");
        scanf("%d", & codigo);
        printf("Digite o preco do produto : ");
        scanf("%d", & preco);
        printf("Digite a quantidade de produto em estoque : ");
        scanf("%d", & quantidade);

        
        posicao++;
    }

    return 0;
}
