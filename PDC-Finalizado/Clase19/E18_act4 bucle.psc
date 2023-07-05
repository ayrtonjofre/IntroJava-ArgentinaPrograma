Algoritmo E18_act4
	
	Definir numa Como Entero
	Dimension numa(4)
	Definir numb Como Entero
	Dimension numb(4) 
	Definir numc Como Entero
	Dimension numc(4)
	Definir numd Como Entero
	Dimension numd(4)
	
	Menu(numa, numb, numc, numd)
	
FinAlgoritmo

SubProceso Menu(numa, numb, numc, numd)
	Definir letra Como Caracter
	escribir "***************************"
	Escribir "Opc A: Llenar vector A";
	Escribir "Opc B: Llenar vector B";
	Escribir "Opc C: Suma de vector A y B";
	Escribir "Opc D: Resta de vector C y D";
	Escribir "Opc E: Mostrar vector...";
	Escribir "Opc F: Salir";
	Escribir "Ingrese letra: "
	Leer letra
	SegLetra(letra, numa, numb, numc, numd)
FinSubProceso

SubProceso SegLetra (letra, numa, numb, numc, numd,)
	Hacer
		Segun letra Hacer
			"A": letra_a(numa, numb, numc, numd)
			"B": letra_b(numa, numb, numc, numd)
			"C": letra_c(numa, numb, numc, numd)
			"D": letra_d(numa, numb, numc, numd)
			"E": letra_e(numa, numb, numc, numd)
			"F": Escribir "Salir"
		FinSegun
		
	Mientras Que letra<>"F" 
FinSubProceso

SubProceso letra_a (numa, numb, numc, numd)
	
	definir i como entero
	
	Para i=0 Hasta 3 Hacer
		numa(i)=Aleatorio(-100, 100)
		Escribir numa(i)
	FinPara
	menu(numa, numb, numc, numd)	
FinSubProceso

SubProceso letra_b (numa, numb, numc, numd)
	
	definir i como entero
	
	Para i=0 Hasta 3 Hacer
		numb(i)=Aleatorio(-100, 100)
		Escribir numb(i)
	FinPara
	menu(numa, numb, numc, numd)	
FinSubProceso

SubProceso letra_c(numa, numb, numc, numd)
	
	definir i como entero
	
	Para i=0 Hasta 3 Hacer
		numc(i)= numa(i)+numb(i)
		Escribir numc(i)
	FinPara
	menu(numa, numb, numc, numd)
FinSubProceso

SubProceso letra_d(numa, numb, numc, numd)
	
	definir i como entero
	
	Para i=0 Hasta 3 Hacer
		numd(i)= numa(i)+numb(i)
		Escribir numd(i)
	FinPara
	menu(numa, numb, numc, numd)	
FinSubProceso

SubProceso letra_e (numa, numb, numc, numd)
	definir letra Como Caracter
	
	Escribir "Mostrar vector A"
	Escribir "Mostrar vector B"
	Escribir "Mostrar vector C suma"
	Escribir "Mostrar vector C resta"
	
	Leer letra
	definir i como entero
	Segun letra hacer
		"A": 
			para i = 0 hasta 3
				escribir numa[i]
			FinPara
			
		"B": 
			para i = 0 hasta 3
				escribir numb[i]
			FinPara
		"C": 
			para i = 0 hasta 3
				escribir numc[i]
			FinPara
		"D": 
			para i = 0 hasta 3
				escribir numd[i]
			FinPara
	FinSegun
	
FinSubProceso



	