//Pr�ctica 13: Queremos hacer un algoritmo que calcule el factorial de un n�mero entero
//		positivo. El factorial de n se denota con n!, pero no existe ning�n operador que permita
//		efectuar este c�lculo directamente. Sabiendo que n! = 1 � 2 � 3 � . . . � (n - 1) � n y que 0! = 1,
//		haz un algoritmo que pida el valor de n y muestre por pantalla el resultado de calcular n!.

Funcion resultado <- factorial( n )
	
	//definir resultado como entero; // Por alguna raz�n, no considera enteros a n�meros muy grandes (Doble Word?), limite 12!.
	si n = 0 entonces
		resultado <- 1;
	SiNo
		resultado <- 1;
		para i<-1 hasta n Con Paso 1 Hacer
			resultado <- resultado*i;
		FinPara
	FinSi
	
Fin Funcion


Algoritmo p14
	Definir x Como Entero;
	Escribir "Introduzca un n�mero entero positivo para calcular su factorial:";
	Leer x;
	escribir "El resultado es ", factorial(x), ".";
FinAlgoritmo
