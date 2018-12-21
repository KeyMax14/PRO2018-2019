/*
    Correcion del ejercicio hecho en clase el dia 20/12/2018
 */
package tareadeclaseencasa20181220kevinhernandezgarcia;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class CambioBase {

    private int acumulado;
    private int baseEntrada;
    private int baseSalida;

    public CambioBase() {
        this(10, 10);
    }

    public CambioBase(int baseEntrada) {
        this(baseEntrada, 10);
    }

    public CambioBase(int baseEntrada, int baseSalida) {
        this.baseEntrada = baseEntrada;
        this.baseSalida = baseSalida;
        this.acumulado = 0;
    }

    public String getAcumulado() {
        return getAcumulado(baseSalida);
    }

    public String getAcumulado(int num) {
        String resultado = "";
        if (num==10) {
            resultado = "" + acumulado;
        }else{
            int resto = acumulado;
            while(resto>0) {
                resultado = resto%num + resultado;
                resto/=num;
            }
        }
        return resultado;
    }

    public void agregarCantidad(int num) throws Exception {
        if (num < 0) {
            throw new Exception("no se admiten números negativos");
        } else {
            acumulado += num;
        }
    }

    public void agregarCantidad(String numString) throws Exception {
        agregarCantidad(numString, baseEntrada);
    }

    public void agregarCantidad(String numString, int base) throws Exception {
        if (Integer.parseInt(numString) < 0) {
            throw new Exception("no se admiten números negativos.");
        } else {
            int suma = 0, j=0;
            for (int i = numString.length()-1; i >= 0; i--) {
                int num = Integer.parseInt("" + numString.charAt(j));
                suma += (num * (int) Math.pow(base, i));
                j++;
            }
            acumulado += suma;
        }
    }

    public void quitarCantidad(int num) throws Exception {
        if (num < 0) {
            throw new Exception("no se admiten números negativos");
        } else {
            acumulado -= num;
        }
    }

    public void quitarCantidad(String numString) throws Exception {
        agregarCantidad(numString, baseEntrada);
    }

    public void quitarCantidad(String numString, int base) throws Exception {
        if (Integer.parseInt(numString) < 0) {
            throw new Exception("no se admiten números negativos.");
        } else {
            int suma = 0, j=0;
            for (int i = numString.length()-1; i >= 0; i--) {
                int num = Integer.parseInt("" + numString.charAt(j));
                suma += (num * (int) Math.pow(base, i));
                j++;
            }
            acumulado -= suma;
        }
    }

    public void limpiar() {
        acumulado = 0;
    }

}
