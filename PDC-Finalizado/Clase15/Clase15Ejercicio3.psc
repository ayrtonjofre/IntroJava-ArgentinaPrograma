//Realizar un procedimiento que permita realizar la división entre dos números y muestre el co-
//ciente y el resto utilizando el método de restas sucesivas.
//El método de división por restas sucesivas consiste en restar el dividendo con el divisor hasta
//obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas
//realizadas es el cociente. Por ejemplo: 50 / 13:
//		50 ? 13 = 37 una resta realizada
//		37 ? 13 = 24 dos restas realizadas
//		24 ? 13 = 11 tres restas realizadas
//	dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
Algoritmo Ejercicio3
	
	definir num1, num2 Como Real
	escribir "Ingrese los numeros que desea dividir"
	leer num1, num2
	
	division(num1, num2)
	
FinAlgoritmo

SubProceso division(num1, num2)
	
	definir num3, conta como entero
	
	conta = 0
	num3 = num1 - num2
	
	mientras num3 > num2 hacer
		
		num3 = num1 - num2
		conta = conta +1
		escribir "La division de: " num1 " - " num2 " es igual a: " num3 
		escribir  conta " resta realizada"
		num1 = num3
		
		si num3 < num2 entonces 
			escribir "El resto es: " num3
		FinSi
		
	Finmientras
	
FinSubProceso
	