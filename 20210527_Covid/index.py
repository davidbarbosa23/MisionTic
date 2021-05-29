# PROBLEMA
# El número de contagiados de Covid-19 en el país de NuncaLandia se
# duplica cada día. Hacer un programa que diga el número total de
# personas que se han contagiado cuando pasen D días a partir de hoy,
# si el número de contagiados actuales es C.

# PSEUDO
# D = int - Días que quiero estimar
# C = int - Contagiados actuales
# PROYECCIÓN: C * (2^D)

# SOLUCIÓN
def projection(current_infected, days):
    return current_infected * 2 ** days


current_infected = int(input('Contagiados actuales en NuncaLandia: '))
days = int(input('Días a calcular: '))

print(
    f"Proyección de contagiados en {days} días: {projection(current_infected, days)}")
