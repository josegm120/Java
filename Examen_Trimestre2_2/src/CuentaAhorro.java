public class CuentaAhorro extends CuentaBancaria{
    private float interesAnual;

    public CuentaAhorro(String dni, String nombre, String email, String telefono, String iban){
        super(dni, nombre, email, telefono, iban);
        this.interesAnual = 0.1f;
    }

    public void ajustarIntereses(){saldo -= interesAnual;}
}