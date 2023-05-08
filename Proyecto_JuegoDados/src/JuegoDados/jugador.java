package JuegoDados;

import java.util.ArrayList;


public class jugador {

    ArrayList<jugador> empates = new ArrayList<jugador>();
    Dado dado = new Dado();
    Dado dado2 = new Dado();
    int puntuacion;
    byte seises;
    int id;
    boolean empate;


    public jugador(int id){
        puntuacion = 0;
        seises=0;
        empate=false;
        this.id=id;
    }
    public int turno(){
        puntuacion = puntuacion + dado.lanzarDado();
        if(dado.getseises()==true){
            seises++;
        }
        puntuacion = puntuacion + dado2.lanzarDado();
        if(dado2.getseises()==true){
            seises++;
        }
        return puntuacion;
    }
    public int getseises(){
        return seises;
    }
    public int getpuntuacion(){
        return puntuacion;
    }
    public boolean getempate(){
        return empate;
    }
    public void setempate(boolean empate){
        this.empate=empate;
    }
    public int getid(){
        return id;
    }

    public void haganado(ArrayList<jugador> jugadores){
        if (jugadores.size() > 1) {
            for (int i = 0; i < jugadores.size(); i++) {
                if (jugadores.size() == 1) {
                    break;
                } else {
                    if (jugadores.get(i).getpuntuacion() < jugadores.get(i + 1).getpuntuacion()) {
                        jugadores.remove(i);
                        i -= 1;
                        empates.removeAll(empates);

                    } else if (jugadores.get(i).getpuntuacion() > jugadores.get(i + 1).getpuntuacion()) {
                        jugadores.remove(i + 1);
                        i -= 1;
                    } else if (jugadores.get(i).getpuntuacion() == jugadores.get(i + 1).getpuntuacion()) {
                        if (empates.size() > 1) {
                            if (empates.contains(jugadores.get(i))==true) {
                                empates.add(jugadores.get(i + 1));
                            } else {
                                empates.add(jugadores.get(i));
                                empates.add(jugadores.get(i + 1));
                            }
                        } else {
                            empates.add(jugadores.get(i));
                            empates.add(jugadores.get(i + 1));
                        }

                        jugadores.remove(i);
                        i -= 1;
                    }
                }

            }
        }
    }
    public void anuncioGanador(ArrayList<jugador> jugadores){
        if (jugadores.size() == 1 && empates.size() < 1) {
            System.out.println("Ganador: Jugador" + jugadores.get(0).getid() + ". Con " + jugadores.get(0).getseises() + " seis y con una puntuacion de " + jugadores.get(0).getpuntuacion()+" puntos");
        } else if (empates.size() > 1) {
            System.out.print("Los jugadores: ");
            for (int i = 0; i < empates.size(); i++) {
                System.out.print(empates.get(i).getid() + ",");
            }
            System.out.print(" han quedado empate con 1 seis y " + jugadores.get(0).getpuntuacion()+ " puntos");
        }
    }
}