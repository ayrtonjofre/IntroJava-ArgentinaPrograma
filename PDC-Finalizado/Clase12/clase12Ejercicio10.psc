Algoritmo clase12Ejercicio10
	
	Definir num Como Real
	Escribir "Ingresse un numero de dos caracteres:"
	Leer num
	
	Escribir "La suma de los digitos del numero es: " sumar(num)
FinAlgoritmo

Funcion suma <- sumar(num)
	
	Definir suma, d1, d2 Como Real
	
	Si num > 99 Entonces
		Escribir "Error, ingrese 2 caracteres"
		Leer num
	FinSi
	
	d1= trunc (num / 10)
	d2= num mod 10
	
	suma = d1 + d2
	
FinFuncion
