Algoritmo E18_act4
	Definir letra Como Caracter
	Menu()
	SegLetra(letra)
	
//	C. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento
//a elemento. Ejemplo: C = A + B
//	D. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a
//elemento. Ejemplo: C = B - A
//E. Mostrar. Esta opción debe permitir al usuario decidir qué vector quiere mostrar: Vector
//	A, B, o C.
//	F. Salir.
	
FinAlgoritmo
SubProceso Menu( )
	Escribir "Opc A: Llenar vector A";
	Escribir "Opc B: Llenar vector B";
	Escribir "Opc C: Suma de vector A y B";
	Escribir "Opc D: Resta de vector C y D";
	Escribir "Opc E: Mostrar vector...";
	Escribir "Opc F: Salir";
	Escribir "Ingrese letra: "
	Leer letra
FinSubProceso
SubProceso SegLetra (letra Por valor)
	Hacer
		Segun letra Hacer
			"A": letra_a
			"B": letra_b
			"C": letra_c(numa,numb)
			"D": letra_d(numa, numb, numc)
			"E": letra_e(letra, numa, numb, numc)
			"F": Escribir "Salir"
		FinSegun
		
	Mientras Que letra<>"F" 
FinSubProceso
SubProceso letra_a ()
	Hacer
		Dimension numa(4) 
		Definir numa, i Como Entero
		Definir letra2 Como Caracter
		letra2=""
		Para i=0 Hasta 3 Hacer
			numa(i)=Aleatorio(-100, 100)
			Escribir numa(i)
		FinPara
	Mientras Que letra2<>"A"
	FinSubProceso

	SubProceso letra_b ()
		Dimension numb(4) 
		Definir numb, i Como Entero
		Para i=0 Hasta 3 Hacer
			numb(i)=Aleatorio(-100, 100)
			Escribir numb(i)
		FinPara
FinSubProceso
SubProceso letra_c(numa Por Referencia, numb Por Referencia)
	Dimension numc(4)
	Definir numc, i Como Entero
	Para i=0 Hasta 3 Hacer
		numc(i)= numa(i)+numb(i)
		Escribir numc(i)
	FinPara
FinSubProceso

SubProceso letra_d(numa Por Referencia, numb Por Referencia, numc Por Referencia)
	Dimension numd(4)
	Definir i Como Entero
	Para i=0 Hasta 3 Hacer
		numc(i)= numb(i)-numa(i)
		Escribir numc(i)
	FinPara
FinSubProceso
SubProceso letra_e (letra Por Valor, numa Por Referencia, numb Por Referencia, numc Por Referencia)
	Escribir "Mostrar vector A"
	Escribir "Mostrar vector B"
	Escribir "Mostrar vector C"
	Leer letra
	Segun letra hacer
		"A": Escribir numa(i)
		"B": Escribir numb(i)
		"C": Escribir numc(i)
	FinSegun
	
FinSubProceso



	