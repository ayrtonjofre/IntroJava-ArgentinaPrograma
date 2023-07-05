//Realizar un programa que calcule la multiplicación de dos matrices de enteros de 3x3. Inicia-
//lice las matrices para evitar el ingreso de datos por teclado.

Algoritmo encuentro_22_25_ejeextra_4
	
	Definir matriz, matriz_2, matriz_3 Como Real
	Definir i, k, j Como Entero
	Dimension matriz(3,3)
	Dimension matriz_2(3,3)
	Dimension matriz_3(3,3)
	
	//rellenar matrices
	Para i <- 0 Hasta 2 Con Paso 1 Hacer
		Para j <- 0 Hasta 2 Con Paso 1 Hacer
			matriz(i,j) = Aleatorio(1,10)
			matriz_2(i,j) = Aleatorio(1,10)
			matriz_3(i,j) = 0
		Fin Para
	Fin Para
	
	//Mostrar matriz 1
	Para i <- 0 Hasta 2 Con Paso 1 Hacer
		Escribir ""
		Para j <- 0 Hasta 2 Con Paso 1 Hacer
			Escribir "[" matriz(i,j) "]" Sin Saltar
		Fin Para
	Fin Para
	Escribir ""
	
	//Mostrar matriz 2
	Para i <- 0 Hasta 2 Con Paso 1 Hacer
		Escribir ""
		Para j <- 0 Hasta 2 Con Paso 1 Hacer
			Escribir "[" matriz_2(i,j) "]" Sin Saltar
		Fin Para
	Fin Para
	Escribir ""
	
	//Multiplicar matriz 1 y matriaz 2
	Para i <- 0 Hasta 2 Con Paso 1 Hacer
		Para j <- 0 Hasta 2 Con Paso 1 Hacer
			matriz_3(i,j) = matriz(i,j) * matriz_2(i,j)
		Fin Para
	Fin Para
	Escribir ""
	
	//mostrar matriz 3
	Para i <- 0 Hasta 2 Con Paso 1 Hacer
		Escribir ""
		Para j <- 0 Hasta 2 Con Paso 1 Hacer
			Escribir "[" matriz_3(i,j) "]" Sin Saltar
		Fin Para
	Fin Para
	Escribir ""
FinAlgoritmo
