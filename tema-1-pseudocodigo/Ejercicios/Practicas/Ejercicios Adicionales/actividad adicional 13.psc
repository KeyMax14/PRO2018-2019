//Decir si un numero es par "sin usar el modulo" y ese numero esta entre el 0 y el 10.

Algoritmo Decirsiespar
	
	Definir num como entero;
	
	repetir
		Escribir "Introduzca un número entero entre 0 y 10: "
		Leer num;
	Hasta Que num>=0 y num <=10;
	
	si num = 0 o num = 2 o num = 4 o num = 6 o num = 8 o num = 10 Entonces
		Escribir num, " es PAR.";
	FinSi
FinAlgoritmo
