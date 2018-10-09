// 16. Haz un algoritmo que vaya leyendo números y mostrándolos por pantalla hasta que el usuario introduzca un número negativo. 
// En ese momento, el algoritmo mostrará un mensaje de despedida y finalizará su ejecución.

Algoritmo a16
	Definir num Como Entero;
	Escribir "Introduce números enteros: (Para salir introduce un número negativo)"
	mientras num >= 0 Hacer
		Leer num;
		si num >= 0 Entonces
			Escribir num;
		FinSi
	FinMientras
FinAlgoritmo
