/*
    Práctica 23: Probar en el IDE las siguientes comparaciones. Obtener una salida en pantalla
        del valor booleano correspondiente y explicar por qué motivo la comparación nos sale true
        o false:
        new String("test").equals("test")
        new String("test") == "test"
        new String("test") == new String("test")
        "test" == "test"
 */
package p23;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class p23 {
    public static void main(String[] args) {
        System.out.println(new String("test").equals("test"));
        System.out.println(new String("test") == "test");
        System.out.println(new String("test") == new String("test"));
        System.out.println("test" == "test");
    }
}
