/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareadeclaseencasa20181220kevinhernandezgarcia;



/**
 *
 * @author carlos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        
        //Si usamos un constructor sin parámetros toma como base de entrada 10 y base de salida 10
        // así que hace las veces de una calculadora de sumas y restas
        CambioBase cb1 = new CambioBase();
        
        
        cb1.agregarCantidad(5);
        //ahora agregamos 7
        cb1.agregarCantidad(7);
        
        //el resultado será 12
        System.out.println(cb1.getAcumulado());
        
        cb1.quitarCantidad(3);
        System.out.println(cb1.getAcumulado());
        
        //limpiamos el acumulado. Así que cuando lo consultemos nos devolverá: 0
        cb1.limpiar();
        
        //Si pasamos como parámetro un número negativo en agregarCantidad()  o quitarCantidad()
        //se lanza una excepción que dice: "no se admiten números negativos"
//        cb1.agregarCantidad(-4);
        
        
        
        //Creamos un nuevo objeto. En esta ocasión recibe por defecto números en base2 y los muestra en base10
        CambioBase cb = new CambioBase(2,10);  //Se agregan números en base2 y se muestran en base10
        //agregamos los números ( sumamos ) los números base2:  1, 10,  100
        //cuyo equivalente en binario es: 1, 2, 4
        //así que en base10 el resultado sería: 1+2+4 = 7
        cb.agregarCantidad("1");
        cb.agregarCantidad("10");
        cb.agregarCantidad("100");
        System.out.println(cb.getAcumulado());
        
        //quitamos el número ( sumamos ) en base3: 10
        //cuyo equivalente en base10 es: 3 así que como había
        //7 y le quitamos 3 nos queda: 4
        cb.quitarCantidad("10", 3);
        System.out.println(cb.getAcumulado());
        
        //limpiamos el acumulado. Así que cuando lo consultemos nos devolverá: 0
        cb.limpiar();
        System.out.println(cb.getAcumulado());
        
        //Si le pasamos un número entero en lugar de una String presupone que el número
        //que le estamos dando está en base 10 
        cb.agregarCantidad(100);
        
        //Si queremos establecemos la base y se lo pasamos como String. En este caso pasamos el 143
        cb.agregarCantidad("143",10);  //se envía el número 143 en base10
        
        
        //100 + 143 = 243
        System.out.println(cb.getAcumulado());
        
        //Podemos observar este mismo número en base3 que es: 100000
        System.out.println(cb.getAcumulado(3));
        
        

    }
    
}
