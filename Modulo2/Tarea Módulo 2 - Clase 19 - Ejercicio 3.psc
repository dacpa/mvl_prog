Algoritmo SolicitarAcceso
	//Escribir un algoritmo que nos pida una clave. Solo tenemos 3 intentos para acertar, si fallamos los 3 intentos nos mostrara un mensaje indic�ndonos que hemos agotado esos 3 intentos.
	Escribir "-----------------------------------";
	Escribir "Tarea M�dulo 2 - Clase 19 - Repaso";
	Escribir "-----------------------------------";
	Escribir "";
	Escribir "3)";
	//Declaro variables
	Definir acierto Como Logico;;
	Definir  contador Como Entero;
	Definir  clave Como Caracter;
	contador<-0;
	//interruptor
	acierto<-Falso;
	//usamos un interruptor, cuando acertemos,
	//cambiara y la condicion sera falsa
	Mientras (contador<3 Y acierto=falso) Hacer
		//ponemos aqui leer porque con las variables
		//iniciales entra en el bucle
		Escribir "Ingrese la contrase�a.";
		Leer clave;
		Escribir "";
		Si (clave="eureka") Entonces
			Escribir"";
			Escribir "La contrase�a es correcta.";
			//el interruptor cambia cuando acertamos
			acierto<-Verdadero;
		FinSi
		contador<-contador+1;
	FinMientras
	//este mensaje solo aparecera si hemos agotado
	//todos los intentos y no hemos acertado
	Si (contador=3 Y acierto=falso) Entonces
		Escribir "Ya no tiene m�s intentos.Acceso denegado.";
	FinSi
	//Cr�ditos
	Escribir "";
	Escribir "_________________________________________________";
	Escribir "Alumno: Daniel Pozzo Ardizzi";
	Escribir "";
FinAlgoritmo
