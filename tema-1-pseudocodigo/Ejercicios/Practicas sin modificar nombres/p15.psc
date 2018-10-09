//Pr�ctica 15: Calcular usando un array, el valor m�nimo, m�ximo y valor medio de 7
//	n�meros introducidos por el usuario. El programa le ir� pidiendo todos los n�meros y
//	cuando se hayan introducido mostrar� el menor de los n�meros, el mayor y el valor medio

Algoritmo p16
	definir i, array, min, max Como Entero;
	definir medio como real;
	Dimension array[7];
	
	Escribir "Introduce 7 n�meros enteros: (Separados por Enter.)"
	
	para i <- 0 hasta 6 Con Paso 1 Hacer
		leer array[i];
	FinPara
	
	min <- array[0];
	max <- array[0];
	medio <- array[0];
	
	para i <- 1 hasta 6 Con Paso 1 Hacer
		
		si array[i] > max Entonces
			max <- array[i];
		FinSi
		
		si array[i] < min entonces
			min <- array[i];
		FinSi
		
		medio <- medio + array[i];
		
	FinPara
	
	medio <- medio/7;
	
	Escribir "El valor m�ximo introducido es ", max, ", el valor m�nimo es ", min, " y el valor medio es ", medio, ".";
	
	
FinAlgoritmo
