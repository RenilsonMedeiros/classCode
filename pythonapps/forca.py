import random as rd

palavras = ["PAPAGAIO", "NETCOM", "CASA", "CELERON"]

acertos = 0
erros = 0
letrasJaDitas = []

palavra = rd.choice(palavras)

jogo = 'on'

def testarSeTerminou(acertos, erros, palavra):
  if acertos == len(palavra):
    print("O usuário ganhou!")
    print("A palavra era: ", palavra)
    return 'off'
  elif erros == 6:
    print("O usuário perdeu!")
    print("A palavra era: ", palavra)
    return 'off'
  else: return 'on'

while(jogo == 'on'):
  letra = input("Informe uma letra: ").upper()

  if len(letra) == 1 and letra not in letrasJaDitas:
    if letra in palavra:
      acertos = acertos + palavra.count(letra)
    else: 
      erros+=1

    letrasJaDitas.append(letra)
    jogo = testarSeTerminou(acertos, erros, palavra)
  else:
    print("Palavras não são aceitas ou letra ja foi dita!")