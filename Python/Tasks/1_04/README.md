# Reto 4

La familia Álvarez ha decidido realizar un viaje de fin de año, para esto ha realizado una lista de los elementos o productos que necesitan para dicho viaje (los elementos se encuentran separados por espacios); han decidido emprender la búsqueda de las cosas necesarias en las tiendas de un centro comercial, la tienda enviara un archivo JSON con los productos que tienen disponibles para la compra y el precio de cada uno de ellos, a través del correo electrónico.

Se debe crear un programa que reciba el JSON que contiene los elementos o productos disponibles en la tienda junto con los precios de cada uno de ellos. Se debe utilizar la lista de cosas o materiales realizada por la familia Álvarez y compararla con el archivo ingresado con el fin de saber que elementos o productos tiene disponible la tienda que la familia necesite, cada vez que se encuentre un producto que se necesita, deberá almacenarlo a la lista de pedido que se le realizará a la tienda.

Para conocer el valor total de la compra se debe sumar el valor del elemento o producto que se necesita y que esté disponible al pago total de la familia a la tienda.

La salida del programa deberá ser el valor total de la compra a la tienda y la lista de pedido de los elementos o productos que se pudieron comprar allí.

#### Entrada

En la primera línea, un JSON de los elementos o productos disponibles de la tienda con su respectivo precio. En la segunda línea, la lista de los elementos separados por un espacio, que requiere la familia Álvarez.

#### Salida

En la primera línea, el precio total de los productos comprados a la tienda. En la segunda línea, la lista de elementos o productos que se compraron.

#### Ejemplo

| Entrada                                                                                                                                                                                                                                                                                                                                               | Salida                                                             |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------ |
| {"vestido": 107520, "bloqueador": 54000, "toalla": 32500, "sandalias": 21500, "sombrero": 21400, "gafas": 22300, "bronceador": 32000, "medias": 5000, "chaqueta": 120000, "blusa": 30800, "falda": 34000, "shampoo": 22500, "repelente": 11500, "pantalón": 51400, "aretes": 5230, "pava": 35000, "baletas": 50000, "saco": 230000, "maleta": 350000} |                                                                    |
| Bloqueador pava crema de peinar gafas morral bolsas maleta sandalias removedor carne plátanos arepas papas asador cobijas vestido.                                                                                                                                                                                                                    | 590320<br/> Bloqueador pava gafas maleta sandalias vestido de baño |
