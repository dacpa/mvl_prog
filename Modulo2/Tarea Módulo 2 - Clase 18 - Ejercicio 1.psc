Algoritmo busqueda
		//Algoritmo que busca un nombre y devuelve su posición.
		Escribir "--------------------------------------------------";
		Escribir "Tarea Módulo 2 - Clase 18 - Algoritmos de búsqueda";
		Escribir "--------------------------------------------------";
		Escribir "";
		Escribir "1)";
		//Declaro variables
	Definir cantidad Como Entero;
	Definir lista Como Caracter;
	Definir nombre Como Caracter;
	Definir encontrado Como Logico;
	Definir i Como Entero;
	//Tamaño del arreglo
    cantidad = 5;
	
    Dimension lista(cantidad);
	
    lista(0)="Isabela";
    lista(1)="Juan";
    lista(2)="Viviana";
    lista(3)="Daniel";
    lista(4)="Marianela";
	
    //Ingresar el nombre a buscar
    Escribir Sin Saltar"Escribe el nombre a buscar: ";
    Leer nombre;
	Escribir "";
	
    //Usado para marcar si existe o no el elemento buscado
    encontrado = falso ;
	
    //Recorremos el arreglo buscando los elementos
    Para i<-0 Hasta cantidad-1 Hacer
		
        Si nombre = lista(i) Entonces
            Escribir "Se ha encontrado el nombre ",nombre," en la posicion: ",i;
            encontrado = verdadero; //Ya existe algun elemento
        FinSi
		
    FinPara
	
    //Sino encuentro nada, muestro un mensaje
    Si no encontrado Entonces
        Escribir "No se ha encontrado ningun elemento.";
    FinSi
	//Créditos
	Escribir "";
	Escribir "_________________________________________________";
	Escribir "Alumno: Daniel Pozzo Ardizzi";
	Escribir "";
FinAlgoritmo
