Algoritmo busqueda
	//Algoritmo que busca un nombre y devulve su posici�n
	Escribir "--------------------------------------------------";
	Escribir "Tarea M�dulo 2 - Clase 18 - Algoritmos de b�squeda";
	Escribir "--------------------------------------------------";
	Escribir "";
	Escribir "1)";
	//Declaro variables
	Definir pilotos Como Entero;
	Definir lista como Caracter;
	Definir nombre como Caracter;
	Definir encontrado Como Logico;
	Definir i como Entero;
	Definir velocidad como Real;
	//Tama�o del arreglo
   pilotos = 5;
   
    dimension lista(pilotos);
	
    lista(0)="Jos�";
    lista(1)="Manuel";
    lista(2)="Silvana";
    lista(3)="Marcos";
    lista(4)="Telma";
	
	dimension tiempos(velocidad);
	
	tiempos(0)
    //Ingresar el nombre a buscar
    Escribir Sin Saltar"Escribe el nombre a buscar: ";
    leer nombre;
	Escribir "";
	
    //Usado para marcar si existe o no el elemento buscado
    encontrado = falso ;
	
    //Recorremos el arreglo buscando los elementos
    Para i<-0 Hasta pilotos-1 Hacer
		
        Si nombre = lista(i) Entonces
            Escribir "Se ha encontrado el nombre ",nombre," en la posicion: ",i;
            encontrado = verdadero; //Ya existe algun elemento
        FinSi
		
    FinPara
	
    //Sino encuentro nada, muestro un mensaje
    Si no encontrado Entonces
        Escribir "No se ha encontrado ningun elemento.";
    FinSi
	//Cr�ditos
	Escribir "";
	Escribir "_________________________________________________";
	Escribir "Alumno: Daniel Pozzo Ardizzi";
	Escribir "";
FinAlgoritmo
