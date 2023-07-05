Algoritmo sin_titulo
//	Realizar un programa que solicite al usuario su código de usuario (un número entero
//	mayor que cero) y su contraseña numérica (otro número entero positivo). El programa no le
//	debe permitir continuar hasta que introduzca como código 1024 y como contraseña 4567.
	//	El programa finaliza cuando ingresa los datos correctos.
	
	definir id, codigo Como Entero
	Repetir
		Escribir "ingrese la id de usuario: "
		leer id
		Escribir "ingrese la contraseña: "
		Leer codigo
		
		si id <>1024 o codigo<>4567
			Escribir "error, ingrese otra vez"
			
		FinSi
		
		
	Mientras Que NO (id=1024 Y codigo=4567)
	
	Escribir "se ingreso correctamente"
	
FinAlgoritmo
