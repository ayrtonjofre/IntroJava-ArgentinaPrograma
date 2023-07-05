Algoritmo validarNota
	Definir nota Como Entero
	Escribir "Defina una nota entre 0 y 10"
	Leer nota
	
	Mientras (nota <= 0) O (nota > 10) Hacer
		Escribir "La nota ingresada no cumple los requisitos: "
		Leer nota
	Fin Mientras
	Escribir "La nota es: ", nota
FinAlgoritmo
