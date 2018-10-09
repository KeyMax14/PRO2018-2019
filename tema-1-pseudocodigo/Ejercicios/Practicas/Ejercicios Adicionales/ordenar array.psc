SubAlgoritmo MostrarArray(array, size)
	Escribir Sin Saltar "[";
		para i<-0 hasta size - 2 con paso 1 Hacer
			escribir Sin Saltar array[i], ", ";
		FinPara
	escribir array[9], "]";
FinSubAlgoritmo

Algoritmo Ordenar
	definir array, posMax, max como entero;
	size <- 10;
	dimension array[size];
	
	array[0]<-1;
	array[1]<-3;
	array[2]<-27;
	array[3]<-15;
	array[4]<-4;
	array[5]<-85;
	array[6]<-0;
	array[7]<-9;
	array[8]<-50;
	array[9]<-49;
	
	para i<-0 hasta size - 2 con paso 1 Hacer
		posMax = i;
		max <- array[i];
		para j<-i hasta size - 1 con paso 1 Hacer
			si max < array[j] Entonces
				max <- array[j];
				posMax <- j;
			FinSi
		FinPara
		temp <- array[i];
		array[i] <- max;
		array[posMax] <- temp;
		MostrarArray(array, size);
	FinPara
	
	MostrarArray(array, size);
FinAlgoritmo
