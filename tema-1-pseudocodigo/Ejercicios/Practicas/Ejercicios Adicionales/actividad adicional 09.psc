// En este ejercicio el programa mostrara números aleatorio hasta que el usuario introduzca la letra "f".

Algoritmo NumeroAlAzarHastaF
	Definir i Como Entero;
	definir text como texto;
	
	//While
	
	text <- "Hola";
	Mientras text != "f" Hacer
		escribir azar(100);
		leer text;
	Fin Mientras
	
	//Do While
	
	Repetir
		escribir azar(100);
		leer text;
	Hasta Que text = "f";
	
	
FinAlgoritmo
