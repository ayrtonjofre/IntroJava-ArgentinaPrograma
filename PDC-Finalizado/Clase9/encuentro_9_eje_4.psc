//Realizar un programa que muestre la cantidad de números que son múltiplos de 2 o de 3
//comprendidos entre 1 y 100.

Algoritmo encuentro_9_eje_4
	
	Definir i, num_mult_2, num_mult_3 Como Entero
	num_mult_2 = 0
	num_mult_3 = 0
	
	Para i <- 0 Hasta 100 Con Paso 1 Hacer
		Si i MOD 2 = 0 Entonces
			Escribir "la cantidad de numeros ingresados es"
			num_mult_2 = num_mult_2 + 1
			Escribir num_mult_2
			Escribir " "
		Fin Si
		
		Si i MOD 3 = 0 Entonces
			Escribir "la cantidad de numeros ingresados es"
			num_mult_3 = num_mult_3 + 1
			Escribir num_mult_3
			Escribir " "
		Fin Si
	Fin Para
	
	Escribir "la cantidad de numeros que son multiplos de 2 son ", num_mult_2
	Escribir "la cantidad de numeros que son multiplos de 3 son ", num_mult_3
FinAlgoritmo
