package com.politecnicomalaga;

public class Incidencia {
    //atributos
    protected String fecha;
    protected String hora;
    protected String matriculaPropia;
    protected String matriculaAjena;
    protected String descripcion;
    protected String codigoIncidencia;

    //constructor
    public Incidencia(String fecha, String hora, String matriculaPropia, String matriculaAjena, String descripcion, String codigoIncidencia) {
        this.fecha = fecha;
        this.hora = hora;
        this.matriculaPropia = matriculaPropia;
        this.matriculaAjena = matriculaAjena;
        this.descripcion = descripcion;
        this.codigoIncidencia = codigoIncidencia;
    }

    //metodos

    @Override
    public String toString() {
        return "Incidencia{" +
                "fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", matriculaPropia='" + matriculaPropia + '\'' +
                ", matriculaAjena='" + matriculaAjena + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", codigoIncidencia='" + codigoIncidencia + '\'' +
                '}';
    }
}
