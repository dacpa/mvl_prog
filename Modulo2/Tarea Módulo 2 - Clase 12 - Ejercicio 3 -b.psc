Algoritmo Validarusuarioyclave
	//Declaro la variable del primer sumando y le reservo un lugar en memoria
	Escribir "-------------------------------------------------";
	Escribir "Tarea M�dulo 2 - Clase 12 - Ejercicios con pseInt";
	Escribir "-------------------------------------------------";
	Escribir " ";
	Escribir "2) Validaci�n del nombre de usuario y de la clave. 2� opci�n:";
	Escribir " ";
	Definir usuario, clave Como Caracter;
	//Corresponde al nombre de usuario que se ingresa manualmente para acceder al sistema
	usuario = "Daniel";
	//Corresponde a la clave autorizada para ingresar al sistema
	clave = "Programacion";
	Definir usuario1, clave1 Como Caracter;
	Escribir "Ingrese el nombre del usuario autorizado para acceder al sistema: ";
	Leer usuario1;
	Escribir " ";
	Escribir "Ingrese la clave v�lida para acceder al sistema: ";
	Leer clave1;
		Si (usuario == usuario1 y clave == clave1) Entonces
		Escribir " ";
		Escribir "Acceso autorizado.";
			SiNo
				Escribir " ";
				Escribir "El usuario o la clave es incorrecta. Acceso no autorizado.";
	FinSi
	Escribir " ";
		Escribir "_________________________________________________";
		Escribir "Alumno: Daniel Pozzo Ardizzi";
		Escribir " ";
	
FinAlgoritmo
