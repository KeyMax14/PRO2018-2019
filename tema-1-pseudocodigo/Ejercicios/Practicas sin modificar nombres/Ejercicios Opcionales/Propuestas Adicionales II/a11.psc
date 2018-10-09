// Haz un algoritmo que pida el valor de dos enteros n y m y que muestre por pantalla el valor del sumatorio desde i=n hasta m de i.

Algoritmo a12
	Escribir "Dame los dos números;";
	leer n, m;
	
	si n > m Entonces
		temp <- n;
		n <- m;
		m <- temp;
	FinSi
	
	acumulador <- 0;
	para i<- n hasta m con paso 1 Hacer
		acumulador <- i +  acumulador;
	FinPara
	
	Escribir acumulador;
	
FinAlgoritmo
