//Pr�ctica 07: Dise�a un algoritmo que, dado un n�mero entero, determine si �ste es el doble
//		de un n�mero impar. (Ejemplo: 14 es el doble de 7, que es impar.)

Algoritmo p07
	Definir num Como Entero;
	Escribir "Introduzca un n�mero entero para saber si es el doble de un n�mero impar:"
	Leer num;
	
	si num%2 = 0 entonces
		mitad <- num/2;
		Si mitad%2 != 0 Entonces
			Escribir "El n�mero ", num, " es el doble de un numero impar (", mitad, ")." ;
		SiNo
			Escribir "El n�mero ", num, " NO es el doble de un numero impar (", mitad, ")." ;
		Fin Si
	sino
		Escribir "El n�mero resultante es un n�mero decimal, no tiene paridad."
	FinSi

FinAlgoritmo
