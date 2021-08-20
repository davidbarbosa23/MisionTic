def tipo_ropa(tipos=[]):
    tipos_unicos = []
    for tipo in tipos:
        if tipo not in tipos_unicos:
            tipos_unicos.append(tipo)
    return tipos_unicos


def ropa_faltante(codigos, tipos, tipo):
    faltantes = []
    for codigo in codigos:
        if tipos[codigo] == tipo:
            faltantes.append(codigo)
    return faltantes


def novendo(competencia=[], empresa=[]):
    interes = []
    for item in competencia:
        if item not in empresa:
            interes.append(item)
    return interes


def cambio_socios(empresa1=[], empresa2=[]):
    interes1 = len(novendo(empresa1, empresa2))
    interes2 = len(novendo(empresa2, empresa1))
    return interes1 if interes1 < interes2 else interes2
