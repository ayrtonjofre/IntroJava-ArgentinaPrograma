Algoritmo sin_titulo
	Definir contador1,contador2,num,matriz,i,j,n,suma,suma2,suma3 Como Entero
	Escribir "Definir el tamaño de la matriz; "
	Leer n
	dimension matriz(n,n)
	
	Escribir "ingresar valores: "
	Para i<-0 hasta n-1 con paso 1
		para j <-0 con paso 1 hasta n-1 hacer
			Leer num
			matriz(i,j)=num
		FinPara
	FinPara
	
	
	//sumar la primera fila de la matriz
	suma=0
	para i<-0 hasta 0 con paso 1 Hacer
		para j<-0 hasta n-1 Con Paso 1 hacer
			suma=suma+matriz(i,j)
		finpara
	FinPara
	
	//compara el valor de la primera fila anterior con la suma de todas las filas de la matriz
	//si el resultado es igual le suma 1 al contador el cual si llega hasta el valor n significa que todas 
	//las cuentas dieron igual
	
	contador1=0
	para i<-0 hasta n-1 con paso 1 Hacer
		suma2=0
		para j<-0 hasta n-1 Con Paso 1 hacer
			
			suma2=suma2+matriz(i,j)
			
		finpara
		si suma2=suma Entonces
			contador1=contador1+1
		FinSi
	FinPara
	
	//compara el valor de la suma anterior con la suma de todas las fcolumnas de la matriz
	//si el resultado es igual le suma 1 al contador el cual si llega hasta el valor n significa que todas 
	//las cuentas dieron igual
	
	contador2=0
	para j<-0 hasta n-1 con paso 1 Hacer
		suma3=0
		para i<-0 hasta n-1 Con Paso 1 hacer
			
			suma3=suma3+matriz(i,j)
			
		finpara
		si suma3=suma Entonces
			contador2=contador2+1
		FinSi
	FinPara
	
	//IMPRIME EL RESULTADO 
	si contador1=n y contador1=contador2 entonces 
		Escribir ""
		Escribir "La matriz de datos es MAGICA!!"
		Escribir ""
		Escribir "La suma de sus filas y columnas es: " suma
		Escribir ""
	SiNo
		Escribir ""
		Escribir "No es una matriz de datos Magicos =("
		Escribir ""
	FinSi
	//Validacion de sumas
	
	
	//imprime matriz 
	para i<-0 hasta n-1 con paso 1 Hacer
		para j<-0 hasta n-1 Con Paso 1 hacer
			Escribir matriz(i,j) "  " sin saltar
		FinPara
		Escribir ""
		Escribir ""
	FinPara
	
	
FinAlgoritmo


// Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas) que 
// tiene como propiedad especial que la suma de las filas, las columnas y las diagonales es igual. 
// Por ejemplo: 
// 2   7   6 
// 9   5   1 
// 4   3   8 
// En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir un algo- 
// ritmo que compruebe si una matriz de datos enteros es mágica o no, y en caso de que sea 
//	mágica escribir la suma. Además, el programa deberá comprobar que los números introduci- 
//	dos son correctos, es decir, están entre el 1 y el 9. El usuario ingresa el tamaño de la matriz 
//	que no debe superar orden igual a 10. 