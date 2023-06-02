import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControladorVehiculos {
    public static int leerDeFichero(String filename, Flota miFlota) throws IOException {
        String text;
        FileReader fileReader = null;
        Scanner scanner;
        int lineas = 0;
        try {
            scanner = new Scanner(fileReader);
            fileReader = new FileReader(filename);

            while (scanner.hasNext()) {
                text=scanner.nextLine();
                String[] linea = text.split(":");
                String[] attributes = text.split(":")[1].split(";");
                if(attributes.length==8 && linea.length==2){
                    Vehiculo v = miFlota.crearVehiculo(attributes, attributes[3]);
                    miFlota.putVehiculo(v);
                    lineas++;
                }else{

                }
            }
            fileReader.close();
            fileReader = null;
        } catch (Exception e) {

        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }

        return lineas;
    }

    public static void grabarAFichero(String filename, Flota miFlota) throws IOException {
        FileWriter fileWriter = null;
        PrintWriter printWriter;
        boolean continuar=true;

        try {
            fileWriter = new FileWriter(filename);
            printWriter = new PrintWriter(fileWriter);
            while (continuar){
                ArrayList<Vehiculo> lista = new ArrayList<>(miFlota.vehiculos.values());
                for(int i=0; i<lista.size(); i++){
                    printWriter.println(lista.get(i).toString());
                }
                continuar=false;
            }
            printWriter.flush();
            fileWriter.close();
            fileWriter = null;
        } catch (Exception e) {

        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }
}