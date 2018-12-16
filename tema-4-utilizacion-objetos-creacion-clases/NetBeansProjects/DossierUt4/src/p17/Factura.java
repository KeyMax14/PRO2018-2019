/*
    Práctica 17: Crear una clase Factura que tenga como mínimo los atributos: double total,
        String detalle y los métodos agregar(String articuloConsumido, double precio) e imprimir()
        así como un constructor de copia
        agregar() permite añadir al String detalle el nombre del artículo que se ha consumido y el
        precio de ese artículo a la vez que añade al total el precio.
        imprimir() devuelve un String que muestra los artículos consumidos y el precio de cada uno
        de ellos así como el total de la factura
 */
package p17;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Factura {
    private double total;
    private String detalle;

    public Factura() {
        detalle = "";
    }
    
    public Factura(Factura factura){
        detalle = factura.detalle;
        total = factura.total;
    }
    
    
    public void agregar(String articuloConsumido, double precio) throws Exception{
        detalle += articuloConsumido+" "+precio+"€\n";
        total += precio;
        if (precio < 0) {
            throw new Exception("Error de precio.");
        }
        if (articuloConsumido.length() < 1) {
            throw new Exception("Articulo en blanco.");
        }
    }
    
    public String imprimir(){
        return detalle+"Total factura: "+total+"€";
    }
    
//    public static void main(String[] args) throws Exception {
//        Factura f = new Factura();
//        f.agregar("Galletas Oreo", 1.15);
//        f.agregar("Leche", 2);
//        
//        Factura g = new Factura(f);
//        
//        g.agregar("Caramelos", 10);
//        
//        System.out.println(g.imprimir());
//        System.out.println("");
//        System.out.println(f.imprimir());
//        
//    }
    
}
