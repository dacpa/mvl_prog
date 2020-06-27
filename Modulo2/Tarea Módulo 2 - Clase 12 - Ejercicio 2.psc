Algoritmo Validarclave
	//Declaro la variable del primer sumando y le reservo un lugar en memoria
	Escribir "-------------------------------------------------";
	Escribir "Tarea Módulo 2 - Clase 12 - Ejercicios con pseInt";
	Escribir "-------------------------------------------------";
	Escribir " ";
	//Corresponde a la clave autorizada para ingreso al sistema
	Definir clave Como Entero;
	clave = 2529;
	//Corresponde a la clave ingresada por el usuario para ingresar al sistema
	Definir clave1 Como Entero;
	Escribir "Ingrese la clave válida para acceder al sistema: ";
	Leer clave1;
	Si (clave == clave1) Entonces
		Escribir " ";
		Escribir "Acceso autorizado.";
	Sino
		Escribir " ";
		Escribir "Acceso no autorizado.";
	FinSi
	Escribir " ";
	Escribir " ";
		Escribir "_________________________________________________";
	Escribir "Alumno: Daniel Pozzo Ardizzi";
	
FinAlgoritmo
