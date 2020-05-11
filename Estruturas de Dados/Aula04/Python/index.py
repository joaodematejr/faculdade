codigo_produto = []
preco_produto = []
preco_produto_desconto = []
quantidade_estoque = []
posicao = 0
limite_maximo = 5

while posicao < limite_maximo:
    codigo = int(input("Digite o codigo do produto : "))
    preco = int(input("Digite o preco do produto : "))
    quantidade = int(input("Digite a quantidade de produto em estoque : "))
    posicao = posicao + 1
    codigo_produto.append(codigo)
    preco_produto.append(preco)
    quantidade_estoque.append(quantidade)


def exibir_tela(titulo, lista):
    for q in lista:
        print(titulo, q)


for preco in preco_produto:
    porcetagem = int(input("Digite a porcetagem a aplicar na lista : "))
    formula = porcetagem * preco
    resultado = formula / 100
    preco_produto_desconto.append(resultado)
    for qe in quantidade_estoque:
        if qe > 500:
            exibir_tela('Quantidade em Estoque', quantidade_estoque)
            exibir_tela('Codigo do produto', codigo_produto)
            exibir_tela('Preço com Desconto', preco_produto_desconto)
        pass
    pass
