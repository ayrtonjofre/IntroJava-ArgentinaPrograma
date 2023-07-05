Algoritmo sin_titulo

	definir usuario, codigo, respSaldo Como Caracter
	Definir login Como Logico
	Definir intentos, selec, cantBotellas, contBotellas, numRand Como Entero
	Definir saldo, sumaSaldo como real
	Escribir "ingrese la usuario"
	Leer usuario
	usuario= Mayusculas(usuario)
	login= Falso
	intentos= 0
	saldo= 0
	sumaSaldo= 0
	si usuario  =  "A" Entonces
		Escribir "ingrese la clave"
		leer codigo
		
		codigo= Mayusculas(codigo)
		Mientras intentos < 2 y codigo <> "B"
			intentos= intentos+1
			Escribir "la clave es incorrecta ingrese de nuevo"
			Leer codigo
			codigo= Mayusculas(codigo)
		FinMientras
		si intentos= 2 y codigo <> "B"
			Escribir "usted se quedo sin intentos, intente de nuevo mas tarde."
		FinSi
		Si codigo= "B" y usuario= "A" Entonces
			login= Verdadero
			
		FinSi
		
	SiNo
		Escribir "usuario no registrado."
	FinSi
	
	si login = Verdadero Entonces
		Repetir
			Escribir "Ingresar botellas (1)"
			Escribir "Consultar saldo (2) "
			Escribir "salir (3)"
			leer selec
			Segun selec Hacer
				1: 
					Escribir "ingrese la cantidad de botellas"
					Escribir " "
					leer cantBotellas
					Para contBotellas = 0 Hasta cantBotellas Hacer
						numRand= Aleatorio(100,3000)
						si numRand <= 500 Entonces
							sumaSaldo= sumaSaldo + 50
						SiNo si numRand >= 501 y numRand <= 1500
								sumaSaldo= sumaSaldo+ 125
							sino si numRand >= 1501
									sumaSaldo= sumaSaldo+ 200
								FinSi
							FinSi
						FinSi
						
					FinPara
					Escribir "tu saldo actual es: " sumaSaldo " lo queres o no, si (S) no (N)? "
					Escribir " "
					leer respSaldo
					respSaldo= Mayusculas(respSaldo)
					si respSaldo = "S" Entonces
						Escribir "se agregaron " sumaSaldo " a tu cuenta"
						Escribir " "
						saldo= sumaSaldo + saldo
					sino 
						Escribir "devolviendo material." 
						Escribir " "
						sumaSaldo= 0 
					FinSi
				2: 	
					escribir "SU SALDO ES ", saldo "."
			FinSegun
		Mientras Que selec <> 3
		
	FinSI
FinAlgoritmo
