Algoritmo MaxMin
	//Algoritmo que lea números enteros hasta teclear 0, y nos muestre el máximo, el mínimo y la media de todos ellos
	Escribir "-----------------------------------";
	Escribir "Tarea Módulo 2 - Clase 19 - Repaso";
	Escribir "-----------------------------------";
	Escribir "";
	Escribir "1)";
	//Declaro variables
	Definir num Como Real;
	Definir minimo Como Real;
	Definir maximo Como Real;
	Definir suma Como Real;
	Definir media Como Real;
	Definir contador Como Real;
	
	Escribir "Programa para determinar, de una secuencia de números, cual es el máximo, el mínimo y la media.";
	Escribir "";
	Escribir "Ingrese distintos números. Para finalizar, digite el 0: ";
	Escribir "";
	Leer num;
	//maximo y el minimo se inician con el numero que
	//insertemos para que lo podamos modificar
	//durante el programa
	minimo<-num;
	maximo<-num;
	suma<-0;
	contador=0;
	Mientras (num<>0) Hacer
		Si (num>maximo) Entonces
			maximo<-num;
		FinSi
		Si (num<minimo) Entonces
			minimo<-num;
		FinSi
		suma<-suma+num;
		contador<-contador+1;
		Leer num;
	FinMientras
	media<-suma/(contador);
	//escrbimos los resultados
	Escribir "";
	Escribir "El máximo es " maximo,".";
	Escribir "El mínimo es " minimo,".";
	Escribir "La media es " media,".";
	//Créditos
	Escribir "";
	Escribir "_________________________________________________";
	Escribir "Alumno: Daniel Pozzo Ardizzi";
	Escribir "";
FinAlgoritmo
