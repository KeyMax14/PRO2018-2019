// Pr�ctica 06: Dise�a un algoritmo que, dado un n�mero entero, muestre por pantalla el
//		mensaje "El n�mero es par." cuando el n�mero sea par y el mensaje "El n�mero es impar."
//	cuando sea impar. (Una pista: un n�mero es par si el resto de dividirlo por 2 es 0, e impar en
//			caso contrario.)

Algoritmo p06
	
	definir num como entero;
	Escribir "Introduce el n�mero del que deseas saber la paridad:"
	Leer num;
	Si num%2 = 0 Entonces
		Escribir "El n�mero ", num, " es par.";
	SiNo
		Escribir "El n�mero ", num, " es impar.";
	Fin Si
	
FinAlgoritmo
