public class Carrera {
    private String codigo;
    private int distancia;
    private int tiempo;
    private byte pendienteMedia;
    private int dorsal;

    public Carrera(String codigo, int distancia, int tiempo, byte pendienteMedia, int dorsal) {
        this.codigo = codigo;
        this.distancia = distancia;
        this.tiempo = tiempo;
        this.pendienteMedia = pendienteMedia;
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "Carrera{"+codigo +"->"+distancia+" metros, "+tiempo+" seg, "+pendienteMedia+" %, Dorsal: "+dorsal+"}";
    }

    public String getCodigo() {
        return codigo;
    }

    public int getDistancia() {
        return distancia;
    }

    public int getTiempo() {
        return tiempo;
    }

    public byte getPendienteMedia() {
        return pendienteMedia;
    }

    public int getDorsal() {
        return dorsal;
    }
}