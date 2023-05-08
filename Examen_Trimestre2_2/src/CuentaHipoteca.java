public class CuentaHipoteca extends CuentaBancaria{
    private float hipotecaMensual;

    public CuentaHipoteca(String dni, String nombre, String email, String telefono, String iban, float hipotecaMensual){
        super(dni, nombre, email, telefono, iban);
        this.hipotecaMensual = hipotecaMensual;
    }

    public void cobrarHipoteca(){saldo -= hipotecaMensual;}
}