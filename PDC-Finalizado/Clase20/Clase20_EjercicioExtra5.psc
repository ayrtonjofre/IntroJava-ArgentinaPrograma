//Tomando en cuenta el ejercicio 6, mejore el mecanismo de inserción del carácter, facilitando
//un potencial reordenamiento del vector. Digamos que se pide ingresar el carácter en la
//posición X y la misma está ocupada, entonces de existir un espacio en cualquier posición X-n
//o X+n, desplazar los caracteres hacia la izq o hacia la derecha para poder ingresar el carácter
//	en cuestión en el lugar deseado. El procedimiento de reordenamiento debe ubicar el espacio
//	más cercano.
//Por ejemplo, suponiendo la siguiente frase y los subíndices del vector:
//	H o l a m u n d o c r u e l !
//	0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
//	
//	Si se desea ingresar el carácter "%" en la posición 8, entonces el resultado con desplaza-
//	miento sería:
//		
//		h o l a m u n % d o c r u e l !
//		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
//		
//		Notar que el desplazamiento se hizo hacia la izquierda porque el espacio de la posición 10 es-
//		taba más cerca de la posición 8 que el espacio de la posición 4.

Algoritmo Clase20_EjercicioExtra5
	Definir vector,x,z,frase, vectorAux Como Caracter
	Definir bandera Como Logico
	Definir i, j, pos Como Entero
	Dimension vector(20), vectorAux(20)
	frase=""
	j = 0
	//Ingreso de frase en vector
	Escribir "Ingrese una frase"
	leer x
	
	Para i=0 Hasta 19 con paso 1 Hacer
		vector(i)=Subcadena(x,i,i)
		Escribir "[" ,vector[i], "]" Sin Saltar
	FinPara
	
		Escribir ""
		Escribir "Ingrese un caracter y posicion"		
		escribir "ingrese simbolo "
		leer z
		escribir "ingrese posicion "
		leer pos
		
		
		Para i = 0 Hasta 19 Con Paso 1 Hacer
			vectorAux(i)=vector(i)
		FinPara
		
		vector(pos) = z
		
		Para i = pos Hasta 19 Con Paso 1 Hacer
			j = i + 1
			Si j < 20 Entonces
				vector(j) = vectorAux(i) //Aca vuelvo al vector original, los valores del auxiliar corriendo el subindice con el contador "j"
			FinSi
		FinPara
	
	//Escribir final
	Para i=0 Hasta 19 con paso 1 Hacer
		Escribir "[" ,vector[i], "]" Sin Saltar
	FinPara
	escribir " "
	
	Para i=0 Hasta 19 con paso 1 Hacer
		frase=Concatenar(frase,vector(i))
	FinPara
	Escribir frase
FinAlgoritmo
