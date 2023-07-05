//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es
//capicúa o no (Por ejemplo: 12321). Nota: recordar el uso del MOD y el Trunc. No podemos
//transformar el numero a cadena para realizar el ejercicio.
Algoritmo Ejercicio17
	
	definir num Como Entero
	
	escribir "Indique un numero"
	leer num
	
	escribir capi(num)
	
FinAlgoritmo

funcion cuenta <- capi(num)
	
	definir  d1, d2, d3, d4, d5 Como entero
	
	si num > 9999 y num <= 99999
		
		d5 = num mod 10
		num = trunc(num /10)
		d4 = num mod 10
		num = trunc(num / 10)
		d3 = num mod 10
		num = trunc(num/10)
		d2 = num mod 10
		num = trunc(num/10)
		d1 = num mod 10
		
		si d1 = d5 y d2 = d4
			escribir "El numero es capicua"
		SiNo
			escribir "El numero no es capicua"
		FinSi
		
	FinSi
		
		
    si num >999 y num <=9999
		
		d4 = num mod 10
		num = trunc(num / 10)
		d3 = num mod 10
		num = trunc(num/10)
		d2 = num mod 10
		num = trunc(num/10)
		d1 = num mod 10
		
		si d1 = d4 y d2 = d3
			escribir "El numero es capicua"
		SiNo
			escribir "El numero no es capicua"
		FinSi
		
	FinSi
	
	si num > 99 y num <=999
		
		d3 = num mod 10
		num = trunc(num/10)
		d2 = num mod 10
		num = trunc(num/10)
		d1 = num mod 10
		
		si d1 = d3
			escribir "El numero es capicua"
		SiNo
			escribir "El numero no es capicua"
		FinSi
		
	FinSi
	
	si num > 9 y num <= 99 
		
		d2 = num mod 10
		num = trunc(num/10)
		d1 = num mod 10
		
		si d1 = d2
			escribir "El numero es capicua"
		SiNo
			escribir "El numero no es capicua"
		FinSi
		
	FinSi
	
FinFuncion
	