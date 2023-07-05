//Crea un procedimiento "convertirEspaciado", que reciba como argumento un texto y muestra
//una cadena con un espacio adicional tras cada letra.
//Por ejemplo, "Hola, tú" devolverá "H o l a , t ú ". Crea un programa principal donde se use
//dicho procedimiento.

Algoritmo Clase15_Ejercicio5
	Escribir "Ingrese un texto: "
	Definir frase Como Caracter
	Leer frase
	
	convertirEspaciado(frase)
	
FinAlgoritmo

SubProceso convertirEspaciado (frase)
	definir frase2 Como Caracter
	definir i, contador_caracteres Como Entero
	contador_caracteres = Longitud(frase)
	
    para i = 0 hasta contador_caracteres Hacer
        // frase2 seria la subcadena de frase, en las posiciones que vaya hasta "i"
        frase2 = Subcadena(frase, i, i) + " "
        escribir Sin Saltar frase2
    FinPara
FinSubProceso
