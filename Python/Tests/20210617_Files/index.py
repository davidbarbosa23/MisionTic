import os

path = os.path.dirname(__file__)

with open(f"{path}/files/data.txt", "r") as file:
    var = file.read()
    print(var)
