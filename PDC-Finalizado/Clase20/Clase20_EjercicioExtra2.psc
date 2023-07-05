//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//usuario y muestre por pantalla el promedio de la suma de todos los valores ingresados.

Algoritmo Clase20_EjercicioExtra2
	Definir vector, n, i, suma Como Entero
	suma = 0
	
	Escribir "Defina el tamaño del vector: "
	Leer n
	Dimension vector[n]
	
	Escribir "Definir los valores de los subindices: "
	Para i = 0 Hasta n - 1 Con Paso 1 Hacer
		Leer vector[i]
	FinPara
	
	Para i = 0 Hasta n - 1 Con Paso 1 Hacer
		suma = suma + vector[i]
	FinPara
	
	Escribir "El promedio del arreglo es: " suma / n
	
FinAlgoritmo
