public class Fasta {
    private String cadena;
    private String gen;

    public Fasta(String cadena, String gen) {
        this.cadena = cadena;
        this.gen = gen;
    }

    public void comprobarGen(){
        int cadenaLongitud = this.cadena.length();
        int genLongitud = this.gen.length();

        for(int i = 0; i < cadenaLongitud-genLongitud; i++){
            for (int j = 0; j < genLongitud; j++){

            }
        }

    }

}
