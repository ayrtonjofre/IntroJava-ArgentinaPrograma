Algoritmo cuadrado
	Definir a, b, n Como Entero
	Escribir "Defina un numero para calcular los lados: "
	Leer n
	
	Para a = 1 Hasta n Hacer
		Para b = 1 Hasta n Hacer
			Si a > 1 y a < n y b > 1 y b > n Entonces // como da todo falso la lineas dan como falso cumpliendo la segunda condicion
				Escribir Sin Saltar "  "
			SiNo
				Escribir Sin Saltar "* "
			Fin Si
		FinPara
		Escribir " "
	FinPara
	
FinAlgoritmo
