name = input()
unit_price = int(input())
sell_price = int(input())
units = int(input())


def profit():
    benefit = sell_price - unit_price
    return benefit * units


print(f"Producto: {name}")
print(f"CU: ${unit_price}")
print(f"PVP: ${sell_price}")
print(f"Unidades Disponibles: ${units}")
print(f"Ganancia: ${profit()}")
