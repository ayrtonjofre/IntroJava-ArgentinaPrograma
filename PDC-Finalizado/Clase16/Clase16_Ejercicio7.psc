Algoritmo Clase16_Ejercicio7
	
	definir alt Como Entero
	escribir "Ingrese la altura de la escalera"
	leer alt
	escalera(alt)
	
FinAlgoritmo

SubProceso escalera(alt)
	
	definir i, f Como Entero
	para i <- 1 hasta alt Hacer
		
		para f <- 1 hasta i Hacer
			
			escribir f Sin Saltar
			
		FinPara
		
		escribir " "
		
	FinPara
	
FinSubProceso