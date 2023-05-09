package com.politecnicomalaga;

import java.util.ArrayList;
import java.util.HashMap;

public class Cliente {
    //atributos
    private String dni;
    private String cod_poliza;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String email;
    private String telf;
    private ArrayList<Incidencia> incidencias;



    //constructor
    public Cliente(String dni, String cod_poliza, String nombre, String apellidos, String direccion, String email, String telf) {
        this.dni = dni;
        this.cod_poliza = cod_poliza;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.email = email;
        this.telf = telf;
        this.incidencias = new ArrayList<>();
    }

    //metodos
    public void altaIncidenciaUrgente(String fecha, String hora, String matriculaPropia, String matriculaAjena, String descripcion, int diasMaximo, String codigoIncidencia){
        IncidenciaUrgente incidencia = new IncidenciaUrgente(fecha, hora, matriculaPropia, matriculaAjena, descripcion, diasMaximo, codigoIncidencia);
        incidencias.add(incidencia);
    }

    public void altaIncidenciaAjena(String fecha, String hora, String matriculaPropia, String matriculaAjena, String descripcion, String dniAjeno, String codigoIncidencia){
        IncidenciaAjena incidencia = new IncidenciaAjena(fecha, hora, matriculaPropia, matriculaAjena, descripcion, dniAjeno, codigoIncidencia);
        incidencias.add(incidencia);
    }

    public String[] listarIncidencias(){
        String[] listaIncidencias = new String[incidencias.size()];
        for(int i = 0; i < incidencias.size(); i++){
            listaIncidencias[i] = incidencias.get(i).toString();
        }
        return listaIncidencias;
    }

    public Incidencia borrarIncidencia(String codigoIncidencia){
        for(Incidencia incidencia : incidencias){
            incidencias.remove(incidencia);
        }
        return null;
    }

    public Boolean buscarIncidencias(){
        Boolean tenemosIncidencias=false;
        for(int i = 0; i < incidencias.size(); i++){
            tenemosIncidencias=true;
        }
        return tenemosIncidencias;
    }

    public String crearCodigoIncidencia(){
        String codigoIncidencia;
        codigoIncidencia = cod_poliza+"-"+incidencias.size()+1;
        return codigoIncidencia;
    }

    public String getDni() {
        return dni;
    }

    public void setCod_poliza(String cod_poliza) {
        this.cod_poliza = cod_poliza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dni='" + dni + '\'' +
                ", cod_poliza='" + cod_poliza + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", telf='" + telf + '\'' +
                '}';
    }
}