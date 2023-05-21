import java.util.*;

public class Equipo {
    protected String nombre;
    protected int puntuacion;
    protected String ciudad;
    protected String email;
    protected boolean estaActivo;
    protected HashMap<String,Jugador> listaJugadores;
    protected Portero[] listaPorteros;

    //Constructor
    public Equipo(String nombre, int puntuacion, String ciudad, String email, boolean estaActivo) {
        this.nombre = nombre;
        this.puntuacion = 0;
        this.ciudad = ciudad;
        this.email = email;
        this.estaActivo = estaActivo;
        this.listaJugadores = new HashMap<String, Jugador>();
        this.listaPorteros = new Portero[2];
    }

    public Equipo(String sCadenaCSV){
        //Este metodo permite crear una lista que contiene cada equipo, y dentro decada equipo crea otras dos listas una que contine porteros
        //y otra que contine jugadores, para mostrarlos en mantalla como pide el ejercicio
        String[] atributos = sCadenaCSV.split(":")[1].split(";");
        if (atributos[0].equals("EQUIPO")) {
            this.nombre = atributos[1];
            this.puntuacion = Integer.parseInt(atributos[2]);
            this.ciudad = atributos[3];
            this.email = atributos[4];
            this.estaActivo = Boolean.parseBoolean(atributos[5]);
        }
        //Porteros
        this.listaPorteros = new Portero[2];
        String[] csvPorteros = sCadenaCSV.split("PORTERO");
        String csvPortero;
        for (int i = 1; i < csvPorteros.length; i++) {
            csvPortero = "Portero" + csvPorteros[i];
            Jugador jugador = new Jugador(csvPortero);
            listaJugadores.put(jugador.dni, jugador);
        }
        //Jugadores
        this.listaJugadores = new HashMap<>();
        String[] csvJugadores = sCadenaCSV.split("JUGADOR");
        String csvJugador;
        for (int i = 1; i < csvJugadores.length; i++) {
            csvJugador = "Jugador" + csvJugadores[i];
            Jugador jugador = new Jugador(csvJugador);
            listaJugadores.put(jugador.dni, jugador);
        }
    }

    //metodos
    public boolean addPortero(Portero p){
        for(int i=0; i<=listaPorteros.length; i++){

            if(listaPorteros[1]!=null&&listaPorteros[0]!=null){
                if(listaPorteros[i].getDni().equals(p.getDni())){

                } else if(listaPorteros[i].equals(null)){
                    listaPorteros[i] = p;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean addJugador(Jugador j){
        if(listaJugadores.containsKey(j.getDni())){
            return false;
        }else{
            listaJugadores.put(j.getDni(), j);
            return true;
        }
    }

    public boolean eliminaPortero(String dni){
        for(int i=0; i<=listaPorteros.length; i++){
            if(listaPorteros[i].getDni().equals(dni)){
                listaPorteros[i]=null;
                return true;
            }
        }
        return false;
    }

    public boolean eliminarJugador(String dni){
        if(listaJugadores.remove(dni)!=null){
            return true;
        }else{
            return false;
        }
    }

    public boolean isActivo(){
        if(listaJugadores.size()>=5&&listaPorteros[0]!=null||listaPorteros[1]!=null){
            return true;
        }else{
            return false;
        }
    }

    public ArrayList<Jugador> menoresEdad(){
        ArrayList<Jugador> Jugador = null;

        return Jugador;
    }

    public ArrayList<Jugador> jugadoresTitulares(){
        ArrayList<Jugador> Jugador = null;

        return Jugador;
    }

    public String toString() {
        StringBuilder sCadenaCSV;

        sCadenaCSV = new StringBuilder(String.format("EQUIPO:" +
                        "%10s;" +
                        "%3s;" +
                        "%10s;" +
                        "%20s;" +
                        "%10s\n",
                this.nombre,
                this.puntuacion,
                this.ciudad,
                this.email,
                this.estaActivo));
        return sCadenaCSV.toString();
    }

}
