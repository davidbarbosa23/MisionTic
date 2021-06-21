from os import path

filepath = f'{path.dirname(__file__)}/directorio.txt'
print('>>>Welcome to Users Directory<<<')


def exist(notprint=0):
    check = path.exists(filepath) and path.getsize(filepath) > 0
    if not check and not notprint:
        print(
            '\n\n::The directory doesn\'t exist, or it\'s empty. Please start to add someone.::')
    return check


def get_person(phonenumber):
    with open(filepath, 'r') as file:
        for line in file:
            line = line.strip()
            if line:
                line = line.split(",")
                if int(line[0]) == phonenumber:
                    return line
    return False


def consult():
    print('\n\n::CONSULT::')
    phonenumber = int(input('Please enter the phonenumber: '))

    person = get_person(phonenumber)

    if person:
        return f'\nPerson found with {person[0]}: {person[1]}'
    else:
        return f'\nThe phonenumber {phonenumber} doesn\'t exist.'


def delete():
    print('\n\n::DELETE::')
    phonenumber = int(input('Please enter the phonenumber: '))

    person = get_person(phonenumber)

    if person:
        with open(filepath, 'r+') as file:
            lines = file.readlines()
            file.seek(0)
            for line in lines:
                if line.strip() != f'{person[0]},{person[1]}':
                    file.write(line)
            file.truncate()
        return f'\nPerson deleted {person[0]}: {person[1]}'
    else:
        return f'\nNothing to delete with phonenumber {phonenumber}'


def add(exist):
    print('\n\n::ADD::')
    phonenumber = int(input('Please enter the phonenumber: '))
    name = str(input('Please enter the name: '))

    if exist and get_person(phonenumber):
        return f'\nPerson with phonenumber {phonenumber} already exist'
    else:
        with open(filepath, 'a' if exist else 'w') as file:
            file.write(f'{phonenumber},{name}\n')
        return '\nPerson added succesfully'


def init():
    action = True
    while action:
        action = int(
            input('\n\nEnter 1 for Consult.\nEnter 2 for Delete.\nEnter 3 for Add.\nEnter 0 for Terminate program.: '))

        if action == 1:
            if exist():
                print(consult())
        elif action == 2:
            if exist():
                print(delete())
        elif action == 3:
            print(add(exist(1)))
        elif action == 0:
            return
        else:
            print('\n\n::NOT VALID INPUT::')


init()

"""
Escribir un programa para gestionar una lista de telefonos 
con los nombres y los teléfonos de los clientes de una empresa. 
El programa que desarrollen debe crear funciones para consultar 
el teléfono de un cliente, añadir el teléfono de un nuevo cliente 
y eliminar el teléfono de un cliente. La lista de telefonos debe 
estar guardado en el archivo de texto directorio.txt donde 
el nombre del cliente y su teléfono deben aparecer separados 
por comas y cada cliente en una línea distinta.
"""
