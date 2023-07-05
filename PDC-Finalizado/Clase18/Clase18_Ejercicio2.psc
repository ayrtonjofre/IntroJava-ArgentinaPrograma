//Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo y
//
//muestre por pantalla la suma, resta y multiplicación de todos los números ingresados al arre-
//glo.

Algoritmo Clase18_Ejercicio2
	Definir arreglo, i, suma, resta, multiplicar Como Entero
	Dimension arreglo[10]
	Escribir "Indique 10 numeros enteros: "
	
	Para i = 0 Hasta 9 Con paso 1 Hacer
		Leer arreglo[i]
	FinPara
	
	//Suma
	suma = 0
	Para i = 0 Hasta 9 Con Paso 1 Hacer
		suma = suma + arreglo[i]
	FinPara
	
	Escribir "Las suma de todos los numeros es: ", suma
	Escribir ""
	
	//Resta
	resta = 0
	Para i = 0 Hasta 9 Con Paso 1 Hacer
		resta = resta - arreglo[i]
	FinPara
	
	Escribir "Las resta de todos los numeros es: ", resta
	Escribir ""
	
	//Multiplicacion
	multiplicar = 1
	Para i = 0 Hasta 9 Con Paso 1 Hacer
		multiplicar = multiplicar * arreglo[i]
	FinPara
	
	Escribir "Las multiplicacion de todos los numeros es: ", multiplicar
	Escribir ""
	
FinAlgoritmo

