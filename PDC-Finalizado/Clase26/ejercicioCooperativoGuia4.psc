

Algoritmo ejercicioCooperativoGuia4
	Definir tablero como Cadena
	Definir i,j Como Entero
	Dimension tablero[9, 12]
	inicializarMatriz(tablero, 9, 12)
	agregarPalabra(tablero, 9, 12)
	//	acomodarPalabras(tablero)
	//	imprimirMatriz(tablero, 9, 12)
	
	Para i = 0 Hasta 8 Con Paso 1 Hacer
		Para j = 0 Hasta 11 Con Paso 1 Hacer
			Escribir Sin Saltar tablero[i,j] " "
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

//Agregar palabra
SubProceso agregarPalabra(tablero, 9, 12)
	Definir i, j Como Entero
	i = 0
	j = 0
	Segun tablero[i,j] Hacer
		"vector":
			Para i = 0 Hasta 11 Con Paso 1 Hacer
				tablero[0,i] = Subcadena("vector",i,i)
			FinPara
		"matrix":
			Para i = 0 Hasta 11 Con Paso 1 Hacer
				tablero[1,i] = Subcadena("matrix",i,i)
			FinPara
		"programa":
			Para i = 0 Hasta 11 Con Paso 1 Hacer
				tablero[2,i] = Subcadena("programa",i,i)
			FinPara
		"subprograma":
			Para i = 0 Hasta 11 Con Paso 1 Hacer
				tablero[3,i] = Subcadena("subprograma",i,i)
			FinPara
		"subproceso":
			Para i = 0 Hasta 11 Con Paso 1 Hacer
				tablero[4,i] = Subcadena("subproceso",i,i)
			FinPara
		"variable":
			Para i = 0 Hasta 11 Con Paso 1 Hacer
				tablero[5,i] = Subcadena("variable",i,i)
			FinPara
		"entero":
			Para i = 0 Hasta 11 Con Paso 1 Hacer
				tablero[6,i] = Subcadena("entero",i,i)
			FinPara
		"para":
			Para i = 0 Hasta 11 Con Paso 1 Hacer
				tablero[7,i] = Subcadena("para",i,i)
			FinPara
		"mientras":
			Para i = 0 Hasta 11 Con Paso 1 Hacer
				tablero[8,i] = Subcadena("mientras",i,i)
			FinPara
	Fin Segun
FinSubProceso

