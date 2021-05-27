from math import pi


def circularConeVolume(height, radius):
    return 1/3 * pi * radius**2 * height


def sphereVolume(radius):
    return 4/3 * pi * radius**3


def solidVolume(value1, value2):
    return value1 + value2


coneRadius = float(input('Cone radius: '))
coneHeight = float(input('Cone height: '))
sphereRadius = float(input('Sphere Radius: '))

print(
    f"Solid volume: {solidVolume(circularConeVolume(coneHeight, coneRadius), sphereVolume(sphereRadius))}")
