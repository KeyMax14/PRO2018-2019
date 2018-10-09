// como realizar minimo comun multiplo de dos valores

// MCM(a, b)= a * b / MCD(a, b)

Funcion dividendo <- MCD(dividendo, divisor)
	Repetir
		cociente <- trunc(dividendo/divisor);
		resto <- dividendo MOD divisor;
		
		dividendo <- divisor;
		divisor <- resto;
		
	Hasta Que resto = 0;
FinFuncion

Algoritmo MinimimoComunMultiplo
	
	definir a, b, mcm Como Entero;
	
	Escribir "Introduce dos números enteros: ";
	leer a, b; 
	
	mcm <- a * b / MCD(a, b);
	
	Escribir "El mcm de los dos números es ", mcm, ".";
	
FinAlgoritmo
