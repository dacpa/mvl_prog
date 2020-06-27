Algoritmo Promedio
	//Algoritmo que muestra el promedio altura entre 15 alumnos.
	Escribir "---------------------------------------------------";
	Escribir "Tarea Módulo 2 - Clase 15 - Estructuras repetitivas";
	Escribir "---------------------------------------------------";
	Escribir "";
	Escribir "2)";
	//Declaro variables
	Definir lista como Real;
	Definir i como Real;
	Definir prom como Real;
	Definir total como Real;
	prom = 0;
	total = 0;
	Dimension lista[15];
	Para i = 0 Hasta 14 Hacer
		Escribir Sin Saltar"Ingrese la altura del alumno ",i+1,", expresada en metros ";
		Leer lista[i];
		total = total + lista[i];
	FinPara
	 prom = total/15;
	 Escribir "";
	 Escribir "El promedio de altura de los 15 alumnos es de ",prom, " metros.";
	 //Créditos
	 Escribir "";
	 Escribir "_________________________________________________";
	 Escribir "Alumno: Daniel Pozzo Ardizzi";
	 Escribir "";
FinAlgoritmo
