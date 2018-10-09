//Practica 10 no dosier

//Diseña un algoritmo que lea un carácter cualquiera desde el teclado, 
//	y muestre el mensaje "Es una MAYUSCULA" cuando el carácter sea una letra mayúscula y el mensaje 
//	"Es una MINUSCULA" cuando sea una minúscula. En cualquier otro caso, no mostrará mensaje alguno. 
//	(Considera únicamente letras del alfabeto inglés.) 

//Pista: aunque parezca una obviedad, recuerda que una letra es minúscula si está entre la \u2019a\u2019 y la \u2019z\u2019, y mayúscula si está entre la \u2019A\u2019 y la \u2019Z\u2019.


Algoritmo a1_10
	// Para hacer este ejercicio tenemos que transformar la letra al codigo asci
	
	definir letra Como Caracter;
	
	Escribir "Introducir una letra para saber si es mayuscula o minuscula";
	leer letra;
	
	si letra >= 'A' y letra <= 'Z' Entonces
		Escribir "La letra es mayúscula.";
	sino
		si letra >= 'a' y letra <= 'z' Entonces
			Escribir "La letra es minúscula.";
		FinSi
	FinSi
	
	// Usando funciones mayusculas y minusculas
	
	si Mayusculas(text) != Minusculas(text) Entonces // Esto es para que si introduces un número en forma de string, será igual en mayus que en minus.
		si mayusculas(letra) = letra Entonces
			Escribir "La letra es mayúscula.";
		sino
			Escribir "La letra es minúscula";
		FinSi
	sino 
		Escribir "El cáracter introducido no es válido";
	FinSi
	
	
FinAlgoritmo
