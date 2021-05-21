import random 

subjects = ["queridos", "apreciados", "distinguidos", "honorables", "estimados", "respetados"] 
mentions = ["compatriotas", "conciudadanos", "amigos", "coterraneos", "compartidarios", "electores"] 
decisions = ["en mi gobierno", "con su apoyo", "siendo elegido", "con su ayuda", "si me siguen", "durante mi mandato"]
actions = ["voy a derrotar", "venceré", "eliminaré", "acabaré", "lucharé contra", "conbatiré"]
circs = ["la violencia y", "la delincuencia y", "la corrupción y", "la inflación y", "la pobreza y", "el desplazamiento y"]
promises = ["trabajaré por", "garantizaré", "protegeré", "velaré por", "promoveré", "defenderé"]
benefits = ["la educacion", "el empleo", "la seguridad", "la paz", "la igualdad", "la salud"]
groups = ["del país", "de la ciudad", "de la comunidad", "de la población", "para toda la gente", "de cada colombiano"]

subjectSelected = random.choice(subjects) 
mentionSelected = random.choice(mentions) 
decisionSelected = random.choice(decisions) 
actionSelected = random.choice(actions)
circSelected = random.choice(circs) 
promiseSelected = random.choice(promises) 
benefitSelected = random.choice(benefits)
groupSelected = random.choice(groups)

print("Discurso: " + subjectSelected.capitalize() + " " + mentionSelected + " " + decisionSelected + " " + actionSelected + " " + circSelected + " " + promiseSelected + " " + benefitSelected + " " + groupSelected)