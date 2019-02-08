/*
    Práctica 17: Crear la interfaz: Ordenable
        e incluir como métodos: boolean
        esMayorQue() , esMenorQue(), esIgualQue() Implementar el interfaz en la clase Persona
        (tomaremos la clase abstracta que ya hemos usado en esta unidad ) ¿ qué ocurre en el IDE
        cuándo escribimos: Persona implements Ordenable ? ( tomar captura de pantalla )
        mediante alt+enter hacer el override
 */
package P20ArrayOrdenablePersonasFracciones;



/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public interface Ordenable<T> {
    boolean esMayorQue(T elemento);
    boolean esMenorQue(T elemento);
    boolean esIgualQue(T elemento);
}
