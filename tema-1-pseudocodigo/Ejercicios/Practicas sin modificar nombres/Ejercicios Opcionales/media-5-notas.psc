// Calcular nota media de 5 notas

Algoritmo CalcularNotaMedia
	
	definir i como entero;
	definir nota, valores como real;
	
	nota <- 0;
	para i<- 1 hasta 5 con paso 1 entonces
		Escribir "Introduce la ", i, "º nota: ";
		leer valores;
		nota <- nota + valores;
	FinPara
	
	nota <- nota / 5;
	
	Escribir "La media es ", nota, ".";
	
FinAlgoritmo
