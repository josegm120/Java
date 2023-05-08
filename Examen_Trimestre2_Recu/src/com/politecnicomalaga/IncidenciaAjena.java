package com.politecnicomalaga;

public class IncidenciaAjena extends Incidencia{
    private String dniConductor;
    public IncidenciaAjena(String fecha, String hora, String matriculaPropia, String matriculaAjena, String descripcion, String dniConductor, String codigoIncidencia) {
        super(fecha, hora, matriculaPropia, matriculaAjena, descripcion, codigoIncidencia);
        this.dniConductor = dniConductor;
    }
}
