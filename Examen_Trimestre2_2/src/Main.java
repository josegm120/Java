import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Boolean continuar = true;
        Boolean continuar2 = true;

        String direccionOficina="", codigoOficina="", telefonoOficina="", emailOficina="", cpOficina="", ciudadOficina="";
        Oficina oficina = new Oficina(direccionOficina, codigoOficina, telefonoOficina, emailOficina, cpOficina, ciudadOficina);

        String dni="";
        String nombre="";
        String email="";
        String telf="";
        String iban="";
        float hipotecaMensual= 0.0f;

        String fecha;
        int hora;
        String iban2 ="";
        float cantidad;





        do {
            System.out.println("Programa prototipo de gestión bancaria:\n" +
                    "0. Salir\n" +
                    "1. Crear oficina/Modificar datos de oficina.\n" +
                    "2. Dar de alta una cuenta.\n" +
                    "3. Cerrar una cuenta.\n" +
                    "4. Buscar una cuenta\n" +
                    "5. Listar todas las cuentas\n" +
                    "Introduzca la opción que desee ejecutar.");
            int resp = leer.nextInt();

            switch(resp){
                case 1:
                    System.out.println("Introduce la dirección de la oficina");
                    direccionOficina = leer.nextLine();
                    oficina.setDireccion(direccionOficina);
                    System.out.println("Introduce el codigo de la oficina");
                    oficina.setCod_of(codigoOficina);
                    System.out.println("Introduce el teléfono de la oficina");
                    oficina.setTelf(telefonoOficina);
                    System.out.println("Introduce el email de la oficina");
                    oficina.setEmail(emailOficina);
                    System.out.println("Introduce el codigo postal de la oficina");
                    oficina.setCp_of(cpOficina);
                    System.out.println("Introduce la ciudad de la oficina");
                    oficina.setCiudad(ciudadOficina);
                    break;
                case 2:
                    System.out.println("Qur tipo de cuenta desea crear?\n" +
                            "1. Cuenta Ahorro\n" +
                            "2. Cuenta Hipoteca\n" +
                            "3. Cuenta Depósito\n" +
                            "Introduzca la opción que desee ejecutar.");
                    resp = leer.nextInt();

                    switch(resp){
                        case 1:
                            System.out.println("Introduce el dni");
                            dni = leer.nextLine();
                            System.out.println("Introduce el nombre");
                            nombre=leer.nextLine();
                            System.out.println("Introduce el email");
                            email=leer.nextLine();
                            System.out.println("Introduce el telefono");
                            telf=leer.nextLine();
                            System.out.println("Introduce el iban");
                            iban=leer.nextLine();
                            CuentaAhorro cuenta_ahorro = new CuentaAhorro(dni, nombre, email, telf, iban);
                            oficina.cuentas.add(cuenta_ahorro);
                        case 2:
                            System.out.println("Introduce el dni");
                            dni = leer.nextLine();
                            System.out.println("Introduce el nombre");
                            nombre=leer.nextLine();
                            System.out.println("Introduce el email");
                            email=leer.nextLine();
                            System.out.println("Introduce el telefono");
                            telf=leer.nextLine();
                            System.out.println("Introduce el iban");
                            iban=leer.nextLine();
                            System.out.println("Introduce la hipoteca mensual");
                            hipotecaMensual=leer.nextFloat();
                            CuentaHipoteca cuenta_hipoteca = new CuentaHipoteca(dni, nombre, email, telf, iban, hipotecaMensual);
                            oficina.cuentas.add(cuenta_hipoteca);
                        case 3:
                            System.out.println("Introduce el dni");
                            dni = leer.nextLine();
                            System.out.println("Introduce el nombre");
                            nombre=leer.nextLine();
                            System.out.println("Introduce el email");
                            email=leer.nextLine();
                            System.out.println("Introduce el telefono");
                            telf=leer.nextLine();
                            System.out.println("Introduce el iban");
                            iban=leer.nextLine();
                            CuentaDeposito cuenta_deposito = new CuentaDeposito(dni, nombre, email, telf, iban);
                            oficina.cuentas.add(cuenta_deposito);
                        default:
                            continuar=false;
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Introduce el IBAN de la cuenta que desea eliminar");
                    String resp2 = leer.nextLine();
                    oficina.borrarCuenta(resp2);
                    break;
                case 4:
                    System.out.println("Introduce el Iban de la cuenta que está buscando");
                    resp2=leer.nextLine();
                    CuentaBancaria cuenta = oficina.buscarCuenta(iban);
                    do{
                        System.out.println("IBAN: "+resp2+" Saldo: "+oficina.buscarCuenta(resp2).getSaldo()+" €\n" +
                                "Operación a realizar:\n" +
                                "0. Volver atrás\n" +
                                "1. Retirar dinero de nuestra cuenta\n" +
                                "2. Ingresar dinero en nuestra cuenta\n" +
                                "3. Transferir dinero de nuestra cuenta a otra.\n" +
                                "4. Recibir dinero de otra cuenta a la nuestra.\n" +
                                "5. Ajustar intereses\n" +
                                "6. Calcular retención mensual hipoteca");
                        resp=leer.nextInt();

                        switch(resp){
                            case 1:
                                System.out.println("Introduzca fecha:");
                                fecha = leer.nextLine();
                                System.out.println("Introduzca hora:");
                                hora = leer.nextByte();
                                System.out.println("Introduce el iban");
                                iban = leer.nextLine();
                                System.out.println("Introduzca cantidad:");
                                cantidad = leer.nextFloat();

                                if(cuenta.hacerOperacion(fecha, hora, iban2, cantidad)){
                                    System.out.println("Operación realizada con éxito.");
                                }else{
                                    System.out.println("Alguno de los datos introducidos es erróneo.");
                                }
                                break;
                            case 2:
                                System.out.println("Introduzca fecha:");
                                fecha = leer.nextLine();
                                System.out.println("Introduzca hora:");
                                hora = leer.nextByte();
                                System.out.println("Introduce el iban");
                                iban = leer.nextLine();
                                System.out.println("Introduzca cantidad:");
                                cantidad = leer.nextFloat();

                                if(cuenta.hacerOperacion(fecha, hora, iban2, cantidad)){
                                    System.out.println("Operación realizada con éxito.");
                                }else{
                                    System.out.println("Alguno de los datos introducidos es erróneo.");
                                }
                                break;
                            case 3:
                                System.out.println("Introduzca fecha:");
                                fecha = leer.nextLine();
                                System.out.println("Introduzca hora:");
                                hora = leer.nextByte();
                                System.out.println("Introduce el iban");
                                iban = leer.nextLine();
                                System.out.println("Introduzca cantidad:");
                                cantidad = leer.nextFloat();

                                if(cuenta.hacerOperacion(fecha, hora, iban2, cantidad)){
                                    System.out.println("Operación realizada con éxito.");
                                }else{
                                    System.out.println("Alguno de los datos introducidos es erróneo.");
                                }
                                break;
                            case 4:
                                System.out.println("Introduzca fecha:");
                                fecha = leer.nextLine();
                                System.out.println("Introduzca hora:");
                                hora = leer.nextByte();
                                System.out.println("Introduce el iban");
                                iban = leer.nextLine();
                                System.out.println("Introduzca cantidad:");
                                cantidad = leer.nextFloat();

                                if(cuenta.hacerOperacion(fecha, hora, iban2, cantidad)){
                                    System.out.println("Operación realizada con éxito.");
                                }else{
                                    System.out.println("Alguno de los datos introducidos es erróneo.");
                                }
                                break;
                            case 5:
                            case 6:
                            default:
                                continuar2=false;
                        }
                    }while(continuar2);
                    break;
                case 5:
                    oficina.listarCuentas();
                    break;
                default:
                    continuar = false;
                    break;
            }
        }while(continuar);
    }
}