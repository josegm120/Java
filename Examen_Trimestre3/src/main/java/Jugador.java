import java.time.YearMonth;
import java.util.LinkedList;

public class Jugador {
    //Atributos
    protected String nombre;
    protected String apellidos;
    protected String dni;
    protected String email;
    protected String telefono;
    protected Integer nacimiento;
    protected int dorsal;
    protected int goles;

    //Constructor
    public Jugador(String nombre, String apellidos, String dni, String email, String telefono, Integer nacimiento, int dorsal, int goles) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
        this.nacimiento = nacimiento;
        this.dorsal = dorsal;
        this.goles = goles;
    }

    //Constructor csv
    public Jugador(String sCadenaCSV){
        //Este metodo permite crear una lista que contiene cada jugador con sus atributos, haciando una lista que en cada fila tenga un jugador
        //y en cada fila almacena en otra lista los atributos del jugador
        String[] lineas = sCadenaCSV.split("\n");
        String[] atributos = lineas[0].split(";");
        if (atributos[0].equals("JUGADOR")) {
            this.nombre = atributos[1];
            this.apellidos = atributos[2];
            this.dni = atributos[3];
            this.email = atributos[4];
            this.telefono = atributos[5];
            this.nacimiento = Integer.parseInt(atributos[6]);
            this.dorsal = Integer.parseInt(atributos[7]);
            this.goles = Integer.parseInt(atributos[8]);
        }
    }

    //Setters y Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Integer nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        //En este setter compruebo que me den valores válidos
        if(dorsal<1||dorsal>9){
            this.dorsal = 100;
        }else{
            this.dorsal = dorsal;
        }
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        //En este motodo set goles compruebo que me den un valor válido y luego le sumo a los goles ya definidos los goles que me dan
        if(goles<0){
            this.goles = 0;
        }else{
            this.goles += goles;
        }

    }

    public boolean mayorEdad(){
        //Tomo el año actual con la clase yearmonth le resto 17 para que al comprobar con la variable nacimiento
        // me da si tiene 17 años o no
        Integer year = YearMonth.now().getYear();

        year -= 17;

        if(this.nacimiento <= year){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder sCadenaCSV;

        sCadenaCSV = new StringBuilder(String.format("JUGADOR:" +
                        "%10s;" +
                        "%20s;" +
                        "%9s;" +
                        "%20s;" +
                        "%9s;" +
                        "%4s;" +
                        "%3s;" +
                        "%3s\n",
                this.nombre,
                this.apellidos,
                this.dni,
                this.email,
                this.telefono,
                this.nacimiento,
                this.dorsal,
                this.goles));
        return sCadenaCSV.toString();
    }
}