// 14. Haz un algoritmo que calcule el m�ximo com�n divisor (mcd) de dos enteros positivos. 
// El mcd es el n�mero m�s grande que divide exactamente a ambos n�meros.

// Este es el m�todo usado en clase.


Algoritmo a14MOD
	
	definir dividendo, divisor, cociente, resto como entero;
	
	Escribir "Introduce 2 n�meros enteros positivos: "
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
