//Crear un procedimiento que calcule la temperatura media de un día a partir de la temperatura
//
//máxima y mínima. Crear un programa principal, que, utilizando un procedimiento, vaya pi-
//diendo la temperatura máxima y mínima de n días y vaya mostrando la media de cada día. El
//
//programa pedirá el número de días que se van a introducir.


Algoritmo Clase15_Ejercicio2
	Definir numDias Como Real
	Escribir "Defina la cantidad de dias: "
	Leer numDias

	promedio(numDias)
	
FinAlgoritmo

SubProceso promedio(numDias)
	Definir media, tempMax, tempMin Como Real
	Definir i Como Entero
	
	Para i<-1 Hasta numDias Con Paso 1 Hacer
		Escribir " "
		Escribir "Defina la temperatura max"
		Leer tempMax
		Escribir "Defina la temepratura min"
		Leer tempMin
		media = (tempMin+tempMax)/2
		Escribir "La temperatura media del dia ", i, " es de: ", media, "°C"
		
	Fin Para
	

FinSubProceso
