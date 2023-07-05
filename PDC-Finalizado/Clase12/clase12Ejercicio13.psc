Algoritmo capicua_13
	Definir num,a,b Como Entero
	Escribir "Ingresa un número:"
	leer num
	si num > 9 y num < 100 Entonces
		a = trunc(num/10)
		b = num mod 10
			si a == b Entonces
					
					Escribir "El numero ",num, " es capicúa"
					
				SiNo
				
						
						Escribir "El número" ,num, " no es capicúa"
						
					FinSi
               FinSi
			   
			   si num > 99 y num < 9999 Entonces
				   a = trunc(num/100)
				   b = num mod 100
				   si a == b Entonces
					   
					   Escribir "El numero ",num, " es capicúa"
					   
				   SiNo
					   
					   Escribir "El número " ,num," no es capicúa"
					   
				   FinSi
				   
               FinSi
			   
			   
FinAlgoritmo
