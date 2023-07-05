Algoritmo contadorDeCaracteres
	Definir n, contador Como Entero
	Escribir "Defina un numero"
	Leer n
	
	contador = 0
	
	Mientras n >= 1 Hacer
		n = trunc(n/10)
		contador = contador + 1
	FinMientras
	Escribir "El numero tiene: ",contador, "caracteres"
FinAlgoritmo
