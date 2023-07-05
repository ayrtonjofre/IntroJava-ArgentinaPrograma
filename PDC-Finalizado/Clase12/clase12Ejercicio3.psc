//Crea una función EsMultiplo que reciba los dos números pasados por el usuario, validando
//
//que el primer número múltiplo del segundo y devuelva verdadero si el primer número es múlti-
//	plo del segundo, sino es múltiplo que devuelva falso.

Algoritmo clase12Ejercicio3
	
	Definir num1, num2 Como Entero
	Definir resul Como Logico
	
	Escribir "Ingrese el primer numero"
	Leer num1
	Escribir " "
	
	Escribir "Ingrese el segundo numero"
	Leer num2
	Escribir " "
	
	
	Escribir  EsMultiplo(num1, num2)
	
FinAlgoritmo

Funcion multi <- EsMultiplo(num1, num2)
	
	Definir multi Como Logico
	
	multi = num1 mod num2 = 0
	
FinFuncion
