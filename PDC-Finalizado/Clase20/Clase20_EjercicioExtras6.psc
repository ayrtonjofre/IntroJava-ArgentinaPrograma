//Crear una función que devuelva la diferencia que hay entre el valor más chico de un arreglo y
//su valor más grande.

Algoritmo Ejercicios_Extras_Venctores_Nro6
	definir vector, ret Como Entero
	Dimension vector(4)
	
	Escribir "Ingrese los valores del vector:"
	para i=0 Hasta 3 Hacer
		leer vector(i)
	FinPara
	
	Escribir "La diferencia entre el valor mayor y menor es: "
	retor = diferencia(vector)
	Escribir retor
	
FinAlgoritmo

Funcion retorno = diferencia(vector)
	Definir may, men, j Como Entero
	
	para i=0 Hasta 3 Hacer
		j=i+1
		si j < 4
			Si vector(i) > vector(j)
				may = vector(i)
			FinSi
			Si vector(i) < vector(j)
				men = vector(i)
			FinSi
		FinSi
	FinPara
	Escribir "mayor" may
	Escribir " menor" men
	
	retorno = may - men
FinFuncion
