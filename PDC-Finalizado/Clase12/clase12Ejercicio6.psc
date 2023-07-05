//Realizar una función que calcule y retorne la suma de todos los divisores del número n distin-
//tos de n. El valor de n debe ser ingresado por el usuario.

Algoritmo clase12Ejercicio6
	
	Definir num Como Entero
	
	Escribir "Ingrese un numero"
	Leer num
	Escribir " "
	
	Escribir "La suma de todos los divisores del numero es " Divisores(num) 
	
	
FinAlgoritmo

Funcion div <- Divisores(num)
	
	Definir numAlt, div, i Como Entero
	
	div = 0
	numAlt = 1
	
	Para i <- 1 Hasta  num Hacer
		
		si num mod numAlt = 0 y numAlt <> num   Entonces
			
			div = div + numAlt
			
		FinSi
		
		numAlt = numAlt + 1
		
	FinPara
	
FinFuncion
	