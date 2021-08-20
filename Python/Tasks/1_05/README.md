# Reto 5

Una empresa de moda requiere mejorar su manejo de inventarios de la ropa que vende, para lo cual lo contrata a usted con el fin de realizar dicho proceso. Para ello se debe crear una librería llamada siemprebellas que contenga las siguientes funciones:

### 1. `tipo_ropa`

La función `tipo_ropa` que dada una lista de los tipos de ropa que vende (cada posición i de la lista es la categoría del elemento i), genera una lista con las categorías únicas existentes (sin repetición). Por ejemplo, si se recibe una lista como la siguiente:

```python
["deportiva", "lencería", "informal", "sport", "casual", "deportiva", "informal", "alta-costura", "vestidos", "formal", "elegante", "sport"];
```

Debe devolver la lista

```python
["deportiva", "lencería", "informal", "sport", "casual", "alta-costura", "vestidos", "formal", "elegante"];
```

### 2. `ropa_faltante`

También se debe implementar una función llamada `ropa_faltante` con los siguientes datos de entrada: una lista con los números de códigos de los productos que no tienen en el local; la lista de las clases de cada producto; y una clase de producto. La función debe retornar una lista con los números de dicha clase que hacen falta en la empresa de moda.

Por ejemplo, si se ejecuta la función

```python
ropa_faltante([1, 2, 6, 8], ["deportiva", "lencería", "informal", "sport", "casual", "deportiva", "informal", "alta-costura", "vestidos", "formal", "elegante", "sport"], "informal");
```

La función debe retornar la lista

```python
[2, 6]
```

Nótese que los códigos de los productos empiezan en `0` y van hasta el `12`

### 3. `novendo`

hacer una función llamada `novendo` que recibe una lista con los códigos de productos que se venden en una empresa de moda de la competencia; y una lista con los productos que se venden en la empresa de moda _Siempre Bellas_. La función devuelve otra lista con los productos de la empresa de moda de la competencia que le interesarían vender _Siempre Bellas_.

Por ejemplo, si se ejecuta la función

```python
novendo([3, 5, 7, 10, 15, 16], [4, 10, 5, 8])
```

Se debe retornar la lista

```python
[3, 7, 15, 16]
```

### 4. `cambio_socios`

_Siempre Bellas_ se ha hecho socia de _SurtiRopa_, por lo cual desean intercambiar entre ellos productos que no tengan para la venta en _Siempre Bellas_, pero que si estén a la venta en _SurtiRopa_.

Crear otra función llamada `cambio_socios`, que reciba dos listas, una con los códigos de los productos que se venden en _SurtiRopa_ y otra lista con la lista de los productos que vende en _Siempre Bellas_, la función debe retornar la cantidad de los productos que se pueden intercambiar.

Por ejemplo, al ejecutar la función

```python
cambio_socios([3, 5, 7, 10, 15, 16], [4, 10, 5, 8])
```

Se debe retornar `2` porque _SurtiRopa_ le interesa los productos `[4, 8]`, mientras que a _Siempre Bellas_ le interesa cuatro productos `[3, 7, 15, 16]`. En este caso solo se puede intercambiar `2` productos.

#### Entrada

Este programa no requiere entrada. Ni generará salida. Se requiere que el estudiante genere un archivo con el nombre `restaurante.py` y que se respeten los nombres de las funciones dadas y sus parámetros.
