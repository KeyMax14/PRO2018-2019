//Pr�ctica 14: Usando el c�digo anterior como una funci�n desarrollar el siguiente programa:
//			El n�mero de combinaciones que podemos formar tomando m elementos de un conjunto
//		con n elementos es: C(m,n) = n! / (n - m)!m! . Dise�a un algoritmo que pida el valor de n y
//				m y calcule Cm n . (Ten en cuenta que n ha de ser mayor o igual que m.) (Puedes
//			comprobar la validez de tu programa introduciendo los valores n = 15 y m = 10: el
//				resultado es 3003.)


Funcion resultado <- factorial( n )
	
	definir resultado como real; // Por alguna raz�n, no considera enteros a valores muy grandes (Doble Word?), limite 12!.
	si n = 0 entonces
		resultado <- 1;
	SiNo
		resultado <- 1;
		para i<-1 hasta n Con Paso 1 Hacer
			resultado <- resultado*i;
		FinPara
	FinSi
	
Fin Funcion



Algoritmo p15
	
	Definir n, m Como Entero; // Resultado da error para valores muy grandes.
	Definir resultado como real;
	
	Escribir "Escribe dos n�meros enteros, el primero debe ser mayor o igual al segundo: (Separados por Enter.)";
	Leer n, m;
	
	si n >= m entonces
		resultado <- factorial(n)/(factorial(n-m)*factorial(m));
		Escribir "El resultado de C(", n, ",", m, ") es ", resultado, ".";
	sino
		Escribir "El primer valor es menor que el segundo, no se puede realizar la operaci�n.";
	FinSi
	
FinAlgoritmo
