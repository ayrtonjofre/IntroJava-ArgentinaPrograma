//Una compañía de seguros tiene contratados a n vendedores. Cada vendedor realiza
//múltiples ventas a la semana. 
//La política de pagos de la compañía es que cada vendedor
//recibe un sueldo base más un 10% extra por comisiones de sus ventas. El gerente de la
//compañía desea saber, por un lado, cuánto dinero deberá pagar en la semana a cada
//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cuánto
//deberá pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
//	vendedor ingresar cuanto es su sueldo base, cuantas ventas realizó y cuanto cobró por
//cada venta.

Algoritmo compania
	
	Definir vend, i, j , ventas Como Entero
	Definir sBase, comis, sTotal, precio Como Real
	Definir nomvend Como Caracter
	
	Escribir "Ingrese cantidad de vendedores"
	Leer vend
	
	Para i = 1 Hasta vend Con Paso 1 Hacer // <- funciona como = 
		
		ventas <- 0
		comis <- 0
		precio <- 0
		
		Escribir Sin Saltar "Ingrese nombre de vendedor " i ":"
		Leer nomvend
		
		Escribir Sin Saltar "Ingrese sueldo base" 
		Leer sBase
		
		Escribir Sin Saltar "Ingrese cantidad de ventas" 
		Leer ventas
		
		
		Para j <- 1  Hasta ventas Con Paso 1 Hacer
			
			Escribir "Ingrese monto de venta " j ":"
			Leer precio
			comis <- (precio * 0.10) + comis
//			Si i > 1  Entonces
//				comis <- 0 
//			FinSi
		Fin Para 
		
		Escribir "Cobro por ventas $" , comis 
		
		sTotal <- sBase + comis
		
		Escribir "Debera pagar al vendedor " i ":" , sTotal
		
	Fin Para
	
FinAlgoritmo
