//Realizar un programa que calcule la multiplicación de dos matrices de enteros de 3x3. Inicia-
//lice las matrices para evitar el ingreso de datos por teclado.


Algoritmo Clase24_Ejercicio4
	Definir matriz, matriz2, matriz3, i, j Como Entero
	Dimension matriz[3,3], matriz2[3,3], matriz3[3,3]
	
	//Defino valores en matriz 1
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			matriz[i,j] = Aleatorio(1,9)
		FinPara
	FinPara
	
	//Muestro los valores de matriz 1
	Escribir "Los valores de la matriz 1 son: " 
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar matriz[i,j] " "
		FinPara
		Escribir " "
	FinPara
	
	//Defino valores de matriz 2
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			matriz2[i,j] = Aleatorio(1,3)
		FinPara
	FinPara
	
	//Muestro los valores de matriz 2
	Escribir "Los valores de la matriz 2 son: " 
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar matriz2[i,j] " "
		FinPara
		Escribir " "
	FinPara
	
	//Multiplico ambas matrizes (1 y 2)
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			matriz3[i,j] = matriz[i,j] * matriz2[i,j]
		FinPara
	FinPara
	
	//Visualizar la multiplicación en matriz 3
	Escribir "Los valor de la multiplicacion entre matrices es: "
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar matriz3[i,j] " "
		FinPara
		Escribir " "
	FinPara
	
FinAlgoritmo
