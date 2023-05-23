import java.util.Comparator;

public class CompararCamasDisponibles implements Comparator<Autocaravana> {
    @Override
    public int compare(Autocaravana o1, Autocaravana o2) {
        return o1.getCamasDisponibles()-o2.getCamasDisponibles();
    }
}
