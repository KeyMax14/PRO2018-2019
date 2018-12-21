/*
    Práctica 20: Crear una clase Reloj con atributos: int hora, int minuto, int segundo crear un
        constructor como mínimo con los 3 parámetros. Un constructor de copia, un método: String
        mostrar() que devolverá un texto con los datos del reloj en el formato:
        hora:minuto:segundo. Por ejemplo: 20:17:00
        los metodos agregarMinutos(int), agregarHoras(int), agregarSegundos(int) que sumarán lo
        correspondiente al reloj.
        Observar que cuando supere 60minutos, 60segundos se agrega en la siguiente unidad.
        Sobrecargar los métodos agregarHoras(double) , agregarMinutos(double) que si tienen una
        parte decimal calcula el equivalente en la unidad correspondiente y lo agrega
 */
package p20;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Reloj {

    private int hora;
    private int minuto;
    private int segundo;

    public Reloj(int hora, int minuto, int segundo) {
        while (segundo > 60) {
            minuto += 1;
            segundo -= 60;
        }
        while (minuto > 60) {
            hora += 1;
            minuto -= 60;
        }
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Reloj(Reloj reloj) {
        this.hora = reloj.hora;
        this.minuto = reloj.minuto;
        this.segundo = reloj.segundo;
    }

    // Mod p24 - toString
    @Override
    public String toString() {
        return "" + hora + ":" + minuto + ":" + segundo;
    }

    public String mostrar() {
        return "" + hora + ":" + minuto + ":" + segundo;
    }

    public void agregarHoras(int horas) throws Exception {
        if (horas >= 0) {
            this.hora += horas;
        } else {
            throw new Exception("No se pueden agregar valores negativos.");
        }

    }

    public void agregarMinutos(int minutos) throws Exception {
        if (minutos < 0) {
            throw new Exception("No se pueden agregar valores negativos.");
        } else {
            this.minuto += minutos;
            while (this.minuto > 60) {
                this.agregarHoras(1);
                this.minuto -= 60;
            }
        }
    }

    public void agregarSegundos(int segundos) throws Exception {
        if (segundos < 0) {
            throw new Exception("No se pueden agregar valores negativos.");
        } else {
            this.segundo += segundos;
            while (this.segundo > 60) {
                this.agregarMinutos(1);
                this.segundo -= 60;
            }
        }
    }
  
    public void agregarHoras(double horas) throws Exception{
        if (horas < 0) {
            throw new Exception("No se pueden agregar valores negativos.");
        }else{
            double parteDecimal = horas - ((int)horas);
            this.hora+=((int)horas);
            if (parteDecimal > 0) {
                parteDecimal *= 60;
                agregarMinutos(parteDecimal);
            }
        }
    }
    
        public void agregarMinutos(double minutos) throws Exception {
        if (minutos < 0) {
            throw new Exception("No se pueden agregar valores negativos.");
        } else {
            double parteDecimal = minutos - ((int)minutos);
            this.minuto += ((int)minutos);
            while (this.minuto > 60) {
                this.agregarHoras(1);
                this.minuto -= 60;
            }
            if (parteDecimal > 0) {
                parteDecimal *= 60;
                agregarSegundos((int)parteDecimal);
            }
        }
    }
}
