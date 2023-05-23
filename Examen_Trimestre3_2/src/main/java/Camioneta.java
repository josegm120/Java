public class Camioneta extends Vehiculo{
    private int pesoMaximo;
    public Camioneta(String marca, String modelo, String matricula, int kilometraje, float precio, boolean disponible, int pesoMaximo){
        super(marca, modelo, matricula, "camioneta", kilometraje, precio, disponible);
        try{
            if(pesoMaximo>=3500&&pesoMaximo<=7500){
                this.pesoMaximo=pesoMaximo;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public float facturaAlquiler(int kms) {
        float factura;
        if(pesoMaximo>=5000){
            factura = this.precio*kms;
            factura = factura + (factura*0.3f);
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
                this.pesoMaximo));
        return sCadenaCSV.toString();
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(int pesoMaximo) {
        if(pesoMaximo>=3500&&pesoMaximo<=7500){
            this.pesoMaximo=pesoMaximo;
        }
    }
}
