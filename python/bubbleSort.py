i = 0
vec = [0, 9, 4, 1, 8, 7, 6]

for each in vec: #PARA CADA VALOR DENTRO DO VETOR:
  for i in range(0, len(vec) - 1):
    if vec[i] > vec[i+1]:
      aux = vec[i+1]
      vec[i+1] = vec[i]
      vec[i] = aux
    print("Vetor Ordenado: ", vec)
