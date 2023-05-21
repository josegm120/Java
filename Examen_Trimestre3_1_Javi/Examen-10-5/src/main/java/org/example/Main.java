package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String teclado;
        int inum;
        Equipo e = new Equipo("Equipo", "ciudad", "email");

        e.addJugador("UNO", "apellidos", "UNO","email","telefono",2020,1, 0);
        e.addJugador("DOS", "apellidos", "DOS","email","telefono",2003,2, 0);
        e.addJugador("TRES", "apellidos", "TRES","email","telefono",1989,3, 0);
        e.addJugador("CUATRO", "apellidos", "CUATRO","email","telefono",2023,4, 0);
        e.addJugador("CINCO", "apellidos", "CINCO","email","telefono",1999,5, 0);

        e.addPortero("UNO", "apellidos", "UNO","email","telefono",2000,1, 0,0);
        e.addPortero("DOS", "apellidos", "UNO","email","telefono",2000,1, 0,0);

        System.out.println(e.jugadoresTitulares(true));
    }


}