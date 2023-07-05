Algoritmo eje_3
	definir n, m, mat Como Entero
	escribir "ingrese valor de matris "
	leer n, m 
	Dimension mat(n,m)
	matris(mat, n,m)
	total(mat, n,m )
	
FinAlgoritmo

SubProceso matris(mat, n,m Por valor)
	definir i , j Como Entero
	
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Para j<-0 Hasta m-1 Con Paso 1 hacer 
			mat(i,j)=Aleatorio(1,20)
			Escribir mat(i,j) " " Sin Saltar
		Fin Para
		Escribir " "
	Fin Para
FinSubProceso

SubProceso total(mat, n,m Por valor)
	definir i , j , suma Como Entero
	suma=0
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Para j<-0 Hasta m-1 Con Paso 1 hacer 
			suma = suma + mat(i,j) 
		Fin Para
	Fin Para
	Escribir "el total de toda a matris es..." ,suma
FinSubProceso
