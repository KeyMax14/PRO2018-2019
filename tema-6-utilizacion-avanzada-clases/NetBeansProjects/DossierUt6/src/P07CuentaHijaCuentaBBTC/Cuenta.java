/*
    Práctica 7: Tomando la clase Cuenta que definimos en la UT sobre clases y objetos:
        atributos: String numero, String titular, double saldo, ingresar(), retirar() Crear una clase
        hija llamada CuentaBCTT que refleja las cuentas del banco BCTT Este banco por cada
        ingreso retiene en comisión 0.50€ y por cada retirada de efectivo un 0.02% del dinero
        retirado. Hacer uso de la palabra reservada super
 */
package P07CuentaHijaCuentaBBTC;

import java.util.Random;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Cuenta {

    private String numero;
    private String titular;
    private double saldo;

    // Aqui añadimos un constructor que cree el numero aleatoriamente.
    public Cuenta() {
        this("anonimo"); // Para usar this como constructor, siempre debe ser la primera sentencia del constructor.
    }

    public Cuenta(String titular) {
        this("", titular);
//        numero = "";  // Esto no hace falta porque ya esta inicializado.
        Random rnd = new Random();
        for (int i = 1; i <= 20; i++) {
            if (i % 4 == 0) {
                numero += " ";
            }
            numero += rnd.nextInt(10);
        }
    }

    public Cuenta(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    // Mod p24 - toString
    @Override
    public String toString() {
        return "Titular: " + titular + " Numero: " + numero + " Saldo: " + saldo + "€";
    }

    public void ingresar(double ingreso) throws Exception {
        if (ingreso >= 0) {
            saldo += ingreso;
        } else {
            throw new Exception("No admite esta cantidad.");
        }
    }

    public void retirar(double retirada) throws Exception {
        if (retirada >= 0) { // si colocamos ademas "&& retirada <= this.saldo" podemos controlar ambos con la misma excepcion.
            if (saldo - retirada < 0) {
                throw new Exception("No tiene suficiente saldo.");
            } else {
                saldo -= retirada;
            }
        } else {
            throw new Exception("No admite esta cantidad.");
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
