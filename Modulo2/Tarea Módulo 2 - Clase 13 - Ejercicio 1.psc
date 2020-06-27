Algoritmo validarBancos
	Escribir "-------------------------------------------------";
	Escribir "Tarea Módulo 2 - Clase 13 - Ejercicios con pseInt";
	Escribir "-------------------------------------------------";
	Escribir "";
	Escribir "1) ";
	//Declaro las variables de la memoria
	Definir bancos, alumnos Como Entero;
	Escribir Sin Saltar "Cantidad de bancos disponibles en el aula: ";
	Leer bancos;
	Escribir "";
	Escribir Sin Saltar "Cantidad de alumnos inscriptos en el curso: ";
	Leer alumnos;
	Escribir "";
	Si (bancos >= alumnos) Entonces
		Escribir "";
		Escribir "La cantidad de bancos es suficiente.";
	SiNo
		Si (alumnos > bancos) Entonces;
			Escribir "";
			Escribir "Faltan ",alumnos-bancos, " bancos.";
		FinSi
	FinSi
	Escribir "";
	Escribir "_________________________________________________";
	Escribir "Alumno: Daniel Pozzo Ardizzi";
	Escribir " ";
FinAlgoritmo
