def market(data):
    items = data.split(" ")
    items.append('')
    products = []
    counter = []

    active_item = ""
    count = 1

    for key, item in enumerate(items):
        if active_item == item and key + 1 != len(items):
            count += 1
        elif active_item:
            products.append(active_item)
            counter.append(count)
            count = 1

        active_item = item

    print(' '.join(map(str, products)))
    print(' '.join(map(str, counter)))


market(input())

"""
El supermercado A LA VUELTA DE LA ESQUINA vende los siguientes productos: 
Arroz, Lentejas, Verduras, Sal, Frijoles, Carne, Banano, Garbanzos, Masmelos, 
Huevos, Detergente, Esponjas, Jugos, Natilla, Ochuva, Papa, Queso. 
Cuando un cliente va a la caja registradora la cajera registra 
en la una planilla la inicial del producto que lleva el cliente, por ejemplo:

Los productos del cliente X son los siguientes: 
Masmelos, Masmelos, Arroz, Arroz, Esponjas, Detergente, Natilla, Natilla, Queso, Sal, Frijoles, Masmelos 
por lo que la cajera registra la siguiente información separadas por espacio: M M A A E D N N Q S F M.

Durante el proceso de registrar los productos se requiere conocer 
por cada cliente la cantidad de productos que lleva del mismo tipo (producto). 
Para esto el supermercado lo contrato a usted para diseñar un programa que reciba 
como entrada el registro de productos que el cliente esta llevando 
(Recuerde el registro se realiza con la inicial del producto separado por espacios) 
y deberá imprimir dos líneas, la primera deberá ser la inicial del producto que 
lleva el cliente y en la segunda línea se debe imprimir el conteo de productos 
consecutivos del mismo tipo que lleva el cliente (Todos van separados por espacios en blanco).

EJEMPLOS:

ENTRADA                          |  SALIDA
---------------------------------┼---------------------
M M A A E D N N Q S F M          |  M A E D N Q S F M
                                 |  2 2 1 1 2 1 1 1 1
---------------------------------┼---------------------
N N A A A E E N D D D S S F A A  |  N A E N D S F A
                                 |  2 3 2 1 3 2 1 2 



Test 1: 0
--- Input ---
I I S S S P P P P P P P F F F F F I S S S E P P P P
--- Expected output (text)---
I S P F I S E P
2 3 7 5 1 3 1 4

Test 2: 1
--- Input ---
S S S S S S S I I I I F F S S S S S S S F F F F F P P S
--- Expected output (text)---
S I F S F P S
7 4 2 7 5 2 1

Test 3: 2
--- Input ---
P S S S S S E P P S S S P P P P P P P
--- Expected output (text)---
P S E P S P
1 5 1 2 3 7

Test 4: 3
--- Input ---
P S S P P P P S S S S S S E E E E I I I E E E E E I I I I
--- Expected output (text)---
P S P S E I E I
1 2 4 6 4 3 5 4

Test 5: 4
--- Input ---
S F F F F F P P P F F F S S P P P P P S S F
--- Expected output (text)---
S F P F S P S F
1 5 3 3 2 5 2 1

Test 6: 5
--- Input ---
E I F E E E P P P P F F P P P E E E E I I
--- Expected output (text)---
E I F E P F P E I
1 1 1 3 4 2 3 4 2

Test 7: 6
--- Input ---
E E P P P S S S S S P P P P E E E E I I P P P P S S S S F F
--- Expected output (text)---
E P S P E I P S F
2 3 5 4 4 2 4 4 2

Test 8: 7
--- Input ---
S P P I I I I E E E F F F P P P P P E E E E F F
--- Expected output (text)---
S P I E F P E F
1 2 4 3 3 5 4 2

Test 9: 8
--- Input ---
F F F F S S E E S S S P P P P E E E S S S I P P
--- Expected output (text)---
F S E S P E S I P
4 2 2 3 4 3 3 1 2

Test 10: 9
--- Input ---
P P P P P P P P P I I I F F F F E E F F P P P P F F F F E E
--- Expected output (text)---
P I F E F P F E
9 3 4 2 2 4 4 2

Test 11: 10
--- Input ---
F F I E E S S I I I I S S F F E E E E P P P
--- Expected output (text)---
F I E S I S F E P
2 1 2 2 4 2 2 4 3

Test 12: 11
--- Input ---
S S S S F F F F P F F S S P P P S S S I I I I I F
--- Expected output (text)---
S F P F S P S I F
4 4 1 2 2 3 3 5 1

Test 13: 12
--- Input ---
P P F F F F I F F F F F F F F F F F P P F F F S S S S S
--- Expected output (text)---
P F I F P F S
2 4 1 11 2 3 5

Test 14: 13
--- Input ---
F F P P P P S S S S P P P P P P P P P E F F F F E E E E
--- Expected output (text)---
F P S P E F E
2 4 4 9 1 4 4

Test 15: 14
--- Input ---
S E E E E S S E F F F F E E E E P P P S S S S F F
--- Expected output (text)---
S E S E F E P S F
1 4 2 1 4 4 3 4 2

Test 16: 15
--- Input ---
P P P P P P P P I I I E E E E P E E F F F F
--- Expected output (text)---
P I E P E F
8 3 4 1 2 4

Test 17: 16
--- Input ---
F F F E E E I S S S S I P P P P P P P E E P P P P
--- Expected output (text)---
F E I S I P E P
3 3 1 4 1 7 2 4

Test 18: 17
--- Input ---
S S S S S S S E E E F F F E E S P P P P P P P P F F F P P P
--- Expected output (text)---
S E F E S P F P
7 3 3 2 1 8 3 3

Test 19: 18
--- Input ---
S S P P P E E F F F F P P P P P S E E E E P S S
--- Expected output (text)---
S P E F P S E P S
2 3 2 4 5 1 4 1 2

Test 20: 19
--- Input ---
F F F F P P E E E E E E S S S F F F F S E E S S S S F F F F
--- Expected output (text)---
F P E S F S E S F
4 2 6 3 4 1 2 4 4
"""
