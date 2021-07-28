def compound_interest(debt, months):
    return debt * 1.03 ** months


debt = int(input('Prestamo: '))
months = int(input('Meses: '))

print(f"Pago total en {months} meses: {compound_interest(debt, months)}")

"""
PROBLEMA
Si pido prestados P cantidad de pesos para pagarlos en dos meses, si
el interés del préstamo es del 3%. ¿Cuánto se debe pagar al final del
segundo mes si el interés es compuesto mensualmente?.

PSEUDO
P = int Dinero prestado
M = int Meses a pagar
DEUDA CON INTERÉS COMPUESTO = P * (1 + 0.03) ^ M
"""
