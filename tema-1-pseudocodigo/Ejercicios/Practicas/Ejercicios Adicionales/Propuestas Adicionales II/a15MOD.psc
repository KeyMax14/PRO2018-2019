// 15. Haz un algoritmo que calcule el m�ximo com�n divisor (mcd) de tres enteros positivos. 
//     El mcd de tres n�meros es el n�mero m�s grande que divide exactamente a los tres.

// Mejorado a Maximo com�n divisor de los numeros que desee el usuario;

// Este es el m�todo empleado en clase.

Funcion dividendo <- MCD(dividendo, divisor)
	Repetir
		cociente <- trunc(dividendo/divisor);
		resto <- dividendo MOD divisor;
		
		dividendo <- divisor;
		divisor <- resto;
		
	Hasta Que resto = 0;
FinFuncion

Algoritmo McdVarios
	
	definir mcdfinal, array como entero;
	
	Escribir "De cuantos n�meros es el MCD?";
	leer cantidadnumeros;
	
	si cantidadnumeros > 0 Entonces
		
		dimension array(cantidadnumeros);
		
		Escribir "Introduce ", cantidadnumeros, " n�mero/s entero/s: "
		
		para i<- 0 hasta cantidadnumeros - 1 con paso 1 Hacer
			leer array[i];
		FinPara
		
		si cantidadnumeros = 1 Entonces
			Escribir "El mcd es ", array[0], ".";
		SiNo
			si cantidadnumeros = 2 Entonces
				mcdfinal <- MCD(array[0], array[1]);
				Escribir "El mcd es ", mcdfinal, ".";
			sino 
				si cantidadnumeros >= 3 Entonces
					mcdfinal <- MCD(array[0], array[1]);
					para i <- 2 hasta cantidadnumeros - 1 con paso 1 Hacer
						mcdfinal <- MCD(mcdfinal, array[i]);
					FinPara
					Escribir "El mcd es ", mcdfinal, ".";
				FinSi
			FinSi
		FinSi
	SiNo
		Escribir "No se puede hacer el mcd de ", cantidadnumeros, " n�meros.";
	FinSi
FinAlgoritmo
