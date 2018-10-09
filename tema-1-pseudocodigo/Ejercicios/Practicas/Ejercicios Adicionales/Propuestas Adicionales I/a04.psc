// Práctica 04: Diseña un algoritmo que pida el valor del lado de un cuadrado y muestre el
//		valor de su perímetro y el de su área.

Algoritmo p04
	
	definir lado, perimetro, area como real;
	Escribir "Introduzca el valor del lado del cuadrado: (m)"
	Leer lado;
	perimetro <- lado*4;
	area <- lado^2;
	Escribir "El área del cuadrado es de ", area, " m^2 y su perímetro es de ", perimetro, " m.";
		
FinAlgoritmo
