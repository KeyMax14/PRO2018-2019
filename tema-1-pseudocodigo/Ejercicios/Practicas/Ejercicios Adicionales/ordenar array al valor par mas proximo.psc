// Convertimos los valores de una array al valor par más proximo.(igual o superior)

SubAlgoritmo MostrarArray(array, size)
	Escribir Sin Saltar "[";
	para i<-0 hasta size - 2 con paso 1 Hacer
		escribir Sin Saltar array[i], ", ";
	FinPara
	escribir array[size-1], "]";
FinSubAlgoritmo

Algoritmo ConvertirArray
	Definir array, size Como Entero;
	Escribir "Introduce el número de elementos del array: "
	leer size;
	Dimension array[size];
	
	para i<-0 hasta size - 1 con paso 1 Hacer
		si array[i]%2 = 1 Entonces
			array[i] <- array[i] + 1;
		FinSi
		
		// Esto puede ser
		//escribir trunc((array[i]+1)/2)*2;
	FinPara
	
	MostrarArray[array, size];
	
FinAlgoritmo
