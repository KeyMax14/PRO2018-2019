/*

 */
package modelo;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Punto {
    private final double x;
    private final double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto(Punto punto) {
        this.x = punto.x;
        this.y = punto.y;
    }

    @Override
    public String toString() {
        return "("+this.x+","+this.y+")";
    }
    
    public boolean equals(Punto punto) {
        return this.x == punto.x && this.y==punto.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    // En principio no se puede crear un método setter como pide la práctica
    // porque los atributos son final y no se pueden modificar.
    
    
    
    
}
