// 17. Haz un algoritmo que vaya leyendo n�meros hasta que el usuario introduzca un n�mero negativo. 
//   	En ese momento, el algoritmo mostrar� por pantalla el n�mero mayor de cuantos ha visto.
 
Algoritmo a17
	Definir num Como Entero;
	Escribir "Introduce n�meros enteros: (Para salir introduce un n�mero negativo)"
	leer num;
	max <- num; 
	
	mientras num >= 0 Hacer
		leer num;
		si num > max Entonces
			max <- num;
		FinSi
	FinMientras
	
	Escribir "El mayor n�mero introducido es ", max, ".";

FinAlgoritmo
