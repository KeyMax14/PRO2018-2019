// Diseña un algoritmo que pida el valor de los dos lados de un rectángulo y muestre el valor de su perímetro y el de su área.

Algoritmo p05
	
	definir lado1, lado2, perimetro, area como real;
	Escribir "Introduzca el valor del ancho y el largo del rectangulo en metros: (Presione enter para introducir el siguiente valor.)"
	Leer lado1, lado2;
	perimetro <- (lado1+lado2)*2;
	area <- lado1*lado2;
	Escribir "El área del rectangulo es de ", area, " m^2 y su perímetro es de ", perimetro, " m.";
	
	
FinAlgoritmo
