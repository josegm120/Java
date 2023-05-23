import java.util.ArrayList;
import java.util.HashMap;

public class Flota {
    private String nombreGerente, dniGerente, emailGerente;
    protected HashMap<String, Vehiculo> vehiculos;

    public Flota(String nombreGerente, String dniGerente, String emailGerente) {
        this.nombreGerente = nombreGerente;
        this.dniGerente = dniGerente;
        this.emailGerente = emailGerente;
        this.vehiculos = new HashMap<>();
    }

    public Moto[] motosDisponibles(){
        ArrayList<Vehiculo> listavehiculos = new ArrayList<>(vehiculos.values());
        ArrayList<Moto> motosLista = new ArrayList<>();

        for(int i = 0;i<listavehiculos.size();i++){
            if(listavehiculos.get(i).disponible && listavehiculos.get(i).getTipo().equals("moto")){
                motosLista.add((Moto) listavehiculos.get(i));
            }
        }
        motosLista.sort(new CompararMotos());
        Moto[] motos = new Moto[motosLista.size()];
        for(int i = 0;i<motosLista.size();i++){
            motos[i] = motosLista.get(i);
        }
        return motos;
    }

    public Coche[] cochesDisponibles(){
        ArrayList<Vehiculo> listavehiculos = new ArrayList<>(vehiculos.values());
        ArrayList<Coche> cochesLista = new ArrayList<>();

        for(int i = 0;i<listavehiculos.size();i++){
            if(listavehiculos.get(i).disponible && listavehiculos.get(i).getTipo().equals("coche")){
                cochesLista.add((Coche) listavehiculos.get(i));
            }
        }
        cochesLista.sort(new CompararPrecio());
        Coche[] coches = new Coche[cochesLista.size()];
        for(int i = 0;i<cochesLista.size();i++){
            coches[i] = cochesLista.get(i);
        }
        return coches;
    }

    public Camioneta[] camionetasDisponibles(){
        ArrayList<Vehiculo> listavehiculos = new ArrayList<>(vehiculos.values());
        ArrayList<Camioneta> camionetasLista = new ArrayList<>();

        for(int i = 0;i<listavehiculos.size();i++){
            if(listavehiculos.get(i).disponible && listavehiculos.get(i).getTipo().equals("camioneta")){
                camionetasLista.add((Camioneta) listavehiculos.get(i));
            }
        }
        camionetasLista.sort(new ComparaPesoMaximo());
        Camioneta[] camionetas = new Camioneta[camionetasLista.size()];
        for(int i = 0;i<camionetasLista.size();i++){
            camionetas[i] = camionetasLista.get(i);
        }
        return camionetas;
    }

    public Autocaravana[] autocaravanasDisponibles(){
        ArrayList<Vehiculo> listavehiculos = new ArrayList<>(vehiculos.values());
        ArrayList<Autocaravana> autocaravanasaDisponibles = new ArrayList<>();

        for(int i = 0;i<listavehiculos.size();i++){
            if(listavehiculos.get(i).disponible && listavehiculos.get(i).getTipo().equals("autocaravana")){
                autocaravanasaDisponibles.add((Autocaravana) listavehiculos.get(i));
            }
        }
        autocaravanasaDisponibles.sort(new CompararCamasDisponibles());
        Autocaravana[] autocaravanas = new Autocaravana[autocaravanasaDisponibles.size()];
        for(int i = 0;i<autocaravanasaDisponibles.size();i++){
            autocaravanas[i] = autocaravanasaDisponibles.get(i);
        }
        return autocaravanas;
    }

    public Vehiculo crearVehiculo(String[] datosAtributos, String tipo) throws Exception {
        String atributo = datosAtributos[0];
        String atributo1 = datosAtributos[1];
        String atributo2 = datosAtributos[2];
        int atributo3 = Integer.parseInt(datosAtributos[3]);
        float atributo4 = Float.parseFloat(datosAtributos[4]);
        boolean atributo5 = Boolean.parseBoolean(datosAtributos[5]);
        int atributo6 = Integer.parseInt(datosAtributos[6]);
        switch(tipo){
            case "moto":
                return new Moto(atributo, atributo1, atributo2, atributo3, atributo4, atributo5, atributo6);
            case "coche":
                return new Coche(atributo, atributo1, atributo2, atributo3, atributo4, atributo5, atributo6);
            case "camioneta":
                return new Camioneta(atributo, atributo1, atributo2, atributo3, atributo4, atributo5, atributo6);
            case "autocaravana":
                return new Autocaravana(atributo, atributo1, atributo2, atributo3, atributo4, atributo5, atributo6);
        }
        return null;
    }

    public void putVehiculo(Vehiculo v){
        //ya que si existía antes reemplaza la vieja con la nueva automaticamente
        vehiculos.put(v.getMatricula(), v);
    }

    public float facturarVehiculo(String matricula, int kms){
        //En caso de pasar un dato negativo retorna 0, ya que no cambia el kilometraje, debido a las condiciones de el setKilometraje, pero permito
        //que realice el metodo con 0 por si se pretende facturar un vehiculo que no ha recorrido distancia por la razon que sea, no prodría
        //poner disponible ese vehículo
        if(kms>=0){
            vehiculos.get(matricula).setKilometraje(kms);
            vehiculos.get(matricula).setDisponible(true);
            return vehiculos.get(matricula).facturaAlquiler(vehiculos.get(matricula).getKilometraje());
        }else{
            return 0;
        }
    }

    public boolean alquilarVehiculo(String matricula){
        if(vehiculos.get(matricula)==null){
            return false;
        }else{
            vehiculos.get(matricula).setDisponible(false);
            return true;
        }
    }

    @Override
    public String toString() {
        StringBuilder sCadenaCSV;

        sCadenaCSV = new StringBuilder(String.format(
                        "%s;" +
                        "%s;" +
                        "%s\n",
                this.nombreGerente,
                this.dniGerente,
                this.emailGerente));
        return sCadenaCSV.toString();
    }

    public String getNombreGerente() {
        return nombreGerente;
    }

    public void setNombreGerente(String nombreGerente) {
        this.nombreGerente = nombreGerente;
    }

    public String getDniGerente() {
        return dniGerente;
    }

    public void setDniGerente(String dniGerente) {
        this.dniGerente = dniGerente;
    }

    public String getEmailGerente() {
        return emailGerente;
    }

    public void setEmailGerente(String emailGerente) {
        this.emailGerente = emailGerente;
    }
}
