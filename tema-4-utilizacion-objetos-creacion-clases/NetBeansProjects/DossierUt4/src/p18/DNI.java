/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p18;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class DNI {

    private int dniNum;
    private final static String letrasPosibles = "TRWAGMYFPDXBNJZSQVHLCKE";

    public DNI(int dniNum) {
        this.dniNum = dniNum;
    }

    public DNI(DNI dni) {
        dniNum = dni.dniNum;
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
