//Pr�ctica 11: Implementa un algoritmo que muestre todos los m�ltiplos de n entre n y m�n,
//		ambos inclusive, donde n y m son n�meros introducidos por el usuario.

Algoritmo p11
	
	Definir n, m como enteros;
	Escribir "Introduce dos n�meros enteros: (Separados por Enter.)";
	Leer n, m;
	Escribir "Estos son los multiplos de ", n, " desde ", n," a ", n*m, ".";
	
	// Primer m�todo
	
	Para i<-n Hasta n*m Con Paso n Hacer
		Escribir i;
	Fin Para
	
	// Segundo m�todo
	
//	Para i<-1 Hasta m Con Paso 1 Hacer
//		Escribir i*n;
//	Fin Para
	
FinAlgoritmo
