/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicionales;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class DiccionarioRecursivoPerm {

    public static void diccionarioRecursivo(String[] dic, int pos, String palabra) {

        if (pos >= dic.length) {
            System.out.println(palabra);
        } else {
//            String anterior = palabra;
            for (int i = pos; i < dic.length; i++) {

//                palabra += dic[i];
                String temp = dic[pos];
                dic[pos] = dic[i];
                dic[i] = temp;
                
                diccionarioRecursivo(dic, pos + 1, palabra + dic[pos]);
                temp = dic[pos];
                dic[pos] = dic[i];
                dic[i] = temp;
//                System.out.println(palabra);
            }
//            palabra = anterior;
        }
    }

    public static void main(String[] args) {
        String dic[] = {"t", "a", "e", "r"};
        diccionarioRecursivo(dic, 0, "");
    }
}
