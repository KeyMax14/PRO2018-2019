/*
    Práctica 21: Crear la interfaz ImprimirEnMayuscula<T> que incluya el método:
        void imprimirMayuscula(T objeto) y probarlo con el código anterior. Tomar captura de
        pantalla de ese trozo de código y la ejecución
 */
package P21InterfazImprimirEnMayuscula;

import java.util.ArrayList;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P21Main {

    public static void main(String[] args) {
        Mujer nuevaMujer = new Mujer("Isabel", "Dorta", "Jiménez", 45, 165, 60);
        ImprimirEnMayuscula<Mujer> iem = new ImprimirEnMayuscula<Mujer>() {
            @Override
            public void imprimirMayuscula(Mujer mujer) {
                String val = mujer.toString();
                System.out.println(val.toUpperCase());
            }
        };
        iem.imprimirMayuscula(nuevaMujer);
        ArrayList<ImprimirEnMayuscula> imprimibles = new ArrayList<>();
        imprimibles.add(iem);
    }
}
