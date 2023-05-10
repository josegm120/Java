import com.google.gson.Gson;

import java.io.*;
import java.util.Scanner;

public class ControladorFicheros {
    public static boolean grabarEquipoCSV(String sNombreFichero, Equipo e){
        FileWriter fileWriter;
        PrintWriter printWriter;

        try {
            fileWriter = new FileWriter(sNombreFichero);
            printWriter = new PrintWriter(fileWriter);
            printWriter.print(e);
            printWriter.flush();
            return true;
        } catch (IOException ex) {
            return false;
        }

    }

    public static Equipo leerEquipoCSV(String sNombreFichero) throws FileNotFoundException {
        StringBuilder text = new StringBuilder();
        FileReader fileReader;
        Scanner scanner;

        try {
            fileReader = new FileReader(sNombreFichero);
            scanner = new Scanner(fileReader);

            while (scanner.hasNext()) {
                text.append(scanner.nextLine()).append("\n");
            }

        } catch (FileNotFoundException e) {
            return null;
        }
        return null;
    }

}