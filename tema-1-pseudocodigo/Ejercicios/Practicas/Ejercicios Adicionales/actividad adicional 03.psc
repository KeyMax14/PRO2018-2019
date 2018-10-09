// Primer ejemplo de array realizado en clase

Algoritmo EjemploArray
	
//	Escribir "Introduce 5 numeros";
//	leer num1, num2, num3, num4, num5;
//	
//	acumulador <- num1 + num2 + num3 + num4 + num5;
//	media <- acumulador / 5;
	
	// Pasemos esto a array
	
	Definir almacen Como Entero;
	Dimension almacen[5];
	
	acumulador <- 0;
	
	para i <- 0 hasta 4 con paso 1 Hacer
		Escribir "Dame la variable ", i+1;
		leer almacen[i];
	FinPara
	
//	Escribir "la var1 es ", almacen[0];
//	Escribir "la var2 es ", almacen[1];
//	Escribir "la var3 es ", almacen[2];
//	Escribir "la var4 es ", almacen[3];
	//	Escribir "la var5 es ", almacen[4];
	
	// Hacer esto con un bucle
	
	
	para i <- 0 hasta 4 con paso 1 Hacer
		Escribir "la var", i+1, " es ", almacen[i];
	FinPara
	
	// Si dejas almacen vacio, depende del los lenguajes, pero PSeInt te devuelve el primero
	
	Escribir almacen[];
	
	
FinAlgoritmo
