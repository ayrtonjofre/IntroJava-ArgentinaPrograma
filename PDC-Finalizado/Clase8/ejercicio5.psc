Algoritmo parimpar
	
	definir num, numpar, numimpar, conta Como Entero
	
	conta = 0
	numpar = 0
	numimpar = 0
	
	hacer
		
		escribir "Ingrese un numero"
		leer num
		
		conta = conta + 1
		si num mod 2 = 0 Entonces
			numpar = numpar + 1
		SiNo
			numimpar = numimpar + 1
			
		FinSi
		
    mientras que conta < 10
	
	escribir "El total de numeros pares es: " numpar " , el total de numeros impares es: " numimpar
	
FinAlgoritmo
