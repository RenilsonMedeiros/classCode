import math as mt
const = 4.730041
E = 205e9
A = 0.03
I = 2.25e-4
l = 2
p = 7830

wn = (const**2)*((E*I)/(p*A*l**4))**(0.5)
print(wn/(2*mt.pi))