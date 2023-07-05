Algoritmo sin_titulo
	definir matriz,n,m,i,j como entero
	Escribir "Defina la dimension de la matriz:"
	Escribir "Cantidad de filas: " Sin Saltar
	leer n
	Escribir "Cantidad de columnas: " sin saltar
	Leer m
	dimension matriz(n,m)
	
	//define valores en matriz
	para i<-0 hasta n-1 con paso 1 Hacer
		para j<-0 hasta m-1 con paso 1 Hacer
			
			matriz(i,j)=aleatorio(1,9)
			
		FinPara
	FinPara
	
	//Imprime primer matriz A
	Escribir ""
	Escribir "Matriz A"
	Escribir ""
	para i<-0 hasta n-1 con paso 1 Hacer
		para j<-0 hasta m-1 con paso 1 Hacer
			
			Escribir matriz(i,j) "  " sin saltar
			
		FinPara
		Escribir ""
	FinPara
	Escribir ""
	
	//cambia valores de columnas a filas e Imprimir Matriz B
	
	Escribir "Matriz B (Transpuesta)"
	Escribir ""
	
	para j<-0 hasta m-1 con paso 1 Hacer
		para i<-0 hasta n-1 con paso 1 Hacer
			
			Escribir matriz(i,j) "  " sin saltar
			
		FinPara
		Escribir ""
	FinPara
	Escribir ""

	
FinAlgoritmo
//Crear una matriz de orden n * m (donde n y m son valores ingresados por el usuario), llenarla 
//con números aleatorios entre 1 y 100 y mostrar su traspuesta. 
//¿Qué es una Matriz Traspuesta?
//La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa//).
