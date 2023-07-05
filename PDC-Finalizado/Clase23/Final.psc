Algoritmo Final
	//Definición de variables
	Definir calculadora Como Entero
	Definir cadena1, cadena2 Como Caracter
	Definir diagonal3D1, diagonal3D2 Como Entero
	//Definimos las 3 dimensiones de la matriz calculadora
	Dimension calculadora[3,3,3]
	//Asignamos valores a las cadenas de texto
	cadena1 = "123456789"
	cadena2 = "987654321"
	//Inicializamos la matriz
	inicializarMatriz(calculadora)
	//Llenamos las matrices como se marca en el enunciado
	llenarMatriz_Z0(calculadora, cadena1)
	llenarMatriz_Z1(calculadora, cadena2)
	llenarMatriz_Z2(calculadora)
	//Mostramos los resultados de la matriz
	imprimirMatriz(calculadora)
	//Asignamos los valores de las diagonales 3D
	diagonal3D1 = calculadora(0, 2, 0)*calculadora(1, 1,1)*calculadora(2, 0, 2)
	diagonal3D2 = calculadora(0, 0, 0)*calculadora(1, 1,1)*calculadora(2, 2, 2)
	//Escribimos los resultados de las diagonales
	Escribir "La multiplicación de los elementos de la diagonal 3D 1 es " diagonal3D1
	Escribir "La multiplicación de los elementos de la diagonal 3D 2 es " diagonal3D2
FinAlgoritmo

//Inicializa la matriz en 0
SubAlgoritmo inicializarMatriz(calculadora Por Referencia)
	Definir i, j ,k Como Entero
	
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			Para k = 0 Hasta 2 Con Paso 1 Hacer
				calculadora[i,j,k] = 0
			FinPara
		FinPara
	FinPara
FinSubAlgoritmo

	//Llena la matriz 0 
Subalgoritmo llenarMatriz_Z0(calculadora Por Referencia, cadena1)
	Definir i, j, k, cont Como Entero
	i = 0
	cont = 0
	
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			Para k = 0 Hasta 2 Con Paso 1 Hacer
				calculadora[i,j,k] = ConvertirANumero(Subcadena(cadena1, cont, cont))
			FinPara
		FinPara
	FinPara
FinSubAlgoritmo

	//Llena la matriz1
SubAlgoritmo llenarMatriz_Z1(calculadora Por Referencia, cadena2)
	Definir i, j, k, cont Como Entero
	i = 0
	cont = 0
	
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			Para k = 0 Hasta 2 Con Paso 1 Hacer
				calculadora[i,j,k] = ConvertirANumero(Subcadena(cadena2, cont, cont))
			FinPara
		FinPara
	FinPara
FinSubAlgoritmo

//Llena la matriz 2 multiplicando las posiciones entre la matriz 0 y 1
SubAlgoritmo llenarMatriz_Z2(calculadora Por Referencia)
	Definir i, j, k Como Entero
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			Para k = 0 Hasta 2 Con Paso 1 Hacer
				calculadora[i,j,k] = calculadora [i,j,k] * calculadora [i,j,k]
			FinPara
		FinPara
	FinPara
FinSubAlgoritmo

//Imprimo la matriz 

SubAlgoritmo imprimirMatriz(calculadora)
	Definir i,j,k Como Entero
	Para i = 0 Hasta 2 Con Paso 1 Hacer
		Para j = 0 Hasta 2 Con Paso 1 Hacer
			Para k = 0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar calculadora[i,j,k] " " 
		FinPara
		Escribir " "
		FinPara
		Escribir " "
	FinPara
FinSubAlgoritmo

