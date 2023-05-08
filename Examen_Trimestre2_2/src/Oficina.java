import java.util.ArrayList;
import java.util.List;

public class Oficina {
    private String direccion;
    private String cod_of;
    private String telf;
    private String email;
    private String cp_of;
    private String ciudad;
    List<CuentaBancaria> cuentas = new ArrayList<>();

    public Oficina(String direccion, String cod_of, String telf, String email, String cp_of, String ciudad) {
        this.direccion = direccion;
        this.cod_of = cod_of;
        this.telf = telf;
        this.email = email;
        this.cp_of = cp_of;
        this.ciudad = ciudad;
        this.cuentas = new ArrayList<>();
    }

    public void addCuenta(String dni, String nombre, String email, String telf, String iban){
        CuentaBancaria cuenta = new CuentaBancaria(dni, nombre, email, telf, iban);
        cuentas.add(cuenta);
    }

    public String[] listarCuentas(){
        String[] listaCuentas = new String[cuentas.size()];
        for(int i = 0; i < cuentas.size(); i++){
            listaCuentas[i] = cuentas.get(i).toString();
        }
        return listaCuentas;
    }

    public CuentaBancaria buscarCuenta(String iban){
        for(int i = 0; i < cuentas.size(); i++){
            CuentaBancaria cuenta = cuentas.get(i);
            if(cuenta.getIban().equals(iban)){
                return cuenta;
            }
        }
        return null;
    }

    public CuentaBancaria borrarCuenta(String dni){
        for(CuentaBancaria cliente : cuentas){
            if(cliente.getDni().equalsIgnoreCase(dni)){
                cuentas.remove(cliente);
            }
        }
        return null;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCod_of(String cod_of) {
        this.cod_of = cod_of;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCp_of(String cp_of) {
        this.cp_of = cp_of;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCod_of() {
        return cod_of;
    }

    public String getTelf() {
        return telf;
    }

    public String getEmail() {
        return email;
    }

    public String getCp_of() {
        return cp_of;
    }

    public String getCiudad() {
        return ciudad;
    }

}