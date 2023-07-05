//Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo entero.
//La variable A, debe terminar con el valor de la variable B.

Algoritmo Clase15_Ejercicio1
	Definir num1, num2 Como Entero
	Escribir "Por favor defina 2 numeros de tipo entero"
	Leer num1, num2
	cambio(num1, num2)

FinAlgoritmo

SubProceso cambio(num1, num2)
	Definir contenedor Como Entero
	contenedor = num1
	num1 = num2
	num2 = contenedor
	
	Escribir num1, " ", num2
FinSubProceso
