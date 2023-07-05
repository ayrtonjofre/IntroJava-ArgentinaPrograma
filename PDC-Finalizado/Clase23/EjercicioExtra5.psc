////Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. 
////Las dos primeras columnas contendrán valores enteros ingresados por el usuario y en la 3 columna se deberá almacenar el resultado de:
////sumar el número de la primera y segunda columna.

Algoritmo EjercicioExtra5
	Definir matriz, filas, suma, i, j Como Entero
	Escribir "Ingrese el número de filas que tiene la matriz"
	Leer filas
	
	Dimension matriz(filas,3)
	
	Para i = 0 hasta filas-1 con paso 1 Hacer
		Para j = 0 hasta 1 con paso 1 Hacer
			Escribir "Ingrese el valor de la matriz " i " , " j
			Leer matriz(i,j)
		FinPara
	FinPara
	
	Para i = 0 hasta filas-1 con paso 1 Hacer
		suma = 0
		Para j = 0 hasta 1 con paso 1 Hacer
			suma = matriz (i,j) + suma
		FinPara
		matriz(i,2) = suma
	FinPara
	
	Para i = 0 hasta filas-1 con paso 1 Hacer
		Para j = 0 hasta 2 con paso 1 Hacer
			Escribir sin saltar "[" matriz(i,j) "]"
			Si j = 0 Entonces
				Escribir sin saltar " + "
			FinSi
			Si j = 1 Entonces
				escribir Sin Saltar " = "
			FinSi
		FinPara
		Escribir ""
	FinPara
	
	
FinAlgoritmo
	
	
	
	

