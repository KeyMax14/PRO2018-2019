//Pr�ctica 09: Crear un algoritmo que le solicite al usuario un n�mero y muestre la tabla de
//multiplicar para ese n�mero. Hacerlo para los tres tipos de bucles que hemos visto

Algoritmo p09
	
	definir num, bucle, i como entero;
	
	Escribir "Diga la tabla que desea:"
	leer num;
	
	Escribir "Menu";
	Escribir "1) Bucle Para.";
	Escribir "2) Bucle mientras.";
	Escribir "3) Bucle repetir.";
	leer bucle;
	
	si bucle = 1 Entonces
		Para i<-1 Hasta 10 Con Paso 1 Hacer
			escribir num, " x ", i, " = ", num*i;
		Fin Para
	SiNo
		si bucle = 2 Entonces
			i <- 1;
			mientras i < 11 Hacer
				escribir num, " x ", i, " = ", num*i;
				i <- i + 1;
			FinMientras
		SiNo
			si bucle = 3 Entonces
				i <- 1;
				Repetir
					escribir num, " x ", i, " = ", num*i;
					i <- i + 1;
				Hasta Que i > 10;
			sino
				Escribir "La opci�n del bucle no es v�lida.";
			FinSi
		FinSi
	FinSi
	
	
	
FinAlgoritmo
