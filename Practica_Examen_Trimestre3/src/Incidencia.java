public class Incidencia {

    //Atributos
    protected String fechaIncidencia;
    protected int hora;
    protected String matriculaPropia;
    protected String matriculaAjena;
    protected String descripcion;
    protected String codIncidencia;

    //Constructor


    public Incidencia(String fechaIncidencia, int hora, String matriculaPropia, String matriculaAjena, String descripcion, String codIncidencia) {
        this.fechaIncidencia = fechaIncidencia;
        this.hora = hora;
        this.matriculaPropia = matriculaPropia;
        this.matriculaAjena = matriculaAjena;
        this.descripcion = descripcion;
        this.codIncidencia = codIncidencia;
    }
}
