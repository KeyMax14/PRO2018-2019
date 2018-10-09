// 17. Haz un algoritmo que vaya leyendo números hasta que el usuario introduzca un número negativo. 
//   	En ese momento, el algoritmo mostrará por pantalla el número mayor de cuantos ha visto.
 
Algoritmo a17
	Definir num Como Entero;
	Escribir "Introduce números enteros: (Para salir introduce un número negativo)"
	leer num;
	max <- num; 
	
	mientras num >= 0 Hacer
		leer num;
		si num > max Entonces
			max <- num;
		FinSi
	FinMientras
	
	Escribir "El mayor número introducido es ", max, ".";

FinAlgoritmo
