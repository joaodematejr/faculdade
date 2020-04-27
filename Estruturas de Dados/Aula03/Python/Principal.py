MENU = 'Aula 3: Métodos de Ordenação \nEscolha uma opção \n1 – Faça um programa que leia 13 nomes definido pelo usuário, inserindo-os em um vetor e que os ordene utilizando a ideia do algoritmo da inserção. No final, o programa deve mostrar todos os nomes ordenados alfabeticamente. \n2 - Dados três vetores de 5 posições ordenados, implemente uma função que intercala e retorne o vetor resultante ordenado. Implemente uma função merge sort, que faça ordenação em um vetor utilizando a sua função de intercalação (sugestão: se baseie no algoritmo do merge-sort original).  \n3 - Considere a seguinte estrutura: typedef struct pessoa {string nome; unsigned int Matricula; float Nota; } Aluno; \n'


def renderMenu():
    opcaoMenu = int(input(MENU))
    return opcaoMenu


def funcaoOrdenacao():
    limite_maximo = 13
    posicao = 0
    nomes_lista = []
    while posicao < limite_maximo:
        nomes = input("Digite um nome para adicionar na lista ")
        posicao = posicao + 1
        nomes_lista.append(nomes)

    def ordernarAlfabeticamente(listaNomes):
        for index in range(1, len(listaNomes)):

            valorAtual = listaNomes[index]
            posicao = index

            while posicao > 0 and listaNomes[posicao-1] > valorAtual:
                listaNomes[posicao] = listaNomes[posicao-1]
                posicao = posicao-1

            listaNomes[posicao] = valorAtual

    ordernarAlfabeticamente(nomes_lista)
    print('Nome em Ordem Alfabética', nomes_lista)


def funcaoMergeSort(arr):
    if len(arr) > 1:
        mid = len(arr)//2
        L = arr[:mid]
        R = arr[mid:]

        funcaoMergeSort(L)
        funcaoMergeSort(R)

        i = j = k = 0

        while i < len(L) and j < len(R):
            if L[i] < R[j]:
                arr[k] = L[i]
                i += 1
            else:
                arr[k] = R[j]
                j += 1
            k += 1

        while i < len(L):
            arr[k] = L[i]
            i += 1
            k += 1

        while j < len(R):
            arr[k] = R[j]
            j += 1
            k += 1


def printList(arr):
    for i in range(len(arr)):
        print(arr[i], end=" ")
    print()


if renderMenu() == 1:
    funcaoOrdenacao()
elif renderMenu() == 2:
    vetor1 = ['12', '11', '13', '5', '6', '7']
    vetor2 = ['Gisele', 'Daniel', 'Joao', 'Bruna', 'Ana']
    vetor3 = [12, 11, 13, 5, 6, 7]
    print("Dada matriz i", end="\n")
    """ ARRAY 1 """
    printList(vetor1)
    funcaoMergeSort(vetor1)
    printList(vetor1)
    print(end="\n")
    """ ARRAY 2 """
    printList(vetor2)
    funcaoMergeSort(vetor2)
    printList(vetor2)
    print(end="\n")
    """ ARRAY 3 """
    printList(vetor3)
    funcaoMergeSort(vetor3)
    printList(vetor3)
    print(end="\n")
    print("A Matriz classificada é: ", end="\n")
    printList(vetor1)
    printList(vetor2)
    printList(vetor3)
elif renderMenu() == 3:
    print('NÃO ENTENDI')
else:
    print('Opção invalida escola de 1 a 3 !!!')
