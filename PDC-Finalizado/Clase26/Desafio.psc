Algoritmo ejercicioCooperativoGuia4
	
		Definir tablero como Cadena
		Definir i,j Como Entero
		Dimension tablero[9, 12]
		inicializarMatriz(tablero, 9, 12)
		agregarPalabra(tablero, 9 , 12)
//		buscarR(tablero, 9, 12)
		acomodarPalabras(tablero)
		
		//	imprimirMatriz(tablero, 9, 12)
		
		Para i = 0 Hasta 8 Con Paso 1 Hacer
			Para j = 0 Hasta 11 Con Paso 1 Hacer
				Escribir Sin Saltar "[" tablero[i,j] "]"
			FinPara
			Escribir " "
		FinPara
		
FinAlgoritmo

//Inicializar Matriz
SubProceso inicializarMatriz(tablero, 9, 12)
	Definir i, j Como Entero
	Para i = 0 Hasta 8 Con Paso 1 Hacer
		Para j = 0 Hasta 11 Con Paso 1 Hacer
			tablero[i,j] = "*"
		FinPara
	FinPara
FinSubProceso

//Agregar palabras
SubProceso agregarPalabra(tablero, 9, 12)
	Definir i Como Entero
	
	//Vector
	Para i = 0 Hasta 11 Con Paso 1 Hacer
		tablero[0,i] = Subcadena("vector",i,i)
	FinPara
	
	//Matrix
	Para i = 0 Hasta 11 Con Paso 1 Hacer
		tablero[1,i] = Subcadena("matrix",i,i)
	FinPara
	
	//Programa
	Para i = 0 Hasta 11 Con Paso 1 Hacer
		tablero[2,i] = Subcadena("programa",i,i)
	FinPara
	
	//Subprograma
	Para i = 0 Hasta 11 Con Paso 1 Hacer
		tablero[3,i] = Subcadena("subprograma",i,i)
	FinPara
	
	//Subproceso
	Para i = 0 Hasta 11 Con Paso 1 Hacer
		tablero[4,i] = Subcadena("subproceso",i,i)
	FinPara
	
	//Variable
	Para i = 0 Hasta 11 Con Paso 1 Hacer
		tablero[5,i] = Subcadena("variable",i,i)
	FinPara
	
	//Entero
	Para i = 0 Hasta 11 Con Paso 1 Hacer
		tablero[6,i] = Subcadena("entero",i,i)
	FinPara
	
	//Para 
	Para i = 0 Hasta 11 Con Paso 1 Hacer
		tablero[7,i] = Subcadena("para",i,i)
	FinPara
	
	//Mientras 
	Para i = 0 Hasta 11 Con Paso 1 Hacer
		tablero[8,i] = Subcadena("mientras",i,i)
	FinPara
FinSubProceso

//SubProceso buscarR(tablero,9,12)
//	Definir i, j Como Entero
//	Para i = 0 Hasta 8 Con Paso 1 Hacer
//		Para j = 0 Hasta 11 Con Paso 1 Hacer
//			si tablero(0,j)=="r" Entonces
//				escribir j
//			FinSi
//		FinPara
//	FinPara
//FinSubProceso


SubProceso acomodarPalabras(tablero)
	
	//Vector
	Definir i, j, z Como Entero
	Para i = 0 Hasta 8 Con Paso 1 Hacer
		Para j = 0 Hasta 11 Con Paso 1 Hacer
			si tablero(0,j)=="r" Entonces
				z=j-5
			FinSi
		FinPara
	FinPara
	
	Para i = 0 Hasta 11 Con Paso 1 Hacer
		tablero[0,i] = Subcadena("vector",i,i)
	FinPara
	
	//Matrix
	z=0
	Para i = 0 Hasta 8 Con Paso 1 Hacer
		Para j = 0 Hasta 11 Con Paso 1 Hacer
			si tablero(1,j)=="r" Entonces
				z=5-j
				escribir z
			FinSi
		FinPara
	FinPara	

	Para i = 0 Hasta 11-z Con Paso 1 Hacer
		tablero[1,i+z] = Subcadena("matrix",i,i)
	FinPara
	Para i = 0 Hasta z-1 Con Paso 1 Hacer
		tablero[1,i] = " "
	FinPara
		
		//Programa
	z=0
	Para i = 0 Hasta 8 Con Paso 1 Hacer
		Para j = 0 Hasta 11 Con Paso 1 Hacer
			si tablero(2,j)=="r" Entonces
				z=5-j
				escribir z
			FinSi
		FinPara
	FinPara	
	
	Para i = 0 Hasta 11-z Con Paso 1 Hacer
		tablero[2,i+z] = Subcadena("programa",i,i)
	FinPara
	Para i = 0 Hasta z-1 Con Paso 1 Hacer
		tablero[2,i] = " "
	FinPara
		
		//Subprograma
	z=0
	Para i = 0 Hasta 8 Con Paso 1 Hacer
		Para j = 0 Hasta 11 Con Paso 1 Hacer
			si tablero(2,j)=="r" Entonces
				z=5-j
				escribir z
			FinSi
		FinPara
	FinPara	
	
	Para i = 0 Hasta 11-z Con Paso 1 Hacer
		tablero[3,i+z] = Subcadena("subprograma",i,i)
	FinPara
	Para i = 0 Hasta z-1 Con Paso 1 Hacer
		tablero[3,i] = " "
	FinPara
		
		//Variable
		Para i = 0 Hasta 11 Con Paso 1 Hacer
			tablero[5,i] = Subcadena("variable",i,i)
		FinPara
		
		//Entero
		Para i = 0 Hasta 11 Con Paso 1 Hacer
			tablero[6,i] = Subcadena("entero",i,i)
		FinPara
		
		//Para 
		Para i = 0 Hasta 11 Con Paso 1 Hacer
			tablero[7,i] = Subcadena("para",i,i)
		FinPara
		
		//Mientras 
		Para i = 0 Hasta 11 Con Paso 1 Hacer
			tablero[8,i] = Subcadena("mientras",i,i)
		FinPara
FinSubProceso

