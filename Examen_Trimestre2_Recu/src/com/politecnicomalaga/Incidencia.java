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
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMatriculaPropia() {
        return matriculaPropia;
    }

    public void setMatriculaPropia(String matriculaPropia) {
        this.matriculaPropia = matriculaPropia;
    }

    public String getMatriculaAjena() {
        return matriculaAjena;
    }

    public void setMatriculaAjena(String matriculaAjena) {
        this.matriculaAjena = matriculaAjena;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigoIncidencia() {
        return codigoIncidencia;
    }

    public void setCodigoIncidencia(String codigoIncidencia) {
        this.codigoIncidencia = codigoIncidencia;
    }

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
