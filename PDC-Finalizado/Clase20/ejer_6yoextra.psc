

Funcion retorno <- valores ( n,resultado )
	Definir vector,i,retorno,vmin,vmax Como Entero
	Dimension vector[n]
	vmin=0
	vmax=0
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		vector[i] = Aleatorio(1,20)
		Escribir Sin Saltar vector[i]," , "
		si vmin < vector[i] Entonces
			vmin=vector[i]
			
		FinSi
		si vmax > vector[i] Entonces
			vmax = vector[i]
		FinSi
		Escribir ""
	Fin Para
	
	 resultado= vmin-vmax
Fin Funcion

////Crear una función que devuelva la diferencia que hay entre el valor más chico de un arreglo y
////su valor más grande.



Algoritmo ejer_6yoextra
	Definir n ,resultado Como Entero
	resultado=0
	Escribir "Ingrese la dimencion del vector"
	leer n
	Escribir valores(n,resultado)
	
FinAlgoritmo
