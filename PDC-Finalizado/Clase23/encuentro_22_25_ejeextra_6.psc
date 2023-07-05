//Realizar un programa que permita visualizar el resultado del producto de una matriz de ente-
//ros de 3x3 por un vector de 3 elementos. Los valores de la matriz y el vector pueden iniciali-
//zarse evitando así el ingreso de datos por teclado. Para conocer más acerca de cómo se rea-
//liza la multiplicación entre matrices consultar el siguiente link:

Algoritmo encuentro_22_25_ejeextra_6
	
	Definir matriz, vector, vector_multiplicado, i, j, k Como Entero
	Dimension matriz(3,3)
	Dimension vector(3)
	Dimension vector_multiplicado(3)
	
	//rellenar matriz
	Para i <- 0 Hasta 2 Con Paso 1 Hacer
		Para j <- 0 Hasta 2 Con Paso 1 Hacer
			matriz(i,j) = Aleatorio(1,10)
		Fin Para
	Fin Para
	Escribir ""
	
	//rellenar vector
	Para i <- 0 Hasta 2 Con Paso 1 Hacer
		vector(i) =Aleatorio(1,10)
		vector_multiplicado(i) = 0
	Fin Para
	Escribir ""
	
	//mostrar matriz 
	Escribir "matriz y vector"
	Para i <- 0 Hasta 2 Con Paso 1 Hacer
		Escribir ""
		Para j <- 0 Hasta 2 Con Paso 1 Hacer
			Escribir "[" matriz(i,j) "]" Sin Saltar
		Fin Para
		Escribir  "  " "[" vector(i) "]" "  " Sin Saltar 
	Fin Para
	Escribir ""
	
	//multiplicar matriz * vector
	Para i <- 0 Hasta 2 Con Paso 1 Hacer
		Para j <- 0 Hasta 2 Con Paso 1 Hacer
			vector_multiplicado(i) = vector_multiplicado(i) + (matriz(i,j) * vector(i))
		Fin Para
	Fin Para
	Escribir ""
	
	//mostrar vector multiplicado
	Para i <- 0 Hasta 2 Con Paso 1 Hacer
		Escribir "[" vector_multiplicado(i) "]" Sin Saltar
	Fin Para
	Escribir ""
	
	
FinAlgoritmo
