Algoritmo ejercicioCooperativoGuia4
Definir tablero como Cadena
Dimension tablero[9, 12]
iniciarMatriz(tablero)
ImprimirMatriz(tablero)
MoverTablero(tablero)
ImprimirMatriz(tablero)
FinAlgoritmo

SubProceso IniciarMatriz(tablero)
	Definir i, j Como Entero
Para i<-0 Hasta 8
		Para j<-0 Hasta 11
			Segun i Hacer
				0:
					tablero(i, j)=Subcadena("VECTOR",j, j)
				1:
					tablero(i, j)=Subcadena("MATRIX",j, j)
				2:
					tablero(i, j)=Subcadena("PROGRAMA",j, j)
				3:
					tablero(i, j)=Subcadena("SUBPROGRAMA",j, j)
				4:
					tablero(i, j)=Subcadena("SUBPROCESO",j, j)
				5:
					tablero(i, j)=Subcadena("VARIABLE",j, j)
				6:
					tablero(i, j)=Subcadena("ENTERO",j, j)
				7:
					tablero(i, j)=Subcadena("PARA",j, j)
				8:
					tablero(i, j)=Subcadena("MIENTRAS",j, j)
			Fin Segun
		Fin Para
	FinPara
FinSubProceso

SubProceso ImprimirMatriz(tablero)
	Definir i, j Como Entero
	Escribir "   0   1   2   3   4   5   6   7   8   9  10   11"
	Para i<-0 Hasta 8
		Para j<-0 Hasta 11
			si j=0 Entonces
				Escribir Sin Saltar i " |" tablero(i, j) "|"
			SiNo
				si tablero(i, j)="" Entonces
					Escribir Sin Saltar " |*|"
				SiNo
					
				Escribir Sin Saltar  " |" tablero(i, j) "|"
			FinSi
		FinSi
	Fin Para
		Escribir ""
	Fin Para
FinSubProceso

SubProceso MoverTablero (tablero)
	Definir i, j, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve Como Entero
	cuatro=0
	Para i<-0 Hasta 8
		Para j<-0 Hasta 11
			Segun i Hacer
				0:
					si tablero(i, j)="R" Entonces
						si j=5 Entonces
							uno=0
						SiNo
							uno=5-j
						FinSi
					FinSi	
				1:
					si tablero(i, j)="R" Entonces
						si j=5 Entonces
							dos=0
						SiNo
							dos=5-j
						FinSi
					FinSi	
				2:
					si tablero(i, j)="R" Entonces
						si j=5 Entonces
							tres=0
						SiNo
							tres=8-j
						FinSi
					FinSi	
				3:
					si tablero(i, j)="R" Y cuatro=0 Entonces
						si j=5 Entonces
							cuatro=0
						SiNo
							cuatro=5-j
						FinSi
					FinSi
				4:
					si tablero(i, j)="R" Entonces
						si j=5 Entonces
							cinco=0
						SiNo
							cinco=5-j
						FinSi
					FinSi
				5:
					si tablero(i, j)="R" Entonces
						si j=5 Entonces
							seis=0
						SiNo
							seis=5-j
						FinSi
					FinSi
				6:
					si tablero(i, j)="R" Entonces
						si j=5 Entonces
							siete=0
						SiNo
							siete=5-j
						FinSi
					FinSi
				7:
					si tablero(i, j)="R" Entonces
						si j=5 Entonces
							ocho=0
						SiNo
							ocho=5-j
						FinSi
					FinSi
				8:
					si tablero(i, j)="R" Entonces
						si j=5 Entonces
							nueve=0
						SiNo
							nueve=5-j
						FinSi
					FinSi
			Fin Segun
		Fin Para
	FinPara
	
	Para i<-0 Hasta 8
		Para j<-0 Hasta 11
			Segun i Hacer
				0:
					si j<uno Entonces
						tablero(i, j)="*"
					SiNo
						tablero(i, j)=Subcadena("VECTOR",j-uno, j-uno)
					FinSi	
				1:
					si j<dos Entonces
						tablero(i, j)="*"
					SiNo
						tablero(i, j)=Subcadena("MATRIX",j-dos, j-dos)
					FinSi
				2:
					si j<tres Entonces
						tablero(i, j)="*"
					SiNo
						tablero(i, j)=Subcadena("PROGRAMA",j-tres, j-tres)
					FinSi
				3:
					si j<cuatro Entonces
						tablero(i, j)="*"
					SiNo
						tablero(i, j)=Subcadena("SUBPROGRAMA",j-cuatro, j-cuatro)
					FinSi
				4:
					si j<cinco Entonces
						tablero(i, j)="*"
					SiNo
						tablero(i, j)=Subcadena("SUBPROCESO",j-cinco, j-cinco)
					FinSi
				5:
					si j<seis Entonces
						tablero(i, j)="*"
					SiNo
						tablero(i, j)=Subcadena("VARIABLE",j-seis, j-seis)
					FinSi
				6:
					si j<siete Entonces
						tablero(i, j)="*"
					SiNo
						tablero(i, j)=Subcadena("ENTERO",j-siete, j-siete)
					FinSi
				7:
					si j<ocho Entonces
						tablero(i, j)="*"
					SiNo
						tablero(i, j)=Subcadena("PARA",j-ocho, j-ocho)
					FinSi
				8:
					si j<nueve Entonces
						tablero(i, j)="*"
					SiNo
						tablero(i, j)=Subcadena("MIENTRAS",j-nueve, j-nueve)
					FinSi
			Fin Segun
		Fin Para
	FinPara
	Escribir ""
FinSubProceso
