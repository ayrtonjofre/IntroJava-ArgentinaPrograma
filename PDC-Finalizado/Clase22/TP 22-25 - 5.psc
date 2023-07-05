Algoritmo sin_titulo
	definir i,j,n Como Entero
	definir frase,x,matriz Como Caracter
	dimension matriz(3,3)
	hacer
	Escribir "Ingrese una frase o palabra de 9 digitos"
	
	Leer frase
	si longitud(frase)>9 entonces 
		Escribir "Superaste los 9 digitos"
	FinSi
	
	hasta que longitud(frase)<=9
     
		n=0
	    para i<-0 hasta 2 con paso 1 Hacer
		 
		    para j<-0 hasta 2 Con Paso 1 hacer
			
			x=subcadena(frase,j+n,j+n)
			matriz(i,j)=x
			
		FinPara
		n=n+3
		finpara
		Escribir ""
	 
	 
	para i<-0 hasta 2 con paso 1 Hacer
		para j<-0 hasta 2 Con Paso 1 hacer
			Escribir matriz(i,j) "  " sin saltar
		FinPara
		Escribir ""
	FinPara
	
	Escribir ""	
FinAlgoritmo
