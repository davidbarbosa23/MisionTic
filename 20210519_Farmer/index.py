def counter(animals, foots):
    rabbits = 0
    chickens = animals

    while (foots != (rabbits * 4) + (chickens * 2)):
        rabbits += 1
        chickens -= 1

    return "Conejos: {}, Gallinas: {}".format(rabbits, chickens)


print("»» Ejecutando programa de conejos y gallinas ««")
print("¿Cuántos animales tiene?")
animals = int(input())
print("¿Cuántas patas?")
foots = int(input())
print("El resultado es:")
print(counter(animals, foots))
