Algoritmo EjercicioRepetir
	//Algoritmo que muestra por pantalla la tabla de multiplicar
	Escribir "---------------------------------------------------";
	Escribir "Tarea Módulo 2 - Clase 14 - Estructuras repetitivas";
	Escribir "---------------------------------------------------";
	Escribir "";
	Escribir "2)";
	//Declaro variables
	Definir numTabla, numMult, numEjec Como Entero;
	numEjec = 0;
	//Ingreso de datos
    Escribir Sin Saltar "¿Qué tabla de multiplicar desea?: " ;
	Leer numTabla ;
	Escribir "";
	Escribir Sin Saltar "¿Hasta qué multiplicador?: " ;
	Leer numMult;
	Escribir "";
	//Cálculos
	Escribir "Resultado de la multiplicación solicitada:";
	Escribir "";
	Repetir
		numEjec = numEjec + 1;
		Escribir numTabla, " x ", numEjec, " = ", numTabla*numEjec;
		Hasta Que (numEjec = numMult)
	//Créditos
	Escribir "";
	Escribir "_________________________________________________";
	Escribir "Alumno: Daniel Pozzo Ardizzi";
	Escribir "";
FinAlgoritmo