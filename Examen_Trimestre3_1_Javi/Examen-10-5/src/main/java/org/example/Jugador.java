package org.example;

import java.time.YearMonth;

public class Jugador {
     protected String nombre, apellidos, dni, email, telefono;
     protected int nacimiento, dorsal, goles;

    public Jugador(String sCadenaCSV) {


    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public int getDorsal() {
        return dorsal;
    }

    public int getGoles() {
        return goles;
    }


    @Override
    public String toString() {
        return String.format("JUGADOR:%15s;%30s;%9s;%30s;%9s;%i;%i;%i;", nombre, apellidos, dni,email, telefono, nacimiento, dorsal, goles);
    }

    public boolean mayorEdad(){
        boolean mayor =true;
        int edad= (YearMonth.now().getYear())-nacimiento;
        if(edad>17){ //El jugador tiene más de 17 años
            mayor=true;
        }else {
            mayor=false;
        }

        return mayor;
    }

    public Jugador(String nombre, String apellidos, String dni, String email, String telefono, int nacimiento, int dorsal, int goles) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
        this.nacimiento = nacimiento;

        if(goles>=0 ){ //Si goles son mayor o igual a cero
            this.goles = goles;
        }else {
            this.goles=0;
        }

        if(dorsal>=0&&dorsal<=100){
            this.dorsal=dorsal;
        }else {
            this.dorsal=100;
        }


    }
}

