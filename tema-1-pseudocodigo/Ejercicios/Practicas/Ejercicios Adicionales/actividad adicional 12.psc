// Practica 12 del dossier con un breve cambio


// Mostrar los números entre 13 y 30 de una sucesion que suma 2 y 3 consecutivamente.

Algoritmo p12repetir
	definir dato, i Como Entero;
	dato <-2;
	i <- 1;
	mientras dato <= 30 hacer
		si i%2 = 1 Entonces
			si dato >= 13 Entonces
				escribir dato;
			FinSi
			dato <- dato + 2;
		sino
			si dato >= 13 Entonces
				escribir dato;
			FinSi
			dato <- dato + 3;
		FinSi
		i <- i + 1;
	FinMientras
FinAlgoritmo
