first_player = input()
second_player = input()
game = input()


def score(first, second):
    if first > second:
        return 'C'
    elif first < second:
        return 'E'
    else:
        return 'T'


def lucky_game():
    points_first_player = 0
    points_second_player = 0
    result = []

    for str in game:
        if str in first_player:
            points_first_player += 1
        if str in second_player:
            points_second_player += 1

        result.append(score(points_first_player, points_second_player))

    return result


print(''.join(map(str, lucky_game())))


"""
En un juego de azar se tienen cinco pelotas de diferente color: Amarilla, Roja, Morada, Negra, Verde; cada uno de los dos participantes escoge una pelota para cada lanzamiento que realice la urna de pelotas, los lanzamientos deben quedar registrados por cada jugador. La idea del juego es adivinar la pelota que seleccionará la urna, en caso de que un participante seleccione la correcta obtendrá un punto para su suma final.

Por ejemplo, Juan y Mateo son los concursantes de este juego, por su parte juan escoge el color de la pelota para cada ronda: Roja, Negra, Amarilla, Roja, Morada, Negra, Roja, es decir, que Juan registra sus lanzamientos así: RNARMNA. Mateo por su parte escoge el color de la pelota para cada ronda: Morada, Verde, Amarilla, Roja, Verde, Roja, Negra y registra sus lanzamientos: MVARVNR. En el juego cada lanzamiento obtuvo el siguiente registro de pelotas:

Lanzamiento 1  |  Morada
Lanzamiento 2  |  Negra
Lanzamiento 3  |  Amarilla
Lanzamiento 4  |  Roja
Lanzamiento 5  |  Verde
Lanzamiento 6  |  Negra
Lanzamiento 7  |  Roja

Por lo tanto, la urna de pelotas registro los lanzamientos al finalizar el juego: VNMAVNR.

Construir un programa para la urna de pelotas el cual debe codificar el estado del juego dependiendo si el jugador 1 lleva mas puntos que el jugador 2 debe imprimir la letra C. Si el jugador 2 lleva mas puntos que el jugador 1 debe imprimir la letra E y si llevan los mismos puntos debe imprimir la letra T. Para el ejemplo dado de Juan y Mateo el programa deberá codificar lo siguiente: ETTTETC

URNA	  |  JUAN  |  MATEO	 |  SALIDA
----------┼--------┼---------┼----------
Morada    |   0	   |    1    |    E
Negra     |   1	   |    1    |    T
Amarilla  |   2	   |    2    |    T
Roja      |   3	   |    3    |    T
Verde     |   3	   |    4    |    E
Negra     |   4	   |    4    |    T
Roja      |   5	   |    4    |    C



Entrada:  Dos cadenas de texto
Salida:   Una cadena de texto

EJEMPLO

ENTRADA  |  SALIDA
---------┼----------
ARMAVNM  |  CTTCCCC
VMARNVR  | 
AMRAVNR  | 



--- Input ---
AVM
MNM
RMRVMANNMMAVRVAMVMVAMRVVRRVVRV
--- Expected output (text)---
 TTTCCCCTTTCCCCCCCCCCCCCCCCCCCC

--- Input ---
VNVRR
VVVAR
NMVMMRMVRMVVRAVRRVRAAV
--- Expected output (text)---
 CCCCCCCCCCCCCTTTTTTEEE

--- Input ---
NMRVRA
NRMRVA
RNMVMVMMVMMRNMMRVAV
--- Expected output (text)---
 TTTTTTTTTTTTTTTTTTT

--- Input ---
MVM
RVM
VVRVMVVVMNVRARAVNVVR
--- Expected output (text)---
 TTEEEEEEEEEEEEEEEEEE

--- Input ---
VVRR
VVMV
VAMVVRMRMNAVVVVVMRVMVRNMVV

--- Expected output (text)---
 TTEEETETEEEEEEEEEEEEEEEEEE

--- Input ---
VMNVM
MAVRM
VVAMVRRVVMRMVVRVMRRVNARRMMR
--- Expected output (text)---
 TTEEEEEEEEEEEEEEEEEEEEEEEEE

--- Input ---
ARVMR
MRVNR
VNVMNRMRNANVVRARVVRNRNNMRV
--- Expected output (text)---
 TEEEEEEEEEEEEEEEEEEEEEEEEE

--- Input ---
AVVVR
MVRAN
RVVRAAANAVVVVAMVMRRARRRVVVN
--- Expected output (text)---
 TTTTTTTEEEEEEEEEEEEEEEEEEEE

--- Input ---
RMN
RNV
RMVVRMMARVAVRVVMNMMVNMMRVVRMV
--- Expected output (text)---
 TCTEETCCCTTEEEEEEETEETCCTEETE

--- Input ---
RMVRNM
NARMVR
MRMVNVMRMAMAMVRVVAVAVNNV
--- Expected output (text)---
 TTTTTTTTTEEEEEEEEEEEEEEE

--- Input ---
RRV
RMR
RVNAMVVRNRVAMRANVRRNMRRMMM
--- Expected output (text)---
 TCCCTCCCCCCCCCCCCCCCCCCCTE

--- Input ---
VVR
VRR
MRAVAVMMMVVVMMMRRV
--- Expected output (text)---
 TTTTTTTTTTTTTTTTTT

--- Input ---
RRAN
RVAV
MRVVAMMRVNVVVMRANVVANRAVVVVR
--- Expected output (text)---
 TTEEEEEEEEEEEEEEEEEEEEEEEEEE

--- Input ---
AMVN
VVNR
NNVNARRRNVNVMMVRAVMVMVNRVAV
--- Expected output (text)---
 TTTTCTEEEEEEETTETTCCCCCCCCC

--- Input ---
RMRVVA
MRMVRV
VMMVVRVVVNVMVVVRVVRMRMMAAV
--- Expected output (text)---
 TTTTTTTTTTTTTTTTTTTTTTTCCC

--- Input ---
RVAVV
VAMMV
NMAVRANAARVVRMMMRMAAAVRNMVAA
--- Expected output (text)---
 TEEETTTTTCCCCCTETEEEEETTEEEE

--- Input ---
MNARV
RRVAV
VRRAMVMANRVARRRVVRVAMRVNVVAV
--- Expected output (text)---
 TTTTCCCCCCCCCCCCCCCCCCCCCCCC

--- Input ---
MVNVAR
MVRNVM
NMRVVRVMMMMNAVARR
--- Expected output (text)---
 TTTTTTTTTTTTCCCCC

--- Input ---
MRVAV
RNRVV
MAMMVNNAVNRRVVVV
--- Expected output (text)---
 CCCCCCCCCCCCCCCC

--- Input ---
RAVMR
AVRMV
VMVRAVVRNARRVRA
--- Expected output (text)---
 TTTTTTTTTTTTTTT
"""
