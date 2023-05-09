import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean salir = false;

        //Oficina
        String codOficina;
        String nombreOficina;
        String direccionOficina;
        String ciudadOficina;
        String cpOficina;
        String telfOficina;
        String emailOficina;

        //Cliente
        String dniCliente;
        String cod_poliza_cliente;
        String nombreCliente;
        String apellidosCliente;
        String direccionCliente;
        String emailCliente;
        String telfCliente;


        System.out.println("Primero necesitas crear tu oficina");
        System.out.println("Introduce el código de la oficina: ");
        codOficina=leer.nextLine();
        leer.nextLine();
        System.out.println("Introduce el nombre de la oficina: ");
        nombreOficina=leer.nextLine();
        leer.nextLine();
        System.out.println("Introduce la dirección de la oficina: ");
        direccionOficina=leer.nextLine();
        leer.nextLine();
        System.out.println("Introduce la ciudad de la oficina: ");
        ciudadOficina=leer.nextLine();
        leer.nextLine();
        System.out.println("Introduce el código postal de la oficina: ");
        cpOficina=leer.nextLine();
        leer.nextLine();
        System.out.println("Introduce el teléfono de la oficina: ");
        telfOficina=leer.nextLine();
        leer.nextLine();
        System.out.println("Introduce el email de la oficina: ");
        emailOficina=leer.nextLine();
        leer.nextLine();

        Oficina miOficina = new Oficina(codOficina, nombreOficina, direccionOficina, ciudadOficina, cpOficina, telfOficina, emailOficina);

        while (!salir) {
            System.out.println("1. Modificar Oficina");
            System.out.println("2. Añadir Cliente");
            System.out.println("3. Eliminar Cliente");
            System.out.println("4. Actualizar Cliente");

            int opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el código de la oficina: ");
                    codOficina=leer.nextLine();
                    miOficina.setCodOficina(codOficina);
                    leer.nextLine();
                    System.out.println("Introduce el nombre de la oficina: ");
                    nombreOficina=leer.nextLine();
                    miOficina.setNombreOficina(nombreOficina);
                    leer.nextLine();
                    System.out.println("Introduce la dirección de la oficina: ");
                    direccionOficina=leer.nextLine();
                    miOficina.setDireccionOficina(direccionOficina);
                    leer.nextLine();
                    System.out.println("Introduce la ciudad de la oficina: ");
                    ciudadOficina=leer.nextLine();
                    miOficina.setCiudadOficina(ciudadOficina);
                    leer.nextLine();
                    System.out.println("Introduce el código postal de la oficina: ");
                    cpOficina=leer.nextLine();
                    miOficina.setCpOficina(cpOficina);
                    leer.nextLine();
                    System.out.println("Introduce el teléfono de la oficina: ");
                    telfOficina=leer.nextLine();
                    miOficina.setTelfOficina(telfOficina);
                    leer.nextLine();
                    System.out.println("Introduce el email de la oficina: ");
                    emailOficina=leer.nextLine();
                    miOficina.setEmailOficina(emailOficina);
                    leer.nextLine();
                    break;
                case 2:
                    System.out.println("Introduce el dni del cliente");
                    dniCliente=leer.nextLine();
                    System.out.println("Introduce el codigo de poliza del cliente");
                    cod_poliza_cliente=leer.nextLine();
                    System.out.println("Introduce el nombre del cliente");
                    nombreCliente=leer.nextLine();
                    System.out.println("Introduce los apellidos del cliente");
                    apellidosCliente=leer.nextLine();
                    System.out.println("Introduce la dirreccion del cliente");
                    direccionCliente=leer.nextLine();
                    System.out.println("Introduce el email del cliente");
                    emailCliente=leer.nextLine();
                    System.out.printf("Introduce el telefono del cliente");
                    telfCliente=leer.nextLine();

                    boolean resultado = miOficina.addCliente(dniCliente, cod_poliza_cliente, nombreCliente, apellidosCliente, direccionCliente, emailCliente, telfCliente);

                    if(resultado==true){
                        System.out.println("Se ha creado el cliente");
                    }else{
                        System.out.println("Cliente existente");
                    }

                    break;
                case 3:

                    leer.nextLine();
                    System.out.println("Introduce el dni del cliente que desea eliminar: ");
                    dniCliente= leer.nextLine();
                    leer.nextLine();
                    String resultado2=miOficina.deleteCliente(dniCliente);

                    System.out.println(resultado2);

                    break;
                case 4:

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
        leer.close();

    }
}