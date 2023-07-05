Algoritmo validacionClave
	Definir b Como Entero
	Definir a Como Caracter
	b=0
	Repetir
		Escribir "ingrese la clave"
		leer a
		a=Minusculas(a)
		b=b+1
	Mientras Que a<>"eureka" y b<3
	si b=3 y a<>"eureka"
		escribir "error"
	FinSi
	si a="eureka"
		Escribir "todo piola"
	FinSi
FinAlgoritmo