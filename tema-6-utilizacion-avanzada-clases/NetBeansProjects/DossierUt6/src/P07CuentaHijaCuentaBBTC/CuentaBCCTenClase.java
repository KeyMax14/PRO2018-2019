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
public class CuentaBCCTenClase extends Cuenta {

    private static final double COMISION_INGRESO = 0.50;
    private static final double COMISION_DESCUENTO = 0.0002;

// Mod, el numero del banco inicia con los digitos 7214
    
    public CuentaBCCTenClase() {
        this("Anonimo");
    }

    public CuentaBCCTenClase(String titular) {
        super(titular);
        this.numero = "7214"+this.numero.substring(4);
    }

    public CuentaBCCTenClase(String numero, String titular) throws Exception {
        super(numero, titular);
        if (numero.substring(0,3).equals("7214")) {
            throw new Exception("El número no es de este banco.");
        }
    }
 

    @Override
    public void retirar(double retirada, String concepto) throws Exception {
        super.retirar(retirada, concepto); //To change body of generated methods, choose Tools | Templates.
        super.retirar(retirada * COMISION_DESCUENTO, "Comision "+concepto);
    }

    @Override
    public void ingresar(double ingreso, String concepto) throws Exception {
        if (this.saldo < ingreso*(1+COMISION_DESCUENTO)) {
            throw new Exception("No hay suficiente dinero.");
        }else{
            this.saldo -= ingreso*(1+COMISION_DESCUENTO);
            movimientos.add(new Movimiento(concepto, ingreso));
        }
    }
}
