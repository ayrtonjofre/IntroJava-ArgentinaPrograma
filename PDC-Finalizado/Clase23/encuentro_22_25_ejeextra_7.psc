//Una empresa de venta de productos por correo desea realizar una estadística de las ventas
//
//realizadas de cada uno de sus productos a lo largo de una semana. Distribuya luego 5 produc-
//tos en los 5 días hábiles de la semana. Se desea conocer:
//	
//	a) Total de ventas por cada día de la semana.
//	b) Total de ventas de cada producto a lo largo de la semana.
//	c) El producto más vendido en cada semana.
//	d) El nombre, el día de la semana y la cantidad del producto más vendido.

Algoritmo  encuentro_22_25_ejeextra_7
	
	Definir matriz,i,j,k,vector, suma,s, sumaTs, mayor, mayor_Dia, producto,l Como Entero
	Definir vectorD, vectorP Como Caracter
	Dimension matriz(5,5)
	Dimension vectorD(7)
	Dimension vectorP(5)
	Dimension suma(5)
	Dimension sumaTs(5)
	Dimension mayor(5)
	Dimension mayor_Dia(5)
	
	producto = 0
	
	Para i <- 0 Hasta 4 Con Paso 1 Hacer
		Para j <- 0 Hasta 4 Con Paso 1 Hacer
			matriz(i,j) = Aleatorio(1,500)
		Fin Para
	Fin Para
	
	vectorD(0) = " "
	vectorD(1) = "lunes"
	vectorD(2) = "martes"
	vectorD(3) = "miercoles"
	vectorD(4) = "jueves"
	vectorD(5) = "viernes"
	vectorD(6) = "total producto"
	
	vectorP(0) = "producto 1"
	vectorP(1) = "producto 2"
	vectorP(2) = "producto 3"
	vectorP(3) = "producto 4"
	vectorP(4) = "producto 5"
	
	//suma total de los productos
	Para i <- 0 Hasta 4 Con Paso 1 Hacer
		suma(i) = 0
		Para j <- 0 Hasta 4 Con Paso 1 Hacer
			suma(i) = suma(i) + matriz(i,j)
		Fin Para
	Fin Para
	Escribir ""
	
	//suma total de productos por dia
	Para j <- 0 Hasta 4 Con Paso 1 Hacer
		sumaTs(j) = 0
		Para i <- 0 Hasta 4 Con Paso 1 Hacer
			sumaTs(j) = sumaTs(j) + matriz(i,j)
		Fin Para
	Fin Para
	Escribir ""
	
	// el mayor de cada producto de la semana
	Para i <- 0 Hasta 4 Con Paso 1 Hacer
		mayor(i) = 0
		Para j <- 0 Hasta 4 Con Paso 1 Hacer
			Si mayor(i) < matriz(i,j) Entonces
				mayor(i) = matriz(i,j)
			Fin Si
		Fin Para
	Fin Para
	Escribir ""
	
	// el mayor de un producto en cada dia
	Para j <- 0 Hasta 4 Con Paso 1 Hacer
		mayor_Dia(j) = 0
		Para i <- 0 Hasta 4 Con Paso 1 Hacer
			Si mayor_Dia(j) < matriz(i,j) Entonces
				mayor_Dia(j) = matriz(i,j)
			Fin Si
		Fin Para
	Fin Para
	Escribir ""
	
	// escribir el cuadro
	Para i <- 0 Hasta 6 Con Paso 1 Hacer
		Escribir "[" vectorD(i) "]" Sin Saltar
	Fin Para
	Escribir ""
	
	Para i <- 0 Hasta 5 Con Paso 1 Hacer
		Si i = 0  Entonces
			Escribir "producto 1", "|", "[" matriz(i,0) "]", "|", "[" matriz(i,1) "]", "|", "[" matriz(i,2) "]", "|", "[" matriz(i,3) "]", "|", "[" matriz(i,4) "]", "|", "[" suma(i) "]", "|"
		Fin Si
		Si i = 1 Entonces
			Escribir "producto 2", "|", "[" matriz(i,0) "]", "|", "[" matriz(i,1) "]", "|", "[" matriz(i,2) "]", "|", "[" matriz(i,3) "]", "|", "[" matriz(i,4) "]", "|", "[" suma(i) "]", "|"
		Fin Si
		Si i = 2 Entonces
			Escribir "producto 3", "|", "[" matriz(i,0) "]", "|", "[" matriz(i,1) "]", "|", "[" matriz(i,2) "]", "|", "[" matriz(i,3) "]", "|", "[" matriz(i,4) "]", "|", "[" suma(i) "]", "|"
		Fin Si
		Si i = 3 Entonces
			Escribir "producto 4", "|", "[" matriz(i,0) "]", "|", "[" matriz(i,1) "]", "|", "[" matriz(i,2) "]", "|", "[" matriz(i,3) "]", "|", "[" matriz(i,4) "]", "|", "[" suma(i) "]", "|"
		Fin Si
		Si i = 4 Entonces
			Escribir "producto 5", "|", "[" matriz(i,0) "]", "|", "[" matriz(i,1) "]", "|", "[" matriz(i,2) "]", "|", "[" matriz(i,3) "]", "|", "[" matriz(i,4) "]", "|", "[" suma(i) "]", "|"
		Fin Si
		Si i = 5 Entonces
			Escribir "el total de la semana es: ", "|", "[" sumaTs(0) "]", "|", "[" sumaTs(1) "]", "|", "[" sumaTs(2) "]", "|", "[" sumaTs(3) "]", "|", "[" sumaTs(4) "]", "|"
		Fin Si
	Fin Para
	Escribir ""
	
	Escribir "el producto mas vendido es: ", "|", "[" mayor_Dia(0) "]", "|", "[" mayor_Dia(1) "]", "|", "[" mayor_Dia(2) "]", "|", "[" mayor_Dia(3) "]", "|", "[" mayor_Dia(4) "]", "|"
	Escribir ""
	
	// guardo el producto mas vendido de la semana
	Para i <- 0 Hasta 4 Con Paso 1 Hacer
		Si producto < mayor(i) Entonces
			producto = mayor(i)
		Fin Si
	Fin Para
	Escribir ""
	
	k = 0
	l = 0
	Para i <- 0 Hasta 4 Con Paso 1 Hacer
		Para j <- 0 Hasta 4 Con Paso 1 Hacer
			Si producto = matriz(i,j) Entonces
				k = i
				l = j + 1
			Fin Si
		Fin Para
	Fin Para
	
	Escribir "el dia ", vectorD(l), " el ", vectorP(k), " fue el mas vendido con una cantidad de ", producto 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
FinAlgoritmo
