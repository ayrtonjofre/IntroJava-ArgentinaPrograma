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
		escribir "6)Calcular pisos"
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
			6:
				CalcularPisos()
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

///Subproceso 1

SubProceso calcularmuro()
	
	definir resp Como Entero
	definir m2,largo,alto como real
	escribir "El muro sera de 20 o 30 cm de espesor?"
	leer resp
	escribir "Cual es el largo del muro?"
	leer largo
	escribir "Cual es el alto del muro?"
	leer alto
	
	m2 = superficie(largo,alto)
	si resp = 30 entonces
		
		escribir "Con una superficie de ",m2,"m2, se necesitaran ",15,2 * m2,"Kg de cemento ",0.115 * m2,"m3 de arena y ",120 * m2," ladrillos "
		
	SiNo
		si resp = 20 Entonces
			
			escribir "Con una superficie de ",m2," m2, se necesitaran ",10,9 * m2,"Kg de cemento ",0.09 * m2,"m3 de arena y ",90 * m2," ladrillos "
			
		SiNo
			escribir "la medida del muro es incorrecta"
		FinSi
		
		
		
	FinSi
	esperar tecla
	Borrar Pantalla
	
FinSubProceso

///Subproceso 2
//Nos debe pedir el largo de la viga. Por metro lineal de viga se necesitarán: 9 kg de cemento, 0.02
//m3 de arena, 0.02 m2 de piedra, 4 m de hierro del 8 y 3 m de hierro del 4.
//Debemos mostrar al usuario la cantidad de materiales necesaria.

subproceso calcularVigaDeHormigon()
	definir largo Como Real
	escribir "Por favor ingrese el largo de la viga"
	leer largo
	
	escribir "Para una viga de ",largo," mts se necesitaran ",9*largo," Kg de cemento, ",0.02 * largo," m3 de arena, ",0.02 * largo," m2 de piedra, ",4*largo," mts de hierro del 8 y ",3*largo," mts de hierro del 4"
	
	esperar tecla
	Borrar Pantalla
	
	
FinSubProceso
///Subproceso 3
//Nos debe pedir el largo de la columna. Por metro lineal de columna se necesitarán: 7.5 kg de
//	cemento, 0.016 m3 de arena, 0.016 m2 de piedra, 6 m de hierro del 10 y 3 m de hierro del 4.
//	Debemos mostrar al usuario la cantidad de materiales necesaria.

subproceso CalcularColumna()
	definir largo Como Real
	escribir "Por favor ingrese el largo de la columna"
	leer largo
	
	escribir "Para una columna de ",largo," mts se necesitaran ",7.5*largo," Kg de cemento, ",0.016 * largo," m3 de arena, ",0.016 * largo," m2 de piedra, ",6*largo," mts de hierro del 10 y ",3*largo," mts de hierro del 4"
	
	esperar tecla
	borrar pantalla
	
FinSubProceso

///Subproceso4
//Nos debe pedir espesor, ancho y largo del contrapiso a calcular.
//Por metro cúbico de contrapiso se necesita: 105 kg de cemento, 0.45 m3 de arena y 0.9 m3 de
//	piedra.
//	Debemos mostrar al usuario la cantidad de materiales necesaria.

subproceso CalcularContrapiso()
	definir m3,alto,largo,ancho Como Real
	escribir "Por favor ingrese el espesor o alto del contrapiso"
	leer alto
	escribir "Por favor ingrese el largo del contrapiso"
	leer largo
	escribir "Por favor ingrese el ancho del contrapiso"
	leer ancho
	
	m3=volumen(alto,largo,ancho)
	
	escribir "Para un contrapiso de ",m3," m3 se necesitaran ",105*m3," Kg de cemento, ",0.45*m3," m3 de arena y ",0.9*m3," m3 de piedra"
	esperar Tecla
	Borrar Pantalla
	
