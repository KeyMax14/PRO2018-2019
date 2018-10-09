// 15. Haz un algoritmo que calcule el máximo común divisor (mcd) de tres enteros positivos. 
//     El mcd de tres números es el número más grande que divide exactamente a los tres.


// Método usado antes de saber la formula del mcd explicada en clase, menos eficiente.

Algoritmo a15
	
	definir n1, n2, n3, mcd como entero;
	
	Escribir "Introduce 3 números enteros positivos: "
	leer n1, n2, n3;
	
	si n1 <= n2 y n1 <= n3 Entonces
		mcd <- n1;
	Sino
		si n2 <= n1 y n2 <= n3
			mcd <- n2;
		sino 
			mcd <- n3;
		FinSi
	FinSi
	
	Mientras ((n1 MOD mcd) <> 0) o ((n2 MOD mcd) <> 0) o ((n3 MOD mcd) <> 0)  Hacer 
		mcd <- mcd - 1;
	finMientras
	
	Escribir "El mcd es ", mcd, ".";
FinAlgoritmo