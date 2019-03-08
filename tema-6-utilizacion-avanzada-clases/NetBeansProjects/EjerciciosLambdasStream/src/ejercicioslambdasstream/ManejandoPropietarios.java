/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioslambdasstream;

import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author carlos
 */


class Propietario{
    String nombre;
    ArrayList<Casa> casas = new ArrayList<Casa>();

    public Propietario(String nombre, Casa casa) {
        this.nombre = nombre;
        casas.add(casa);
    }

   
    public void mostrarDatos() {
        System.out.println("Propietario{" + "nombre=" + nombre + ", casas=" + casas + '}');
    }
    
    void addCasa(Casa casa){
        casas.add(casa);
    }
    
    Optional<Casa> getCasa(Casa c){
        Casa resultado = null;
        if( casas.indexOf(c) != -1 )
            resultado = c;
        
        return Optional.ofNullable(resultado);
    }
    
    Optional<Casa> getCasa(int i){
        Casa casa=null;
        try{
            casa = casas.get(i);
        }catch(Exception ex){}
        
        return Optional.ofNullable(casa);
    }
    
    Optional<Casa> getCasa(){
        return getCasa(0);
    }
    
    Casa primeraCasa(){
        return casas.get(0);
    }
    
    
}

class Casa{
    double metrosCuadrados;
    String direccion;
    Balcon balcon;

    public Casa(double metrosCuadrados, String direccion, Balcon balcon) {
        this.metrosCuadrados = metrosCuadrados;
        this.direccion = direccion;
        this.balcon = balcon;
    }

    
    public void mostrarDatos() {
        System.out.println("Casa{" + "metrosCuadrados=" + metrosCuadrados + ", direccion=" + direccion + ", balcon=" + balcon + '}');
    }
    
    Optional<Balcon> getBalcon(){
        return Optional.ofNullable(balcon);
    }
    
}

class Balcon{
    
    boolean estaCerrado;
    double metrosCuadrados;

   
    public void mostrarDatos() {
        System.out.println("Balcon{" + "estaCerrado=" + estaCerrado + ", metrosCuadrados=" + metrosCuadrados + '}');
    }

    public Balcon(boolean estaCerrado, double metrosCuadrados) {
        this.estaCerrado = estaCerrado;
        this.metrosCuadrados = metrosCuadrados;
    }
    
}


