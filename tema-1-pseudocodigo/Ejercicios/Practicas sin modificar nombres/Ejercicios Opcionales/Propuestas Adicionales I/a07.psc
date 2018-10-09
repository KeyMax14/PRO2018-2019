//Práctica 07: Diseña un algoritmo que, dado un número entero, determine si éste es el doble
//		de un número impar. (Ejemplo: 14 es el doble de 7, que es impar.)

Algoritmo p07
	Definir num Como Entero;
	Escribir "Introduzca un número entero para saber si es el doble de un número impar:"
	Leer num;
	
	si num%2 = 0 entonces
		mitad <- num/2;
		Si mitad%2 != 0 Entonces
			Escribir "El número ", num, " es el doble de un numero impar (", mitad, ")." ;
		SiNo
			Escribir "El número ", num, " NO es el doble de un numero impar (", mitad, ")." ;
		Fin Si
	sino
		Escribir "El número resultante es un número decimal, no tiene paridad."
	FinSi

FinAlgoritmo
