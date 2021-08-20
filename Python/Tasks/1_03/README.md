# Reto 3

El supermercado _A LA VUELTA DE LA ESQUINA_ vende los siguientes productos:

> Arroz, Lentejas, Verduras, Sal, Frijoles, Carne, Banano, Garbanzos, Masmelos, Huevos, Detergente, Esponjas, Jugos, Natilla, Ochuva, Papa, Queso.

Cuando un cliente va a la caja registradora la cajera registra en la una planilla la inicial del producto que lleva el cliente, por ejemplo:

> Masmelos, Masmelos, Arroz, Arroz, Esponjas, Detergente, Natilla, Natilla, Queso, Sal, Frijoles, Masmelos

Por lo que la cajera registra la siguiente información separadas por espacio:

```bash
M M A A E D N N Q S F M
```

Durante el proceso de registrar los productos se requiere conocer
por cada cliente la cantidad de productos que lleva del mismo tipo (producto).
Para esto el supermercado lo contrato a usted para diseñar un programa que reciba
como entrada el registro de productos que el cliente esta llevando
(Recuerde el registro se realiza con la inicial del producto separado por espacios)
y deberá imprimir dos líneas, la primera deberá ser la inicial del producto que
lleva el cliente y en la segunda línea se debe imprimir el conteo de productos
consecutivos del mismo tipo que lleva el cliente (Todos van separados por espacios en blanco).

#### Ejemplo

| ENTRADA                         | SALIDA                                  |
| ------------------------------- | --------------------------------------- |
| M M A A E D N N Q S F M         | M A E D N Q S F M<br/>2 2 1 1 2 1 1 1 1 |
| N N A A A E E N D D D S S F A A | N A E N D S F A<br/>2 3 2 1 3 2 1 2     |
