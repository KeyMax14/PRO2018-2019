/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p10;

import java.util.Random;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
class Cuenta{
    private String numero;
    private String titular;
    private double saldo;

    
    // Aqui añadimos un constructor que cree el numero aleatoriamente.

    public Cuenta(){
        this("anonimo"); // Para usar this como constructor, siempre debe ser la primera sentencia del constructor.
    }
    
    public Cuenta(String titular) {
        this("",titular);
//        numero = "";  // Esto no hace falta porque ya esta inicializado.
        Random rnd = new Random();
        for (int i = 1; i <= 20; i++) {
            if (i%4==0) {
                numero+=" ";
            }
            numero += rnd.nextInt(10);
        }
    }
    

    public Cuenta(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }
    
    
    
    public void ingresar(double ingreso) throws Exception{
        if (ingreso >= 0) { 
            saldo += ingreso;
        }else{
            throw new Exception("No admite esta cantidad."); 
        }
    }
    
    public void retirar(double retirada) throws Exception{
        if (retirada >= 0) { // si colocamos ademas "&& retirada <= this.saldo" podemos controlar ambos con la misma excepcion.
            if (saldo-retirada < 0) {
                throw new Exception("No tiene suficiente saldo.");
            }else{
                saldo -= retirada;
            }
        }else{
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

public class p10 {
    public static void main(String[] args) {
        
    }
}
