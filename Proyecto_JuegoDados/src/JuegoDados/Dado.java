package JuegoDados;

import java.util.Random;

public class Dado {

    int numero;
    boolean seises;
    Random aleatorio = new Random();

    public Dado(){
        this.numero=0;
        this.seises=false;
    }

    public int lanzarDado() {
        numero = aleatorio.nextInt(6)+1;
        if (numero==6){
            this.seises = true;
        }
        return numero;
    }
    public boolean getseises(){
        return seises;
    }

}