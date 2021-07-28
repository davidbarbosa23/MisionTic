import json
from os import path

filepath = f'{path.dirname(__file__)}/result.json'

resource = '''{
  "10001": [5, 4, 3.5, 2, 1],
  "10002": [5, 4, 3, 2, 1],
  "10003": [5, 4, 3.8, 2, 1.6],
  "10004": [5, 4, 3, 2, 1],
  "10005": [5, 3, 3, 2, 1],
  "10006": [5, 4, 3, 4, 1],
  "10007": [5, 4, 5, 2, 5],
  "10008": [5, 4, 3, 2, 1],
  "10009": [5, 4, 3, 2.3, 1]
}'''

data = json.loads(resource)
result = {}


def average(scores):
    return float("{:.1f}".format(sum(scores) / len(scores)))


for student in data:
    result[student] = average(data[student])

with open(filepath, 'w') as scores:
    json.dump(result, scores, indent=2)

"""
Desarrolle un programa que lea un objeto JSON, 
en el cual se encuentran las notas de los estudiantes del curso. 
Cada llave corresponde al codigo de cada estudiante, y su valor 
es una lista con las notas obtenidas en las actividades del curso. 
Se debe generar un nuevo objeto JSON que guarde el promedio de las 
notas obtenidas por el estudiante dado por usuario y lo guardan en un archivo.
"""
