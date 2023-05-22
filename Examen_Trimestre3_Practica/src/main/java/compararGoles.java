import java.util.Comparator;

public class compararGoles implements Comparator<Jugador> {
    @Override
    public int compare(Jugador jugador1, Jugador jugador2) {
        return jugador2.goles-jugador1.goles;
    }
}