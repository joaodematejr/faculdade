# -*- coding: utf-8 -*-
import random
import time

TEXTO_INPUT_MENU = 'Aula 2: Algoritmos de Ordenação e Busca \nEscolha uma opção \n1) 1.4 - Vetor Valores INT: \n2) 2.4 - Vetor Valores CHAR: \n3) 3.4 - Vetor Valores STRING: \n'
TEXTO_INPUT_MENU_INT = '1.Vetor Valores INT: \nEscolha uma opção \n1) 1.1 Ordenação Bubble Sort - Vetor com valores Int 3.000 e 5.000 números – controle de comparações, troca e tempo execução – gerar de forma randômica: \n2) 1.2 Ordenação Bubble Sort - 1ª versão Melhorado - Vetor com valores Int 3.000 e 5.000 números – controle de comparações, troca e tempo execução – gerar de forma randômica: \n3) 1.3 Ordenação Bubble Sort - 2ª versão Melhorado - Vetor com valores Int 3.000 e 5.000 números – controle de comparações, troca e tempo execução – gerar de forma randômica: \n'
TEXTO_INPUT_MENU_CHAR = '1.Vetor Valores CHAR: \nEscolha uma opção \n1) 2.1 Ordenação Bubble Sort - Vetor com valores char 156 e 256 caracteres – controle de comparações, troca e tempo execução – gerar de forma randômica: \n2) 1.2 Ordenação Bubble Sort - 1ª versão Melhorado - Vetor com valores char 156 e 256 caracteres – controle de comparações, troca e tempo execução – gerar de forma randômica: \n3) 1.3 Ordenação Bubble Sort - 2ª versão Melhorado - Vetor com valores char 156 e 256 caracteres – controle de comparações, troca e tempo execução – gerar de forma randômica: \n'
TEXTO_INPUT_MENU_STRING = '1.Vetor Valores STRING: \nEscolha uma opção \n1) 2.1 Ordenação Bubble Sort - Vetor com valores strings 30 e 300 strings – controle de comparações, troca e tempo execução – gerar de forma randômica: \n2) 1.2 Ordenação Bubble Sort - 1ª versão Melhorado - Vetor com valores strings 30 e 300 strings – controle de comparações, troca e tempo execução – gerar de forma randômica: \n3) 1.3 Ordenação Bubble Sort - 2ª versão Melhorado - Vetor com valores strings 30 e 300 strings – controle de comparações, troca e tempo execução – gerar de forma randômica: \n'
LISTA_NUMEROS = random.sample(range(3000, 5001), 2000)
""" RENDER MENU """


def renderMenu():
    opcaoMenu = int(input(TEXTO_INPUT_MENU))
    return opcaoMenu


""" RENDER MENU INT"""


def renderMenuINT():
    opcaoMenu = int(input(TEXTO_INPUT_MENU_INT))
    return opcaoMenu


""" RENDER MENU CHAR"""


def renderMenuCHAR():
    opcaoMenu = int(input(TEXTO_INPUT_MENU_CHAR))
    return opcaoMenu


def renderMenuString():
    opcaoMenu = int(input(TEXTO_INPUT_MENU_STRING))
    return opcaoMenu


""" FUNÇÃO SORT"""


def bubbleSort(lista):
    iniciarTempoExecucao = time.time()
    contador = 0
    elementos = len(lista)-1
    ordenado = False
    while not ordenado:
        ordenado = True
        contador = contador + 1
        for i in range(elementos):
            if lista[i] > lista[i+1]:
                lista[i], lista[i + 1] = lista[i+1], lista[i]
                ordenado = False
    print(lista)
    encerraTempoExecucao = time.time()
    tempo = encerraTempoExecucao-iniciarTempoExecucao
    print("Função Bubble Sort levou {:.2f}".format(tempo), "Milissegundos")
    print("Quantidades de Vezes", contador)
    pass


""" GERAR STRING ALERTORIO"""


def randomChar(length):
    str_rd = ""
    listChar = []
    while(len(str_rd) <= length):
        str_rd += '%c' % random.randint(97, 122)
        listChar.append(str_rd)
    bubbleSortCharFuncao(listChar)
    return str_rd


def bubbleSortCharFuncao(char):
    iniciarTempoExecucao = time.time()
    contador = 0
    alpha = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
             'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x',
             'y', 'z', 'w']
    """ char = ['o', 'oq', 'oqy', 'oqyd', 'oqydz', 'oqydzi'] """
    for j in range(0, len(char)):
        for i in range(0, len(char)):
            _sorted = False
            contador = contador + 1
            if i != len(char)-1:
                for k in range(0, len(char[i])):
                    if not _sorted:
                        if k != (len(char[i]) and len(char[i+1])):
                            if alpha.index(char[i][k]) > alpha.index(char[i+1][k]):
                                char[i], char[i+1] = char[i+1], char[i]
                                _sorted = True
                            elif alpha.index(char[i][k]) < alpha.index(char[i+1][k]):
                                _sorted = True
                            else:
                                if len(char[i+1]) < len(char[i]):
                                    char[i], char[i +
                                                  1] = char[i+1], char[i]
                                    _sorted = True
        encerraTempoExecucao = time.time()
        tempo = encerraTempoExecucao-iniciarTempoExecucao
        print("Função Bubble Sort levou {:.2f}".format(tempo), "Segundos")
        print("Quantidades de Vezes", contador)
        """ print("Char", char) """


""" FUNÇÃO BUBBLE"""


def bubbleSortString():
    for n in range(29, 30):
        randomChar(n)
    for n in range(299, 300):
        randomChar(n)
    pass


def bubbleSortChar():
    for n in range(155, 156):
        randomChar(n)
    for n in range(255, 256):
        randomChar(n)
    pass


if renderMenu() == 1:
    if renderMenuINT() == 1:
        bubbleSort(LISTA_NUMEROS)
    elif renderMenuINT() == 2:
        bubbleSort(LISTA_NUMEROS)
    elif renderMenuINT() == 3:
        bubbleSort(LISTA_NUMEROS)
    else:
        print('Opção invalida !!!')
elif renderMenu() == 2:
    if renderMenuCHAR() == 1:
        bubbleSortChar()
    elif renderMenuCHAR() == 2:
        bubbleSortChar()
    elif renderMenuCHAR() == 3:
        bubbleSortChar()
    else:
        print('Opção invalida !!!')
elif renderMenu() == 3:
    if renderMenuString() == 1:
        bubbleSortString()
    elif renderMenuString() == 2:
        bubbleSortString()
    elif renderMenuString() == 3:
        bubbleSortString()
    else:
        print('Opção invalida !!!')
else:
    print("Opção invalida escola de 1 a 3 !!!")