FinSubProceso
///subproceso5
//Nos debe pedir espesor, ancho y largo del techo a calcular.
//Por metro cuadrado de techo se necesita: 33 kg de cemento, 0.072 m3 de arena, 0.072 m3 de
//	piedra, 7 m de hierro del 8 y 4 m de hierro del 6
//	Debemos mostrar al usuario la cantidad de materiales necesaria.
subproceso CalcularTecho()
	definir m3,m2,alto,largo,ancho como real
	escribir "Por favor ingrese el espesor o alto del techo"
	leer alto
	escribir "Por favor ingrese el largo del techo"
	leer largo
	escribir "Por favor ingrese el ancho del techo"
	leer ancho
	
	m3=volumen(alto,largo,ancho)
	m2=m3/alto
	
	escribir "Para un techo de ",m2," m2 se necesitaran ",33*m2," Kg de cemento, ",0.072*m2," m3 de arena, ",0.072*m3," m3 de piedra, ",7*m2," mts de hierro del 8 y ",4*m2," mts de hierro del 6"
	esperar Tecla
	Borrar Pantalla
	
FinSubProceso
///subproceso6
//Nos debe pedir ancho y largo del paño de piso a colocar. Teniendo esos datos se debe calcular la
//superficie y añadirle un 10% extra por recortes
//Mostrar el resultado en m2
subproceso CalcularPisos()
	definir anchopanio,largopanio,cm2,m2baldo,m2tot,baldosas,largo,ancho,anchobaldo,largobaldo,m2 como real
	escribir "Por favor ingrese el ancho de la baldosa de piso a colocar"
	leer anchobaldo
	escribir "Por Favor ingrese el largo de la baldosa de piso a colocar"
	leer largobaldo
	escribir "Por favor ingrese el ancho del paño a colocar"
	leer ancho
	escribir "Por favor ingrese el largo del paño a colocar"
	leer largo
	
	m2tot=0
	m2baldo=0
	baldosas=0
	
	cm2=superficie(largobaldo,anchobaldo)
	m2baldo = (cm2 * 1)/10000
	
	Repetir
		m2tot = m2tot + cm2 / 10000
		baldosas = baldosas + 1
		
	Mientras Que m2tot < 1
	
	m2=superficie(largo,ancho)
	
	Escribir "Para un paño de ",m2," m2 se necesitaran ",redon(baldosas)," Baldosas por m2, en este caso se necesitaran ",redon((baldosas*m2)+(baldosas*m2*0.10))," Baldosas por m2 teniendo en cuenta el 10% por recortes"
	esperar Tecla
	Borrar Pantalla
	
FinSubProceso
///subproceso7
//Nos debe pedir la superficie del muro y mostrar cuánta pintura necesitamos teniendo en cuenta
//que rinde 6 m2 por litro de pintura.
subproceso calcularPintura()
	definir litro,m2,largo,alto como real
	escribir "Por favor ingrese la altura del muro"
	leer alto
	escribir "Por favor ingrese el largo del muro"
	leer largo
	
	m2=superficie(largo,alto)
	litro=m2/6
	
	escribir "Para un muro de ",m2," m2 se necesitaran ",redon(litro)," Litros de pintura"
	esperar Tecla
	borrar pantalla
	
	
FinSubProceso
///subproceso8
//Nos debe pedir la superficie de la habitación. La iluminación la calculamos de la siguiente forma:
//	superficie * 0.20. Eso nos da la cantidad mínima de superficie de iluminación natural (ventanas y
//	puertas de vidrio). Mostrar resultado
subproceso iluminacion()
	definir m2,ancho,largo como real
	escribir "Por favor ingrese el ancho de la habitación"
	leer ancho
	escribir "por favor ingrese el largo de la habitación"
	leer largo
	
	m2=superficie(largo,ancho)
	
	escribir "La iluminación minima natural para ",m2," m2 es de ",m2*0.20," m2 de superficie permeable"
	esperar Tecla
	Borrar Pantalla
		
FinSubProceso


