import random 

subjects = ["queridos", "apreciados", "distinguidos", "honorables", "estimados", "respetados"] 
mentions = ["compatriotas", "conciudadanos", "amigos", "coterraneos", "compartidarios", "electores"] 
decisions = ["en mi gobierno", "con su apoyo", "siendo elegido", "con su ayuda", "si me siguen", "durante mi mandato"]
actions = ["voy a derrotar", "venceré", "eliminaré", "acabaré", "lucharé contra", "conbatiré"]
circs = ["la violencia y", "la delincuencia y", "la corrupción y", "la inflación y", "la pobreza y", "el desplazamiento y"]
promises = ["trabajaré por", "garantizaré", "protegeré", "velaré por", "promoveré", "defenderé"]
benefits = ["la educacion", "el empleo", "la seguridad", "la paz", "la igualdad", "la salud"]
groups = ["del país", "de la ciudad", "de la comunidad", "de la población", "para toda la gente", "de cada colombiano"]

subject_selected = random.choice(subjects).capitalize() 
mention_selected = random.choice(mentions) 
decision_selected = random.choice(decisions) 
action_selected = random.choice(actions)
circ_selected = random.choice(circs) 
promise_selected = random.choice(promises) 
benefit_selected = random.choice(benefits)
group_selected = random.choice(groups)

print("Discurso: " + subject_selected.capitalize() + " " + mention_selected + " " + decision_selected + " " + action_selected + " " + circ_selected + " " + promise_selected + " " + benefit_selected + " " + group_selected)
