Algoritmo sin_titulo
	definir min, max, valorbuscado , contador como entero
	max=0
	min=max
	contador=0
	
	Repetir
		escribir "escriba numero mayores a cero"
		leer valorbuscado
		contador=contador+1
		si valorbuscado>max
			max=valorbuscado
		FinSi
		si contador=1 Entonces
			min=valorbuscado
		FinSi
		si valorbuscado<min
			min=valorbuscado
			
		FinSi
		escribir "el valor maximo actual es " max
		escribir "el valor minimo actual es " min
	mientras que valorbuscado<>0
	
FinAlgoritmo
