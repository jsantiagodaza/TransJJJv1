
package clases;

import java.time.LocalDate; //<--para que usemos la fecha
import java.time.LocalTime; //<--para que usemos la hora

public class ticket {
    private String Id; //<--esta tiene que ser única e irrepetible
    private String Empresa; //<--El nombre de la empresa que proprciona el ticket
    private String CodigoTicket; //<--este puede ser la concatenación que mejor nos parezca, propongo "BUS" y un número de X digitos
    //ejemplo "BUS-3984" o si es micro bus "MBUS-1933" por ejemplo
    private LocalDate fechaviaje;
    private LocalTime horaviaje;
    private String Idvehiculo;
    private float precioticket;

    public ticket(String Id, String Empresa, String CodigoTicket, LocalDate fechaviaje, LocalTime horaviaje, String Idvehiculo, float precioticket) {
        this.Id = Id;
        this.Empresa = Empresa;
        this.CodigoTicket = CodigoTicket;
        this.fechaviaje = fechaviaje;
        this.horaviaje = horaviaje;
        this.Idvehiculo = Idvehiculo;
        this.precioticket = precioticket;
    }

    public ticket() {
    }
    
    
    
}
