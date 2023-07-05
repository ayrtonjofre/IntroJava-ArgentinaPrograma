Algoritmo Clase16_Ejercicio6
	Definir letra Como Caracter
	Escribir "Digite una letra: "
	leer letra
	MT(letra)
	
FinAlgoritmo

SubProceso MT(letra)
	
	si letra>"M" y letra<"T" Entonces
		Escribir "La letra {",letra,"} esta entre las letras M y T"
		
	SiNo
		Escribir "La letra {",letra,"} NO esta entre las letras M y T"
	FinSi
	
FinSubProceso
