/*
    Práctica 7: Tomando la clase Cuenta que definimos en la UT sobre clases y objetos:
        atributos: String numero, String titular, double saldo, ingresar(), retirar() Crear una clase
        hija llamada CuentaBCTT que refleja las cuentas del banco BCTT Este banco por cada
        ingreso retiene en comisión 0.50€ y por cada retirada de efectivo un 0.02% del dinero
        retirado. Hacer uso de la palabra reservada super
 */
package P07CuentaHijaCuentaBBTC;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class CuentaBCTT extends Cuenta{

    public CuentaBCTT() {
    }

    public CuentaBCTT(String titular) {
        super(titular);
    }

    public CuentaBCTT(String numero, String titular) {
        super(numero, titular);
    }

    
    
    @Override
    public void retirar(double retirada) throws Exception {
        super.retirar(retirada); //To change body of generated methods, choose Tools | Templates.
        super.retirar(retirada*0.002);
    }

    @Override
    public void ingresar(double ingreso) throws Exception {
        super.ingresar(ingreso); //To change body of generated methods, choose Tools | Templates.
        super.retirar(0.50);
    }
    
}
