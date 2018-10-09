// Haz un algoritmo que pida el valor de dos enteros n y m y calcule el sumatorio de todos los números pares comprendidos entre ellos 
//	(incluyéndolos en el caso de que sean pares).

Algoritmo a13
	
	definir n, m, temp, acumulador como entero;
	
	Escribir "Introduce dos números enteros: "
	leer n, m;
	
	si n > m entonces
		temp <- n;
		n <- m;
		m <- temp;
	FinSi
	
	para i <- n hasta m con paso 1 hacer
		si i%2 = 0 entonces
			acumulador <- acumulador + i;
		FinSi
	FinPara
	
FinAlgoritmo
