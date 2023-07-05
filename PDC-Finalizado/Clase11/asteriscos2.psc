Algoritmo asteriscos2
definir num,i,j Como Entero
para i = 0 hasta 4
	Escribir "ingrese numero"
	leer num
	si num >= 1 y num <= 20
		para j = 0 hasta num -1
			si j=0 Entonces
				Escribir Sin Saltar num " "		
			FinSi
			Escribir Sin Saltar "*"	
		FinPara
		Escribir ""
	SiNo
		Escribir "fuera de rango"
	FinSi
FinPara
Fin Algoritmo