Algoritmo  VendedoresDeUnaCompaniaDeSeguros
	Definir n, i, ventas, comisiones, pago, sueldo_base Como Real
    Escribir Sin Saltar "Ingresa el valor de n:";
    Leer n;
    Para i<-1 Hasta n Con Paso 1 Hacer
        Escribir "PROCESO ", i;
        Escribir Sin Saltar "Ingresa el valor de sueldo base:";
        Leer sueldo_base;
        Escribir Sin Saltar "Ingresa el valor de ventas: ";
        Leer ventas;
        comisiones <- (venta_1+venta_2+venta_3)*.10;
        pago <- sueldo_base+comisiones;
        Escribir "Valor de sueldo base: ", sueldo_base;
		Escribir "Valor de comisiones: ", comisiones
        Escribir "Valor de pago con comisiones: ", pago;
        Escribir "";
    FinPara
FinAlgoritmo
