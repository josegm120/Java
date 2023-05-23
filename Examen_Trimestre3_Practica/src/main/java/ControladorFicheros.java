import java.io.*;
import java.util.Scanner;

public class ControladorFicheros {
    public boolean grabarEquipoCSV(String sNombreFichero, Equipo e){
        FileWriter fileWriter = null;
        PrintWriter printWriter;
        boolean correcto;

        try {
            fileWriter = new FileWriter(sNombreFichero);
            printWriter = new PrintWriter(fileWriter);
            printWriter.print(e.toString());
            printWriter.flush();
            fileWriter.close();
            fileWriter = null;
            correcto = true;
        } catch (IOException ex) {
            correcto = false;
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException ex) {
                    correcto = false;
                }
            }
        }
        return correcto;
    }

    public Equipo leerEquipoCSV(String sNombreFichero) throws IOException {
        StringBuilder text = new StringBuilder();
        FileReader fileReader = null;
        Scanner scanner;

        try {
            scanner = new Scanner(fileReader);
            fileReader = new FileReader(sNombreFichero);

            while (scanner.hasNext()) {
                text.append(scanner.nextLine()).append("\n");
            }

            fileReader.close();
            fileReader = null;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }

        return new Equipo(text.toString());
    }

}
