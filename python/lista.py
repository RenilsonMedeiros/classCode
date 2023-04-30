Personagens = {
  "nomes": ['Renilson', 'Jorge', 'Lucas'],
  "cores": ['Branco', 'Moreno', 'Pardo'],
  "poder": ['Velocidade', 'Armas', 'Som'],
  "packs": {
    "Cowboy": ['Renilson', 'Branco', 'Armas'],
    "Musico": ['Jorge', 'Moreno', 'Som'],
    "Jogador": ['Lucas', 'Pardo', 'Velocidade']
  }
}



print("Nomes dos personagens:", Personagens["nomes"])
print("Cores dos Personagens:", Personagens["cores"])
print("Poder dos Personagens:", Personagens["poder"])

nome = input("Informe o nome do Personagem: ")
cor = input("Informe a cor do Personagem: ")
poder = input("Informe o poder do Personagem: ")

if nome not in Personagens['nomes']: print("Nome Inválido")
elif cor not in Personagens['cor']: print("Cor Inválida")
elif poder not in Personagens['poder']: print("Poder Inválido")
else:
  personagemUsuario = [nome, cor, poder]
  print("Seu Personagem é: ", personagemUsuario)















# lista = ['maçã', 'pera', 4, 6.95, False]
# tupla = ('cadeira', 'mouse', 'teclado')
# print(tupla)

# lista[2] = 'teclado mecanico' 
# print(lista)

# dicionario = {
#   'TI':'Tecnologia da informação', 
#   'EM':'Engenaria Mecânica',
#   'cursos':['TI', 'EM', 'EL', 'MT'],
#   'frutas':{'a':'abacate', 'b':'banana'}
# }

# print(dicionario)