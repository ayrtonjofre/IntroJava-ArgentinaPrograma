////Tomando en cuenta el ejercicio 6, mejore el mecanismo de inserción del carácter, facilitando
////un potencial reordenamiento del vector. Digamos que se pide ingresar el carácter en la
////posición X y la misma está ocupada, entonces de existir un espacio en cualquier posición X-n
////o X+n, desplazar los caracteres hacia la izq o hacia la derecha para poder ingresar el carácter
////	en cuestión en el lugar deseado. El procedimiento de reordenamiento debe ubicar el espacio
////	más cercano.
////Por ejemplo, suponiendo la siguiente frase y los subíndices del vector:
////	H o l a m u n d o c r u e l !
////	0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
////	
////	Si se desea ingresar el carácter "%" en la posición 8, entonces el resultado con desplaza-
////	miento sería:
////		
////		h o l a m u n % d o c r u e l !
////		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
////		
////		Notar que el desplazamiento se hizo hacia la izquierda porque el espacio de la posición 10 es-
////		taba más cerca de la posición 8 que el espacio de la posición 4.


Algoritmo encuentro20_extra5
	Definir vect,frase Como Caracter
	Dimension vect[20]
	
	Escribir "ingrese la frase"
	Leer frase
	llenar(frase,vect)
	letra(vect)
FinAlgoritmo

SubProceso llenar(frase,vect)
	Definir i Como Entero
	
	Para i=0 Hasta 19  Hacer
		vect[i] = Subcadena(frase,i,i)
		
		
	Fin Para
	Para i=Longitud(frase) Hasta 19  Hacer
		vect[i] = " "
	Fin Para
	
FinSubProceso

SubProceso mostra(vect)
	Definir i Como Entero
	
	Para i=0 Hasta 19  Hacer
		Escribir vect[i] Sin Saltar
		
	Fin Para
FinSubProceso

SubProceso letra(vect)
	Definir pos Como Entero
	Definir let Como Caracter
	
	Repetir
		Escribir "que letra quiere ingresar?"
		leer let
		si Longitud(let) >1 o let="" o let=" " Entonces
			Escribir "ingrese solo una letra"
		FinSi
	Mientras Que let="" o let=" " o Longitud(let) > 1
	Escribir "en que lugar quiere ingresar(0-19)"
	leer pos
	
	Si vect[pos] = " " o vect[pos] ="" Entonces
		vect[pos] = let
		mostra(vect)
	SiNo
		Colocar_y_Desplazar(vect,pos,let)
	Fin Si
FinSubProceso
////

SubProceso Colocar_y_Desplazar(vect,pos,let)
	Definir i,  posVaciaIzq, posVaciaDer Como Entero
	Definir vectNue Como Caracter
	Dimension vectNue[20]
	Para i=0 hasta 19 hacer //llenar vector auxiliar en el que se almacenará la frase nueva
		vectNue[i]=vect[i]
	FinPara
	Para i=pos hasta 19 Hacer //Busco la posición vacía hacia la derecha
		Si vect[i]="" o vect[i]=" " Entonces
			posVaciaDer=i
			i=19
		FinSi
	FinPara
	Para i=pos hasta 0 Hacer //Busco la posición vacía hacia la izquierda
		Si vect[i]="" o vect[i]=" " Entonces
			posVaciaIzq=i
			i=0
		FinSi
	FinPara
	Si (pos-posVaciaIzq)>abs(pos-posVaciaDer) Entonces
		Para i=(pos+1) hasta 18 hacer
			vectNue[i]=vect[i-1]
		FinPara
		vectNue[pos]=let
	SiNo
		Para i=(pos-1) hasta 0 hacer
			vectNue[i]=vect[i+1]
		FinPara
		vectNue[pos]=let
	FinSi
	mostra(vectNue)
FinSubProceso