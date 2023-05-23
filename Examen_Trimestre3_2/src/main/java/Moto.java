public class Moto extends Vehiculo{

    private int cilindrada;

    public Moto(String marca, String modelo, String matricula, int kilometraje, float precio, boolean disponible, int cilindrada) {
        super(marca, modelo, matricula, "moto", kilometraje, precio, disponible);
        this.cilindrada = cilindrada;
    }

    @Override
    public float facturaAlquiler(int kms) {
        float factura;
        if(cilindrada>=500){
            factura = this.precio*kms;
            factura = factura + (factura*0.2f);
        }else{
            factura = this.precio*kms;
        }
        return factura;
    }

    @Override
    public String toString() {
        StringBuilder sCadenaCSV;

        sCadenaCSV = new StringBuilder(String.format("VEHICULO:" +
                        "%s;" +
                        "%s;" +
                        "%s;" +
                        "%s;" +
                        "%s;" +
                        "%s;" +
                        "%s;" +
                        "%s\n",
                this.marca,
                this.modelo,
                this.kilometraje,
                this.matricula,
                this.precio,
                this.disponible,
                this.tipo,
                this.cilindrada));
        return sCadenaCSV.toString();
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}