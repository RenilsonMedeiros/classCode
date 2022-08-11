def validarPersonagem(nome, cor, poder, Personagens):
  if nome not in Personagens['nomes']: print("Nome Inválido")
  elif cor not in Personagens['cores']: print("Cor Inválida")
  elif poder not in Personagens['poder']: print("Poder Inválido")
  else: return True


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

if validarPersonagem(nome, cor, poder, Personagens) != True:
  print("ERRO")
else: 
  personagemUsuario = [nome, cor, poder]
  print("Seu Personagem é: ", personagemUsuario)