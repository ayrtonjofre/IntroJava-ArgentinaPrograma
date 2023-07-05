//Una compañía de seguros tiene contratados a n vendedores.
//Cada vendedor realiza múltiples ventas a la semana.
//La política de pagos de la compañía es que cada vendedor recibe un sueldo base más un 10% extra por comisiones de sus ventas.
//El gerente de la compañía desea saber, por un lado, cuánto dinero deberá pagar en la semana a cada vendedor por concepto de 
//comisiones de las ventas realizadas, y por otro lado, cuánto deberá pagar a cada vendedor como sueldo total (sueldo base + comisiones).
//Para cada vendedor ingresar cuanto es su sueldo base, cuantas ventas realizó y cuanto cobró por cada venta.

Algoritmo VentaSeguros
	Definir vendedor, ventas, v, vc Como Entero
	Definir com, sueldobase, acumcom Como Real
	
	
	Escribir "Ingrese la cantidad de vendedores"
	Leer vendedor //cantidad de vendedores 
	
	Si vendedor > 0 Entonces
		
		Para v=1 Hasta vendedor Hacer
			Escribir "Ingrese el sueldo base para el vendedor " v
			Leer sueldobase 
			
			Escribir "Ingrese la cantidad de ventas que ingresará para el vendedor " v
			leer ventas
			
			acumcom=0 //el acumulador de comisiones se pone en cero para cada vendedor
			
			Para vc=1 Hasta ventas Hacer
				Escribir "Ingrese el monto de la venta " vc " del vendedor " v
				Leer com
				acumcom=acumcom+com // acumulando cada venta ingresada se podría mostrar en cada que corresponde
			FinPara
			
			Escribir "Sueldo base: " sueldobase
			Escribir "Total de ventas: " ventas
			Escribir "Comisiones acumuladas: " acumcom*0.1
			Escribir "El sueldo total para el vendedor " v " es: " sueldobase+acumcom*0.1
			Escribir " "
			Esperar Tecla // Espera una tecla para continuar el ingreso del próximo vendedor
		FinPara
	FinSi
	
	
FinAlgoritmo
