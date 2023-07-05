Algoritmo sin_titulo
	Definir matriz,i,j,n como entero
	Dimension matriz(5,15)
	
	// coloca 1 solo en la primer y ultima fila
	Para i<-0 con paso 4 hasta 4 Hacer
		Para j<-0 con paso 1 hasta 14 Hacer
			matriz(i,j)=1
		FinPara
	FinPara
	
	//coloca 1 en la primer y ultima variable de cada fila
	Para i<- 1 con paso 1 hasta 3 Hacer
		Para j<-0 con paso 1 hasta 14 Hacer
			matriz(i,j)=0
		FinPara
		matriz(i,0)=1
		matriz(i,14)=1
	FinPara
	
	//Imprime matriz
	Escribir ""
	Para i<- 0 con paso 1 hasta 4 Hacer
		Para j<-0 con paso 1 hasta 14 Hacer
			Escribir matriz(i,j) "" sin saltar
		FinPara
		Escribir ""
	FinPara
	Escribir""
	
FinAlgoritmo
