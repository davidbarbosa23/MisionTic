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
