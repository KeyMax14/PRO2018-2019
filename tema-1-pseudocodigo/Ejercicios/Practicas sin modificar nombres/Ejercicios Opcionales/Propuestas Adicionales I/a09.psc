//Práctica 13: Diseña un algoritmo que, dados cinco números enteros, determine cuál de los
//		cuatro últimos números es más cercano al primero. (Por ejemplo, si el usuario introduce los
//			números 2, 6, 4, 1 y 10, el programa responderá que el número más cercano al 2 es el 1.)

Algoritmo p13
	
	Definir n1, n2, distancia, min, dmin Como Entero;
	Escribir "Introduzca un número entero:";
	Leer n1;
	
	para i<-1 hasta 4 con paso 1 Hacer
		Escribir "Introduzca el siguiente número:";
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
	
	Escribir "El número más cercano a ", n1, " es ", min, ", con una distancia de ", dmin, ".";
	
	
FinAlgoritmo
