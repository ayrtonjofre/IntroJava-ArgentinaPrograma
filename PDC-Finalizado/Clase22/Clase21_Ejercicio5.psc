//Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario, encon-
//trando la manera de que la frase se muestre de manera continua en la matriz.
//
//Por ejemplo, si tenemos la palabra habilidad, nuestra matriz se debería ver así:
//		H A B
//		I L I
//		D A D

Algoritmo Clase21_Ejercicio5
	Definir matriz, palabra,x Como Caracter
	Definir i, j,n Como Entero
	Dimension matriz[3,3]
	Escribir "Por favor ingrese una palabra de 9 caracteres: "
	Leer palabra
	Hacer
		
	si longitud(palabra)>9 entonces 
		Escribir "Superaste los 9 digitos"
	FinSi
	
Hasta Que Longitud(palabra) <= 9 
n=0
para i<-0 hasta 2 con paso 1 Hacer
	
	para j<-0 hasta 2 Con Paso 1 hacer
		
		x=subcadena(palabra,j+n,j+n)
		matriz(i,j)=x
		
	FinPara
	n=n+3
finpara

Para i=0 Hasta 2 Con Paso 1 Hacer
	Para j = 0 Hasta 2 Con Paso 1 Hacer
		Escribir matriz[i,j] " " Sin Saltar
	FinPara
	Escribir " "
FinPara

FinAlgoritmo
