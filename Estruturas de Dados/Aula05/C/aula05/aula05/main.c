//
//  main.c
//  aula05
//
//  Created by João Dematé Jr 🤠 on 19/05/20.
//  Copyright © 2020 João Dematé Jr 🤠. All rights reserved.
//

#include <stdio.h>
#include <string.h>

struct st_aluno{
    char nome[100];
    int nota_final;
}alunos;

struct st_turma{
    struct st_aluno alunos[5];
}turma;


int main() {
    // insert code here...
    int i;
    for (i = 0; i < 5; i++) {
        printf("Informe o nome do aluno: ");
        fgets(turma.alunos[i].nome, 100, stdin);
        printf("Informe a nota do aluno: ");
        scanf("%d", &turma.alunos[i].nota_final);
        getchar();
    }
    
    for (i = 0; i < 5; i++) {
        if (turma.alunos[i].nota_final > 7) {
            printf("Nenhum aluno Aprovado \n");
        } else {
            printf("Nome: %s\n", turma.alunos[i].nome);
            printf("Nota Final: %d\n", turma.alunos[i].nota_final);
        }
    }
    
    return 0;
}
