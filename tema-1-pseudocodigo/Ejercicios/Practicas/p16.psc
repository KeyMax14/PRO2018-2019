//Pr�ctica 16: Mostrar usando un array los dos n�meros mayores de 10 n�meros
//	introducidos por teclado

Algoritmo p16
	Definir num, temp como enteros;
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
	
	Escribir "El n�mero mayor es ", num[0], ".";
	Escribir "El segundo n�mero mayor es ", num[1], ".";
FinAlgoritmo
