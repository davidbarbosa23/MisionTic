def tipo_ropa(tipos=[]):
    tipos_unicos = []
    for tipo in tipos:
        if tipo not in tipos_unicos:
            tipos_unicos.append(tipo)
    return tipos_unicos


def ropa_faltante(codigos, tipos, tipo):
    faltantes = []
    for codigo in codigos:
        if tipos[codigo] == tipo:
            faltantes.append(codigo)
    return faltantes


def novendo(competencia=[], empresa=[]):
    interes = []
    for item in competencia:
        if item not in empresa:
            interes.append(item)
    return interes


def cambio_socios(empresa1=[], empresa2=[]):
    interes1 = len(novendo(empresa1, empresa2))
    interes2 = len(novendo(empresa2, empresa1))
    return interes1 if interes1 < interes2 else interes2


"""
Una empresa de moda requiere mejorar su manejo de inventarios de la ropa que vende, para lo cual lo contrata a usted con el fin de realizar dicho proceso. Para ello se debe crear una librería llamada siemprebellas que contenga las siguientes funciones:

1.(Vale 1) La función “tipo_ropa” que dada una lista de los tipos de ropa que vende (cada posición i de la lista es la categoría del elemento i), genera una lista con las categorías únicas existentes (sin repetición). Por ejemplo, si se recibe una lista como la siguiente:

[deportiva, lencería, informal, sport, casual, deportiva, informal, alta-costura, vestidos, formal, elegante, sport]

Debe devolver la lista: [deportiva, lencería, informal, sport, casual, alta-costura, vestidos, formal, elegante]

2. (Vale 1) También se debe implementar una función llamada “ropa_faltante” con los siguientes datos de entrada:  una lista con los números de códigos de los productos que no tienen en el local; la lista de las clases de cada producto; y una clase de producto. La función debe retornar una lista con los números de dicha clase que hacen falta en la empresa de moda.

Por ejemplo, si se ejecuta la función:  ropa_faltante ([1,2,6,8[deportiva, lencería, informal, sport, casual, deportiva, informal, alta-costura, vestidos, formal, elegante, sport], informal)

La función debe retornar la lista: [2, 6]

Nótese que los códigos de los productos empiezan en cero (0) y van hasta el nueve (15)

3. (Vale 1) hacer una función llamada “novendo” que recibe: una lista con los códigos de productos que se venden en una empresa de moda de la competencia; y una lista con los productos que se venden en la empresa de moda Siempre Bellas. La función devuelve otra lista con los productos de la empresa de moda de la competencia que le interesarían vender Siempre Bellas.

Por ejemplo, si se ejecuta la función: novendo ([3,5,7,10,15,16], [4,10,5,8])

Se debe retornar la lista: [3,7,15,16]

4. (Vale 1) Siempre Bellas se ha hecho socia de SurtiRopa, por lo cual desean intercambiar entre ellos productos que no tengan para la venta en Siempre Bellas, pero que si estén a la venta en SurtiRopa.

Crear otra función llamada “cambio_socios”, que reciba dos listas, una con los códigos de los productos que se venden en SurtiRopa y otra lista con la lista de los productos que vende en Siempre Bellas, la función debe retornar la cantidad de los productos que se pueden intercambiar.

Por ejemplo, al ejecutar la función cambio_socios ([3,5,7,10,15,16], [4,10,5,8])

Se debe retornar 2 porque SurtiRopa le interesa los productos [4,8], mientras que a Siempre Bellas le interesa cuatro productos [3,7,15,16]. En este caso solo se puede intercambiar 2 productos.

Entrada:

Este programa no requiere entrada. Ni generará salida. Se requiere que el estudiante genere un archivo con el nombre restaurante.py y que se respeten los nombres de las funciones dadas y sus parámetros.
"""
