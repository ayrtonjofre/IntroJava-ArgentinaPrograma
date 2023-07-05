///Crear un subproceso que rellene dos arreglos de tamaño n, con números aleatorios. Después,
///	hacer una función que reciba los dos arreglos y diga si todos sus valores son iguales o no. La
///			función debe devolver el resultado de esta validación, para mostrar el mensaje en el algoritmo.
///				Nota: recordar el uso de las variables de tipo lógico.

Algoritmo ejer_7yo
	Definir n como entero
	definir v1, v2 Como enteros
	Escribir "Ingrese la dimension de los vectores"
	Leer n
	Dimension v1[n],v2[n]	
	vectores(v1,v2,n)
FinAlgoritmo
SubProceso vectores(v1,v2,n)
Definir i Como Entero
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		v1[i] = Aleatorio(1,10)
		v2[i] = Aleatorio(1,10)
	Fin Para
	
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Escribir ,v1[i] " , " Sin Saltar
		Escribir ,v2[i] " , " Sin Saltar
		si v1[i] == v2[i] Entonces
			Escribir Verdadero
		SiNo
			Escribir falso
		FinSi
	Fin Para
FinSubProceso
	