//Rellenar en un subproceso una matriz cuadrada con números aleatorios salvo en la diagonal
//	
//	principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe generar otro subpro-
//	ceso para imprimir la matriz.

Algoritmo Clase21_Ejercicio4
	Definir matriz, i, j Como Entero
	i = 0
	j = 0
	Dimension matriz[3,3]
	relleno(matriz,i,j)
	diagonal(matriz,i,j)
FinAlgoritmo

SubProceso relleno(matriz,i,j)
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			matriz[i,j] = Aleatorio(1,9)
		FinPara
	FinPara
	
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			Escribir matriz[i,j] " " Sin Saltar
		FinPara
		Escribir " "
	FinPara
FinSubProceso

SubProceso diagonal(matriz,i,j)
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			matriz[i,i] = 0
		FinPara
	FinPara
	Escribir " "
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			Escribir matriz[i,j] " " Sin Saltar
		FinPara
		Escribir " "
	FinPara
FinSubProceso
	