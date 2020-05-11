data = []
posicao = 0
limite_maximo = 2

while posicao < limite_maximo:
    nome = input("Digite o nome do funcionario : ")
    salario = int(input("Digite o salario do funcionario : "))
    data.append([nome,  salario])
    posicao = posicao + 1


for a in data:
    print(a)


""" numerosOrdenados = sorted(numeros, reverse=True)  """
