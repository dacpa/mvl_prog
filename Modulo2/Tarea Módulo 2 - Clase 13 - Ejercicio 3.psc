Algoritmo nombreMes
	//A partir del n�mero del mes, se devuevle su correspondiente nombre
		Escribir "-------------------------------------------------";
	Escribir "Tarea M�dulo 2 - Clase 13 - Ejercicios con pseInt";
	Escribir "-------------------------------------------------";
	Escribir "";
	Escribir "3)";
	//Declaro variables
	Definir mes Como Entero;
	Escribir Sin Saltar "Ingrese el n�mero del mes: ";
	Leer mes;
	Escribir "";
	//analisis alternativa multiple
	segun mes
		1: Escribir " enero ";
		2: Escribir " febrero ";
		3: Escribir " marzo ";
		4: Escribir " abril ";
		5: Escribir " mayo ";
		6: Escribir " junio ";
		7: Escribir " julio ";
		8: Escribir " agosto ";
		9: Escribir " septiembre ";
		10: Escribir " octubre ";
		11: Escribir " noviembre ";
		12: Escribir " diciembre ";
		De Otro Modo: Escribir "N�mero de mes err�neo.";
	FinSegun
		Escribir "_________________________________________________";
		Escribir "Alumno: Daniel Pozzo Ardizzi";
		Escribir "";
FinAlgoritmo
