Algoritmo "maior_numero"

Var
 numero1, numero2, numero3, maior : inteiro

Inicio
Escreval("Qual o 1� numero?")
leia(numero1)
Escreval("Qual o 2� numero?")
leia(numero2)
Escreval("Qual o 3� numero?")
leia(numero3)
se (numero1 > numero2) entao
maior <- numero1
senao
maior <- numero2
fimse
se (maior < numero3) entao
maior <- numero3
fimse
escreva ("M�ximo: ",maior)
Fimalgoritmo