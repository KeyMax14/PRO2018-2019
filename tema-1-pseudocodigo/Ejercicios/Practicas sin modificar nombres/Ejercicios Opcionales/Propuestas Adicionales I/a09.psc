//Pr�ctica 13: Dise�a un algoritmo que, dados cinco n�meros enteros, determine cu�l de los
//		cuatro �ltimos n�meros es m�s cercano al primero. (Por ejemplo, si el usuario introduce los
//			n�meros 2, 6, 4, 1 y 10, el programa responder� que el n�mero m�s cercano al 2 es el 1.)

Algoritmo p13
	
	Definir n1, n2, distancia, min, dmin Como Entero;
	Escribir "Introduzca un n�mero entero:";
	Leer n1;
	
	para i<-1 hasta 4 con paso 1 Hacer
		Escribir "Introduzca el siguiente n�mero:";
		Leer n2;
		Si i = 1 Entonces
			dmin <- abs(n2-n1);
			min <- n2;
		SiNo
			distancia <- abs(n2-n1);
			Si dmin > distancia Entonces
				dmin <- distancia;
				min <- n2;
			Fin Si
		Fin Si
	FinPara
	
	Escribir "El n�mero m�s cercano a ", n1, " es ", min, ", con una distancia de ", dmin, ".";
	
	
FinAlgoritmo
