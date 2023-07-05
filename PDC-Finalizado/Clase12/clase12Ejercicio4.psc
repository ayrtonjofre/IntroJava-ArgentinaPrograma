//Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La fun-
//ción debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso de la fun-
//	ción Subcadena().

Algoritmo clase12Ejercicio4
	
	Definir cad, letr, canti Como Caracter
	
	Escribir "Ingrese una frase"
	Leer cad
	Escribir " "
	
	Escribir "Ingrese una letra a buscar en la frase"
	Leer letr
	Escribir " "
	
	canti = Deteccion (cad, letr)
	
	Escribir "La cantidad de veces que aparece esa letra en la frase es de " canti
	
FinAlgoritmo


Funcion cade <- Deteccion(caden, letra)
	
	Definir i, cont, cade Como Entero
	
	cont = 0
	
	Para  i = 0 Hasta  Longitud(caden) Hacer
		
		si subcadena(caden, i, i) = letra Entonces
			
			cont = cont + 1
			
		FinSi
		
	FinPara
	
	cade = cont
	
FinFuncion
	