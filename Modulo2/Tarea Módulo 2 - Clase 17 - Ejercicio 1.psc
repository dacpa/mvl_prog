Algoritmo CapacidadAula
	//Algoritmo que informa la cantidad de butacas desocupadas en un cine.
	Escribir "-------------------------------------";
	Escribir "Tarea Módulo 2 - Clase 17 - Arreglos";
	Escribir "-------------------------------------";
	Escribir "";
	Escribir "1)";
	//Declaro variables
	Definir CantidadAlumnos Como Entero;
	Definir indiceAula como entero;
	Definir ListaCapacAula como Entero;
	Definir ListaColorAula como Caracter;
	Definir i Como Entero;
	Definir capacidadAulaActual como Entero;
	Definir CantidadExced como Entero;
	//Listas
	Dimension ListaColorAula[4];
	Dimension ListaCapacAula[4];
	ListaCapacAula[1]=40;
	ListaCapacAula[2]=35;
	ListaCapacAula[3]=30;
	ListaColorAula[1]="Azul";	
	ListaColorAula[2]="Verde";
	ListaColorAula[3]="Amarillo";
	Escribir Sin Saltar "Ingrese la cantidad de alumnos inscriptos para cursar 3er grado: ";
	Leer CantidadAlumnos;
	Escribir "";
	Si CantidadAlumnos = 0 Entonces
		Escribir "No ha ingresado ningún valor. El número debe ser mayor a 0.";
	Sino
		Si CantidadAlumnos < 40 Entonces
	Para i=1 Hasta 3 Hacer
				CapacidadAulaActual = ListaCapacAula[i];
				
				
				Si CapacidadAulaActual>= CantidadAlumnos Entonces
			indiceAula = i;
				FinSi
	FinPara
		Escribir "El aula indicada para la cantidad de alumnos es la de color ", ListaColorAula[indiceAula], ", con capacidad para ", ListaCapacAula[indiceAula], " estudiantes.";
	SiNo
		CantidadExced = CantidadAlumnos - 40;
		Escribir "La cantidad de alumnos supera la capacidad máxima del aula Azul de 40 vacantes. Hay un excedente de ", CantidadExced, " inscriptos.";
		FinSi
	FinSi
	//Créditos
	Escribir "";
	Escribir "_________________________________________________";
	Escribir "Alumno: Daniel Pozzo Ardizzi";
	Escribir "";
		FinAlgoritmo
