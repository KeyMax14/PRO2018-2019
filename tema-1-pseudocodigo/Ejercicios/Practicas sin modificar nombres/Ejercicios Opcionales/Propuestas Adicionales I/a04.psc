// Pr�ctica 04: Dise�a un algoritmo que pida el valor del lado de un cuadrado y muestre el
//		valor de su per�metro y el de su �rea.

Algoritmo p04
	
	definir lado, perimetro, area como real;
	Escribir "Introduzca el valor del lado del cuadrado: (m)"
	Leer lado;
	perimetro <- lado*4;
	area <- lado^2;
	Escribir "El �rea del cuadrado es de ", area, " m^2 y su per�metro es de ", perimetro, " m.";
		
FinAlgoritmo
