Algoritmo numRango
	Definir numMax, numMin, num, contador Como Entero
	Escribir "Defina un numero minimo"
	Leer numMin
	Escribir "Defina un numero maximo"
	Leer numMax
	Escribir "Escriba un numero entre el rango provisto por primera vez"
	Leer num
	contador = 0
	
	Mientras (num > numMin) Y (num < numMax) Hacer
		contador = contador + 1
		Escribir "Siga insertando numeros entre el rango provisto"
		Leer num
	Fin Mientras
	Escribir "El numero ingresado esta fuera del rango, el contador es: ", contador
FinAlgoritmo
