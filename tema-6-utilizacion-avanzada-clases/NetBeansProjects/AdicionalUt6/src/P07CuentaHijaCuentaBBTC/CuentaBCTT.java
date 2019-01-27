/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
