//Crear dos vectores que tengan el mismo tamaño (el tamaño se pedirá por teclado) y
//almacenar en uno de ellos nombres de personas como cadenas. En el segundo vector se
//debe almacenar la longitud de cada uno de los nombres (para ello puedes usar la función
//	Longitud() de PseInt). Mostrar por pantalla cada uno de los nombres junto con su longitud.

Algoritmo Clase20_EjercicioExtra3
	Definir vector1 Como Caracter
	Definir vector2, n, i Como Entero
	
	Escribir "Defina el tamaño del arreglo 1: "
	Leer n
	Dimension vector1[n], vector2[n]
	
	
	Escribir "Definir los nombres para cada subindice: "
	Para i = 0 Hasta n - 1 Con Paso 1 Hacer
		Leer vector1[i]
	FinPara
	
	Para i = 0 Hasta n - 1 Con Paso 1 Hacer
		vector2[i] = Longitud(vector1[i])
	FinPara
	
	Escribir "El vector 1 contiene: "
	Para i = 0 Hasta n - 1 Con Paso 1 Hacer
		Escribir vector1[i] " "
	FinPara
	
	Escribir "El vector 2 contiene: "
	Para i = 0 Hasta n - 1 Con Paso 1 Hacer
		Escribir vector2[i] " "
	FinPara
	
FinAlgoritmo
