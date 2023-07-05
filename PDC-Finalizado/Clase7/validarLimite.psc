Algoritmo validarLimite
	Definir num, sentinela, limite Como Entero
	Escribir "Ingrese un numero entero y positivo"
	Leer num
	
	limite = 100
	sentinela = num
	Mientras sentinela < limite Hacer
		Escribir "Ingrese numeros hasta llegar al limite previsto"
		Leer num
		sentinela = sentinela + num
	Fin Mientras
	Escribir "Has llegado al limite que es: ", sentinela
	
FinAlgoritmo
