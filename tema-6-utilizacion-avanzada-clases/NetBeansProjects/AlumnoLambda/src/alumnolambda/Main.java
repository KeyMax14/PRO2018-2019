/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnolambda;

/**
 *
 * @author carlos
 */
public class Main {
    public static void main(String[] args) {

        Persona personas[] = new Persona[2];


        personas[0] = new Hombre("Paco", "Atta", 91, 170, 71);
        personas[1] = new Mujer("Paca", "Atto", 91, 170, 71);       
        for (Persona persona : personas) {
            System.out.println(persona);
            if( persona instanceof Hombre){
                System.out.println("hombre barba: "+((Hombre)persona).tieneBarba);
            }
            
        }
        
        
        

//Obtener el imc mínimo ( el número ) y mostrar por cada
//persona su imc







//crear un arraylist con las mujeres, y obtener la edad media de los hombres
//        ArrayList<Mujer> mujeres = new ArrayList<Mujer>();
//        double edadMediaHombres = personas.stream()...




//mostrar por cada persona cuántas personas tienen su misma edad

    


//mostrar ordenado para cada edad distinta presente, cuantas personas tienen esa edad




//siguiendo un poco el anterior. Crear un mapa para cada edad como clave una lista de las personas con esa edad como value




//mostrar por cada persona como sería la media de peso si no se contara a esa persona para calcular 
//la media. Esto es, como influye la persona en la media total




//obtener la diferencia de peso menor entre dos personas cualesquiera del array. Esto es por ejemplo, si hay dos personas
//del array con el mismo peso, entonces devolvería cero




//Por cada persona generar tres pesos aleatorios que estén entre +-5 respecto al peso de la persona
//mostrar todos los pesos generados y calcular la media de esos pesos. Si los números aleatorios
//están bien generados esa media no debiera diferir mucho del peso medio de las personas del array
//( crear un arraylist con los tres pesos generados para volcarlo todo en el stream es una opción a considerar )
        
    }
    

    
    
}
