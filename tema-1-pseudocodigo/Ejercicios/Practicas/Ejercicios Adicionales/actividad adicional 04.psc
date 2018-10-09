// Primer ejemplo de if anidado realizado en clase

Algoritmo EjemploIF
	
	// Mostrar un mensaje que diga "El numero es menor que 0",  "El numero esta entre 0 y 10", "El numero esta entre 10 y 100"
	// "El número es mayor que 100"
	
	definir num Como Entero;
	Escribir "Introduzca un número entero";
	leer num;
	
	Si num < 0 Entonces
		Escribir "El número es menor que 0.";
	SiNo
		Si num < 10 Entonces
			Escribir "El número esta entre 0 y 10.";
		SiNo
			Si num < 100 Entonces
				Escribir "El número esta entre 10 y 100."
			SiNo
				Escribir "El número es mayor o igual que 100."
			Fin Si
		Fin Si
	Fin Si
	
	
FinAlgoritmo
