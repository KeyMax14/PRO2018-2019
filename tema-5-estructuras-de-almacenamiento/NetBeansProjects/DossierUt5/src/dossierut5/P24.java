/*
    Práctica 24: Crear una clase Vehiculo con atributos: int numeroRuedas , double potencia y
    T identificador Este identificador pudiera ser como una matrícula ( String ) o un código
    numérico ( double, int,… ) o cualquier otro tipo. Debe tener como mínimo los getter y setter
 */
package dossierut5;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
class Vehiculo<T>{
    int numeroRuedas;
    double potencia;
    T identificador;

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public Vehiculo(int numeroRuedas, double potencia, T identificador) {
        this.numeroRuedas = numeroRuedas;
        this.potencia = potencia;
        this.identificador = identificador;
    }

    public Vehiculo() {
    }
    

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public T getIdentificador() {
        return identificador;
    }

    public void setIdentificador(T identificador) {
        this.identificador = identificador;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "numeroRuedas=" + numeroRuedas + ", potencia=" + potencia + ", identificador=" + identificador + '}';
    }
    
    
    
    
}

public class P24 {
    public static void main(String[] args) {
        /*
            Prueba de la clase Vehiculo
        */
        
        Vehiculo<String> coche = new Vehiculo<>();
        coche.setIdentificador("4896-ABC");
        coche.setNumeroRuedas(4);
        coche.setPotencia(50);
        
        Vehiculo<Double> moto = new Vehiculo<>(2, 100, 4586.4);
        
        System.out.println(coche);
        System.out.println(moto);
        
        
        
    }
}
