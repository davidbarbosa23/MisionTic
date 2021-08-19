# Reto 3: Balanceando bodegas

El director de inventarios de la "ferretería mi casita" tiene varias bodegas en las cuales almacena los productos que se venden en cajas. Con el fin de facilitar el despacho de productos a diferentes tiendas quiere mantener de todos los tipos en todas las bodegas. El director se asesoró con una consultora, ésta le sugirió que encargara una clase llamada *Bodega* con varias funciones que le faciliten obtener la información necesaria para mover sus productos. 

Para la evaluación de este reto, la creación de la clase de forma que se pueda importar e instanciar en otro programa vale 1 punto. Adicionalmente, cada uno de los 4 métodos vale 1 punto para una nota máxima de 5 puntos. Los métodos que se requieren se detallan a continuación:

## 1. tipos_almacenados
Las bodegas almacenan una lista de los tipos de cada una de sus cajas de mercancía. Esta función debe recibir dicha lista y retornar una lista de los tipos *diferentes* de mercancía disponibles en dicha bodega.
### Ejemplo
```js
tipos_almacenados(["tornillos", "pisos", "tuercas", "tornillos", "pisos", "pisos"])
```
Retorna la lista `["tornillos", "pisos", "tuercas"]`

## 2. filtrar_por_tipo
Es un método que, recibe 3 parámetros, el primero una lista de índices que identifican cajas en la segunda lista, el segundo una lista de los tipos de todas las cajas de la bodega, y el tercero un tipo del cual se quiere buscar la mercancía. Esta función retorna una lista con los índices de la primera lista cuyo tipo corresponde al tipo buscado.
### Ejemplo
```js
filtrar_por_tipo([0, 1, 2, 4], ["tornillos", "pisos", "tuercas", "tornillos", "pisos", "pisos"], "tornillos")
```
Retorna  la lista `[0, 2]`. 

Nótese que la clase será usada por otro programa, así que por sugerencia de la consultora se usarán los índices empezando en cero.

## 3. comparar_inventarios
Otra operación común es comparar los productos disponibles entre bodegas, este método recibe dos listas de `String` (códigos internos de productos) y retorna una lista con los productos que están en la primera lista o bodega y no en la segunda bodega.
### Ejemplo
```js
comparar_inventario(["12", "35", "54", "18", "25", "12", "23"], ["45", "12", "25","18","35"])
```
Retorna la lista `["54", "23"]`. 

Los códigos en la lista de retorno deben mantener el tipo de dato String.

## 4. reubicables
Una función que recibe dos listas de códigos de productos repetidos en dos bodegas y retorna la cantidad de productos que se pueden reubicar entre bodegas sin afectar la cantidad de cajas en ellas.
### Ejemplo
```js
reubicables([ "2", "3", "5", "8", "15", "23"], [ "2", "5", "7", "9", "23", "40", "53"])
```
Retorna `3`. 

Dado que de la primera bodega se pueden enviar los productos `["3","8","15"]` que no están en la segunda bodega. 

Por su parte, la segunda bodega puede enviar los productos `["7", "9", "40", "53"]`. 

Sin embargo, no enviará la caja del cuarto producto sin recibir una a cambio.

# Consideraciones adicionales
Para la evaluación de este reto no necesita recibir entrada ni imprimir nada en pantalla. Se deben definir los métodos correctamente (respetando los nombres del enunciado) en un archivo llamado `Bodega.java` (No requiere un método "main"). Deben asegurarse de que este es el nombre de su archivo en la plataforma de moodle.