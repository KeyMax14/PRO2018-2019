//Práctica 08: Diseña un algoritmo que, dados dos números enteros, muestre por pantalla uno
//	de estos mensajes: "El segundo es el cuadrado exacto del primero.", "El segundo es menor
//		que el cuadrado del primero." o "El segundo es mayor que el cuadrado del primero.",
//		dependiendo de la verificación de la condición correspondiente al significado de cada
//		mensaje.


Algoritmo p08
	Definir num1, num2 como enteros;
	Escribir "Introduzca dos números enteros: (Separados por Enter.)"
	Leer num1, num2;
	Si num2 = num1^2 Entonces
		Escribir "El segundo es el cuadrado exacto del primero.";
	SiNo
		Si num2 < num1^2 Entonces
			Escribir "El segundo es menor que el cuadrado del primero."
		SiNo
			Escribir "El segundo es mayor que el cuadrado del primero.";
		Fin Si
	Fin Si
FinAlgoritmo
