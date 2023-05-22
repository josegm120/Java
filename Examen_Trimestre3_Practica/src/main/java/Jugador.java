import java.time.YearMonth;

public class Jugador {
    String nombre, apellidos, dni, email, telefono;
    int nacimiento, dorsal, goles;

    public Jugador(String nombre, String apellidos, String dni, String email, String telefono, int nacimiento, int dorsal, int goles) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
        this.nacimiento = nacimiento;
        if (dorsal>=1 && dorsal<=99){
            this.dorsal = dorsal;
        }
        if(goles>=0){
            this.goles = goles;
        }
    }

    public Jugador(String sCadenaCSV){
        String[] atributos = sCadenaCSV.split(":")[1].split(";");
        if (atributos[0].equals("JUGADOR") || atributos[0].equals("PORTERO")) {
            this.nombre = atributos[1];
            this.apellidos = atributos[2];
            this.dni = atributos[3];
            this.email = atributos[4];
            this.telefono = atributos[5];
            this.nacimiento = Integer.parseInt(atributos[6]);
            this.goles = Integer.parseInt(atributos[7]);
            this.dorsal = Integer.parseInt(atributos[8]);
        }
    }

    public boolean mayorEdad(){
        int añoActual = YearMonth.now().getYear();
        if((añoActual-17) > nacimiento){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public String toString() {
        StringBuilder sCadenaCSV;

        sCadenaCSV = new StringBuilder(String.format("JUGADOR:" +
                        "%s;" +
                        "%s;" +
                        "%s;" +
                        "%s;" +
                        "%s;" +
                        "%d;" +
                        "%d;" +
                        "%d;\n",
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

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        if (dorsal>=1 && dorsal<=99){
            this.dorsal = dorsal;
        }
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        if(goles>=0){
            this.goles = goles;
        }
    }
}
