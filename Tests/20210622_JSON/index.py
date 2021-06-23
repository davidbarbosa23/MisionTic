import json

text = '''{
  "jadiazcoronado": {
    "nombres": "Juan Antonio",
    "apellidos": "Diaz Coronado",
    "edad":19, "colombiano":true,
    "deportes": [
      "Futbol",
      "Ajedrez",
      "Gimnasia"
    ]
  },
  "dmlunasol": {
    "nombres": "Dorotea Maritza",
    "apellidos": "Luna Sol",
    "edad":25,
    "colombiano": false,
    "deportes": [
      "Baloncesto",
      "Ajedrez",
      "Gimnasia"
    ]
  }
}'''

data = json.loads(text)
print(data)

deporte = input("ingrese deporte")
for i in data:
    for j in range(0, 3):
        posicion = data[i]["deportes"][j]
        if posicion == deporte:
            print(data[i]["nombres"], data[i]["apellidos"])

"""
Imprima los nombres completos (nombre y apellidos) de las personas
que practican el deporte ingresado por el usuario.
"""
