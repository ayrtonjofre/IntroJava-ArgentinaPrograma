
//Una compañía de seguros tiene contratados a n vendedores. Cada vendedor realiza
//múltiples ventas a la semana. La política de pagos de la compañía es que cada vendedor
//recibe un sueldo base más un 10% extra por comisiones de sus ventas. El gerente de la
//compañía desea saber, por un lado, cuánto dinero deberá pagar en la semana a cada
//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cuánto
//deberá pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
//	vendedor ingresar cuanto es su sueldo base, cuantas ventas realizó y cuanto cobró por
//cada venta.

Algoritmo day10_eje1
	Definir i, j, n Como Entero
	Definir sueldo,a , b, c, comision Como Real
	Escribir "Ingrese la cantidad de trabajadores"
	Leer n
	
	a = 0
	b = 0
	c = 0
	comision = 0
	
	Para i <- 1 Hasta n Con Paso 1 Hacer
		i = i + 0
		Para j <- 0 Hasta n Con Paso 1 Hacer
			Si i<n Entonces
			j = j + 1
			Escribir "Ingrese el sueldo del trabajador"
			Leer sueldo
			Escribir "Ingrese las tres ventas del mes"
			Leer a
			Leer b
			Leer c
			comision=(a+b+c) * .10
			Escribir "Los datos del trabajador: ", j, " son:"
			Escribir "El saldo mensual es: ", sueldo
			Escribir "La comision del vendedor es ", comision
			Escribir "El sueldo y comision es de: ", sueldo + comision
			Escribir "_______________________________________"
			FinSi
		FinPara
	FinPara	

FinAlgoritmo
