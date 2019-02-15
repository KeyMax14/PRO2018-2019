/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploSimpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class NewClass {
    SimpleDateFormat sdf = new  SimpleDateFormat("yyyy-MM-dd");
//    Date d = sdf.parse("2009-10-01");
    
    String strFecha = sdf.format(new Date()); // Se le pasa una fecha y la muestra
    
}
