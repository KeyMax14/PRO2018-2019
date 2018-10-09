// Práctica 06: Diseña un algoritmo que, dado un número entero, muestre por pantalla el
//		mensaje "El número es par." cuando el número sea par y el mensaje "El número es impar."
//	cuando sea impar. (Una pista: un número es par si el resto de dividirlo por 2 es 0, e impar en
//			caso contrario.)

Algoritmo p06
	
	definir num como entero;
	Escribir "Introduce el número del que deseas saber la paridad:"
	Leer num;
	Si num%2 = 0 Entonces
		Escribir "El número ", num, " es par.";
	SiNo
		Escribir "El número ", num, " es impar.";
	Fin Si
	
FinAlgoritmo
