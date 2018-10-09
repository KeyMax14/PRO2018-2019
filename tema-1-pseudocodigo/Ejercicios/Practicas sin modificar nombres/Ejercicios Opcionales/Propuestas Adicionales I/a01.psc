//Práctica 02: Realizar un un algoritmo que calcule el IVA (16%) de un producto dado su
//		precio de venta sin IVA.

Algoritmo p02
	Definir precio, iva Como Real;
	Escribir "Introduce el precio del producto sin IVA:";
	Leer precio;
	iva <- precio * 0.16;
	Escribir "El IVA del producto equivale a ", iva, ".";
FinAlgoritmo
