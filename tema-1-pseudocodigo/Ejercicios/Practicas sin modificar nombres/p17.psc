//Pr�ctica 17: Modificar el anterior para que sirva con cualquier cantidad de n�meros
//		mayores que se quiera tener guardados.

Algoritmo p17
	Definir num, temp, CantidadNum como enteros;
	Dimension num[10];
	Escribir "Introduzca 10 n�meros: (Separados por Enter.)";
	
	para i<-0 hasta 9 con paso 1 Hacer
		Leer num[i];
	FinPara
		
	para i<-0 hasta 9 con paso 1 hacer
		para j<-i+1 hasta 9 con paso 1 Hacer
			si num[i] < num[j] entonces
				temp <- num[i];
				num[i] <- num[j];				// Con este doble para se ordena de mayor a menor el array
				num[j] <- temp;
			FinSi
		FinPara
	FinPara
	
	Escribir "Introduzca la cantidad de numeros mayores que quiere mostrar: ";
	leer CantidadNum;
	Escribir "Estos son los n�meros mayores: ";
	para i<-0 hasta CantidadNum-1 con paso 1 Hacer
		Escribir Sin Saltar num[i], " ";
	FinPara
	Escribir "";
FinAlgoritmo