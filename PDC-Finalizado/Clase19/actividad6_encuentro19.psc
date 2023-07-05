Algoritmo actividad6_encuentro19
	dimension letras[20]
	palabra=""
	escribir "Ingrese una frase"
	leer palabra
	cantidad=LONGITUD(palabra)
	
	para i<-0 hasta cantidad con paso 1
		letras[i]=subcadena(palabra,i,i)
	FinPara
	
	para i<-0 hasta cantidad con paso 1
		escribir sin saltar letras[i] 
	FinPara
	
	escribir "Ingrese un caracter"
	leer simbolo
	
	para i<-0 hasta cantidad con paso 1
		
		posicion = i
	FinPara
FinAlgoritmo
