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
public class P07Main {
    public static void main(String[] args) throws Exception {
        CuentaBCTT cuenta = new CuentaBCTT("0156456", "Josue");
        
        cuenta.ingresar(50);
        
        System.out.println(cuenta.toString());
    }
}
