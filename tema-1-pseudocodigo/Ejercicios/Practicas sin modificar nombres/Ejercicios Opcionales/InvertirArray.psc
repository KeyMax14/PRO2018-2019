// Crer un algoritmo que nos pida 5 numeros y los guarde en un array
// posteriormente, deberan mostrar el contenido del array
// finalmente cambiaran las posiciones y quedaran al reves
//Ejemplo Si un usuario introduce [3,7,2,9,1]
// Quedara [1,9,2,7,3]
// Despues se mostrara el array.

SubProceso MostrarArray(array)
	Escribir Sin Saltar "["
	para i <- 0 hasta 3 con paso 1 Hacer
		Escribir Sin Saltar array[i], ", ";
	FinPara
	Escribir array[4], "]";
FinSubProceso

Algoritmo InvertirArray
	Definir array, arrayInv Como Entero;
	n <- 5;
	Dimension array[n], arrayInv[n];
	
	Escribir "Introduce 5 números enteros: ";
	para i <- 0 hasta 4 con paso 1 Hacer
		Leer array[i];
	FinPara
	
	MostrarArray(array);
	
	
	//Cambiar sin Array
	// De esta manera no funciona, porque pasado la mitad de los valores vuelve a la posicion original
	
//	Para i <- 0 hasta n-1 con paso 1 Hacer
//		temporal <- array[i];
//		temporal1 <- array[n-1-i]
//		
//		array[i] <- temporal1;
//		array[n-1-i] <- temporal;
//		
//	FinPara
	
	
	
	para i <- n-1 hasta 0 con paso -1 Hacer
		arrayInv[n-1-i] <- array[i];
	FinPara
	
	Para i <- 0 hasta n-1 con paso 1 Hacer
		array[i] <- arrayInv[i]
	FinPara
	
	MostrarArray(array);
	
FinAlgoritmo
