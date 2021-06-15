def second(muscle_mass):
    # El reto plantea una resta no suma, sin embargo los tests fallan al usar resta
    return muscle_mass * 2 + 4


def third(muscle_mass, second_test):
    return (muscle_mass + second_test) // 5


def category(third):
    if third < 20:
        return "uno"
    elif third < 30:
        return "dos"
    elif third < 50:
        return "tres"
    else:
        return "cuatro"


muscle_mass = int(input("Masa muscular: "))
second_test = second(muscle_mass)
third_test = third(muscle_mass, second_test)

print(f"{muscle_mass} {second_test} {third_test}")
print(f"{category(third_test)}")


"""
El campeonato regional de Feerplay tiene la posibilidad de que el concursante participe en diferentes categorías organizadas de la siguiente manera: categoría uno, categoría dos, categoría tres y categoría cuatro. Dentro de la academia que prepara a las personas para este campeonato, se debe realizar un proceso de asignación con los mejores competidores para cada una de las categorías, para ello se ha destinado un concurso que categorizará en los 4 grupos a cada una de las personas interesadas en participar en dicho campeonato.

Durante el proceso, el concursante pasará por tres etapas que ponen a prueba cada una de las habilidades para el campeonato regional. Cada fase que se cumpla satisfactoriamente tendrá un puntaje que será llevado a la cuenta de cada concursante y que permitirá al finalizar dar la categoría en la cual participara.

El puntaje de cada fase será obtenido de la siguiente manera:

·         En la primera prueba se medirá la masa muscular del competidor que es un factor importante y clave para seleccionar y participar en cada una de las categorías. Esta masa muscular será el puntaje obtenido en esta prueba. Esta masa se tomará solo la parte entera. El puntaje de la primera prueba será almacenado en P

·         El puntaje obtenido en la segunda prueba (H) estará dado por la siguiente información:

el doble del puntaje obtenido en la primera prueba (P) es igual al puntaje obtenido de la segunda prueba menos cuatro

·         La tercera prueba tendrá un puntaje (L) dado de la siguiente manera: cinco veces el puntaje de la tercera prueba será igual a la suma de los puntajes obtenidos en la primera (P) y segunda prueba (H).

La categoría del concursante estará dada por el puntaje obtenido al finalizar la tercera prueba; si su puntaje obtenido esta entre 0 y 20 puntos deberá concursar en la categoría número uno, si su puntaje se encuentra entre 21 y 30 puntos deberá participar en la categoría dos, en caso de que el puntaje obtenido este entre 31 y 50 su categoría será tres y finalmente si su puntaje es mayor a 51 participará en la categoría cuatro.

Elabora un programa que permita conocer los puntajes obtenidos por cada participante, así como su categoría para concursar en el campeonato regional de Feerplay. Al finalizar el programa se debe imprimir cada puntaje y seguidamente su categoría. 


ENTRADA

La entrada será el puntaje obtenido en la primera prueba.

SALIDA

Tres enteros que equivalen a los puntajes obtenidos en la primera, segunda y tercera prueba. Además, se debe imprimir en la siguiente línea la categoría en la cual se participará.


Ejemplo:

ENTRADA  |  SALIDA
---------┼-----------
29       |  29 62 18
         |  dos

"""
