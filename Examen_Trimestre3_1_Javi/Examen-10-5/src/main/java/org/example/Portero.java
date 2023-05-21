package org.example;

public class Portero extends Jugador{
    int golesEncajados;
    public Portero(String nombre, String apellidos, String dni, String email, String telefono, int nacimiento, int dorsal, int goles, int golesEncajados) {
        super(nombre, apellidos, dni, email, telefono, nacimiento, dorsal, goles);
        this.golesEncajados=golesEncajados;
    }

    public Portero(String sCadenaCSV) {
        super(sCadenaCSV);
    }

    public int getGolesEncajados() {
        return golesEncajados;
    }

    public void setGolesEncajados(int MasGolesEncajados) {
        golesEncajados = golesEncajados + MasGolesEncajados;
    }
    @Override
    public String toString() {
        return String.format("PORTERO:%15s;%30s;%9s;%30s;%9s;%i;%i;%i;%i;", nombre, apellidos, dni,email, telefono, nacimiento, dorsal, goles, golesEncajados);
    }
}
