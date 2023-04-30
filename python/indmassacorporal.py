altura = int(input("Entre com a sua altura: "))
massa = int(input("Entre com a sua massa: "))

imc = massa / altura**2

if imc <= 18.5:
  print("Abaixo do peso")
else:
  print("normal")