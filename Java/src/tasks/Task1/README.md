# Reto 1: Empacadora de tornillos, puntillas y tachuelas.

Una máquina empacadora automática necesita determinar el tamaño de la bolsa en la que debe empaquetar el grupo de suministros de ferretería que sigue en la banda, para esto necesita determinar el número de cada tipo de suministro. Sin embargo, por restricciones tecnológicas la máquina solo puede contar uno de los tipos de suministros, las puntillas.

En este punto lo contratan a ud para escribir un programa que le ayude a la máquina a decidir el tipo de bolsa que usará dado el número de puntillas del grupo. La compañía le informa que los grupos están compuestos de 3 tipos de suministros (tornillos, puntillas y tachuelas), luego le explican que las tachuelas de un grupo son 2 veces el número de puntillas con 4 agregadas al final y los tornillos son un quinto de la suma del número de las puntillas y las tachuelas (usando solo la parte entera del resultado de la división).

La máquina dispone de 4 tamaños de paquetes. La compañía mide la capacidad de los paquetes en tornillos por grupo y los empaca en un paquete de tamaño “uno” si hay entre 0 y 20 tornillos, tamaño “dos” si hay entre 21 y 30, tamaño “tres” si hay entre 31 y 50 tornillos y tamaño “cuatro” sí hay más de 50 tornillos.

Las últimas especificaciones dicen que su programa debe recibir el número de puntillas del grupo y realizar los cálculos correspondientes para imprimir el número de puntillas, tachuelas y tornillos en una línea, además del tamaño del paquete en la línea siguiente en texto.

En el ejemplo la máquina detectó 25 puntillas con el sensor.

La librería mi ávido lector quiere una aplicación para mantener un inventario de las publicaciones disponibles. Todas las publicaciones tienen como atributos nombre, páginas y tipo.

Estas publicaciones se dividen en dos tipos, Libros y Revistas. De los libros se guarda el autor y de las revistas se guarda el número de publicación.

Considere la especificación del siguiente diagrama de clases para este reto:

| Entrada | Salida   |
| ------- | -------- |
| 25      | 25 54 15 <br />uno |
