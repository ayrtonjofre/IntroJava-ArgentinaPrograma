//Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario) realizar
//
//un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos otro subpro-
//grama que calcule y muestre la suma de los elementos de la matriz. Mostrar la matriz y los re-
//sultados por pantalla.

Algoritmo Clase21_Ejercicio3
	Definir n, m, matriz Como Entero
	Escribir "Defina el tamaño de la matriz: "
	Leer n
	Leer m
	Dimension matriz[n,m]
	
	rellenar(n,m,matriz)
	total(n,m,matriz)
	
FinAlgoritmo

SubProceso rellenar(n,m,matriz)
	Definir i, j Como Entero

	i=0
	j=0
	
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Para j=0 Hasta m-1 Con Paso 1 hacer 
			matriz[i,j]=Aleatorio(1,20)
			Escribir matriz[i,j] " " Sin Saltar
		Fin Para
		Escribir " "
	Fin Para
	
FinSubProceso

SubProceso total(n,m,matriz)
	Definir i, j, suma Como Entero
	suma = 0
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		Para j=0 Hasta m-1 Con Paso 1 Hacer
			suma = suma + matriz[i,j]
		FinPara
	FinPara
	Escribir "La suma de todos los numeros de la matriz es: " suma " " Sin Saltar
FinSubProceso
	