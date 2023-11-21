# codigos
arquivo de estudos e trinamento 

  #enumerate,list comprehension, map,reduce,zip,filter
  #list comprehension
  x=[1,2,3,4,5]
  y=[]
  for i in x:
    #print(i*i)
    y.append(i**2)
    print(x)
    print(y)
  x=[1,2,3,4,5]
  y=[i**2 for i in x]
  z=[i for i in x if i%2==1]
  print(y)
  print(x)
  print(z)
#usando list comprehension 


lista=["abacate","cachorro","bola"]

for i in range(len(lista)):
  print(i ,lista[i])

#usando enumerate
for i, nome in enumerate(lista):
  print(i,nome)
  #map

  def dobro(x):
    return x*2
  valor = [1,2,3,4,5,6]

  valor_dobrado= map(dobro, valor)
  for v in valor_dobrado:
    print(v)

    valor_dobrado=list(valor_dobrado)
    print(valor_dobrado)


    from functools import reduce
def soma(x,y):
  return x+y
lista=[1,2,3,25,38,60]
soma=reduce(soma,lista)
print(soma)

#fnçao zip
lista1=[1,2,3,4,5,]
lista2=["abacate", "bola", "cachorro", "dinheiro", "elefante"]
lista3=['R$5,00','R$20,00',"não tem preço","não tem preço","não tem preço"]
for numero,nome,valor in zip(lista1,lista2, lista3):
  print(numero,nome, valor) 

x=[1,2,3]
y=[i for i in x if i%2==0]
print(y)
