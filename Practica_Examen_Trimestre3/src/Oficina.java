import java.util.LinkedList;

public class Oficina {

    //Atributos
    protected String codOficina;
    protected String nombreOficina;
    protected String direccionOficina;
    protected String ciudadOficina;
    protected String cpOficina;
    protected String telfOficina;
    protected String emailOficina;
    protected LinkedList<Cliente> listaClientes;

    //Constructor
    public Oficina(String codOficina, String nombreOficina, String direccionOficina, String ciudadOficina, String cpOficina, String telfOficina, String emailOficina) {
        this.codOficina = codOficina;
        this.nombreOficina = nombreOficina;
        this.direccionOficina = direccionOficina;
        this.ciudadOficina = ciudadOficina;
        this.cpOficina = cpOficina;
        this.telfOficina = telfOficina;
        this.emailOficina = emailOficina;
        this.listaClientes = new LinkedList<>();
    }

    public boolean addCliente(String dniCliente, String codPolizaCliente, String nombreCliente, String apellidosCliente, String direccionCliente, String emailCliente, String telfCliente){

        for(Cliente recorrerCliente: listaClientes){
            if(recorrerCliente.getDniCliente().equalsIgnoreCase(dniCliente)){
                return false;
            }
            else{
                Cliente cliente = new Cliente(dniCliente, codPolizaCliente, nombreCliente, apellidosCliente, direccionCliente, emailCliente, telfCliente);
                listaClientes.add(cliente);
                return true;
            }
        }
        return false;
    }

    public String deleteCliente(String dni){
        for(Cliente recorrerClientes: listaClientes){
            if(recorrerClientes.getDniCliente().equalsIgnoreCase(dni)){
                listaClientes.remove(recorrerClientes);
                return "Se ha borrado el cliente";
            }
        }
        return "No se ha podido borrar el cliente";
    }

    public void setCodOficina(String codOficina) {
        this.codOficina = codOficina;
    }

    public void setNombreOficina(String nombreOficina) {
        this.nombreOficina = nombreOficina;
    }

    public void setDireccionOficina(String direccionOficina) {
        this.direccionOficina = direccionOficina;
    }

    public void setCiudadOficina(String ciudadOficina) {
        this.ciudadOficina = ciudadOficina;
    }

    public void setCpOficina(String cpOficina) {
        this.cpOficina = cpOficina;
    }

    public void setTelfOficina(String telfOficina) {
        this.telfOficina = telfOficina;
    }

    public void setEmailOficina(String emailOficina) {
        this.emailOficina = emailOficina;
    }
}
