////Realizar un programa que permita visualizar el resultado del producto de una matriz de ente-
////ros de 3x3 por un vector de 3 elementos. Los valores de la matriz y el vector pueden iniciali-
////zarse evitando así el ingreso de datos por teclado. Para conocer más acerca de cómo se rea-
////liza la multiplicación entre matrices consultar el siguiente link:
Algoritmo ejer_6
	Definir matriz,i,j , vector,vectorAux Como Entero
	Dimension matriz[3,3]
	Dimension  vector[3] , vectorAux[3]
	
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			matriz[i,j] = Aleatorio(1,9)
		Fin Para
	Fin Para
	Escribir "matriz"
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			Escribir  "[",matriz[i,j],"]" " "; Sin Saltar
		Fin Para
		Escribir ""
	Fin Para
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		vector[i]=Aleatorio(1,9)
		vectorAux[i]=0
	Fin Para
	Escribir "vector"
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Escribir "[",vector[i],"]" Sin Saltar;
	Fin Para
	
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			vectorAux[i]= vectorAux[i]+ (matriz[i,j] * vector[i])
		Fin Para
		
	Fin Para
	Escribir ""
	Escribir "resultado"
	
	Para i<-0 Hasta 2 Con Paso 1 Hacer
		Escribir "[",vectorAux[i],"]" Sin Saltar
	Fin Para
	Escribir ""
FinAlgoritmo
