package proyecto1otrs;

import java.util.ArrayList;
import java.util.Scanner;

public class OTRS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Ticket> listaTicket = new ArrayList<Ticket>();
        ArrayList<Bitacora> listaBitacora = new ArrayList<Bitacora>();

        System.out.println("Creacion de ticket");
        Ticket t = new Ticket("74343289", "Error en el sistema");
        listaTicket.add(t);
        System.out.println(listaTicket.size());
        System.out.println("Nuevo TICKET = " + t.toString());
        Bitacora b = new Bitacora("74343289", "23/08/2022", "Esto es una prueba de bitacora", TipoEvento.CREAR_TICKET);
        System.out.println("Nueva Bitacora = "+ b.toString());


    }
}
