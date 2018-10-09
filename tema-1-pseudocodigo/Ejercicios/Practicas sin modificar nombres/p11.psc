//Práctica 11: Implementa un algoritmo que muestre todos los múltiplos de n entre n y m·n,
//		ambos inclusive, donde n y m son números introducidos por el usuario.

Algoritmo p11
	
	Definir n, m como enteros;
	Escribir "Introduce dos números enteros: (Separados por Enter.)";
	Leer n, m;
	Escribir "Estos son los multiplos de ", n, " desde ", n," a ", n*m, ".";
	
	// Primer método
	
	Para i<-n Hasta n*m Con Paso n Hacer
		Escribir i;
	Fin Para
	
	// Segundo método
	
//	Para i<-1 Hasta m Con Paso 1 Hacer
//		Escribir i*n;
//	Fin Para
	
FinAlgoritmo
