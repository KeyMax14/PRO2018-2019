// Dise�a un algoritmo que pida el valor de los dos lados de un rect�ngulo y muestre el valor de su per�metro y el de su �rea.

Algoritmo p05
	
	definir lado1, lado2, perimetro, area como real;
	Escribir "Introduzca el valor del ancho y el largo del rectangulo en metros: (Presione enter para introducir el siguiente valor.)"
	Leer lado1, lado2;
	perimetro <- (lado1+lado2)*2;
	area <- lado1*lado2;
	Escribir "El �rea del rectangulo es de ", area, " m^2 y su per�metro es de ", perimetro, " m.";
	
	
FinAlgoritmo
