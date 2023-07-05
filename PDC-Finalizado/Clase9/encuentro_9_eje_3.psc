//  Un docente de Programación tiene un listado de 3 notas registradas por cada uno de sus
//  N estudiantes. La nota final se compone de un trabajo práctico Integrador (35%), una
//  Exposición (25%) y un Parcial (40%). El docente requiere los siguientes informes claves de
//  sus estudiantes:
//	§ Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante
//	reprueba el curso si tiene una nota final inferior a 6.5
//	§ Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
//	§ La mayor nota obtenida en las exposiciones.
//	§ Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.
//	El programa pedirá la cantidad de alumnos que tiene el docente y en cada alumno pedirá
//	las 3 notas y calculará todos informes claves que requiere el docente.

Algoritmo encuentro_9_eje_3
	
	Definir i, cant_alumnos, aprobados, cant_desaprobados Como Entero
	Definir nota1, nota2, nota3, promedio, prom_desaprobados, desaprobados Como Real
	aprobados = 0
	desaprobados = 0
	cant_desaprobados = 0
	Escribir "cantidad de alumnos"
	Leer cant_alumnos
	nota1 = Aleatorio(0,10)
	nota2 = Aleatorio(0,10)
	nota3 = Aleatorio(0,10)
	
	Para i <- 1 Hasta cant_alumnos Con Paso 1 Hacer
		Escribir "ingrese las notas del trabajo integrador"
		nota1 = nota1 * 0.35
		Escribir " "
		Escribir nota1
		
		Escribir "ingrese las notas de la exposicion"
		nota2 = nota2 * 0.25
		Escribir " "
		Escribir nota2
		
		Escribir "ingrese la nota del parcial"
		nota3 = nota3 * 0.40
		Escribir " "
		Escribir nota3
		
		promedio = nota1 + nota2 + nota3
		Escribir promedio
		
		Si (nota1 / 0.35) >= 7.5 Entonces
			Escribir "el alumno esta aprobado"
			aprobados = aprobados + 1
			Escribir " "
			Escribir "la cantidad de alumnos aprobados es " aprobados
		Fin Si
		
		Si promedio < 6.5 Entonces
			Escribir "el alumno esta desaprobado"
			desaprobados = desaprobados + promedio
			cant_desaprobados = cant_desaprobados + 1
			Escribir " "
			Escribir "la cantidad de alumnos desaprobados es " desaprobados
		Fin Si
	Fin Para
	
	prom_desaprobados = desaprobados / cant_desaprobados
	Escribir "porcentaje de alumnos aprobados es = " (aprobados * 100) / cant_alumnos
	Escribir " "
	Escribir "promedio de nota de los desaprobados es " prom_desaprobados
	
FinAlgoritmo
