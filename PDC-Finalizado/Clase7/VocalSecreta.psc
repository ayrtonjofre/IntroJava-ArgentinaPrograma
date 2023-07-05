Algoritmo VocalSecreta
	Definir letraSec, letra Como Caracter
	Escribir "Adivine la letra secreta"
	Leer letra
	
	letraSec = "F"
	
	Mientras letra <> letraSec Hacer
		Escribir "La letra seleccionada no es correcta, por favor intente nuevamente"
		Leer letra
	Fin Mientras
	
	Escribir "La letra es correcta"
	
FinAlgoritmo
