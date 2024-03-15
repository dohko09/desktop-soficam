package vista;

import java.util.Date;
import java.sql.Timestamp;
import metodos.funciones;
import static metodos.funciones.convertirDateAFechayHora;

public class prueba {

    public static void main(String[] args) {
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());

        System.out.println("Date: " + convertirDateAFechayHora(date));
        System.out.println("Timestamp: " + timestamp);

        System.out.println(funciones.compararFechas(new Date("2023/03/24"), new Date("2023/03/25")));
    }
}
