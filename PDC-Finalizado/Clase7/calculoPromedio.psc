Algoritmo calculoPromedio
	Definir num, suma, contador Como Entero
	Escribir "Ingrese numero"
	Leer num
	
	suma<-0
	contador<-0
	
	Mientras (num <> -1) Hacer
		suma <- suma + num
		contador <- contador + 1
		Leer num
	Fin Mientras
	Escribir suma/(contador)
FinAlgoritmo
