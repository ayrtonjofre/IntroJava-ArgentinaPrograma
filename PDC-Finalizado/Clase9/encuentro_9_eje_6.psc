//  Siguiendo el ejercicio 20 de los ejercicios principales, ahora deberemos hacer lo mismo
//  pero que la cadena se muestre al revés. Por ejemplo, si tenemos la cadena: Hola,
//	deberemos mostrar a l o H.

Algoritmo encuentro_9_eje_6
	
	Definir frase, frase2 Como Caracter
	Definir i, j, aux, aux2 Como Entero
	Escribir "ingrese una frase"
	Leer frase
	
	aux = Longitud(frase)
	frase2 = " "
	j = 1
	
	Para i<- 1 Hasta aux Con Paso 1 Hacer
		frase2 = frase2 + Subcadena(frase, aux-j, aux-j)
		j = j + 1
	Fin Para
	
	aux2 = Longitud(frase2)
	
	Para i <- 0 Hasta aux Con Paso 1 Hacer
		Escribir Sin Saltar Subcadena(frase2,i,i) " "
	Fin Para
	
FinAlgoritmo
