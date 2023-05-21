package org.example;


import java.util.ArrayList;
import java.util.HashMap;

public class Equipo {
    String nombre, ciudadOrg, email;
    int puntacion;
    HashMap<String,Jugador> lJugadores;
    ArrayList<Jugador> Ljugador;
    Portero [] lPorteros;

    public Equipo(String nombre, String ciudadOrg, String email) {
        this.nombre = nombre;
        this.ciudadOrg = ciudadOrg;
        this.email = email;
        puntacion=0;
        lJugadores = new HashMap<>();
        lPorteros = new Portero[2];
        Ljugador = new ArrayList<>();
    }

    public Equipo(String sCadenaCSV) {

    }

    public boolean addJugador(String nombre, String apellidos, String dni, String email, String telefono, int nacimiento, int dorsal, int goles){
        /*NOTA: En el metodo menoresEdad() se explica el porque de crear tambien un arrayList*/
        boolean estado=true;

        try{
            this.lJugadores.put(dni,new Jugador(nombre,apellidos,dni,email,telefono,nacimiento,dorsal,goles));
            this.Ljugador.add(new Jugador(nombre,apellidos,dni,email,telefono,nacimiento,dorsal,goles));
        }catch (Exception e){
            estado=false;
        }

        return estado;
    }
    public boolean addPortero(String nombre, String apellidos, String dni, String email, String telefono, int nacimiento, int dorsal, int goles, int golesEncajados){
        boolean estado=true;

        try {
            if(lPorteros[0]==null){ //Si no hay portero 1
                this.lPorteros[0]= new Portero(nombre,apellidos,dni,email,telefono,nacimiento,dorsal,goles,golesEncajados);
            } else if (lPorteros[1]==null) { //Si no hay portero 2
                this.lPorteros[1]= new Portero(nombre,apellidos,dni,email,telefono,nacimiento,dorsal,goles,golesEncajados);
            } else {
                estado=false;
            }
        }catch (Exception e){
            estado = false;
        }

        return estado;
    }
    public boolean isActivo(){
        boolean activo=true;

        if (lPorteros.length>=1){ //Tenemos al menos un portero
            if (lJugadores.size()>=5){ //Tenemos al menos 5 jugadores
                activo=true;
            }else {
                activo=false;
            }
        }else {
            activo=false;
        }

        return activo;
    }
    public ArrayList<Jugador> menoresEdad(){
        ArrayList<Jugador> lMenores = new ArrayList<>();

        for (int i=0; i > lPorteros.length; i++){
            boolean menor= lPorteros[i].mayorEdad();
            if(!menor){ //Si retorna false significa que es menor
                lMenores.add(lPorteros[i]);
            }
        }
        for (int i=0; i > Ljugador.size(); i++){ /*NOTA: No se como ir mirando de uno en uno
        en un hashmap por eso tambien se ha creado un arraylist con todos los jugadores*/

            if(!Ljugador.get(i).mayorEdad()){ //Si retorna false significa que es menor
                lMenores.add(Ljugador.get(i));
            }
        }

        return lMenores;
    }
    public ArrayList<Jugador> jugadoresTitulares(boolean activo){
        ArrayList<Jugador> lTitular = new ArrayList<>();
        ArrayList<Jugador> todosJugadores = new ArrayList<>();
        int goleador=0;

        if(activo) { //Si el equipo esta activo tendran la lista con los titulares, si no la lista estara vacia.
            for (int i = 0; i < lJugadores.size(); i++) {
                String nombre = lJugadores.get(i).getNombre();
                String apellidos = lJugadores.get(i).getApellidos();
                String dni = lJugadores.get(i).getDni();
                String email = lJugadores.get(i).getEmail();
                String telf = lJugadores.get(i).getTelefono();
                int nac = lJugadores.get(i).getNacimiento();
                int dorsal = lJugadores.get(i).getDorsal();
                int gol = lJugadores.get(i).getGoles();
                todosJugadores.add(new Jugador(nombre, apellidos, dni, email, telf, nac, dorsal, gol));
            }

            if (lPorteros.length == 2) { //Significa que tenemos a dos porteros en el equipo
                if (lPorteros[0].getGolesEncajados() > lPorteros[1].getGolesEncajados()) { //El 2 portero > golesencajados
                    lTitular.add(lPorteros[1]);
                } else {
                    lTitular.add(lPorteros[0]);
                }
            }

            for (int i = 0; i < 5; i++) { //Para meter a 5 jugadores

                for (int e = 0; e < todosJugadores.size(); e++) {
                    if (todosJugadores.get(goleador).getGoles() < todosJugadores.get(e).getGoles()) {
                        goleador = e;
                    }
                }
                lTitular.add(todosJugadores.get(goleador));
                todosJugadores.remove(goleador);
            }

        }
        return lTitular;
    }

    public boolean eliminarJugador(String dni){
        boolean estado=true;

        try{
            lJugadores.remove(dni);
        }catch (Exception e){
            estado=false;
        }
        return estado;
    }

    @Override
    public String toString() {
        String CSV="";
        CSV += String.format("EQUIPO:%20s;%i;%30s;%30s;",nombre,puntacion, ciudadOrg,email);
        CSV += "/n";
        for (int i=0; i< lPorteros.length;i++){
            CSV += lPorteros[i].toString();
            CSV += "/n";
        }
        for (int i=0; i< Ljugador.size(); i++){
            CSV += Ljugador.get(i).toString();
            CSV += "/n";
        }
        return CSV;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudadOrg() {
        return ciudadOrg;
    }

    public void setCiudadOrg(String ciudadOrg) {
        this.ciudadOrg = ciudadOrg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPuntacion() {
        return puntacion;
    }

    public void setPuntacion(int puntacion) {
        this.puntacion = puntacion;
    }
}
