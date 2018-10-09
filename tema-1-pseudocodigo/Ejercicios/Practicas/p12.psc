//Práctica 12: Implementa un algoritmo que muestre todos los números potencia de 2 entre
//		20 y 230, ambos inclusive.

Algoritmo p12
	Definir n como entero;
	Escribir "Estos son los números potencia de 2 que están entre 20 y 230, ambos inclusive.";
	n <- 2
	Mientras n <= 230 Hacer
		si n >= 20 entonces
			Escribir n;
		fin si
		n <- n * 2
	FinMientras
FinAlgoritmo
