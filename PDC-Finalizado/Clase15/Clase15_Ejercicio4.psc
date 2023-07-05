Algoritmo act_4
	Definir frase Como Caracter
	Escribir "ingrese una frase"
	Leer frase
	cambiarFrase(frase)
FinAlgoritmo

SubProceso cambiarFrase(frase)
	Definir i Como Entero
	
	Definir x, nuevaFrase, vocal, nuevaVocal Como Caracter
	
	
	Para i = 0 Hasta Longitud(frase) Hacer
		x = Subcadena (frase,i,i)
		Segun  x hacer
			"a" :
				x = "@"
				
			"e":
				x = "#"
				
			"i":
				x = "$"
				
			"o":
				x = "%"
				
			"u":
				x = "*"
		FinSegun
		
		Escribir Sin Saltar x, " " 
	FinPara
FinSubProceso