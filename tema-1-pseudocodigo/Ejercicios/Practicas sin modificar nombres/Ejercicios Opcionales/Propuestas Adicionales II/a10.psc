// Escribe un programa que muestre los números pares que hay entre dos números que introduzca el usuario por teclado.

Algoritmo a10
	
	definir n, m, temp como entero;
	
	Escribir "Introduce dos números enteros: "
	leer n, m;
	
	si n > m entonces
		temp <- n;
		n <- m;
		m <- temp;
	FinSi
	
	para i <- n hasta m con paso 1 hacer
		si i%2 = 0 entonces
			mostrar i;
		FinSi
	FinPara
	
FinAlgoritmo
