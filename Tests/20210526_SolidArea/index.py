from math import pi


def circular_cone_volume(height, radius):
    return 1/3 * height * pi * radius**2


def sphere_volume(radius):
    return 4/3 * pi * radius**3


def solid_volume(value1, value2):
    return value1 + value2


cone_radius = float(input('Cone radius: '))
cone_height = float(input('Cone height: '))
sphere_radius = float(input('Sphere Radius: '))

print(
    f"Solid volume: {solid_volume(circular_cone_volume(cone_height, cone_radius), sphere_volume(sphere_radius))}")
