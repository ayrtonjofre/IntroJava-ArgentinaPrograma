//  Escribir un programa que calcule la suma de los N primeros números naturales. El valor de
//  N se leerá por teclado.

Algoritmo encuentro_9_eje_5
	
	Definir i, n, suma Como Entero
	Escribir "ingrese la cantidad de numeros a sumar"
	Leer n
	
	suma = 0
	
	Para i <- 0 Hasta n Con Paso 1 Hacer
		suma = suma + n
	Fin Para
	
	Escribir "la suma de los numeros ingresados es igual a " suma
	
FinAlgoritmo
