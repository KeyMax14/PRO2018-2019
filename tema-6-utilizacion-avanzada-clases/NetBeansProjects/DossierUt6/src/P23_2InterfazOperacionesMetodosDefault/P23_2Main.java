/*
    Práctica 23_2: Copiar y ejecutar el Ejemplo Operaciones. Ya que las interfaces funcionales
        aceptan métodos con código ( métodos default) agregar a la interfaz un método llamado:
        default public void miNombre() que muestre tu nombre. En el main escribir la sentencia:
        suma.miNombre(); y ejecutar el código ¿funciona?
        Crear otro método default llamado: misApellidos() que en este caso mostrarían tus
        apellidos ¿puedes ejecutarlo? Entonces ¿ se puede tener más de un método default?
 */
package P23_2InterfazOperacionesMetodosDefault;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P23_2Main {

    @FunctionalInterface
    interface Operaciones<T> {
        String operacion(T a, T b);
        default public void miNombre(){
            System.out.println("Kevin");
        }
        default public void misApellidos(){
            System.out.println("Hernández García");
        }
        
    }

    public static void mostrarResultado(int x, int y, Operaciones op) {
        System.out.println(op.operacion(x, y));
    }

    public static void main(String[] args) {
        Operaciones<Integer> suma = (a, b) -> "x + y=" + (a + b);
        Operaciones<Integer> resta = (a, b) -> "x - y=" + (a - b);
        Operaciones<Integer> multiplica = (a, b) -> "x * y=" + (a * b);
        mostrarResultado(2, 3, suma);
        mostrarResultado(5, 1, resta);
        mostrarResultado(4, 7, multiplica);
        suma.miNombre();
        suma.misApellidos();
    }
}
