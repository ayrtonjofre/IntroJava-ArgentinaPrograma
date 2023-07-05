Funcion retorno <- esImpar(num)
	definir retorno como logico
	definir cent,dec,uni Como Entero
	si num>99 y num<1000 Entonces
		uni = trunc(num/100)
		num = trunc(num/10)
		dec = num mod 10
		num = trunc(num/10)
		cent = num mod 10
		si cent mod 2 = 1 y dec mod 2 = 1 y uni mod 2 = 1
			retorno=Verdadero
		FinSi
	sino 
		dec= trunc(num/10)
		num = num mod 10
		uni= trunc(num/1)
		si dec mod 2 = 1 y uni mod 2 = 1
			retorno=Verdadero
		FinSi
	FinSi
	
	
	
Fin Funcion

//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número
//tiene todos sus dígitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el
//	numero en partes (si es un numero de más de un digito) y ver si cada número es par o impar.
//	Nota: recordar el uso de la función Mod y Trunc(). No podemos pasar el numero a cadena para
//	realizar el ejercicio.


Algoritmo Ej11_SubProgramasNumImpares
	definir num como entero 
	escribir "Ingrese un numero para indicar si todos sus digitos son impares"
	leer num
	si esImpar(num)=Verdadero
		escribir "los tres digitos son impares"
	sino 
		escribir "Al menos un digito es par" 
	FinSi
	
FinAlgoritmo
