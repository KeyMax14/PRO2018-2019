// 16. Haz un algoritmo que vaya leyendo n�meros y mostr�ndolos por pantalla hasta que el usuario introduzca un n�mero negativo. 
// En ese momento, el algoritmo mostrar� un mensaje de despedida y finalizar� su ejecuci�n.

Algoritmo a16
	Definir num Como Entero;
	Escribir "Introduce n�meros enteros: (Para salir introduce un n�mero negativo)"
	mientras num >= 0 Hacer
		Leer num;
		si num >= 0 Entonces
			Escribir num;
		FinSi
	FinMientras
FinAlgoritmo
