print('>>> Lista de personas <<<')


def in_range(persons):
    counter = 0
    counter_found = 0
    list_persons = ""
    for person in persons:
        counter += 1
        if 35 <= person['age'] <= 80:
            counter_found += 1
            list_persons += f"Persona {counter}: {person['firstname']} {person['lastname']}\n"

    print(f'\n\n{counter_found} personas encontradas entre 35 y 80 años, de {counter} datos ingresados')
    print(f'\n{list_persons}')


def create_inputs():
    more_persons = True
    persons = []
    while more_persons:
        firstname = input('\nNombre: ')
        lastname = input('Apellido: ')
        age = int(input('Edad: '))

        persons.append(
            {'firstname': firstname, 'lastname': lastname, 'age': age})

        more_persons = int(
            input('\nIngrese 1 para continuar, 0 para detener la ejecución: '))

    return in_range(persons)


create_inputs()


"""
Desarrollar un programa que dado un diccionario de personas, cada
persona representada como el siguiente ejemplo:
{"nombres":"Pedro Julio", "apellidos":"Tristan Merchan", "edad":101} 
imprima los nombres y apellidos de las personas que estan en un rango de edades (35-80).
"""