public class ManejandoPropietarios {
    
    
    public static void main(String[] args) {
        Propietario yayo = new Propietario("Yayo", new Casa(20,"La Laguna",new Balcon(true,5)));
        Propietario marco = new Propietario("Marco", new Casa(110,"Pto Cruz", null ));
        Propietario propietarioNulo = null;
        Propietario marcopolo = new Propietario("MarcoPolo", null);
        
        
        
        // tomemos que tenemos un apuntador de un propietario pero realmente no sabemos 
        // nada de lo que contiene. Ahora tomaremos a marco pero debemos pensar que sea un caso general
        
        Propietario prop = marco;
        
        
        //si nosotros queremos saber los metros cuadrados
        //del balcón de la casa 0 Tenemos que tomar el arraylist de casas:  prop.casas
        // de ese arraylist tomar la posición 0:   prop.casas.get(0)
        // de esa casa tomar su balcón: prop.casas.get(0).balcon
        // y de ese balcón tomar sus metros cuadrados: prop.casas.get(0).balcon.metrosCuadrados
        
        double metrosBalconMarco;
        //metrosBalconMarco = prop.casas.get(0).balcon.metrosCuadrados;
        
        
        // el problema está en que la sentencia anterior puede tener múltiples null
        // el Propietario puede que su arraylist de casas esté vacío, o que la casa 0
        // tenga null en Balcon Si lo hacemos de la forma tradicional habría que hacer algo así:
        
        if( prop.casas != null){
            if( prop.casas.size() > 0 && prop.casas.get(0) != null){
                if( prop.casas.get(0).balcon != null){
                    metrosBalconMarco = prop.casas.get(0).balcon.metrosCuadrados;
                    System.out.println(metrosBalconMarco);
                }
            }
        }
        
        
        
        
        // Mediante Optional se puede hacer que el usuario de la clase Propietario no se vea obligado 
        // a cuestionar por todos esos posibles null. Le solucionas bastante su código si tú le pones
        // todo proparado con métodos que devuelvan Optional
        // el código anterior ahora con métodos que soportan Optional:
        // ATENCIÓN!!!!  OBSERVAR QUE LO SIGUIENTE NO ES UN STREAM !!! SON MÉTODOS DE OPTIONAL
        
        metrosBalconMarco = prop.getCasa(0)
                .map(casa->casa.balcon)
                .map(balcon->balcon.metrosCuadrados)
                .orElse(-1.0);
        System.out.println("los metros del balcón (-1 si no existe ): " + metrosBalconMarco);
        
        
        
        ArrayList<Propietario> propietarios = new ArrayList<Propietario>();
        propietarios.add(yayo); 
        propietarios.add(marco);
        propietarios.add(propietarioNulo);
        propietarios.add(marcopolo);
        
//        for (Propietario propietario : propietarios) {
//            if( propietario != null){
//                for (Casa casa : propietario.casas) {
//                    if( casa != null){
//                        if( casa.balcon != null)
//                            casa.balcon.mostrarDatos();
//                        
//                    }
//                }
//                
//            }
//            System.out.println("");
//        }
        
        
        
//       
//            int i=0;
//            Optional<Propietario> optProp = Optional.ofNullable(propietarios.get(i));
//            if( optProp.isPresent()){
//               
//                Optional<Casa> optCasa = optProp.get().getCasa();
//                if(optCasa.isPresent()){
//                     
//                    
//                    Optional<Balcon> optBalcon = optCasa.get().getBalcon();
//                    if( optBalcon.isPresent())
//                        optBalcon.get().mostrarDatos();
//                }
//            }
            
        
        
            


//        propietarios.stream()
//                .map( propietario-> Optional.ofNullable(propietario))        //protegemos los null de propietario
//                .filter(Optional::isPresent)                       //nos quedamos con los no nulos de propietario
//                .map(optPropiet -> optPropiet.get())              //reconvertimos a propietario, pero ya filtrado
//                .flatMap( propietario ->  propietario.casas.stream())            //pasamos de propietario a casas
//                .map(casa->Optional.ofNullable(casa))                              //protegemos los null de casas
//                .filter(Optional::isPresent)                                // nos quedamos con las casas no null
//                .map(optCasa -> optCasa.get())                  //volvemos a tomar las casas ya filtradas de null
//                .map(casa -> casa.balcon)                                          //convertimos de casa a balcón
//                .map(balcon -> Optional.ofNullable(balcon))                       //protegemos los null de balcón
//                .filter(Optional::isPresent)                                        //filtramos los balcones null
//                .map(Optional::get)                                 // volvemos a convertir a balcón ya sin nulos
//                .forEach(balcon->balcon.mostrarDatos());                          //mostramos los datos de balcón



        
        
        

//eliminando los map de los get:

//        propietarios.stream()
//                .map( propietario-> Optional.ofNullable(propietario))        
//                .filter(Optional::isPresent)                       
//                
//                .flatMap( optPropiet ->  optPropiet.get().casas.stream())  
//                .map(casa->Optional.ofNullable(casa))                           
//                .filter(Optional::isPresent)                 
//                
//                .map(optCasa -> optCasa.get().balcon)           
//                .map(balcon -> Optional.ofNullable(balcon))           
//                .filter(Optional::isPresent)                        
//                             
//                .forEach(optBalcon->optBalcon.get().mostrarDatos());    




            //Entendiendo el map de optional
            Optional<Casa> optionalCasa = Optional.ofNullable(yayo.casas.get(0));
            
            //podemos pasar de un optional a otro mediante mapeo directamente:
            Optional<Balcon> optionalBalcon = optionalCasa.map( casa -> casa.balcon);
            
            Propietario aquel = null;
            new Propietario("aquel", null);
            
           Optional<Propietario> optAquel = Optional.ofNullable(aquel);
           optAquel.map(p->p.primeraCasa().balcon);
//            //Optional<Casa> optCasa = optAquel.map(pr->pr.primeraCasa());
//            Optional<Balcon> optBalcon = optAquel
//                    .map(pr->pr.primeraCasa().balcon);
//            optBalcon.ifPresent(b->b.mostrarDatos());
//            
//            //optionalBalcon.ifPresent(balcon->balcon.mostrarDatos());
//            


//Existe Optional.map() que nos permite pasar un optional a otro optional y ahí ahorramos varias líneas
//ya que entonces no tenemos que hacer la línea de filtrado
//así pasamos de un Optional<Casa> a un Optional<Balcon>
//y ya no tenemos que hacer: map(balcon->Optional.ofNullable(balcon))


//        propietarios.stream()
//                .map( propietario-> Optional.ofNullable(propietario))        
//                .filter(Optional::isPresent)                       
//                
//                .flatMap( optPropiet ->  optPropiet.get().casas.stream())  
//                .map(casa->Optional.ofNullable(casa))                           
//                //.filter(Optional::isPresent)      // esta línea sobra ahora           
//                
//                .map(optCasa -> optCasa.map(casa->casa.balcon))           
//              //  .map(balcon -> Optional.ofNullable(balcon))    /*esta línea se tiene que eliminar*/       
//                .filter(Optional::isPresent)                        
//                             
//                .forEach(optBalcon->optBalcon.get().mostrarDatos()); 




        System.out.println("\n\nRecorremos un array con stream y nos eliminamos los null gracias a Optional");
        propietarios.stream()
                .map( propietario-> Optional.ofNullable(propietario))  //aquí se obtiene stream de optional<propietario>      
                .filter(Optional::isPresent)   // seguimos con stream de optional                    
                .flatMap( optPropiet ->  optPropiet.get().casas.stream())  // obtenemos stream de casas
                .map(casa->Optional.ofNullable(casa))            //ahora obtenemos stream de optional<casa>                
                .map(optCasa -> optCasa.map(casa->casa.balcon))   // obtenemos stream optional<balcon>         
                .filter(Optional::isPresent)                        
                .forEach(optBalcon->optBalcon.get().mostrarDatos()); 
    }
}
