//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es
//primo o no. Un número es primo cuando es divisible sólo por 1 y por sí mismo, por ejemplo: 2,
//3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.

Algoritmo clase12Ejercicio5
	
	Definir num como entero
	
	Escribir "Ingrese un numero"
	Leer num
	Escribir " "
	
	si Primo(num) Entonces
		
		Escribir "Este numero es primo"
		
	SiNo
		
		Escribir "Este numero no es primo"
		
	FinSi
	
FinAlgoritmo


Funcion pri <- Primo(num)
	
	Definir pri Como Logico
	
	
	pri  = (num mod num = 0) y (num mod 1 = 0) y (num mod 2 <> 0) 
	
FinFuncion
	