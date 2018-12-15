/*
    Práctica 11: Crear una clase llamada Cliente que emulará los gastos de un cliente de un
        hotel. Como atributos tendrá como mínimo: int id, String nombre, String apellido, int
        habitacion, double debe, int noches Como métodos como mínimo gastar(double) y
        pagar(double) que reflejan cuando el cliente consume y aumenta su deuda así como pagar
        parte de su cuenta. Tener en cuenta que como mínimo en el debe del cliente estará la cuantía
        de alquilar la habitación por el número de noches que esté. Cuando se establezca el número
        de la habitación también se deberá establecer el precio/noche de la habitación
 */
package p11;

import com.sun.security.ntlm.Client;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */

class Cliente{
    private int id;
    private String nombre;
    private String apellido;
    private int habitacion;
    private double debe;
    private int noches;
    private double precioNoche;
    
    public Cliente(int id, String nombre, int habitacion, int noches, double precioNoche) throws Exception{
        this(id, nombre, "", habitacion, noches, precioNoche);
    }
    
    public Cliente(int id, String nombre, String apellido, int habitacion, int noches, double precioNoche) throws Exception {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.habitacion = habitacion;
        if (precioNoche < 0) {
            throw new Exception("Precio de noche negativo.");
        }
        if (noches < 1) {
            throw new Exception("No puede quedarse en el hotel sin noches.");
        }
        this.debe = precioNoche*noches;
        this.noches = noches;
        this.precioNoche = precioNoche;
    }
    
    public String infoEstancia(){
        String respuesta = "Cliente: "+nombre+" "+apellido+".\n"
                + "Habitación: "+ habitacion+".\nPrecio noche: "
                +precioNoche+"€.\nTotal a deber: "+debe+"€.";
        return respuesta;
    }
    
    public String gastar(double gasto){
        debe += gasto;
        return "Actualmente debe "+debe+"€.";
    }
    
    public String pagar(double pago){
        String respuesta = "";
        if (debe-pago>0) {
            debe -= pago;
            respuesta = "Actualmente debe "+debe+"€.";
        }else if(debe-pago==0){
            debe = 0;
            respuesta = "Ha pagado toda su estancía.";
        }else{
            respuesta = "Ha pagado toda su estancía. Su vuelta son "+(pago-debe)+"€.";
            debe = 0;
        }
        return respuesta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }

    public double getDebe() {
        return debe;
    }

    public void setDebe(double debe) {
        this.debe = debe;
    }

    public int getNoches() {
        return noches;
    }

    public void setNoches(int noches) {
        this.noches = noches;
    }
}

public class p11 {
    public static void main(String[] args) throws Exception {
        Cliente c = new Cliente(1, "Pedro", "Sanchez", 105, 5, 50);
        
        System.out.println(c.infoEstancia());
        System.out.println(c.gastar(26.56));
        System.out.println(c.pagar(900));
        
    }
}
