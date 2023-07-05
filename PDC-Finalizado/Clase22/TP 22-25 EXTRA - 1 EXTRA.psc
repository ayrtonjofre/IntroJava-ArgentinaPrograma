Algoritmo sin_titulo
	Definir matriz como entero
	dimension matriz(3,3)
	
	llenarmatriz(matriz,3,3)
	
FinAlgoritmo


//_________________________________________llenado de matriz

SubProceso llenarmatriz(matriz,a,b)
	Definir i,j Como Entero
	
	Para i<-0 con paso 1 hasta 2 Hacer
		Para j<-0 con paso 1 hasta 2 Hacer
			
			matriz(i,j)=aleatorio(1,9)
			
		FinPara
	FinPara
	
	Imprimematriz(matriz,a,b)
	
FinSubProceso

//____________________________________Imprime matriz

SubProceso Imprimematriz(matriz,a,b)
	Definir i,j como entero 
	
	Escribir ""
	Para i<-0 con paso 1 hasta 2 Hacer
		Para j<-0 con paso 1 hasta 2 Hacer
			
			Escribir matriz(i,j) "  " sin saltar
			
		FinPara
		Escribir ""
	FinPara
	Escribir ""
	
FinSubProceso
//Realizar un programa que rellene de números aleatorios una matriz a través de un subpro- 
//grama y generar otro subprograma que muestre por pantalla la matriz final.