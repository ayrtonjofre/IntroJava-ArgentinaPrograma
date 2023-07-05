Algoritmo sin_titulo
	Definir matriz,n,m Como Entero
	Escribir "Dimension de matriz x:"
	leer n
	Escribir "Dimension de matriz y:"
	leer m
	Dimension matriz(n,m)
	llenarmatriz(matriz,m,n)
	mostrarmatriz(matriz,m,n)
	matriztraspuesta(matriz,m,n)
FinAlgoritmo

SubProceso matriztraspuesta(matriz,m,n)
	Definir i,j,traspuesta Como Entero
	Dimension traspuesta(m,n)
	Para i=0 Hasta m-1 con paso 1 Hacer
		Para j=0 Hasta n-1 con paso 1 Hacer
			traspuesta(i,j)=matriz(j,i)
		FinPara
	FinPara
	mostrarmatriztraspuesta(traspuesta,m,n)
FinSubProceso
SubProceso mostrarmatriztraspuesta(traspuesta,m,n)
	Definir i,j Como Entero
	Escribir "traspuesta:"
	Para i=0 Hasta m-1 con paso 1 Hacer
		Para j=0 Hasta n-1 con paso 1 Hacer
			Escribir traspuesta(i,j)," " Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinSubProceso

SubProceso llenarmatriz(matriz,m,n)
	Definir i,j Como Entero
	Para i=0 Hasta n-1 con paso 1 Hacer
		Para j=0 Hasta m-1 con paso 1 Hacer
			matriz(i,j)=Aleatorio(1,100)
		FinPara
	FinPara
FinSubProceso

SubProceso mostrarmatriz(matriz,m,n)
	Definir i,j Como Entero
	Escribir "normal:"
	Para i=0 Hasta n-1 con paso 1 Hacer
		Para j=0 Hasta m-1 con paso 1 Hacer
			Escribir matriz(i,j)," " Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinSubProceso
	