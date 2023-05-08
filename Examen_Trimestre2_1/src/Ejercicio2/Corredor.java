import java.util.ArrayList;
import java.util.List;

public class Corredor {
    private String nombre;
    private String apellidos;
    private String dni;
    private String telf;
    private String email;
    List<Carrera> carreras = new ArrayList<>();;

    public Corredor(String nombre, String apellidos, String dni, String telf, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telf = telf;
        this.email = email;
    }

    public String getNombre() {return nombre;}

    public String getApellidos() {return apellidos;}

    public String getDni() {return dni;}

    public String getTelf() {return telf;}

    public String getEmail() {return email;}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean addCarrera(String codigo, int distancia, int tiempo, byte pendienteMedia, int dorsal){
        if(codigo == null||codigo==""||pendienteMedia<0||pendienteMedia>10||dorsal<100||dorsal>999){
            System.out.println("Parametros no válidos");
            return false;
        }
        Carrera carrera = new Carrera(codigo, distancia, tiempo, pendienteMedia, dorsal);
        carreras.add(carrera);
        return true;
    }

    public String[] mostrarCarreras(){
        String[] listaCarreras = new String[carreras.size()];
        for(int i = 0; i < carreras.size(); i++){
            listaCarreras[i] = carreras.get(i).toString();
        }
        return listaCarreras;
    }

    public Carrera buscarCarrera(String codigo){
        for(Carrera carrera : carreras){
            if(carrera.getCodigo().equals(codigo)){
                return carrera;
            }
        }
        return null;
    }
}
