Algoritmo EjercicioRepetir
	//Algoritmo que muestra por pantalla la tabla de multiplicar
	Escribir "---------------------------------------------------";
	Escribir "Tarea M�dulo 2 - Clase 14 - Estructuras repetitivas";
	Escribir "---------------------------------------------------";
	Escribir "";
	Escribir "2)";
	//Declaro variables
	Definir numTabla, numMult, numEjec Como Entero;
	numEjec = 0;
	//Ingreso de datos
    Escribir Sin Saltar "�Qu� tabla de multiplicar desea?: " ;
	Leer numTabla ;
	Escribir "";
	Escribir Sin Saltar "�Hasta qu� multiplicador?: " ;
	Leer numMult;
	Escribir "";
	//C�lculos
	Escribir "Resultado de la multiplicaci�n solicitada:";
	Escribir "";
	Repetir
		numEjec = numEjec + 1;
		Escribir numTabla, " x ", numEjec, " = ", numTabla*numEjec;
		Hasta Que (numEjec = numMult)
	//Cr�ditos
	Escribir "";
	Escribir "_________________________________________________";
	Escribir "Alumno: Daniel Pozzo Ardizzi";
	Escribir "";
FinAlgoritmo