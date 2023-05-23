import java.util.Comparator;

public class ComparaPesoMaximo implements Comparator<Camioneta> {
    @Override
    public int compare(Camioneta o1, Camioneta o2) {
        return o1.getPesoMaximo()-o2.getPesoMaximo();
    }
}
