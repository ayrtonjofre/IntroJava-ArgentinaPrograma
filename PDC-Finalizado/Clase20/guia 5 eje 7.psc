Algoritmo vectores
	Definir vector1,vector2,i como entero
	Definir x Como Logico
	Dimension vector1(2)
	Dimension vector2(2)
	Para i=0 hasta 1 con paso 1 Hacer
		vector1(i)=Aleatorio(1,2)
		vector2(i)=Aleatorio(1,2)
	FinPara
	
	Escribir ""
	Para i=0 hasta 1 con paso 1 Hacer
		Escribir vector1(i) Sin Saltar
	FinPara
	Escribir ""
	Para i=0 hasta 1 con paso 1 Hacer
		Escribir vector2(i) sin saltar
	FinPara
	Escribir ""
	
	x=verdadero
	para i=0 hasta 1 con paso 1 Hacer
		si x=verdadero Entonces
			si vector1(i) <> vector2(i) Entonces
				x=falso
			FinSi
		finsi
	FinPara
	
	escribir x

FinAlgoritmo
