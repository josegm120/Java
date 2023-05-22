import java.util.ArrayList;
import java.util.HashMap;

public class Equipo {
    private HashMap<String, Jugador> jugadores;
    private Portero[] porteros;
    private String nombre, ciudad, email;
    private int puntuacion;
    public Equipo(String nombre, String ciudad, String email) {
        this.jugadores = new HashMap<>();
        this.porteros = new Portero[2];
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.email = email;
        this.puntuacion = 0;
    }

    public Equipo(String sCadenaCSV) {
        Jugador j;
        Portero p;
        String head;
        String[] attributes;
        String[] lineas = sCadenaCSV.split("\n");

        this.jugadores = new HashMap<>();
        this.porteros = new Portero[2];

        for (int i = 0; i < lineas.length; i++) {
            lineas[i] = lineas[i].replaceAll("\n", "");
            head = lineas[i].split(":")[0];
            attributes = lineas[i].split(":")[1].split(";");

            switch (head) {
                case "EQUIPO":
                    this.nombre = attributes[0];
                    this.puntuacion = Integer.parseInt(attributes[1]);
                    this.ciudad = attributes[2];
                    this.email = attributes[3];
                    break;
                case "JUGADOR":
                    j = new Jugador(lineas[i]);
                    this.jugadores.put(j.getDni(), j);
                    break;
                case "PORTERO":
                    p = new Portero(lineas[i]);
                    for (int k = 0; k < this.porteros.length; k++) {

                        if (this.porteros[k] == null) {
                            this.porteros[k] = p;
                            break;
                        }
                        break;
                    }

            }
        }
    }

    public boolean addPortero(Portero p){
        for (int i=0; i<porteros.length; i++){
            if(porteros[i] == null && !porteros[i].getDni().equals(p.getDni())){
                porteros[i] =p;
                return true;
            }
        }
        return false;
    }

    public boolean addJugador(Jugador j){
        if((jugadores.get(j.getDni()) == null)){
            jugadores.put(j.dni, j);
            return true;
        }
        return false;
    }

    public boolean eliminaPortero(String dni){
       for(int k=0; k<porteros.length;k++){
           if((porteros[k].getDni())==dni){
               porteros[k] = null;
               return true;
           }
       }
       return false;
    }

    public boolean eliminaJugador(String dni){
        if ((jugadores.get(dni))==null){
            return false;
        }else{
            jugadores.remove(dni);
            return true;
        }
    }

    public boolean isActivo(){
        int contadorP = 0;
        for(int i=0; i<porteros.length; i++){
            if(porteros[i]!=null){
                contadorP++;
            }
        }

        if((jugadores.values().size())>=5&&contadorP>=1){
            return true;
        }else {
            return false;
        }
    }

    public ArrayList<Jugador> menoresEdad(){
        ArrayList<Jugador> menores = new ArrayList<>();
        ArrayList<Jugador> jugadores = new ArrayList<>(this.jugadores.values());

        for (int i=0; i<porteros.length; i++){
            if(!porteros[i].mayorEdad()){
                menores.add(porteros[i]);
            }
        }

        for(Jugador jugador: jugadores){
            if(!jugador.mayorEdad()){
                menores.add(jugador);
            }
        }

        menores.sort(new compararJugadores());

        return menores;
    }

    public ArrayList<Jugador> jugadoresTitulares(){
        ArrayList<Jugador> titulares = new ArrayList<>();
        ArrayList<Jugador> jugadores = new ArrayList<>(this.jugadores.values());

        if(porteros[0]!=null||porteros[1]!=null){
            if(porteros[0].golesEncajados<porteros[1].golesEncajados){
                titulares.add(porteros[0]);
            }else if (porteros[0].golesEncajados>porteros[1].golesEncajados){
                titulares.add(porteros[1]);
            }
        }

        jugadores.sort(new compararGoles());

        for (int i=0; i<jugadores.size()||i<=5; i++){
            titulares.add(jugadores.get(i));
        }

        return titulares;

    }

}