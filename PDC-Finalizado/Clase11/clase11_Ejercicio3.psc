// Necesitamos crear un sistema para una máquina de reciclaje de botellas automática. Dicha máquina nos pagará dinero por la cantidad de plástico reciclado. Tenemos que ingresar
// nuestro usuario y contraseña para que se nos cargue el saldo por sistema a nuestra cuenta.	
// Condición simple anidada: validaremos que el usuario sea "Albus_D", luego si esto es verdadero, validaremos si la contraseña es "caramelosDeLimon". Si la contraseña es correcta
// haremos que una variable llamada Login sea verdadera.		
// Bucle Mientras: Este bloque de validación de la contraseña lo encerraremos en un	bucle Mientras para darle al usuario sólo 3 intentos para poner la contraseña.			 
// Bucle Hacer Mientras(Repetir): Una vez que el login sea verdadero, accederemos al			
//	menú de opciones:				
//		o Ingresar botellas
//	    o Consultar saldo
//		o Salir					
//	Ingresar Botellas: Primero preguntaremos cuántas botellas se va a ingresar al sistema. Una vez que tenemos el número vamos a usar un bucle para, a fin de ir ingresando							
//	cada botella. En cada ciclo del bucle se debe generar un número aleatorio entre 100 y 3000 gr, que va a ser el peso de las botellas a reciclar (simulando que el usuario está								
//	ingresando botellas en la máquina). Una vez generado, según el peso del material, usaremos un condicional múltiple para asignarle un valor monetario:							
//	    o Si es menos de 500 gr, corresponden $50
//      o Si es entre 501 gr y 1500 gr, corresponden $125
//      o Si es más de 1501 gr, corresponden $200								
//	Hecho esto, el programa debe informar al usuario por pantalla el valor que se le ofrece. Si el usuario acepta, lo acreditamos a su saldo, sino se debe devolver el								
//	material (sólo mostrar en pantalla "Devolviendo material"). Para esto usaremos un condicional doble.
//	Consultar saldo: revisaremos el valor monetario que tiene asignada la variable "saldo".										
//	Tanto al terminar "Ingresar Botellas" como "Consultar Saldo" debe volver al menú principal.									

Algoritmo Ejercicio3
	
	definir i, botellas, pesototal, conta, conta2, respuesta, peso, saldo, pago1, pago2, pago3 Como Entero
	definir usuario, contra, pago Como Caracter
	definir login como logico
	
	conta = 2
	conta2 = 2
	peso = 0
	pesototal = 0
	saldo = 0
	pago1 = 50
	pago2 = 125
	pago3 = 200
	

	
	escribir "BIENVENIDO!!"
	escribir "Por favor ingrese su usuario "
	leer usuario
	
	mientras usuario <>  "Albus_D" y conta <= 3
		
		escribir "Usuario incorrecto"
		escribir "Intente de nuevo"
		leer usuario
		conta = conta + 1
		
	finmientras
	
	si usuario = "Albus_D" Entonces
		
		escribir "Bienvenido Albus_D"
		escribir "----------------------------------"
		escribir "Ingrese la contraseña"
		leer contra
		
		mientras contra <> "caramelosDeLimon" y conta2 <= 3
			
			escribir "Contraseña incorrecta"
			escribir "Intente de nuevo"
			leer contra
			conta2 = conta2 + 1
			
		finmientras
		
		si contra = "caramelosDeLimon" Entonces
			
			escribir "Contraseña correcta"
			escribir "------------------------------"
			
		SiNo
			
			escribir "Agotaste los 3 intentos"
			
		FinSi
		
	SiNo
		
		escribir "Agotaste los 3 intentos"
		
	FinSi
	
	
	
	login = (usuario = "Albus_D") y (contra = "caramelosDeLimon")
	
	mientras login Hacer
		
		escribir "MENU"
		escribir "1-°Ingresar Botellas"
		escribir "2-°Consultar saldo"
		escribir "3-°Salir"
		
		leer respuesta
		escribir "---------------------------------------------"
		
		si respuesta = 1 Entonces
			
			escribir "Cuantas botellas va a ingresar?"
			leer botellas
			
			para i = 1 hasta botellas Hacer
				
				pesototal = 0
				
				peso = aleatorio(300,1000)
				
				escribir "Botella numero: " i " peso: " peso "gr"
				pesototal = pesototal + peso
				
			FinPara
			
			escribir "El peso total es: " pesototal "gr"
			escribir "----------------------------------------------"
			
			si pesototal < 500 Entonces
				
				escribir "El pago es de $50"
				escribir "Acepta el pago?"
				leer pago
				pago = minusculas(pago)
				
				si pago = "si" entonces
					
					escribir "Pago acreditado al saldo"
					escribir "---------------------------------"
					saldo = saldo + pago1
					
				SiNo
					
					escribir "Devolviendo material"
					escribir "---------------------------------"
					
				FinSi
				
			SiNo
				
				si pesototal > 501 y pesototal < 1500 Entonces
					
					escribir "El pago es de $125"
					escribir "Acepta el pago?"
					leer pago
					pago = minusculas(pago)
					
					si pago = "si" entonces
						
						escribir "Pago acreditado al saldo"
						escribir "---------------------------------"
						saldo = saldo + pago2
						
					SiNo
						
						escribir "Devolviendo material"
						escribir "---------------------------------"
						
					FinSi
					
					
				SiNo
					
					si pesototal > 1501 Entonces
						
						escribir "El pago es de $200"
						escribir "Acepta el pago?"
						leer pago
						
						pago = minusculas(pago)
						
						si pago = "si" entonces
							
							escribir "Pago acreditado al saldo"
							escribir "---------------------------------"
							saldo = saldo + pago3
							
						SiNo
							
							escribir "Devolviendo material"
							escribir "---------------------------------"
							
						FinSi
						
						
					FinSi
					
					
				FinSi
				
			FinSi
			
		SiNo
			
			si respuesta = 2 entonces 
				
				escribir "El saldo es: $" saldo 
				escribir "---------------------------------"
				
			sino 
				
				si respuesta = 3 Entonces
					
					escribir "Gracias, vuelvan pronto!"
					login = falso
					
				FinSi
				
			FinSi
			
		FinSi
		
	Finmientras
	
FinAlgoritmo



