package proyecto1otrs;

public class Bitacora {

    private int idTicket;
    private String nitSoporte;
    private String fechaHora;
    private String mensajeBitacora;

    private TipoEvento tipoEvento;
    public Bitacora(String nitSoporte, String fechaHora, String mensajeBitacora, TipoEvento tipoEvento) {
        this.nitSoporte = nitSoporte;
        this.fechaHora = fechaHora;
        this.mensajeBitacora = mensajeBitacora;
        this.tipoEvento = tipoEvento;
    }

    @Override
    public String toString() {
        return "Bitacora{" +
                "idTicket=" + idTicket +
                ", nitSoporte='" + nitSoporte + '\'' +
                ", fechaHora='" + fechaHora + '\'' +
                ", mensajeBitacora='" + mensajeBitacora + '\'' +
                ", tipoEvento=" + tipoEvento +
                '}';
    }
}
