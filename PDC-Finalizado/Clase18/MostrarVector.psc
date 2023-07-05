//EJERCICIO MOSTRAR VECTOR
//Ahora te toca a ti mostrar tus vectores. Además, define una nueva variable y aloja allí algún valor
//del vector.

Algoritmo MostrarVector
	Definir vector1, test, i Como Entero
	Dimension vector1[6]
	
	vector1[0] = 1
	vector1[1] = 2
	vector1[2] = 3
	vector1[3] = 4
	vector1[4] = 5
	vector1[5] = 6
	
	//Escribir 1 solo valor del vector seleccionando el indice
	Escribir vector1[2]
	
	Escribir ""
	
	//Escribir todos los valores del vector1 
	Para i = 0 Hasta 5 Con Paso 1 Hacer
		Escribir Sin Saltar vector1[i]
	FinPara
	Escribir ""
FinAlgoritmo
