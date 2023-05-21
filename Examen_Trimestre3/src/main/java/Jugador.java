import java.time.YearMonth;

public class Jugador {
    protected String nombre, apellidos, dni, email, telefono;
    protected int nacimiento, dorsal, goles;

    public Jugador(String nombre, String apellidos, String dni, String email, String telefono, int nacimiento, int dorsal, int goles) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
        this.nacimiento = nacimiento;

        if (goles >= 0) { //Si goles son mayor o igual a cero
            this.goles = goles;
        }

        if (dorsal >= 0 && dorsal <= 100) {
            this.dorsal = dorsal;
        } else {
            this.dorsal = 100;
        }
    }

    public Jugador(String sCadenaCSV) {

        String[] atributos = sCadenaCSV.split(":")[1].split(":");
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

    public boolean mayorEdad () {
        boolean mayor = true;
        int edad = (YearMonth.now().getYear()) - nacimiento;
        if (edad > 17) { //El jugador tiene más de 17 años
            mayor = true;
        } else {
            mayor = false;
        }
        return mayor;
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
        this.dorsal = dorsal;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
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
                            "%3s;\n",
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