/*
        Práctica 20: Crear un pequeño programa con un array de Ordenable:
            
            Ordenable array[] = new Ordenable[2];
            donde apuntemos a un Hombre o Mujer y a una Fraccion
            Recorrer el array y mediante un condicional con instanceof haremos que:
            si el elemento es de tipo Fraccion se comparará con la Fraccion: 4/5 y se mostrará cuál es
            mayor en pantalla.
            Si el elemento es Persona se comparará con la Mujer: Mujer(“Ana”,”Po”,”Ro”,20,165,60)
            y se mostrara cuál es mayor en pantalla
 */
package P20ArrayOrdenablePersonasFracciones;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class P20Main {
    public static void main(String[] args) {
        Ordenable array[] = new Ordenable[2];
        
        array[0] = new Fraccion(1, 2);
        array[1] = new Hombre("Jose", "Ramirez", "Socas", 46, 178, 86);
        
        for (Ordenable ordenable : array) {
            if (ordenable instanceof Fraccion) {
                Fraccion f = new Fraccion(4, 5);
                if (((Fraccion) ordenable).esIgualQue(f) || ((Fraccion) ordenable).esMayorQue(f)) {
                    System.out.println(ordenable);
                }else{
                    System.out.println(f);
                }
            }else if(ordenable instanceof Persona){  // Aunque la instancia sea de tipo Hombre, también es de tipo Persona.
                Persona m = new Mujer("Ana", "Po", "Ro", 20, 165, 60);
                if (((Persona) ordenable).esIgualQue(m) || ((Persona) ordenable).esMayorQue(m)) {
                    System.out.println(ordenable);
                }else{
                    System.out.println(m);
                }
            }
        }
    }
}
