# -*- coding: utf-8 -*-
import random
import time

TEXTO_INPUT_MENU = 'Aula 2: Algoritmos de Ordenação e Busca \nEscolha uma opção \n1) 1.4 - Vetor Valores INT: \n2) 2.4 - Vetor Valores CHAR: \n3) 3.4 - Vetor Valores STRING: \n'
TEXTO_INPUT_MENU_INT = '1.Vetor Valores INT: \nEscolha uma opção \n1) 1.1 Ordenação Bubble Sort - Vetor com valores Int 3.000 e 5.000 números – controle de comparações, troca e tempo execução – gerar de forma randômica: \n2) 1.2 Ordenação Bubble Sort - 1ª versão Melhorado - Vetor com valores Int 3.000 e 5.000 números – controle de comparações, troca e tempo execução – gerar de forma randômica: \n3) 1.3 Ordenação Bubble Sort - 2ª versão Melhorado - Vetor com valores Int 3.000 e 5.000 números – controle de comparações, troca e tempo execução – gerar de forma randômica: \n'
LISTA_NUMEROS = random.sample(range(3000, 5001), 2000)
""" RENDER MENU """


def renderMenu():
    opcaoMenu = int(input(TEXTO_INPUT_MENU))
    return opcaoMenu


""" RENDER MENU INT"""


def renderMenuINT():
    opcaoMenu = int(input(TEXTO_INPUT_MENU_INT))
    return opcaoMenu


def bubbleSort():
    iniciarTempoExecucao = time.time()
    elementos = len(LISTA_NUMEROS)-1
    ordenado = False
    while not ordenado:
        ordenado = True
        for i in range(elementos):
            if LISTA_NUMEROS[i] > LISTA_NUMEROS[i+1]:
                LISTA_NUMEROS[i], LISTA_NUMEROS[i +
                                                1] = LISTA_NUMEROS[i+1], LISTA_NUMEROS[i]
                ordenado = False
    print(LISTA_NUMEROS)
    encerraTempoExecucao = time.time()
    print("Função Bubble Sort levou {:.2f}".format(
        encerraTempoExecucao-iniciarTempoExecucao), "Milissegundos")
    pass


if renderMenu() == 1:
    if renderMenuINT() == 1:
        bubbleSort()
    elif renderMenu() == 2:
        bubbleSort()
    elif renderMenu() == 3:
        bubbleSort()
    else:
        print('Opção invalida !!!')
elif renderMenu() == 2:
    print("Opção invalida")
elif renderMenu() == 3:
    print("Opção invalida")
else:
    print("Opção invalida escola de 1 a 3 !!!")
