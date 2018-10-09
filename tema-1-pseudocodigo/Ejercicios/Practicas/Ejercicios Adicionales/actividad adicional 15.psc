// Realizar una tabla de multiplicar según un número que introduzca el usuario. 


Algoritmo multiplicar
	definir i, tabla Como Entero;
	Escribir "Dime la tabla que deseas:";
	leer tabla;
	Escribir "Tabla del ", tabla;
	i <- 1;
	Mientras i < 11 Hacer
		Escribir tabla ," x ",i," = ",tabla*i;
		i <- i + 1;
	FinMientras
FinAlgoritmo
