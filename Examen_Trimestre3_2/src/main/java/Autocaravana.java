public class Autocaravana extends Vehiculo{
    private int camasDisponibles;
    public Autocaravana(String marca, String modelo, String matricula, int kilometraje, float precio, boolean disponible, int camasDisponibles){
        super(marca, modelo, matricula, "autocaravana", kilometraje, precio, disponible);
        try{
            if(camasDisponibles>=1&&camasDisponibles<=6){
                this.camasDisponibles=camasDisponibles;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public float facturaAlquiler(int kms) {
        float factura;
        if(camasDisponibles>=5){
            factura = this.precio*kms;
            factura = factura + (factura*0.15f);
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
                this.camasDisponibles));
        return sCadenaCSV.toString();
    }

    public int getCamasDisponibles() {
        return camasDisponibles;
    }

    public void setCamasDisponibles(int camasDisponibles) {
        if(camasDisponibles>=1&&camasDisponibles<=6){
            this.camasDisponibles=camasDisponibles;
        }
    }
}
