//
//  main.c
//  aula05
//
//  Created by João Dematé Jr 🤠 on 19/05/20.
//  Copyright © 2020 João Dematé Jr 🤠. All rights reserved.
//

#include <stdio.h>
#include <string.h>

struct st_funcionario{
    char nome[100];
    int salario;
}funcionario;

struct st_empresa{
    struct st_funcionario funcionario[5];
}empresa;


int main() {
    // insert code here...
    int i;
    for (i = 0; i < 5; i++) {
        printf("Informe o nome do aluno: ");
        fgets(empresa.funcionario[i].nome, 100, stdin);
        printf("Informe a nota do aluno: ");
        scanf("%d", &empresa.funcionario[i].salario);
        getchar();
    }
    
    for (i = 0; i < 5; i++) {
        if (empresa.funcionario[i].salario > 7) {
            printf("Nenhum aluno Aprovado \n");
        } else {
            printf("Nome: %s\n", empresa.funcionario[i].nome);
            printf("Salario: %d\n", empresa.funcionario[i].salario);
        }
    }
    
    return 0;
}
