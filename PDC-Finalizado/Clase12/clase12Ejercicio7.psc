//Diseñar una función que reciba un numero en forma de cadena y lo devuelva como numero
//
//entero. El programa podrá recibir números de hasta 3 dígitos. Nota: no poner números con de-
//cimales ni letras. Ejemplo: ingresando "100"(carácter) debe convertirse en 100(entero).

Algoritmo clase12Ejercicio7
	
	Definir numer Como Caracter
	Definir resul Como Entero
	
	Escribir "Escriba un numero"
	Leer numer
	Escribir " "
	
	Escribir Convertir(numer)
	
FinAlgoritmo

Funcion  re <- Convertir(num)
	
	Definir re Como Entero
	
	re = ConvertirANumero(num)
	
	
FinFuncion
