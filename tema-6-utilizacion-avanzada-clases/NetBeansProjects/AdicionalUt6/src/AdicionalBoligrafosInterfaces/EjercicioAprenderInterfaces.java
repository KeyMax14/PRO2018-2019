/*
                Crear una clase boligrafo ( que guarde la marca y el color ) una clase lÃ¡piz ( que guarde el nÃºmero 
        y un boolean que informe si tiene goma o no tiene )
        
           una clase planta ( que guarde el tipo de planta que es y la edad que tiene )
        
        
            Una tienda quiere listar los objetos que tiene a la venta ( con la informaciÃ³n del objeto y del 
            precio ) Todo objeto que estÃ© en venta en la tienda diremos que es: vendible 
            Crear la interfaz vendible con un mÃ©todo llamado: obtenerPrecio()  que devolverÃ¡ el precio del artÃ­culo
            y un mÃ©todo: listar() que devuelve una String con todos los datos del artÃ­culo
        
            Hacer que las clases Boligrafo, Lapiz, Planta implementen la interfaz haciendo que los boligrafos
        cuesten: 1.0, los lÃ¡pices: 0.50, y las plantas: 5.0
        
            Poner un par de boligrafos, 1 lÃ¡piz y una planta en un ArrayList<Vendible> recorrerlo y ejecutar 
            para cada objeto el mÃ©todo listar()
 */
package AdicionalBoligrafosInterfaces;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class EjercicioAprenderInterfaces {
    public static void main(String[] args) {
//        ArrayList<Vendible> tienda= new ArrayList<Vendible>();
//        
//        Vendible vendible = new Planta("Orquidea", 2);
//        tienda.add(vendible);
//        tienda.add(new Boligrafo("bic", "Naranja"));
//        tienda.add(new Lapiz(2, true));
//        
//        int i= 0;
//        for (Vendible ven : tienda) {
//            System.out.println("articulo: "+i);
//            System.out.println(ven.listar());
//            i++;
//        }
//        System.out.println("Introducir número de articulo a comprar: ");
//        
//        Scanner sc = new Scanner(System.in);
//        
//        int opcion = sc.nextInt();
//        Vendible v= tienda.get(opcion);
//        tienda.remove(opcion);
//        System.out.println("Has comprado el articulo: "+v.listar());
        Tienda t = new Tienda("Tienda Kevin", 2500);
        Scanner sc = new Scanner(System.in);
        
        
        t.agregarArticulos(new Lapiz(2, true));
        t.agregarArticulos(new Planta("Orquidea", 2));
        t.agregarArticulos(new Planta("Rosal", 7));
        t.agregarArticulos(new Boligrafo("Pilot", "Azul"));
        
        System.out.println("¿Qué desea comprar?");
        System.out.println(t.mostrarArticulos());
        int opcion = sc.nextInt();sc.nextLine();
        System.out.println("¿Cuanto dinero das?");
        double dinero = sc.nextDouble();sc.nextLine();
        double cambio = t.vender(opcion, dinero); 
        if ( cambio < 0) {
            System.out.println("Dinero insuficiente,");
        }else{
            System.out.println("Tenga su cambio: " + cambio);
        }
        System.out.println(t.mostrarArticulos());
        
        
        
    }
}

class Boligrafo implements Vendible{
    String marca;
    String color;

    public Boligrafo(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Boligrafo "+"Marca=" + marca + ", Color=" + color;
    }

    @Override
    public double obtenerPrecio() {
        return 1;
    }

    @Override
    public String listar() {
        return toString() + " Precio= "+ obtenerPrecio();
    }
    
    
    
}
class Lapiz implements Vendible{
    int numero;
    boolean tieneGoma;

    public Lapiz(int numero, boolean tieneGoma) {
        this.numero = numero;
        this.tieneGoma = tieneGoma;
    }

    @Override
    public String toString() {
        return "lapiz{" + "numero=" + numero + ", tieneGoma=" + tieneGoma + '}';
    }

    @Override
    public double obtenerPrecio() {
        return 0.50;
    }

    @Override
    public String listar() {
        return toString() + " Precio= "+ obtenerPrecio();
    }
    
    
    
}

class Planta implements Vendible{
    String tipo;
    int edad;

    public Planta(String tipo, int edad) {
        this.tipo = tipo;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "planta{" + "tipo=" + tipo + ", edad=" + edad + '}';
    }

    @Override
    public double obtenerPrecio() {
        return 5.0;
    }

    @Override
    public String listar() {
        return toString() + " Precio= "+ obtenerPrecio();
    }
    
    
}

interface Vendible{
    double obtenerPrecio();
    String listar();
}