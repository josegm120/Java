public class Portero extends Jugador{

    protected int golesEncajados;

    public Portero(String nombre, String apellidos, String dni, String email, String telefono, Integer nacimiento, int dorsal, int goles, int golesEncajados) {
        super(nombre, apellidos, dni, email, telefono, nacimiento, dorsal, goles);
        this.golesEncajados = golesEncajados;
    }

    public Portero(String sCadenaCSV) {
        super(sCadenaCSV);
        String[] atributos = sCadenaCSV.split(":")[1].split(";");
        this.golesEncajados = Integer.parseInt(atributos[9]);
    }

    @Override
    public String toString() {
        StringBuilder sCadenaCSV;

        sCadenaCSV = new StringBuilder(String.format("PORTERO:" +
                        "%10s;" +
                        "%20s;" +
                        "%9s;" +
                        "%20s;" +
                        "%9s;" +
                        "%4s;" +
                        "%3s;" +
                        "%3s;" +
                        "%3s\n",
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

    public int getGolesEncajados() {
        return golesEncajados;
    }

    public void setGolesEncajados(int golesEncajados) {
        //Este metodo comprueba que me den valores válidos de goles encajados
        if(golesEncajados<0){
            this.golesEncajados = 0;
        }else{
            this.golesEncajados += golesEncajados;
        }
    }
}