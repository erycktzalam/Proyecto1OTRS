package proyecto1otrs;

import java.util.ArrayList;

public class Ticket {
    private static int IDINICIAL = 0;
    private int id;
    private String nitUsuario;
    private String descripcionProblema;
    private String estado;// 1 = CREADO, 2 = RESUELTO
    public Ticket () {

    }
    public Ticket (String nitUsuario, String descripcionProblema) {
        this.IDINICIAL++;
        this.id = this.IDINICIAL;
        this.nitUsuario = nitUsuario;
        this.descripcionProblema = descripcionProblema;
        this.estado = "1";
    }

    //METODOS GET Y SET


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNitUsuario() {
        return nitUsuario;
    }

    public void setNitUsuario(String nitUsuario) {
        this.nitUsuario = nitUsuario;
    }

    public String getDescripcionProblema() {
        return descripcionProblema;
    }

    public void setDescripcionProblema(String descripcionProblema) {
        this.descripcionProblema = descripcionProblema;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", nitUsuario='" + nitUsuario + '\'' +
                ", descripcionProblema='" + descripcionProblema + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
