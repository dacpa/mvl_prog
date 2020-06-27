Algoritmo ordenAscen
	//Algoritmo de ordenamiento con el método burbuja.
	Escribir "-------------------------------------";
	Escribir "Tarea Módulo 2 - Clase 17 - Arreglos";
	Escribir "-------------------------------------";
	Escribir "";
	Escribir "2)";
	//Declaro variables
	Definir v como Entero;
	Definir i como Entero;
	Definir g como Entero;
	Definir aux como Entero;
	Definir Lista Como Entero;
	Dimension Lista[10];
	v=5;
	Escribir "Ingresar cinco números enteros para ser ordenados de manera ascendente: ";
	Escribir "";
	Para i<-1  Hasta v Hacer
		Escribir Sin Saltar i," - ";
		
		Leer Lista[i];
	FinPara
	Para i<-2 Hasta v Hacer
		Para g<-1 Hasta v-i+1 Hacer
			Si Lista[g] > Lista[g+1] Entonces
				aux=Lista[g];
				Lista[g] = Lista[g+1];
				Lista[g+1]=aux;
			FinSi
		FinPara
	FinPara
	Escribir "";
	Escribir "Lista ordenada: ";
	Escribir "";
	Para i<-1 Hasta v Hacer
		Escribir "[" ,i,"] : ", Lista[i];
	FinPara
	//Créditos
	Escribir "";
	Escribir "_________________________________________________";
	Escribir "Alumno: Daniel Pozzo Ardizzi";
	Escribir "";
FinAlgoritmo
