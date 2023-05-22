import java.util.Comparator;

public class compararJugadores implements Comparator<Jugador> {
    @Override
    public int compare(Jugador jugador1, Jugador jugador2) {
        String nombreCompleto1;
        String nombreCompleto2;
        nombreCompleto1 = jugador1.getApellidos()+" "+jugador1.getNombre();
        nombreCompleto2 = jugador2.getApellidos()+" "+jugador2.getNombre();

        return nombreCompleto1.compareTo(nombreCompleto2);
    }
}
