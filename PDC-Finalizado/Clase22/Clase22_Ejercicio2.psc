//Escribir un programa que realice la búsqueda lineal de un número entero ingresado por el
//
//usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las coorde-
//nadas donde se encuentra el valor, es decir en que fila y columna se encuentra. En caso de no
//
//encontrar el valor dentro de la matriz se debe mostrar un mensaje.

Algoritmo Clase22_Ejercicio2
	Definir num, i, j, matrix, aux Como Entero
	//La variable auxiliar la defino como 1, para cuando se cumpla el primer si y el nro esté dentro de la matriz lo cambie a 0
	//luego en el proximo si, si no se cumple el primer si donde esta el nro en la matriz, la variable aux regresa a valer 1
	//haciendo con que me de un falso y me indique el escribir correspondiente.
	aux = 1
	Dimension matrix[5,5]
	
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		Para j = 0 Hasta 4 Con Paso 1 Hacer
			matrix[i,j] = Aleatorio(1,50)
		FinPara
	FinPara
	
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		Para j = 0 Hasta 4 Con Paso 1 Hacer
			Escribir matrix[i,j] " " Sin Saltar
		FinPara
		Escribir " "
	FinPara
	
		Escribir "Defina el numero a buscar: "
		Leer num
				
		Para i = 0 Hasta 4 Con Paso 1 Hacer
			Para j = 0 Hasta 4 Con Paso 1 Hacer
				Si num = matrix[i,j] Entonces
					aux = 0
					Escribir "La posición del numero es: " i, "," j
				FinSi
			FinPara
			Escribir " "
		FinPara
		
		Si aux <> 0 Entonces 
			Escribir "El numero ingresado no se encuentra en la matriz"
		FinSi
		
FinAlgoritmo
