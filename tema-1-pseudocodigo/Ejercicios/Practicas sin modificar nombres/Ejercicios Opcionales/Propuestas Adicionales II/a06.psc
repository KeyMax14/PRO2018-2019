
// Dise�a un algoritmo que solicite la lectura de un n�mero entre 0 y 10 (ambos inclusive).
// Si el usuario teclea un n�mero fuera del rango v�lido, el programa solicitar� nuevamente la introducci�n del valor cuantas veces sea necesario.

Algoritmo a06
	
	definir num Como Entero;
	
	repetir
		Escribir "Introduce un numero del 0 al 10: "
		Leer num;
	Hasta Que num >= 0 y num <= 10;
FinAlgoritmo
