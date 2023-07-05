//Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios y los
//muestre por pantalla.

Algoritmo Clase20_EjercicioExtras1
	Definir vector1, vector2, i Como Entero
	Dimension vector1[5], vector2[5]
	
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		vector1[i]=Aleatorio(0,100)
		vector2[i]=Aleatorio(0,100)
	FinPara
	
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		Escribir vector1[i] " " Sin Saltar
	FinPara
	Escribir ""
	Para i = 0 Hasta 4 Con Paso 1 Hacer
		Escribir vector2[i] " " Sin Saltar
	FinPara
	
FinAlgoritmo
