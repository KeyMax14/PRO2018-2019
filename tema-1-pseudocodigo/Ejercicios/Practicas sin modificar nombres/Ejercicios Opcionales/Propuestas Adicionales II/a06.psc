
// Diseña un algoritmo que solicite la lectura de un número entre 0 y 10 (ambos inclusive).
// Si el usuario teclea un número fuera del rango válido, el programa solicitará nuevamente la introducción del valor cuantas veces sea necesario.

Algoritmo a06
	
	definir num Como Entero;
	
	repetir
		Escribir "Introduce un numero del 0 al 10: "
		Leer num;
	Hasta Que num >= 0 y num <= 10;
FinAlgoritmo
