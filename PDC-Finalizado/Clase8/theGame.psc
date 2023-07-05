Algoritmo theGame
	Definir r,n Como Entero
	r=Aleatorio(1,10)
	Repetir
		Escribir "adivine el nº del 1 al 10: "
		leer n
		si n>=1 y n<=10
			si n>r
				Escribir "el nº a adivinar es mas bajo"
			SiNo si n<r
					Escribir "el nº a adivinar es mas alto"
				FinSi
			FinSi
		FinSi
	Mientras Que no(n=r)
	Escribir "adivinaste es ",r
FinAlgoritmo