//Los empleados de una fábrica trabajan en dos turnos: Diurno y Nocturno. Se desea calcular el
//jornal diario de acuerdo con las siguientes reglas:
//	a) La tarifa de las horas diurnas es de $ 90
//	b) La tarifa de las horas nocturnas es de $ 125
//	c) En caso de ser feriado, la tarifa se incrementa en un 10% si el turno es diurno y en
//		un 15% si el turno es nocturno.
//			
//		El programa debe solicitar la siguiente información al usuario: el nombre del trabajador, el día
//			
//			de la semana, el turno (diurno o nocturno) y la cantidad de horas trabajadas. Además, debe-
//			mos preguntarle al usuario si el día de la semana (lunes, martes, miércoles, etc.) era festivo o
//				
//				no, para poder calcular el jornal diario. Utilice una función para realizar el cálculo.


Algoritmo Clase12Ejercicio9
	Definir nombre, dia, turno, feriado Como Caracter
	Definir horas Como Real
	
	Escribir "Defina su nobre: "
	Leer nombre
	Escribir "Indique que dia es: "
	Leer dia
	Escribir "Que turno trabajas: "
	Leer turno
	Escribir "Indique la cantidad de horas: "
	Leer horas
	Escribir "Algun feriado?: "
	Leer feriado
	
	Escribir "Sueldo es: " sueldo(turno, horas, feriado)
	
FinAlgoritmo

Funcion jornalDiario <- sueldo(turno, horas, feriado)
	Definir jornalDiario Como Real
	
	
	Si feriado = "si" Entonces
		Si turno = "diurno" Entonces
			jornalDiario = (horas * 90 * 0.10) + (horas * 90)
		SiNo
			Si turno = "nocturno" Entonces
				jornalDiario = (horas * 125 * 0.15) + (horas * 125)
			FinSi
		FinSi
		
	SiNo
		
		Si turno = "diurno" Entonces
			jornalDiario = horas * 90
		SiNo 
			Si turno = "nocturno" Entonces
				jornalDiario = horas * 125
			SiNo
				Si turno <> "diurno" y turno <> "nocturno" Entonces
					Escribir "Turno no valido, defina nuevamente: "
					Leer turno
				FinSi
			FinSi
		FinSi
	FinSi
	
FinFuncion
	