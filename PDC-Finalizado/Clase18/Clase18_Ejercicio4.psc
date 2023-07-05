//Realizar un programa con el siguiente menú y le pregunte al usuario que quiere hacer hasta
//que ingrese la opción Salir:
//	A. Llenar Vector A. Este vector es de tamaño N y se debe llenar de manera aleatoria
//	usando la función Aleatorio(valorMin, valorMax) de PseInt.
//	B. Llenar Vector B. Este vector también es de tamaño N y se llena de manera aleatoria.
//	C. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento
//a elemento. Ejemplo: C = A + B
//	D. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a
//elemento. Ejemplo: C = B - A
//E. Mostrar. Esta opción debe permitir al usuario decidir qué vector quiere mostrar: Vector
//	A, B, o C.
//	F. Salir.
//NOTA: El rango de los números aleatorios para los Vectores será de [-100 a 100]. La longitud
//		para todos los vectores debe ser la misma, por lo tanto, esa información sólo se solicitará una
//vez.

Algoritmo Clase18_Ejercicio4
	Definir vectorA, vectorB, vectorC, num, i Como Entero
	Definir letra Como Caracter
	letra = ""
	Dimension vectorA[3], vectorB[3], vectorC[3]
	
	
	Hacer 
		Escribir "Defina una opcion desde " "A" " hasta " "F" " "
		Leer letra
	Segun letra Hacer
		"a":
			Escribir "Se rellenaron los indices vector A"
			Para i = 0 Hasta 2 Con Paso 1 Hacer
				vectorA[i] = Aleatorio(-100,100)
			FinPara
		"b":
			Escribir "Se rellenaron los indices del vector B"
			Para i = 0 Hasta 2 Con Paso 1 Hacer
				vectorB[i] = Aleatorio(-100,100)
			FinPara

		"c": 
			Escribir "Se sumaron los vectores A + B"
			Para i = 0 Hasta 2 Con paso 1 Hacer
				vectorC[i] = vectorA[i] + vectorB[i]
			FinPara

		"d":
			Escribir "Se restan los vectores B - A: " 
			Para i = 0 Hasta 2 Con paso 1 Hacer
				vectorC[i] = vectorB[i] - vectorA[i]
			Fin Para
		"e":
			Escribir "Indique el vector que desea mostrar:"
			leer letra
			si letra = "a"
				Escribir "El vector A es: "
				para i=0 Hasta 2 Hacer
					Escribir vectorA[i]
				FinPara
				Escribir ""
			SiNo
				si letra = "b"
					Escribir "El vector B es: "
					para i=0 Hasta 2 Hacer
						Escribir  vectorB[i]
					FinPara
					Escribir ""
				SiNo
					Si letra="c" Entonces
						Escribir "El vector C sumado es: "
						para i=0 Hasta 2 Hacer
							Escribir  vectorC[i]
						FinPara
						Escribir ""
					SiNo
						Si letra="d"
							Escribir "El vector C subtraido es: "
							para i=0 Hasta 2 Hacer
								Escribir  vectorC[i]
							FinPara
							Escribir ""
						FinSi
					FinSi
				FinSi
			FinSi
	
		
		"f":
			Escribir "Saludos!"
			Escribir ""
	Fin Segun
Mientras Que letra <> "f"
FinAlgoritmo
