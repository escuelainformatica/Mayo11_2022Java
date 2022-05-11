package servicio;

import modelo.Encomienda;

public class EncomiendaServicio {

    public void mostrar(String destino,String origen,int al,int an,int la) {
        System.out.println("-----------------------------------------------");
        System.out.println("Destino: "+destino);
        System.out.println("Origen: "+origen);
        System.out.println("Alto: "+al);
        System.out.println("Ancho: "+an);
        System.out.println("Largo: "+la);
        System.out.println("-----------------------------------------------");
    }
    public void mostrar(Encomienda enc) {
        System.out.println("----------------------TICKET-------------------");
        System.out.println("Destino: "+enc.destinatario);
        System.out.println("Origen: "+enc.origen);
        System.out.println("Alto: "+enc.alto);
        System.out.println("Ancho: "+enc.alto);
        System.out.println("Largo: "+enc.largo);
        System.out.println("Rut: "+enc.rutCliente);
        System.out.println("Telefono: "+enc.telefonoContacto);
        System.out.println("-----------------------------------------------");
    }
    
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
    public boolean validar(Encomienda enc) {
        boolean resultado=true;
        if(enc.alto<=0) {
            resultado=false;
        }
        if(enc.ancho<=0) {
            resultado=false;
        }
        if(enc.largo<=0) {
            resultado=false;
        }
        //if (enc.destinatario.equals("")) {
        if (enc.destinatario=="") {
            resultado=false;
        }
        /*if(enc.alto<=0 || enc.ancho<=0 || enc.largo<=0) {
        
            resultado=false;
        }*/
        return resultado;
    }

}
