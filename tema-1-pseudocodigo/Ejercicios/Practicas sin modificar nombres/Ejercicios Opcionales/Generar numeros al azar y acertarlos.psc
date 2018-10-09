// Generar dos números al azar entre el 0 y 9, Hacer que el usuario introduzca dos números
// en caso de acertar se mostrara el siguiente grafismo por cada acierto:
//***********
//** BRAVO **
//***********

subproceso felicitar()
	Escribir "***********";
	Escribir "** BRAVO **";
	Escribir "***********";
Finsubproceso


Algoritmo AcertarNumerosAzar
	
	definir a1, a2, n1, n2 Como Entero;
	
	a1 <- azar(10);
	Escribir a1;
	repetir
	a2 <- azar(10);
	Escribir a2;
	hasta que a1<>a2;
	
	Escribir "Introduce 2 números del 0 al 9, a ver si acierta: "
	leer n1, n2;
	si n1 = n2 Entonces
		Repetir
			Escribir "Los valores no pueden ser iguales, vuelva a introducir el segundo valor: "
			Leer n2;
		Hasta Que n1 <> n2; 
	FinSi
	
	si a1 = n1 o a2 = n1 Entonces
		felicitar();
	FinSi
	
	
	si a1 = n2 o a2 = n2 Entonces
		felicitar();
	FinSi
	
FinAlgoritmo
