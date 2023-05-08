package JuegoDados;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        jugador jugar = new jugador(999999); // la id = 999999 esta reservada para el controlador de jugador
        ArrayList<jugador> cantjugadores = new ArrayList<jugador>();
        ArrayList<jugador> jugadores0 = new ArrayList<jugador>();
        ArrayList<jugador> jugadores1 = new ArrayList<jugador>();
        ArrayList<jugador> jugadores2 = new ArrayList<jugador>();

        System.out.println("Cuantos jugadores hay?: ");
        int as = scan.nextInt();
        for (int i = 1; i <= as; i++) {
            jugador z = new jugador(i);
            cantjugadores.add(z);
        }

        for (int i = 1; i <= as; i++) {
            jugador z = new jugador(i);
            cantjugadores.add(z);
        }

        for (int i = 0; i < cantjugadores.size(); i++) {
            cantjugadores.get(i).turno();
        }

        for (int i = 0; i < cantjugadores.size(); i++) {
            if (cantjugadores.get(i).getseises() == 0) {
                jugadores0.add(cantjugadores.get(i));
            } else if (cantjugadores.get(i).getseises() == 1) {
                jugadores1.add(cantjugadores.get(i));
            } else if (cantjugadores.get(i).getseises() == 2) {
                jugadores2.add(cantjugadores.get(i));
            }
        }
        if (!jugadores2.isEmpty()) {
            if (jugadores2.size() > 1) {
                System.out.print("Los jugadores: " + jugadores2.get(0).getid());
                for (int i = 1; i < jugadores2.size(); i++) {
                    System.out.print(" , " + jugadores2.get(i).getid());
                }
                System.out.print(" han quedado empate con 2 seis");
            } else {
                System.out.println("El jugador: " + jugadores2.get(0).getid() + " ha ganado con 2 seis");
            }
        } else if (!jugadores1.isEmpty()) {
            jugar.haganado(jugadores1);
            jugar.anuncioGanador(jugadores1);

        } else if (!jugadores0.isEmpty()) {
            jugar.haganado(jugadores0);
            jugar.anuncioGanador(jugadores0);
        }

    }

}
