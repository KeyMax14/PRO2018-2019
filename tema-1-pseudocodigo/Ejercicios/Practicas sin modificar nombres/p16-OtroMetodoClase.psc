//Práctica 16: Mostrar usando un array los dos números mayores de 10 números
//	introducidos por teclado

Algoritmo p16MOD
	definir array, n, contador, NumMayor, NumMayor Como Entero;
	
	n <- 10;
	
	Dimension array(n);
	numMayor <- 0;
	segundomayor <- 0;
	
	para i<-0 hasta n-1 con paso 1 Hacer
		Escribir "Introducir nº ", i+1;
		leer array[i];
	FinPara
	
	para i<-0 hasta n-1 con paso 1 Hacer
		si i = 0 Entonces
			NumMayor = array[i]
		SiNo
			si array[i] > NumMayor Entonces
				segundomayor <- numMayor;
				numMayor <- array[i];
			SiNo
				si array[i] > segundomayor Entonces
					segundomayor <- array[i]
				FinSi
			FinSi
		FinSi
	FinPara
	
	Escribir "El número mayor es: ", numMayor;
	Escribir "El segundo mayor es: ", segundomayor;
FinAlgoritmo
