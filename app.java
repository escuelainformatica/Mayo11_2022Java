import javax.crypto.AEADBadTagException;

import modelo.Encomienda;
import servicio.CompararServicio;
import servicio.EncomiendaServicio;

public class app {
    // campos
    public int campo;

    // constructor

    // metodos o funcion
    public static void main(String[] args) {
        // logica
        int numero1 = 2;
        int numero2 = 2;

        CompararServicio cs=new CompararServicio();

        // ejercicio #1
        cs.comparar1(numero1, numero2);

        // ejercicio #1 escrito diferente
        cs.comparar2(numero1, numero2);
     
        // ejercicio #1 escrito de otra manera
        cs.comparar3(numero1, numero2);

        String resultado=cs.comparar4(numero1, numero2);
        System.out.println("el resultado es :"+resultado);      
        
        // Ejercicio #2
        // Tengo una encomienda para santiago con los siguientes datos, 2x3x3, y quisiera calcular el volumen
        // para calcular el precio de envio.
        Encomienda enc=new Encomienda("Santiago",2,3,3);
        
        EncomiendaServicio ensrv=new EncomiendaServicio();
        
        int volumen=ensrv.volumen(enc.alto,enc.ancho,enc.largo);
        System.out.println("el volumen es :"+volumen);

        int volumen2=ensrv.volumen(enc);
        System.out.println("el volumen es :"+volumen2);


        int precio=ensrv.precioEnvio(volumen);
        System.out.println("el precio de envio es $"+precio);

        int precio2=ensrv.precioEnvio(enc);
        System.out.println("el precio de envio es $"+precio2);

        // probar funcion validacion de encomienda
        Encomienda enc1=new Encomienda("santiago",2,3,4);
        if(ensrv.validar(enc1)) {
            System.out.println("la encomienda 1 es valida");
        }
        Encomienda enc2=new Encomienda("santiago",-2,3,4);
        if(ensrv.validar(enc2)) {
            System.out.println("la encomienda 2 es valida");
        } else {
            System.out.println("la encomienda 2 no es valida");
        }

        // mostrar encomienda
        Encomienda enc3=new Encomienda("santiago","arica",3,4,5);
        enc3.rutCliente="1111111-1";
        enc3.telefonoContacto="555-22333";

        ensrv.mostrar(enc3.destinatario,enc3.origen,enc3.alto,enc3.ancho,enc3.largo);
        ensrv.mostrar(enc3);

    } // fin de funcion main
} // fin de la clase
