import java.util.HashMap;

public class Cliente {

    //Atributos
    protected String dniCliente;
    protected String codPolizaCliente;
    protected String nombreCliente;
    protected String apellidosCliente;
    protected String direccionCliente;
    protected String emailCliente;
    protected String telfCliente;
    protected HashMap<String, Incidencia> listaIncidencias ;

    //Constructor
    public Cliente(String dniCliente, String codPolizaCliente, String nombreCliente, String apellidosCliente, String direccionCliente, String emailCliente, String telfCliente) {
        this.dniCliente = dniCliente;
        this.codPolizaCliente = codPolizaCliente;
        this.nombreCliente = nombreCliente;
        this.apellidosCliente = apellidosCliente;
        this.direccionCliente = direccionCliente;
        this.emailCliente = emailCliente;
        this.telfCliente = telfCliente;
        this.listaIncidencias = new HashMap<>();
    }

    public String getDniCliente() {
        return dniCliente;
    }
}
