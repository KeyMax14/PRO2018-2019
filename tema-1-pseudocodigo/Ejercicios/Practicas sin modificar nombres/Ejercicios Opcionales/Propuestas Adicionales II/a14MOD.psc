// 14. Haz un algoritmo que calcule el máximo común divisor (mcd) de dos enteros positivos. 
// El mcd es el número más grande que divide exactamente a ambos números.

// Este es el método usado en clase.


Algoritmo a14MOD
	
	definir dividendo, divisor, cociente, resto como entero;
	
	Escribir "Introduce 2 números enteros positivos: "
	leer dividendo, divisor;
	
	
	Repetir
	
		cociente <- trunc(dividendo/divisor);
		Escribir "El cociente es: ", cociente;
		
		resto <- dividendo MOD divisor;
		
		dividendo <- divisor;
		divisor <- resto;
	
	Hasta Que resto = 0;

	Escribir "El MCD es: ", dividendo;
	
	
FinAlgoritmo
