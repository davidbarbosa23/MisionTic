import re


def normalize(s):
    s = s.lower()
    replacements = (
        ("á", "a"),
        ("é", "e"),
        ("í", "i"),
        ("ó", "o"),
        ("ú", "u"),
    )
    for a, b in replacements:
        s = s.replace(a, b)
    s = re.sub('[^a-z\n]', '', s)
    return s


str = " 'DÁbale arroz a la zorra el abad' $%!(%*(!)) "
str_normalizada = normalize(str)
str_invertida = str_normalizada[::-1]

print("> Cadena original: " + str)
print(". Cadena normalizada: " + str_normalizada)
print(". Cadena invertida: " + str_invertida)

if str_normalizada == str_invertida:
    print("La cadena de texto es palíndroma")
else:
    print("La cadena de texto no es palíndroma")
