package com.politecnicomalaga;

public class IncidenciaUrgente extends Incidencia{
    private int diasMaximo;
    public IncidenciaUrgente(String fecha, String hora, String matriculaPropia, String matriculaAjena, String descripcion, int diasMaximo, String codigoIncidencia) {
        super(fecha, hora, matriculaPropia, matriculaAjena, descripcion, codigoIncidencia);
        this.diasMaximo = diasMaximo;
    }
}
