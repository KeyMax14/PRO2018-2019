//Dise�a un algoritmo que solicite la lectura, letra a letra, de un texto que no contenga letras may�sculas. 
//	Si el usuario teclea una letra may�scula, el algoritmo solicitar� nuevamente la introducci�n del texto cuantas veces sea preciso.


Algoritmo a07
	
	definir text como texto;
	Escribir "Escribe letras en minusculas letra por letra: (Sal Pulsando f)"
	
	mientras text <> "f" Hacer
		leer text;
		Mientras text >= "A" y text <= "Z" Hacer
			Escribir "Introduce un caracter v�lido: (No Mayus)";
			leer text;
		FinMientras
	FinMientras
	
FinAlgoritmo
