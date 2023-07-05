Algoritmo vectores
	Definir vector,x,z,pos,frase Como Caracter
	Definir bandera Como Logico
	Definir i Como Entero
	Dimension vector(20)
	frase=""
	
	Escribir "Ingrese una frase"
	leer x
	
	Para i=0 Hasta 19 con paso 1 Hacer
		vector(i)=Subcadena(x,i,i)
	FinPara
	
	Repetir
		Escribir ""
		Escribir "Ingrese un caracter y posicion"
		Para i=0 Hasta 19 con paso 1 Hacer //posiciones libres
			si vector(i)=" " Entonces
				escribir "Posicion libre en ",i
			FinSi
		FinPara
		leer z,pos
		
		si vector(pos)<>" " Entonces
			escribir "Espacio ocupado"
			bandera=Verdadero
		SiNo
			vector(pos)=z
			bandera=Falso
		FinSi
	Mientras Que bandera
	
	
	Para i=0 Hasta 19 con paso 1 Hacer
		frase=Concatenar(frase,vector(i))
	FinPara
	Escribir frase
FinAlgoritmo
