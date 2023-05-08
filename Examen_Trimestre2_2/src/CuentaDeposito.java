public class CuentaDeposito extends CuentaBancaria{
    private float interesAnual;

    public CuentaDeposito(String dni, String nombre, String email, String telefono, String iban){
        super(dni, nombre, email, telefono, iban);
        this.interesAnual = 0.0f;
    }

    public void ajustarIntereses(){saldo -= interesAnual*saldo;}
}
