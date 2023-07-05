//Realizar un programa que rellene una matriz de 3x3 con 9 valores ingresados por el usuario y
//los muestre por pantalla.

Algoritmo Clase22_Ejercicio1
	Definir matrix, i, j Como Entero
	Dimension matrix[3,3]
	
	i=0
	j=0
	
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			matrix[i,j] = Aleatorio(1,9) 
		FinPara
	FinPara
	
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin saltar matrix[i, j]  
		FinPara
		Escribir " "
	FinPara

FinAlgoritmo
