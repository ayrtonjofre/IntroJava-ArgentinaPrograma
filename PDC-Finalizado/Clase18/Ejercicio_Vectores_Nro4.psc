//Realizar un programa con el siguiente menú y le pregunte al usuario que quiere hacer hasta
//que ingrese la opción Salir:
//	A. Llenar Vector A. Este vector es de tamaño N y se debe llenar de manera aleatoria
//	usando la función Aleatorio(valorMin, valorMax) de PseInt.
//	B. Llenar Vector B. Este vector también es de tamaño N y se llena de manera aleatoria.
//	C. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento
//a elemento. Ejemplo: C = A + B
//	D. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a
//elemento. Ejemplo: C = B - A
//	E. Mostrar. Esta opción debe permitir al usuario decidir qué vector quiere mostrar: Vector A, B, o C.
//	F. Salir.
//NOTA: El rango de los números aleatorios para los Vectores será de [-100 a 100]. La longitud
//		para todos los vectores debe ser la misma, por lo tanto, esa información sólo se solicitará una
//vez.

Algoritmo Ejercicio_Vectores_Nro4
	definir vectorA, vectorB, vectroC Como Entero
	Dimension vectorA[5], vectorB[5], vectorC[5]
	definir suma Como Entero
	definir op, vec Como Caracter
	
	hacer 
		Escribir "Ingrese una opción (A,B,C,D,E,F):"
		leer op
	Segun op Hacer
		"A","a":
			Escribir "Se carga vector A con valores aleatorios entre -100 y 100"
			para i=0 Hasta 4 Hacer
				vectorA[i] = Aleatorio[-100,100]
			FinPara
			
		"B","b":
			Escribir "Se carga vector A con valores aleatorios entre -100 y 100"
			para i=0 Hasta 4 Hacer
				vectorB[i] = Aleatorio[-100,100]
			FinPara
		"C","c":
			Escribir "Se suman los vectores A + B"
			para i=0 Hasta 4 Hacer
				vectorC[i] = vectorA[i]+vectorB[i]
			FinPara
		"D","d":
			Escribir "Se restan los vectores B - A"
			para i=0 Hasta 4 Hacer
				vectorC[i] = vectorB[i]-vectorA[i]
			FinPara
		"E","e":
			Escribir "Indique el vector que desea mostrar:"
			leer vec
			si vec = "A" o vec = "a"
				Escribir "El vector A es: "
				para i=0 Hasta 4 Hacer
					Escribir Sin Saltar vectorA[i]
				FinPara
				Escribir ""
			SiNo
				si vec = "B" o vec = "b"
					Escribir "El vector A es: "
					para i=0 Hasta 4 Hacer
						Escribir Sin Saltar vectorB[i]
					FinPara
					Escribir ""
				SiNo
					Escribir "El vector C es: "
					para i=0 Hasta 4 Hacer
						Escribir Sin Saltar vectorC[i]
					FinPara
					Escribir ""
				FinSi
			FinSi
		"F","f":
			Escribir "Hasta luego"
	FinSegun
Mientras Que op <> "F" o op <> "f"
	
	
	
FinAlgoritmo
