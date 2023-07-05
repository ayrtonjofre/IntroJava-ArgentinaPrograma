//Un docente de Programación tiene un listado de 3 notas registradas por cada uno de sus
//N estudiantes. La nota final se compone de un trabajo práctico Integrador (35%), una
//Exposición (25%) y un Parcial (40%). El docente requiere los siguientes informes claves de
//sus estudiantes:
//	§ Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante
//	reprueba el curso si tiene una nota final inferior a 6.5
//		§ Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
//		§ La mayor nota obtenida en las exposiciones.
//		§ Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.
//		El programa pedirá la cantidad de alumnos que tiene el docente y en cada alumno pedirá
//		las 3 notas y calculará todos informes claves que requiere el docente.



Algoritmo ejer3_a
	
	Definir n,i como entero
	definir nota1,nota2,nota3,notafinal,pa,pat,maynota,pen  como real
	
	Escribir "Ingrese la cantidad de alumnos"
	leer n
	pa = 0
	pat =0
	maynota=0
	pen=0
	Para i=1 Hasta n Con Paso 1 Hacer
		Escribir "Alumno numero ",i
		Escribir " Ingrese la nota del trabajo práctico Integrador"
		leer nota1
		Escribir "Ingrese la nota de la Exposición "
		Leer nota2
		Escribir "Ingrese la nota del un Parcial "
		Leer nota3
		
		notafinal = (nota1 *  0.35) + (nota2 * 0.25) + (nota3 * 0.40)
		
		si notafinal< 6.5 Entonces
			Escribir "El alumno ha reprobado"
		FinSi
		si notafinal> 7.5 Entonces
			pa = pa +1
			pat =( pa * 100) / n
			
		FinSi
		
		si nota2 > maynota Entonces
			
			maynota = nota2
		FinSi
		si nota3 >= 4 y nota3 <= 7.5 Entonces
			pen = pen +1
		FinSi
		
		Escribir "_________________________________________________________________________________"
	Fin Para
	Escribir "Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5. es de: " pat " por ciento"
	Escribir "La mayor nota obtenida en las exposiciones." maynota
	Escribir "Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5. es de ",pen 
FinAlgoritmo
