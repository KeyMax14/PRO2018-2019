// 14. Haz un algoritmo que calcule el m�ximo com�n divisor (mcd) de dos enteros positivos. 
// El mcd es el n�mero m�s grande que divide exactamente a ambos n�meros.

// M�todo usado antes de saber la formula del mcd explicada en clase, menos eficiente.

Algoritmo a14
	
	definir n1, n2, mcd como entero;
	
	Escribir "Introduce 2 n�meros enteros positivos: "
	leer n1, n2;
	
	si n1 <= n2 Entonces
		mcd <- n1;
	SiNo
		mcd <- n2;
	FinSi
	
	Mientras (n1%mcd) <> 0 o (n2%mcd) <> 0 Hacer
		mcd <- mcd - 1;
	finMientras 
	
	Escribir "El mcd es ", mcd, ".";
FinAlgoritmo
