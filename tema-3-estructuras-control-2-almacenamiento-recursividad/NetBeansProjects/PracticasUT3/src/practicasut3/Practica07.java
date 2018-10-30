/*
    Práctica 7: Crear un programa con un tipo enumerado para las estaciones y mostrar en
        pantalla el dato enumerado correspondiente a la actual estación.
 */
package practicasut3;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Practica07 {
    public enum Estaciones{
        PRIMAVERA, VERANO, OTOÑO, INVIERNO
    }
    
    public static void main(String[] args) {
        System.out.println("Estamos en: "+Estaciones.OTOÑO);
    }
}
