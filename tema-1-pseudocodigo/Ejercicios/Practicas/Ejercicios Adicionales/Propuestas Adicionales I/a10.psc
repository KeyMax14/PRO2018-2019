//Practica 10 no dosier

//Dise�a un algoritmo que lea un car�cter cualquiera desde el teclado, 
//	y muestre el mensaje "Es una MAYUSCULA" cuando el car�cter sea una letra may�scula y el mensaje 
//	"Es una MINUSCULA" cuando sea una min�scula. En cualquier otro caso, no mostrar� mensaje alguno. 
//	(Considera �nicamente letras del alfabeto ingl�s.) 

//Pista: aunque parezca una obviedad, recuerda que una letra es min�scula si est� entre la \u2019a\u2019 y la \u2019z\u2019, y may�scula si est� entre la \u2019A\u2019 y la \u2019Z\u2019.


Algoritmo a1_10
	// Para hacer este ejercicio tenemos que transformar la letra al codigo asci
	
	definir letra Como Caracter;
	
	Escribir "Introducir una letra para saber si es mayuscula o minuscula";
	leer letra;
	
	si letra >= 'A' y letra <= 'Z' Entonces
		Escribir "La letra es may�scula.";
	sino
		si letra >= 'a' y letra <= 'z' Entonces
			Escribir "La letra es min�scula.";
		FinSi
	FinSi
	
	// Usando funciones mayusculas y minusculas
	
	si Mayusculas(text) != Minusculas(text) Entonces // Esto es para que si introduces un n�mero en forma de string, ser� igual en mayus que en minus.
		si mayusculas(letra) = letra Entonces
			Escribir "La letra es may�scula.";
		sino
			Escribir "La letra es min�scula";
		FinSi
	sino 
		Escribir "El c�racter introducido no es v�lido";
	FinSi
	
	
FinAlgoritmo
