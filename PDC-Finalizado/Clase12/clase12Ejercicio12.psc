//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número
//tiene todos sus dígitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el
//numero en partes (si es un numero de más de un digito) y ver si cada número es par o impar.
//Nota: recordar el uso de la función Mod y Trunc(). No podemos pasar el numero a cadena para
//realizar el ejercicio.
Algoritmo Ejercicio15
	
	definir num Como Entero
	
	escribir "Ingrese un numero"
	leer num
	
	escribir "El numero tiene " impar(num) " digitos impares"
	
FinAlgoritmo

funcion conta <- impar(num)

	definir cent, dec, uni, conta Como Entero
	conta = 0 
	
	si num>99 y num<1000 Entonces
		
		cent = num mod 10
		uni = trunc(num/100)
		num = trunc(num/10)
		dec = num mod 10
		
		
		si cent mod 2 = 1   
			conta = conta + 1
		FinSi
		
		si  dec mod 2 = 1
			conta = conta + 1 
		FinSi
		
		si uni mod 2 = 1
			conta = conta +1
		FinSi
		
	sino 
		
		dec= trunc(num/10)
		uni= num mod 10
		
		si dec mod 2 = 1  
			conta = conta + 1
		FinSi
		
		si uni mod 2 = 1
			conta = conta + 1
		FinSi
		
	FinSi

FinFuncion

	
	
	