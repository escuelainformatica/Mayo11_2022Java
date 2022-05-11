package modelo;

public class Encomienda {
    public String destinatario;
    public String origen;
    public String rutCliente;
    public String telefonoContacto;
    public int alto;
    public int ancho;
    public int largo;

    // constructor
    public Encomienda() {

    }
    // constructor con argumentos
    public Encomienda(String destinatario,int alto,int ancho,int largo) {
        // this.destinatario = indica el campo destinatario.
        // destinatario = indico el argumento del constructor
        this.destinatario=destinatario;
        this.alto=alto;
        this.ancho=ancho;
        this.largo=largo;
    }
    public Encomienda(String destinatario,String origen,int alto,int ancho,int largo) {
        this.destinatario=destinatario;
        this.origen=origen;
        this.alto=alto;
        this.ancho=ancho;
        this.largo=largo;
    }


}
