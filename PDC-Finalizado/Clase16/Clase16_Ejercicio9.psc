Algoritmo Clase16_Ejercicio9
	Definir frase Como Caracter
	Escribir sin saltar "Ingrese una frase: "
	Leer frase
	RemoverVocalRepetida(frase)
FinAlgoritmo
SubProceso RemoverVocalRepetida(frase)
	Definir q, a, e, i, oo, u como entero
	Definir fraseSalida Como Caracter
	a=0
	e=0
	i=0
	oo=0
	u=0
	fraseSalida=""
	Para q=0 hasta Longitud(frase) Hacer
		Segun Subcadena(frase, q, q) Hacer
			"a":
				a=a+1
				Si a>1 Entonces
					fraseSalida=fraseSalida+ ""
				SiNo
					fraseSalida=fraseSalida+Subcadena(frase, q, q)
				FinSi
			"e":
				e=e+1
				Si e>1 Entonces
					fraseSalida=fraseSalida+ ""
				SiNo
					fraseSalida=fraseSalida+Subcadena(frase, q, q)
				FinSi
			"i":
				i=i+1
				Si i>1 Entonces
					fraseSalida=fraseSalida+ ""
				SiNo
					fraseSalida=fraseSalida+Subcadena(frase, q, q)
				FinSi
			"o":
				oo=oo+1
				Si oo>1 Entonces
					fraseSalida=fraseSalida+ ""
				SiNo
					fraseSalida=fraseSalida+Subcadena(frase, q, q)
				FinSi
			"u":
				u=u+1
				Si u>1 Entonces
					fraseSalida=fraseSalida+ ""
				SiNo
					fraseSalida=fraseSalida+Subcadena(frase, q, q)
				FinSi
			De Otro Modo:
				fraseSalida=fraseSalida+Subcadena(frase, q, q)
		FinSegun
	FinPara
	Escribir fraseSalida
FinSubProceso