Algoritmo calculo
	
	definir num, suma, conta Como Entero
	suma = 0
	conta = 0
	
	hacer 
		
		escribir "Ingrese un numero"
		leer num
		si num mod 2 = 0
			suma = suma + num
			conta = conta + 1
		SiNo
			escribir "El numero no es par"
		FinSi
		
	Mientras Que conta < 5
	escribir "La suma de los numeros pares es: " suma
	
	
FinAlgoritmo
