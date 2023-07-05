//vamos a programar una calculadora de materiales para construir
	//	Primero leeremos todo el ejercicio y luego dividiremos tareas en el equipo.
	//	El algoritmo principal sólo debe llamar al subPrograma menu()
	//		Cada subPrograma puede descomponerse, si hiciera falta, en otros subProgramas a creatividad
	//			del programador
	//		El menú debe quedar de la siguiente manera:
	//			1. Calcular muro de ladrillo
	//			2. Calcular viga de hormigón
	//			3. Calcular columnas de hormigón
	//			4. Calcular contrapisos
	//			5. Calcular techo
	//			6. Calcular pisos
	//			7. Calcular pintura
	//			8. Calcular iluminación
	//			9. Salir
	//			subprogramas calcularSuperficie y calcularVolumen
	//			Haremos ambos para usarlos dentro de los otros subprogramas. El usuario no puede acceder a
	//				ellos.
	//				
	//				2
	//				
	//				subprograma calcularMuro
	//				Nos debe pedir primero si el muro será de 20 o 30 cm de espesor. Luego el largo y el alto. A partir
	//					de estos datos se debe mostrar al usuario la superficie del muro y la cantidad de materiales que
	//					necesitaremos para construirlo.
	//					Si el muro es de 30cm necesitaremos por metro cuadrado: 15.2 kg de cemento, 0.115 m3 de arena
	//							y 120 ladrillos.
	//						Si el muro es de 20cm necesitaremos por metro cuadrado: 10.9 kg de cemento, 0.09 m3 de arena
	//								y 90 ladrillos.
	//								subprograma calcularViga
	//							Nos debe pedir el largo de la viga. Por metro lineal de viga se necesitarán: 9 kg de cemento, 0.02
	//								m3 de arena, 0.02 m2 de piedra, 4 m de hierro del 8 y 3 m de hierro del 4.
	//								Debemos mostrar al usuario la cantidad de materiales necesaria.
	//								subprograma calcularColumna
	//							Nos debe pedir el largo de la columna. Por metro lineal de columna se necesitarán: 7.5 kg de
	//								cemento, 0.016 m3 de arena, 0.016 m2 de piedra, 6 m de hierro del 10 y 3 m de hierro del 4.
	//								Debemos mostrar al usuario la cantidad de materiales necesaria.
	//								subprograma calcularContrapisos
	//								Nos debe pedir espesor, ancho y largo del contrapiso a calcular.
	//							Por metro cúbico de contrapiso se necesita: 105 kg de cemento, 0.45 m3 de arena y 0.9 m3 de
	//								piedra.
	//								Debemos mostrar al usuario la cantidad de materiales necesaria.
	//								subprograma calcularTecho
	//								Nos debe pedir espesor, ancho y largo del techo a calcular.
	//							Por metro cuadrado de techo se necesita: 33 kg de cemento, 0.072 m3 de arena, 0.072 m3 de
	//								piedra, 7 m de hierro del 8 y 4 m de hierro del 6
	//								Debemos mostrar al usuario la cantidad de materiales necesaria.
	//								subprograma calcularPisos
	//								Nos debe pedir ancho y largo del paño de piso a colocar. Teniendo esos datos se debe calcular la
	//								superficie y añadirle un 10% extra por recortes
	//								Mostrar el resultado en m2
	//								subprograma calcularPintura
	//								Nos debe pedir la superficie del muro y mostrar cuánta pintura necesitamos teniendo en cuenta
	//								que rinde 6 m2 por litro de pintura.
	//								subprograma calcularIluminacion
	//							Nos debe pedir la superficie de la habitación. La iluminación la calculamos de la siguiente forma:
	//								superficie * 0.20. Eso nos da la cantidad mínima de superficie de iluminación natural (ventanas y
	//								puertas de vidrio). Mostrar resultado
	
	Algoritmo sin_titulo
		menu()
FinAlgoritmo
subproceso menu()
	definir op Como Entero
	
	
	Repetir
		Escribir "Bienvenido a la Calculadora de construcción"
		escribir "******************_____******************"
		escribir "Por favor ingrese el numero de la opción del menu"
		Escribir "1)Calcular muro de ladrillo"
		escribir "2)Calcular viga de hormigón"
		escribir "3)Calcular columnas de hormigón"
		escribir "4)Calcular Contrapisos"
		escribir "5)Calcular techo"
//		escribir "6)Calcular pisos"
		escribir "7)Calcular pintura"
		escribir "8)Calcular iluminación"
		escribir "9)Salir"
		escribir "******************_____******************"
		leer op
		
		Segun op Hacer
			1:
				calcularMuro()
			2:
				calcularVigaDeHormigon()
			3:
				calcularColumna()
			4:
				CalcularContrapiso()
			5:
				CalcularTecho()
//			6:
//				CalcularPisos()
			7:
				calcularPintura()
			8:
				iluminacion()
				
		Fin Segun
		
	Mientras Que op <> 9
	
	escribir "Gracias Por utilizar nuestros Servicios"
	
	
FinSubProceso
///Funciones
funcion ret = superficie(largo,alto)
	definir ret como real
	ret = largo * alto
FinFuncion
funcion ret = volumen(alto,largo,ancho)
	definir ret como real
	ret = alto * largo * ancho
	
FinFuncion

