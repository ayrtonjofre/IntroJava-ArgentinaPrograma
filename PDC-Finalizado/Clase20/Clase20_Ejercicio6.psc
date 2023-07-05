///Disponemos de un vector unidimensional de 20 elementos de tipo carácter. Se pide desarro-
///llar un programa que:
///	a) Pida una frase al usuario y luego ingrese la frase dentro del arreglo letra por letra.
///Ayuda: utilizar la función Subcadena de PSeInt.
///	b) Una vez completado lo anterior, pedirle al usuario un carácter cualquiera y una posi-
///	ción dentro del arreglo, y el programa debe intentar ingresar el carácter en la posición
///	indicada, si es que hay lugar (es decir la posición está vacía o es un espacio en
///	blanco). De ser posible debe mostrar el vector con la frase y el carácter ingresado, de
///	lo contrario debe darle un mensaje al usuario de que esa posición estaba ocupada.
///Por ejemplo, suponiendo la siguiente frase y los subíndices del vector:
///	H o l a m u n d o c r u e l !
///	0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
///Si se desea ingresar el carácter "%" en la posición 10, entonces el resultado sería:
///		H o l a m u n d o % c r u e l !
///	0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
//Escribir "[",a(i),"]" Sin Saltar

Algoritmo ejer_6yo
	Definir vector, frase,vectoraux Como Caracter
	definir i ,n Como Entero
	Dimension vector[20]
	vector(10)=""
	Escribir "ingrese una frase"
	Leer frase
	
	Para i=0 Hasta 19 Con Paso 1 Hacer
		vector[i] =SubCadena(frase,i,i)
		Escribir "[" ,vector[i], "]" Sin Saltar
		
		
		
		
	Fin Para

	Escribir " "
	Escribir "Usted desea ingresar % en la posicion numero 10"
	Escribir "1) SI"
	Escribir "2) NO"
	Leer n
	
	Para i=0 Hasta 19 Con Paso 1 Hacer
		si n = 1 y i = 10  Entonces
			vector(10) = "%"
			
		FinSi
		Escribir "[" ,vector[i], "]" Sin Saltar
	FinPara
	Escribir " "
	
	
FinAlgoritmo
