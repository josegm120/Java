import java.util.Scanner;

public class MainAtletismo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Corredor corredor1 = new Corredor("Pako", "Gonzalez Gomez", "6753763G", "7657637653", "ytdjycyjtyx@gmail.com");

        boolean continuar = true;
        String resp = "";

        do{
            System.out.println("Gestión de carreras\n" +
                    "0. Salir\n" +
                    "1. Añadir/Modificar datos corredor.\n" +
                    "2. Añadir carrera.\n" +
                    "3. Mostrar todas las carreras.\n" +
                    "4. Buscar carrera.\n" +
                    "Introduzca la opción que desee ejecutar.");
            resp = leer.nextLine();

            switch(resp){
                case "1":
                    System.out.println("Introduce el nombre del corredor: ");
                    corredor1.setNombre(leer.nextLine());
                    System.out.println("Introduce los apellidos del corredor: ");
                    corredor1.setApellidos(leer.nextLine());
                    System.out.println("Introduce el DNI del corredor: ");
                    corredor1.setDni(leer.nextLine());
                    System.out.println("Introduce el télefono del corredor: ");
                    corredor1.setTelf(leer.nextLine());
                    System.out.println("Introduce el email del corredor: ");
                    corredor1.setEmail(leer.nextLine());
                    break;
                case "2":
                    System.out.println("Introduce el dódigo de la carrera");
                    String codigo = leer.nextLine();
                    System.out.println("Introduce la distancia de la carrera en metros");
                    int distancia = leer.nextInt();
                    System.out.println("Introduce el tiempo de la carrera en segundos");
                    int tiempo = leer.nextInt();
                    System.out.println("Introduce la pendiente media de la carrera");
                    byte pendienteMedia = leer.nextByte();
                    System.out.println("Introduce el dorsal de la carrera");
                    int dorsal = leer.nextInt();
                    corredor1.addCarrera(codigo, distancia, tiempo, pendienteMedia, dorsal);
                    break;
                case "3":
                    String[] carreras = corredor1.mostrarCarreras();
                    for (String carrera : carreras){
                        System.out.println(carrera);
                    }
                    break;
                case "4":
                    System.out.println("Introduce el código de la carrera que desea buscar");
                    String codigodelete = leer.nextLine();
                    Carrera carreraBuscada = corredor1.buscarCarrera(codigodelete);
                    System.out.println(carreraBuscada);
                    break;
                case "0":
                    continuar = false;
            }
        }while (continuar);
    }
}