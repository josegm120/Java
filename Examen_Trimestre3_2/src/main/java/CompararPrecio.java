import java.util.Comparator;

public class CompararPrecio implements Comparator<Vehiculo> {
    @Override
    public int compare(Vehiculo o1, Vehiculo o2) {
        return (int) (o1.getPrecio()-o2.getPrecio());
    }
}
