# -*- coding: utf-8 -*-
def renderMenu():
    opcaoMenu = int(
        input('Programa para Ordenação de Vetores \nEscolha uma opção \n1 - Ordenação de Vetor com valores Int \n2 - Ordenação de Vetor com valores char \n3 - Ordenação de Vetor com valores Nomes \n'))
    return opcaoMenu


def renderOpcaoOrdenacao():
    opcaoOrdenacao = int(
        input('Exibir em \n1 - Decrescente \n2 - Crescente \n'))
    return opcaoOrdenacao


def renderVetorInt(modoExibicao):
    numeros = [13, 8, 9, 1, 10, 4, 6, 9, 3, 10, 7, 11, 2, 12, 5]
    numerosOrdenados = sorted(numeros, reverse=modoExibicao)  # DECRESCENTE
    """ RESULTADO - VETOR ORIGINAL """
    print('Original:', numeros)
    """ //RESULTADO - VETOR ORDENADO """
    print('Ordenada', numerosOrdenados)
    return


def renderVetorChar(modoExibicao):
    letras = ["C", "J", "D", "B", "G", "H", "E", "A", "F", "I"]
    letrasOrdenados = sorted(letras, reverse=modoExibicao)  # DECRESCENTE
    """ RESULTADO - VETOR ORIGINAL """
    print('Original:', letras)
    """ //RESULTADO - VETOR ORDENADO """
    print('Ordenada', letrasOrdenados)
    return


def renderVetorNomes(modoExibicao):
    nomes = ["Ana", "Joao", "Daniel", "Bruna", "Guilherme",
             "Helena", "Eduarda", "Aline", "Felipe", "Ian", "Maria"]
    nomesOrdenados = sorted(nomes, reverse=modoExibicao)  # DECRESCENTE
    """ RESULTADO - VETOR ORIGINAL """
    print('Original:', nomes)
    """ //RESULTADO - VETOR ORDENADO """
    print('Ordenada', nomesOrdenados)
    return


if renderMenu() == 1:
    if renderOpcaoOrdenacao() == 1:
        renderVetorInt(False)
    elif renderOpcaoOrdenacao() == 2:
        renderVetorInt(True)
    else:
        print("Opção invalida")
elif renderMenu() == 2:
    if renderOpcaoOrdenacao() == 1:
        renderVetorChar(False)
    elif renderOpcaoOrdenacao() == 2:
        renderVetorChar(True)
    else:
        print("Opção invalida")
elif renderMenu() == 3:
    if renderOpcaoOrdenacao() == 1:
        renderVetorNomes(False)
    elif renderOpcaoOrdenacao() == 2:
        renderVetorNomes(True)
    else:
        print("Opção invalida")
else:
    print("Erro no sistema entre em contato com desenvolvedor")
