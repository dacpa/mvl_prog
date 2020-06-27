Algoritmo Estadistico
	//Algoritmo que muestra cuantas personas son hombre y mujer, además del porcentaje de mujeres.
	Escribir "-------------------------------------";
	Escribir "Tarea Módulo 2 - Clase 15 - Arreglos";
	Escribir "-------------------------------------";
	Escribir "";
	Escribir "3)";
	//Declaro variables
	Definir lista como Caracter;
	Definir i como Entero;
	Definir H Como Caracter;
	Definir M Como Caracter;
	Definir contadorh como Entero;
	Definir contadorm como Entero;
	Definir respuesta Como Caracter;
	Dimension lista[30];
	contadorh = 0;
	contadorm = 0;
	i=0;
	Para i = 0 Hasta 29 Hacer
		Escribir "Ingrese la letra H si es hombre o la letra M si es mujer";
		Leer respuesta;
		Si respuesta = "H" Entonces
			contadorh = contadorh+1;
			SiNo
				contadorm = contadorm+1;
		FinSi
	FinPara
	Escribir "Cantidad de hombres: ", contadorh,".", " Cantidad de mujeres: ", contadorm,".";
	//Créditos
	Escribir "";
	Escribir "_________________________________________________";
	Escribir "Alumno: Daniel Pozzo Ardizzi";
	Escribir "";
		FinAlgoritmo
