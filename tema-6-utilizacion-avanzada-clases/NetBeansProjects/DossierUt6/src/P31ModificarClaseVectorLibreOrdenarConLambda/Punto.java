/*
    Práctica 30: Esta es una práctica bastante completa respeto a creación de clases. Se
        pretende recrear las operaciones de los vectores libres del plano.
        Se precisa crear una clase Punto ( generarla en un fichero aparte )
        que tiene dos atributos: final double x, final double y que reflejan que un punto del plano
        es inamovible una vez creado. Precisa de un constructor de copia y del constructor:
        Punto(double x, double y)
        se deben sobreescribir los métodos: toString(), equals(Punto) el toString muestra el
        punto en el formato: (x,y)
        el método equals determina que dos puntos son iguales si coincide su valor x y su valor y
        por supuesto también los getter y setter
        Crear la clase VectorLibre. Para ello debemos saber:
        - Los vectores se definen por dos puntos. Uno inicial y uno final. Al ser un vector libre
        estableceremos para todos los vectores como el punto (0,0) siendo ese uno de los atributos,
        que lo llamaremos: origen
        El otro atributo será: fin que es el otro punto que define el vector
        - Dos constructores: VectorLibre(Punto desde, Punto hasta) y VectorLibre(Punto fin)
        El segundo constructor lo único que precisa es tomar el punto fin dado como el atributo de
        nuestro nuevo vector
        El primer constructor calcula las coordenadas del punto fin a crear como atributo mediante:
        coordenada fin X: hasta.getX() - desde.getX()
        coordenada fin Y: hasta.getY() - desde.getY();
        métodos:
        double modulo() → que devuelve la raiz cuadrada de x²+y²
        VectorLibre multiplicar(double numero) → el producto por un número es multiplicar sus
        componentes: V(3,8) * 2 = V(3*2,8*2)
        VectorLibre division(double numero) → La división por un número es dividir sus
        componentes: V(4,8) / 2 = V(4/2,8/2)
        VectorLibre normalizacion() → Normalizar un vector es dividirlo por su módulo
        VectorLibre opuesto() → Obtener el opuesto de un vector es multiplicarlo por -1
        VectorLibre suma(VectorLibre vectorLibre) → la suma de vectores se hace sumando sus
        componentes: V(1,2) + V(3,4) = V(1+3,2+4)
        VectorLibre resta(VectorLibre vectorLibre) → la resta es igual que la suma pero restando en
        lugar de sumar. Si bien este método se realizará apoyándose en otros dos métodos anteriores
        ya que la resta se puede obtener como la suma del opuesto
        adicionalmente los métodos toString() y equals() Respecto a este último como el punto
        origen lo estamos estableciendo para todos en (0,0) lo único que hay que comprobar es que
        los puntos fin sean iguales ( para ello se usará el método equals() de la clase Punto que
        antes se habrá creado )
        Probar el funcionamiento de la clase haciendo sumas, restas, etc.
 */
package P31ModificarClaseVectorLibreOrdenarConLambda;

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
