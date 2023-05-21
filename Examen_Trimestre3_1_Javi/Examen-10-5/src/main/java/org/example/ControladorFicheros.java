package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ControladorFicheros {
    public ControladorFicheros() {
    }

    static boolean grabarEquipoCSV(String fichero, Equipo e ){
        boolean estado =true;
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter("~/"+fichero, true));
            out.println(e.toString());
        }catch (Exception exception){
            estado = false;
        }finally {
            if (out != null){
                out.close();
            }
        }

        return estado;
    }

    static Equipo leerEquipoCSV(String fichero){
        Equipo e= null;
        String contenido="";
        Scanner in = null;

        try {
            in = new Scanner(new FileReader("~/"+fichero));
            while (in.hasNext()){
                contenido+=in.nextLine();
            }
            e = new Equipo(contenido);
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } finally {
            if(in!=null){
                in.close();
            }
        }

        return e;
    }
}
