public class Operacion {
    private String fecha;
    private int hora;
    private String iban;
    private float cantidad;

    public Operacion(String fecha, int hora, String iban, float cantidad) {
        this.fecha = fecha;
        this.hora = hora;
        this.iban = iban;
        this.cantidad = cantidad;
    }
}