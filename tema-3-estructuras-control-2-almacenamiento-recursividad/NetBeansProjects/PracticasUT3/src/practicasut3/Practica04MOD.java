/*
       Practica 04: Crear un método llamado numeroValido(). El usuario debe introducir un
            número entre 20 y 50 y ser múltiplo de 3. El main() del programa
 */
package practicasut3;

import java.util.Scanner;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */

/*
MOD: Emular un loggin
 */
public class Practica04MOD {

    
    static boolean usuarioAutorizado(String usuIntro, String passIntro){
        
        String usuario = "paco";
        String pass = "pass";
        return ((usuario.equals(usuIntro)) && (pass.equals(passIntro))); // No funciona == en este caso, usar equals() para comparar Strings.
         
    }
    
    public static void main(String[] args) {

        
        String usuarioIntro, passIntro;
        Scanner cin = new Scanner(System.in);
        do {
            System.out.println("Introducir usuario: ");
            usuarioIntro = cin.nextLine();
            System.out.println("Introducir contraseña: ");
            passIntro = cin.nextLine();
        } while (!usuarioAutorizado(usuarioIntro, passIntro));
        System.out.println("Okey. Puedes continuar.");
        
        //Acceso a la zona restringida.
        
        int cuantia = 10000;
        
        System.out.println("Cuantía total del proyecto: "+cuantia);
    }
}
