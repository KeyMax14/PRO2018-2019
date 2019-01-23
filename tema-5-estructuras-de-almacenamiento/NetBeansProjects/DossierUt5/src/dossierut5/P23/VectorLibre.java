/*
    Práctica 30: Enunciado en clase Punto.
 */
package dossierut5.P23;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class VectorLibre implements Comparable<VectorLibre>{

    private Punto origen = new Punto(0, 0);
    private Punto fin;

    public VectorLibre(Punto fin) {
        this.fin = fin;
    }

    public VectorLibre(Punto desde, Punto hasta) {
        double x = hasta.getX() - desde.getX();
        double y = hasta.getY() - desde.getY();
        this.fin = new Punto(x,y);
    }
    
    public double modulo(){
        double sumaCuadrados = Math.pow(fin.getX(), 2)+Math.pow(fin.getY(), 2);
        return Math.sqrt(sumaCuadrados);
    }
    
    
    // Aquí no se muy bien el funcionamiento del vector, como los puntos son final
    // supongo que debo crear un nuevo punto fin, el origen se queda
    // igual ya que es siempre (0,0).
    
    public VectorLibre multiplicar(double numero){
        Punto fin = new Punto(this.fin.getX()*numero, this.fin.getY()*numero);
        return new VectorLibre(fin);
    }
    
    public VectorLibre division(double numero){
        Punto fin = new Punto(this.fin.getX()/numero, this.fin.getY()/numero);
        return new VectorLibre(fin);
    }
    
    // Normalizar es dividir un vector por su módulo.
    
    public VectorLibre normalizacion(){
        return this.division(modulo());
    }
    
    public VectorLibre opuesto(){
        return this.multiplicar(-1);
    }
    
    public VectorLibre suma(VectorLibre vectorLibre){
        Punto fin = new Punto(this.fin.getX()+vectorLibre.fin.getX(), this.fin.getY()+vectorLibre.fin.getY());
        return new VectorLibre(fin);
    }
    
    // La resta será igual a la suma del opuesto.
    
    public VectorLibre resta(VectorLibre vectorLibre){
        return suma(vectorLibre.opuesto());
    }

    @Override
    public String toString() {
        return "Origen: "+this.origen.toString()+" Fin: "+this.fin.toString();
    }
    
    // En el método equals se comparan los puntos mediante el método equals creado en la clase Punto.
    
    public boolean equals(VectorLibre vectorLibre) {
        return this.fin.equals(vectorLibre.fin);
    }

    // Método añadido en el tema 5, donde se compara cada objeto con su módulo. Para ordenarlo mediante Collections.sort.
    @Override
    public int compareTo(VectorLibre v) {
        return Double.compare(this.modulo(), v.modulo());
    }
    
    

}
