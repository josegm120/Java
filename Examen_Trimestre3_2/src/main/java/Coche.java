public class Coche extends Vehiculo{
    private int pasajeros;
    public Coche(String marca, String modelo, String matricula, int kilometraje, float precio, boolean disponible, int pasajeros) {
        super(marca, modelo, matricula, "coche", kilometraje, precio, disponible);
        if(pasajeros>=2&&pasajeros<=7){
            this.pasajeros=pasajeros;
        }else{
            this.pasajeros=5;
        }
    }

    @Override
    public float facturaAlquiler(int kms) {
        float factura;
        if(pasajeros==6||pasajeros==7){
            factura = this.precio*kms;
            factura = factura + (factura*0.1f);
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
                this.pasajeros));
        return sCadenaCSV.toString();
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        if(pasajeros>=2&&pasajeros<=7){
            this.pasajeros=pasajeros;
        }
    }
}