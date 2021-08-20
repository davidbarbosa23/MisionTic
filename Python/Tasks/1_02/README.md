# Reto 2

En un juego de azar se tienen cinco pelotas de diferente color: Amarilla, Roja, Morada, Negra, Verde; cada uno de los dos participantes escoge una pelota para cada lanzamiento que realice la urna de pelotas, los lanzamientos deben quedar registrados por cada jugador. La idea del juego es adivinar la pelota que seleccionará la urna, en caso de que un participante seleccione la correcta obtendrá un punto para su suma final.

Por ejemplo, Juan y Mateo son los concursantes de este juego, por su parte juan escoge el color de la pelota para cada ronda: Roja, Negra, Amarilla, Roja, Morada, Negra, Roja, es decir, que Juan registra sus lanzamientos así: **RNARMNA**. Mateo por su parte escoge el color de la pelota para cada ronda: Morada, Verde, Amarilla, Roja, Verde, Roja, Negra y registra sus lanzamientos: **MVARVNR**. En el juego cada lanzamiento obtuvo el siguiente registro de pelotas:

| Lanzamiento | Color    |
| ----------- | -------- |
| 1           | Morada   |
| 2           | Negra    |
| 3           | Amarilla |
| 4           | Roja     |
| 5           | Verde    |
| 6           | Negra    |
| 7           | Roja     |

Por lo tanto, la urna de pelotas registro los lanzamientos al finalizar el juego: **VNMAVNR**.

Construir un programa para la urna de pelotas el cual debe codificar el estado del juego dependiendo si el jugador 1 lleva mas puntos que el jugador 2 debe imprimir la letra C. Si el jugador 2 lleva mas puntos que el jugador 1 debe imprimir la letra E y si llevan los mismos puntos debe imprimir la letra T. Para el ejemplo dado de Juan y Mateo el programa deberá codificar lo siguiente: **ETTTETC**

| URNA     | JUAN | MATEO | SALIDA |
| -------- | ---- | ----- | ------ |
| Morada   | 0    | 1     | E      |
| Negra    | 1    | 1     | T      |
| Amarilla | 2    | 2     | T      |
| Roja     | 3    | 3     | T      |
| Verde    | 3    | 4     | E      |
| Negra    | 4    | 4     | T      |
| Roja     | 5    | 4     | C      |

#### Entrada

Tres cadenas de texto

#### Salida

Una cadena de texto

#### Ejemplo

| ENTRADA | SALIDA  |
| ------- | ------- |
| ARMAVNM |         |
| VMARNVR |         |
| AMRAVNR | CTTCCCC |
