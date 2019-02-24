/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdicionalMovimientosStream;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P07Main {
    public static void main(String[] args) throws Exception {
        CuentaBCTT cuenta = new CuentaBCTT("0156456", "Josue");
        
        cuenta.ingresar(50, "devolucion");
        cuenta.ingresar(13, "devolucion");
        cuenta.ingresar(13, "devolucion");
        cuenta.ingresar(50, "devolucion");
        
        System.out.println(cuenta.toString());
        
        System.out.println(cuenta.listado());
        
        cuenta.movimientos.stream()
                .filter((t) -> {
                    return t.movimiento == 13; //To change body of generated lambdas, choose Tools | Templates.
                })
                .forEach(System.out::println);
    }
}
