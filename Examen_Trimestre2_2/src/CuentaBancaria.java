import java.util.ArrayList;

public class CuentaBancaria {
    protected String dni;
    protected String nombre;
    protected String email;
    protected String telf;
    protected String iban;
    protected float saldo;
    protected ArrayList<Operacion> operaciones;
    public CuentaBancaria(String dni, String nombre, String email, String telf, String iban) {
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        this.telf = telf;
        this.iban = iban;
        this.saldo = 0.0f;
        this.operaciones = new ArrayList<>();
    }

    public boolean hacerOperacion(String fecha, int hora, String iban, float cantidad){
        if(iban.equalsIgnoreCase("efectivo")){
            if(cantidad < 0.0f){
                this.operaciones.add(new Operacion(fecha, hora, iban, cantidad));
                this.saldo += cantidad;
            }else if (cantidad > 0.0f){
                this.operaciones.add(new Operacion(fecha, hora, iban, cantidad));
                this.saldo += cantidad;
            }
        }else{
            if (cantidad < 0.0f) {
                this.operaciones.add(new Operacion(fecha, hora, iban, cantidad));
                this.saldo += cantidad;
            } else if (cantidad > 0.0f) {
                this.operaciones.add(new Operacion(fecha, hora, iban, cantidad));
                this.saldo += cantidad;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", telf='" + telf + '\'' +
                ", iban='" + iban + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public String getIban() {
        return iban;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getTelf() {
        return telf;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}