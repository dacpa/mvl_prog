Algoritmo descuento
	//Obtener el descuento del 10% en una compra con pago al contado
	Escribir "-------------------------------------------------";
	Escribir "Tarea Módulo 2 - Clase 13 - Ejercicios con pseInt";
	Escribir "-------------------------------------------------";
	Escribir "";
	Escribir "2)";
	//Declaro variables
	Definir compra, resultado Como Real;
	Definir pago Como Caracter;
	Escribir Sin Saltar "Ingrese el costo del producto: ";
	Leer compra;
	Escribir "";
	Escribir Sin Saltar "Ingrese la forma de pago: ";
		Leer pago;
	Si pago == "contado" Entonces
		Escribir "";
		Escribir "El precio final, con el 10% de descuento, es de $ ", compra-((compra*10))/100,".";
	SiNo
		Escribir "";
		Escribir "No se aplica el descuento. El precio final del producto es de: $ ", compra ".";
	FinSi
	Escribir "";
	Escribir "_________________________________________________";
		Escribir "Alumno: Daniel Pozzo Ardizzi";
		Escribir "";
FinAlgoritmo
