/*
    gestionar habitaciones


        En los hoteles cuando se va a desayunar se suele preguntar la habitaciÃ³n de la persona que 
        llega al comedor. Para contemplar si estÃ¡ dentro del precio establecido o hay que agregar
        una tarifa adicional


        No se entiende que una persona que haya ido a desayunar se le permita que vuelva mÃ¡s tarde
        a hacerlo


        Crear una clase: Gestion

        tiene un constructor que acepta un String para que se ponga la fecha del dÃ­a 

        con mÃ©todo: vieneADesayunar()

        a ese mÃ©todo se le pasa el nÃºmero de la habitaciÃ³n

        ese mÃ©todo devolverÃ¡ un "ok" o un "ya ha desayunado"

        TambiÃ©n debe existir un mÃ©todo llamado: listado()

        que nos mostrarÃ¡ un listado que primero mostrarÃ¡ el dÃ­a
        y luego la lista de habitaciones que han venido a desayunar
 */
package adicionalut5;

import java.util.HashSet;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
class Gestion {

    private String fecha;
    private HashSet<Integer> desayunar;

    public Gestion(String fecha) throws Exception {
//        Pattern p = Pattern.compile("[01]+");
//        Matcher m = p.matcher("00001010");
//        if (m.find()) {
//            System.out.println("Si, contiene el patrón");
//        } else {
//            System.out.println("No, no contiene el patrón");
//        }
        if (fecha.matches("[12][0-9]{3}-((0[1-9])|(1[0-2]))-(([0-2][0-9])|(3[01]))")) {
            this.fecha = fecha;
            desayunar = new HashSet<Integer>();
        }else{
            throw new Exception("Error de fecha.");
        }
    }
    
    public String vieneADesayunar(Integer habitacion){
//        String resultado = "";
//        if (this.desayunar.contains(habitacion)) {
//            resultado = "Ya ha desayunado.";
//        }else{
//            desayunar.add(habitacion);
//            resultado = "Ok";
//        }
//        return resultado;
        return desayunar.add(habitacion)?"Ok":"Ya ha desayunado";
    }
    
    public String listado(){
        StringBuilder resultado = new StringBuilder(" "+fecha+" :\n");
        for (Integer integer : desayunar) {
            resultado.append("|");
            resultado.append(integer);
        }
        return resultado.toString();
    }

}

public class AdicionalGestionHabitacion {
    public static void main(String[] args) throws Exception {
        Gestion a = new Gestion("2018-01-01");
        System.out.println(a.vieneADesayunar(123));
        System.out.println(a.vieneADesayunar(234));
        System.out.println(a.vieneADesayunar(567));
        System.out.println(a.listado());
    }
}
