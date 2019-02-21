/*
    Práctica 24: agrega el método: public abstract String toString(); ¿ lo acepta ? ¿cómo es
        que lo acepta si únicamente se podía un único método abstracto?
        Ahora añade el método: public abstract int otroAbstracto(); ¿lo acepta? (toma captura de
        pantalla) ¿qué error muestra? Comenta la línea con: @FunctionalInterface ¿sigue
        quejándose? ¿por qué lo acepta ahora?
 */
package P24InterfazOperacionesMasAbstractos;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P24Main {

    @FunctionalInterface
    interface Operaciones<T> {

        String operacion(T a, T b);
        
        public abstract String toString();
        
//        public abstract int otroAbstracto();
        

        default public void miNombre() {
            System.out.println("Kevin");
        }

        default public void misApellidos() {
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
