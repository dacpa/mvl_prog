Algoritmo EjercicioPara
	//Algoritmo que muestra el promedio de cuatro números
	Escribir "---------------------------------------------------";
	Escribir "Tarea Módulo 2 - Clase 14 - Estructuras repetitivas";
	Escribir "---------------------------------------------------";
	Escribir "";
	Escribir "3)";
	//Declaro variables
	Definir val1, val2, val3, val4, total, promedio Como Real;
	Definir i como Real;
	total=0;
	promedio=0;
	//Ingreso de datos
	para i=1 hasta 4 Hacer
	    Escribir Sin Saltar "Ingrese el valor a promediar: ",i;
		segun i
			1: Leer val1;
			2: Leer val2;
			3: Leer val3;
			4: Leer val4;
		De Otro Modo: Escribir "Error";
		FinSegun
	FinPara
	total=val1+val2+val3+val4;
	promedio=total/4;
	Escribir "";
	Escribir "El promedio de los valores ingresados es: ", promedio ;
	//Créditos
	Escribir "";
	Escribir "_________________________________________________";
	Escribir "Alumno: Daniel Pozzo Ardizzi";
	Escribir "";
FinAlgoritmo