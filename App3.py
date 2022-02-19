from collections import Counter

entrada = input()
count=0
contador = Counter(entrada)

for i in range(2,len(entrada)):
    lista = entrada[0:i]
    l = len(lista)
    contador["".join(sorted(lista))]+=1
    for j in range(1,len(entrada)):
        if j + l <= len(entrada):
            contador["".join(sorted(entrada[j:j+l]))]+=1
    
for k,v in contador.items():
    count += v *(v-1) // 2
    
print(count)