SubProceso calcularMuro()
	Definir espPared como real
	Definir cemento, arena, ladrillos, lmur, amur como real
	Escribir "Escriba el ancho de la pared con 20 o 30 ssegún corresponda:"
	Leer espPared
	Repetir
		Si espPared=20 Entonces
			Escribir "Escriba el largo del muro en m:"
			Leer lmur
			Escribir "Escriba el alto del muro en m"
			Leer amur
			Escribir "La superficie del muro es: ", superficie(lmur,amur), "m2"
			
			Escribir "Los materiales son: "
			cemento= superficie(lmur,amur)*10.9
			arena= superficie(lmur,amur)*0.09
			ladrillos= superficie(lmur,amur)*90
			Escribir "la cantidad de cemento en kg es: ", cemento
			Escribir "la cantidad de arena en kg es: ", arena
			Escribir "la cantidad de ladrillos  es: ", ladrillos
		SiNo
			
			Si espPared=30 Entonces
				Escribir "Escriba el largo del muro en m:"
				Leer lmur
				Escribir "Escriba el alto del muro en m"
				Leer amur
				Escribir "La superficie del muro es: "
				Escribir superficie(lmur,amur)
				Escribir "Los materiales son: "
				cemento= superficie(lmur,amur)*15.2
				arena= superficie(lmur,amur)*0.115
				ladrillos= superficie(lmur,amur)*120
				Escribir "la cantidad de cemento en kg es: ", cemento
				Escribir "la cantidad de arena en kg es: ", arena
				Escribir "la cantidad de ladrillos es: ", ladrillos
			SiNo
				Escribir " el ancho de la pared no es correcto."
				espPared=20
			Fin Si
		Fin Si
	Mientras Que espPared<>20 y espPared<>30
	Escribir "---presione enter para volver al menu principal---"
	
	esperar tecla
	Borrar Pantalla
FinSubProceso

SubProceso calcularVigaDeHormigon()
	definir larViga Como real
	
	Escribir "Ingrese el largo de la viga en metros"
	leer larViga
	
	escribir "Para una viga de ",larviga," mts se necesitaran ",9*larviga," Kg de cemento, ",0.02 * larviga," m3 de arena, ",0.02 * larviga," m2 de piedra, ",4*larviga," mts de hierro del 8 y ",3*larviga," mts de hierro del 4"
	
	Escribir "---presione enter para volver al menu principal---"
	
	esperar tecla
	Borrar Pantalla
	
FinSubProceso

subproceso calcularColumna()
	definir largo Como Real
	Escribir "Ingrese el largo deseado para una columna"
	leer largo
	escribir "Para que se pueda realizar la columna se requiere de :"
	escribir "A- ",7.5*largo," de Cemento"
	Escribir "B- ",0.016*largo, " m3 de arena"
	escribir "C- ",0.016*largo," m2 de piedra"
	Escribir "D- ",6*largo," de hierro"
	
	Escribir "---presione enter para volver al menu principal---"
	
	esperar tecla
	Borrar Pantalla
FinSubProceso


Subproceso CalcularContrapiso()
    definir m3,alto,largo,ancho Como Real
	escribir "Por favor ingrese el espesor del contrapiso"
	leer alto
	escribir "Por favor ingrese el largo del contrapiso"
	leer largo
	escribir "Por favor ingrese el ancho del contrapiso"
	leer ancho
	
	m3 = volumen (alto,largo,ancho)
	
	escribir "Para un contrapiso de ",m3," m3 se necesitaran ",105*m3," Kg de cemento, ",0.45*m3," m3 de arena y ",0.9*m3," m3 de piedra"
	
	Escribir "---presione enter para volver al menu principal---"
	
	esperar tecla
	Borrar Pantalla
	
FinSubProceso

SubProceso CalcularTecho() 
	Definir alto,largo,ancho, vol Como Real
	
	Escribir "Ingrese el espesor del techo en M2: "
	leer alto
	Escribir "Ingrese el largo del techo en M2:  "
	leer largo
	Escribir "Ingrese el ancho del techo en M2:  "
	leer ancho
	
	vol = volumen(alto,largo,ancho)
	
	Escribir " Los materiales que necesita son: "
	Escribir trunc((alto*ancho)*33) " kg de cemento"
	Escribir 0.072*vol " m3 de arena"
	Escribir 0.072*vol " m3 de piedra"
	Escribir 7*vol " metros de hierro 8"
	Escribir 4*vol " metro de hierro 6"
	
	Escribir "---presione enter para volver al menu principal---"
	
	esperar tecla
	Borrar Pantalla
	
FinSubProceso

SubProceso calcularPintura()
	Definir altura, base, litros, metro2 Como Real
	Escribir "Defina la altura: "
	Leer altura
	Escribir "Defina la base: "
	Leer base
	
	metro2 = altura * base
	litros = metro2 / 6
	si litros=1 Entonces
		
	
	Escribir "La cantidad de pintura necesaria para ", metro2, " metros cuadrados es: ", litros " litro"
	
	Escribir "---presione enter para volver al menu principal---"
SiNo
	si litros > 1 Entonces
		Escribir "La cantidad de pintura necesaria para ", metro2, " metros cuadrados es: ", litros " litros"
		
		Escribir "---presione enter para volver al menu principal---"
	FinSi
FinSi

	esperar tecla
	Borrar Pantalla
	
FinSubProceso

subproceso iluminacion()
	Definir alto, largo Como Entero
	Escribir "Ingrese altura del muro: " 
	leer alto
	Escribir "Ingrese largo completo: "
	leer largo
	
	Escribir "La cantidad mínima de superficie de iluminación natural" 
	Escribir "(ventanas y puertas de vidrio) deberia ser de: " superficie(alto,largo)*0.2 "m2"	
	
	esperar tecla
	Borrar Pantalla
FinSubProceso





