package servicio;

import modelo.Encomienda;

public class EncomiendaServicio {
    
    public int volumen(int al,int an,int la) {
        int resultado=0;
        resultado=al*an*la;
        return resultado;
    }
    public int volumen(Encomienda enc) {
        int resultado=0;        
        resultado=enc.alto*enc.ancho*enc.largo;        
        return resultado;
    }
    public int precioEnvio(int vol) {
        int resultado=0;
        // el precio de envio:el volumen*10
        resultado=vol*10;

        return resultado;
    }
    public int precioEnvio(Encomienda enc) {
        //String hola="hola";
        int resultado=0;
        int volumen=volumen(enc);
        resultado=volumen*10;
        return resultado;
    }

}
