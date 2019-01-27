/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicionalut6;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */

public class DNI {

    private int dniNum;
    private char letra;
    private final static String letrasPosibles = "TRWAGMYFPDXBNJZSQVHLCKE";

    public DNI(int dniNum) throws Exception {
        this.dniNum = dniNum;
        this.letra = this.calcularLetra();
    }

    public DNI(DNI dni) throws Exception {
        dniNum = dni.dniNum;
        this.letra = dni.calcularLetra();
    }

    // Mod p24 - toString
    @Override
    public String toString() {
        return " Número de DNI: "+dniNum;
    }

    public static boolean validarDNI(String dni) throws Exception {
        boolean resultado = false;

        if (dni.length() != 9) {
            throw new Exception("No es un dni.");
        } else {
            int num = Integer.parseInt(dni.substring(0, dni.length() - 1));
            int posicion = num % 23;
            char letra = dni.toUpperCase().charAt(dni.length() - 1);
            if (letra < 'A' || letra > 'Z') {
                throw new Exception("El último caracter no es una letra.");
            }
            resultado = letra == letrasPosibles.charAt(posicion);
        }
        return resultado;
    }

    public static char calcularLetra(int num) throws Exception {
        char resultado;
        String comprobarNum = "" + num;
        if (comprobarNum.length() > 8) {
            throw new Exception("No puede ser un DNI.");
        } else {
            resultado = letrasPosibles.charAt(num % 23);
        }

        return resultado;
    }

    public char calcularLetra() throws Exception {
        char resultado;
        String comprobarNum = "" + dniNum;
        if (comprobarNum.length() != 8) {
            throw new Exception("No puede ser un DNI.");
        } else {
            resultado = letrasPosibles.charAt(dniNum % 23);
        }

        return resultado;
    }
}