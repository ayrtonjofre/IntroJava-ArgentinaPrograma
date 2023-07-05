Algoritmo Clase19_Ejercicio5
	
	Definir vector,mayr Como Entero
	Escribir "ingrese 5 valores"
	dimension vector[5]
	mayr = -100
	biggest(vector, mayr)
FinAlgoritmo

Funcion biggest(vector, mayr)	
	Definir i Como Entero
	para i<-0 hasta 4
		leer vector[i]
	FinPara
	
	para i<-0 hasta 4 con paso 1 Hacer
		si(vector[i]>mayr) Entonces
			mayr = vector[i]
		FinSi
	FinPara
	escribir "El mayor número es el: ", mayr
FinFuncion
	