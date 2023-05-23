public class Portero extends Jugador{

    protected int golesEncajados;

    public Portero(String nombre, String apellidos, String dni, String email, String telefono, Integer nacimiento, int dorsal, int goles, int golesEncajados) {
        super(nombre, apellidos, dni, email, telefono, nacimiento, dorsal, goles);
        if (golesEncajados >= 0) {
            this.golesEncajados = golesEncajados;
        }
    }

    public Portero(String sCadenaCSV) {
        super(sCadenaCSV);

        sCadenaCSV = sCadenaCSV.replaceAll("\n", "");

        String[] atributos = sCadenaCSV.split(":")[1].split(";");
        this.golesEncajados = Integer.parseInt(atributos[8]);    }

    public int getGolesEncajados() {
        return golesEncajados;
    }

    public void setGolesEncajados(int golesEncajados) {
        //Este metodo comprueba que me den valores válidos de goles encajados
        if(golesEncajados>=0){
            this.golesEncajados += golesEncajados;
        }
    }

    @Override
    public String toString() {
        StringBuilder sCadenaCSV;

        sCadenaCSV = new StringBuilder(String.format("PORTERO:" +
                        "%s;" +
                        "%s;" +
                        "%s;" +
                        "%s;" +
                        "%s;" +
                        "%d;" +
                        "%d;" +
                        "%d;" +
                        "%d\n",
                this.nombre,
                this.apellidos,
                this.dni,
                this.email,
                this.telefono,
                this.nacimiento,
                this.dorsal,
                this.goles,
                this.golesEncajados));
        return sCadenaCSV.toString();
    }
}