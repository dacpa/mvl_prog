Algoritmo NotaFinal
	//Calcular la nota de N alumnos, introduciendo su nota teórica (60%) y su nota práctica (40%).
	Escribir "-----------------------------------";
	Escribir "Tarea Módulo 2 - Clase 19 - Repaso";
	Escribir "-----------------------------------";
	Escribir "";
	Escribir "2)";
	//Declaro variables
	Definir alumnos Como Entero;
	Definir  nota_teorica como Real;
	Definir  nota_practica como Real;
	Definir nota como Real;
	Definir i como Entero;
	//Validamos el numero de alumnos
    Repetir
	    Escribir Sin Saltar "Escriba la cantidad de alumnos a calificar: ";
        leer alumnos;
	    Si alumnos<1 Entonces
            Escribir "Debe ser mayor o igual que 1.";
		   Escribir "";
        FinSi
	Hasta Que alumnos>0
	//Variables que vamos a usar
    nota_teorica = 0;
    nota_practica = 0;
    nota = 0;
	//Recorremos el numero de alumnos
    Para i<-1 Hasta alumnos Hacer
		//Validamos la nota teorica
        Repetir
		   Escribir "";
		   Escribir "";
		   Escribir Sin Saltar "Introduzca la nota teórica del alumno ",i,".";
            leer nota_teorica;
			Escribir "";
            Si no (nota_teorica>=0 y nota_teorica<=10) Entonces
                Escribir "Debes escribir un valor entre 0 y 10.";
			   Escribir "";
			FinSi
	     Hasta Que nota_teorica>=0 y nota_teorica<=10
	     //Validamos la nota practica
        Repetir
	        Escribir Sin Saltar"Introduzca la nota práctica del alumno: ",i,".";
            leer nota_practica;
	     	Escribir "";
	        Si no (nota_practica>=0 y nota_practica<=10) Entonces
                Escribir "Debe escribir un valor entre 0 y 10.";
		 	Escribir "";
				Escribir "";
            FinSi
	    Hasta Que nota_practica>=0 y nota_practica<=10
	    //Calculamos la nota
        nota = (nota_teorica*0.6) + (nota_practica*0.4);
	    //mostramos la nota
        Escribir "La nota final del alumno número ",i," es: ", nota,".";
	FinPara
	//Esto incrementa en uno y coloca el número de alumno del cual se está ingresando la nota.
	i=i+1;
	//Créditos
	Escribir "";
	Escribir "_________________________________________________";
	Escribir "Alumno: Daniel Pozzo Ardizzi";
	Escribir "";
FinAlgoritmo
