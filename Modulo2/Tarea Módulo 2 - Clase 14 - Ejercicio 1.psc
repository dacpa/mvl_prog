Algoritmo EjercicioMientras
	//Algoritmo que muestra por pantalla la tabla de multiplicar
	Escribir "---------------------------------------------------";
	Escribir "Tarea M�dulo 2 - Clase 14 - Estructuras repetitivas";
	Escribir "---------------------------------------------------";
	Escribir "";
	Escribir "1)";
	//Declaro variables
	Definir numTabla, num Como Entero;
	Definir numMult Como Entero;
	Definir numEjec Como Entero;
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
	Mientras (numEjec <> numMult)
		numEjec = numEjec + 1; 
		Mostrar numTabla, " x ", numEjec, " = ", numTabla*numEjec ;  
	FinMientras
	//Cr�ditos
	Escribir "";
	Escribir "_________________________________________________";
	Escribir "Alumno: Daniel Pozzo Ardizzi";
	Escribir "";
FinAlgoritmo