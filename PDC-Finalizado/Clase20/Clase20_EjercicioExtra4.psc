//Crear un vector que contenga 100 notas de 100 supuestos estudiantes, con valores entre 0 y
//20 generadas aleatoriamente mediante el uso de la función azar() o aleatorio() de PseInt.
//Luego, de acuerdo a las notas contenidas, el programa debe indicar cuántos estudiantes son:
//	a) Deficientes 0-5
//	b) Regulares 6-10
//	c) Buenos 11-15
//	d) Excelentes 16-20

Algoritmo Clase20_EjercicioExtra4
	Definir vector, deficientes, regulares, buenos, excelentes, i Como Entero
	Dimension vector[100]
	
	deficientes = 0
	regulares = 0
	buenos = 0
	excelentes = 0
	
	Para i = 0 Hasta 99 Con Paso 1 Hacer
		vector[i] = Aleatorio(0,20)
		
		Si vector[i] >= 0 Y vector[i] <= 5 Entonces
			deficientes = deficientes + 1
		FinSi
		
		Si vector[i] >= 6 Y vector[i] <= 10 Entonces
			regulares = regulares + 1
		FinSi
		
		Si vector[i] >= 11 Y vector[i] <= 15 Entonces
			buenos = buenos + 1
		FinSi
		
		Si vector[i] >= 16 Y vector[i] <= 20 Entonces
			excelentes = excelentes + 1
		FinSi
		
	FinPara
	
	Escribir "La cantidad de alumnos deficientes es: " deficientes
	Escribir ""
	Escribir "La cantidad de alumnos regulares es: " regulares
	Escribir ""
	Escribir "La cantidad de alumnos buenos es: " buenos
	Escribir "" 
	Escribir "La cantidad de alumnos excelentes es: " excelentes
FinAlgoritmo
