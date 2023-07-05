//Realizar un programa que pida una frase y el programa deberá mostrar la frase con un
//espacio entre cada letra. La frase se mostrará así: H o l a. Nota: recordar el funcionamiento
//		de la función Subcadena().


Algoritmo ejer_2a
	
	Definir  i, x Como entero
	definir frase, frase2 Como Caracter
	
	
	Escribir "Ingrese una frase"
	leer frase
	x = Longitud(frase)
	
	
	Para i=0 Hasta x con paso 1 Hacer
		
		
		frase2 = subcadena(frase, i,i)
		Escribir sin saltar frase2 ," " 
		
	Fin Para
	
	
FinAlgoritmo
