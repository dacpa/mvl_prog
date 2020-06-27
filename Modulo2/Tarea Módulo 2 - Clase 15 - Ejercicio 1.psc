Algoritmo Promedio
	//Algoritmo que informa la cantidad de butacas desocupadas en un cine.
	Escribir "-------------------------------------";
	Escribir "Tarea Módulo 2 - Clase 15 - Arreglos";
	Escribir "-------------------------------------";
	Escribir "";
	Escribir "1)";
	//Declaro variables
	Definir lista como Entero;
	Definir i Como Entero;
	Definir resultado Como Logico;
	Definir total como Entero;
	Definir F Como Logico;
	Definir V Como Logico;
	F = Falso;
	V = Verdadero;
	total=0;
	Escribir "Responder con: V (verdadero) o F (falso)";
	Escribir "";
	Dimension lista[5];
	Para i = 0 Hasta 4 Hacer
		
		Escribir Sin Saltar "Ingrese si la butaca ", i+1, " esta ocupada o vacía.";
		Leer resultado;
		Si resultado = F Entonces
			total = total + 1;
		FinSi
		
	FinPara
	Escribir "";
	Escribir "Total de butacas vacias: .", total;
	//Créditos
	Escribir "";
	Escribir "_________________________________________________";
	Escribir "Alumno: Daniel Pozzo Ardizzi";
	Escribir "";
FinAlgoritmo
