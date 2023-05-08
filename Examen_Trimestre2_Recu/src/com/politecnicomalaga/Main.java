package com.politecnicomalaga;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean continuar = true;

        String nombreOficina="", codigoOficina="", direccionOficina="", emailOficina="", cpOficina="", ciudadOficina="", telfOficina="";
        String dniCliente="", cod_poliza_cliente="", nombreCliente="", apellidosCliente="", direccionCliente="", emailCliente="", telfCliente="";
        String fechaIncidencia="", horaIncidencia="", matriculaPropiaIncidencia="", matriculaAjenaIncidencia="", descripcionIncidencia="", codigoIncidencia="", dniAjenoIncidencias="";
        Oficina oficina = new Oficina(codigoOficina, nombreOficina, direccionOficina, ciudadOficina, cpOficina, telfOficina, emailOficina);
        int diasMaximoIncidencias;

        do{
            System.out.println("Selecciona la opcion deseada");
            System.out.println("1. Añadir/Modificar oficina");
            System.out.println("2. Dar de alta cliente");
            System.out.println("3. Listar Clientes");
            System.out.println("4. Eliminar cliente");
            System.out.println("5. Actualizar cliente");
            System.out.println("6. Buscar cliente");
            System.out.println("Pulse cualquier tecla para salir");
            String resp = leer.nextLine();

            switch(resp){
                case "1":
                    System.out.println("Introduce el codigo de la oficina ");
                    codigoOficina=leer.nextLine();
                    oficina.setCod_oficina(codigoOficina);
                    System.out.println("Introduce el nombre de la oficina");
                    nombreOficina=leer.nextLine();
                    oficina.setNombre(nombreOficina);
                    System.out.println("Introduce la dirrecion de la oficina");
                    direccionOficina = leer.nextLine();
                    oficina.setDireccion(direccionOficina);
                    System.out.println("Introduce la ciudad de la oficina ");
                    ciudadOficina=leer.nextLine();
                    oficina.setCiudad(ciudadOficina);
                    System.out.println("Introduce el codigo postal de la oficina");
                    cpOficina=leer.nextLine();
                    oficina.setCp_oficina(cpOficina);
                    System.out.println("Introduce el telefono de la oficina");
                    telfOficina = leer.nextLine();
                    oficina.setTelf(telfOficina);
                    System.out.println("Introduce el email de la oficina ");
                    emailOficina=leer.nextLine();
                    oficina.setEmail(emailOficina);
                    break;
                case "2":
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

                    oficina.altaCliente(dniCliente, cod_poliza_cliente, nombreCliente, apellidosCliente, direccionCliente, emailCliente, telfCliente);
                    break;
                case "3":
                    System.out.println(oficina.listarClientes());
                    break;
                case "4":
                    System.out.println("Introduce el dni del cliente que desae borrar");
                    dniCliente=leer.nextLine();
                    oficina.borrarCliente(dniCliente);
                case "5":
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

                    oficina.actualizarCliente(dniCliente, cod_poliza_cliente, nombreCliente, apellidosCliente, direccionCliente, emailCliente, telfCliente);
                    break;
                case "6":
                    System.out.println("Desea buscar el cliente por su dni o por su apellido??");
                    System.out.println("1. Por dni");
                    System.out.println("2. Por apellido");
                    resp=leer.nextLine();
                    switch(resp){
                        case "1":
                            System.out.println("Introduce el dni del cliente que busca");
                            dniCliente=leer.nextLine();
                            Cliente cliente1 = oficina.buscarClientePorDni(dniCliente);
                            System.out.println("Selecciona la opcion que desees");
                            System.out.println("1. Añadir Incidencia");
                            System.out.println("2. Listar Incidencias");
                            System.out.println("3. Borrar incidencia");
                            resp=leer.nextLine();
                            switch(resp){
                                case "1":
                                    System.out.println("Seleccione la incidencia que desee abrir:");
                                    System.out.println("Incidencia Urgente");
                                    System.out.println("Incidencia Ajena");
                                    resp=leer.nextLine();

                                    switch(resp){
                                        case "1":
                                            System.out.println("Introduce la fecha de la incidencia");
                                            fechaIncidencia=leer.nextLine();
                                            System.out.println("introduce la hora de la incidencia");
                                            horaIncidencia=leer.nextLine();
                                            System.out.println("Introduce la matricula propia de la incidencia");
                                            matriculaPropiaIncidencia=leer.nextLine();
                                            System.out.println("introduce la matricula ajena de la incidencia");
                                            matriculaAjenaIncidencia=leer.nextLine();
                                            System.out.println("Introduce la descripcion de la incidencia");
                                            descripcionIncidencia=leer.nextLine();
                                            System.out.println("Introduce los días maximos para resolver el incidente");
                                            diasMaximoIncidencias=leer.nextInt();
                                            cliente1.altaIncidenciaUrgente(fechaIncidencia, horaIncidencia, matriculaPropiaIncidencia, matriculaAjenaIncidencia, descripcionIncidencia, diasMaximoIncidencias, cliente1.crearCodigoIncidencia());
                                            break;
                                        case "2":
                                            System.out.println("Introduce la fecha de la incidencia");
                                            fechaIncidencia=leer.nextLine();
                                            System.out.println("introduce la hora de la incidencia");
                                            horaIncidencia=leer.nextLine();
                                            System.out.println("Introduce la matricula propia de la incidencia");
                                            matriculaPropiaIncidencia=leer.nextLine();
                                            System.out.println("introduce la matricula ajena de la incidencia");
                                            matriculaAjenaIncidencia=leer.nextLine();
                                            System.out.println("Introduce la descripcion de la incidencia");
                                            descripcionIncidencia=leer.nextLine();
                                            System.out.println("Introduce el dni del conductor ajeno");
                                            dniAjenoIncidencias=leer.nextLine();
                                            cliente1.altaIncidenciaAjena(fechaIncidencia, horaIncidencia, matriculaPropiaIncidencia, matriculaAjenaIncidencia, descripcionIncidencia, dniAjenoIncidencias, cliente1.crearCodigoIncidencia());
                                            break;
                                    }
                                    break;
                                case "2":
                                    System.out.println(cliente1.listarIncidencias());
                                    break;
                                case "3":
                                    System.out.println("introduce el codigo de la incidencia que desea borrar");
                                    codigoIncidencia=leer.nextLine();
                                    cliente1.borrarIncidencia(codigoIncidencia);
                                    break;
                            }
                            break;
                        case "2":
                            System.out.println("Introduce los apellidos del cliente que busca");
                            apellidosCliente=leer.nextLine();
                            Cliente[] cliente2 = new Cliente[]{oficina.buscarClientePorDni(apellidosCliente)};
                            System.out.println("Estos son los clientes que se han encontrado:");
                            System.out.println(cliente2);
                            System.out.println("Seleccione el cliente que desee tecleando su posicion comenzando desde 0");
                            int resp2 = leer.nextInt();
                            System.out.println("Selecciona la opcion que desees");
                            System.out.println("1. Añadir Incidencia");
                            System.out.println("2. Listar Incidencias");
                            System.out.println("3. Borrar incidencia");
                            resp=leer.nextLine();
                            switch(resp){
                                case "1":
                                    System.out.println("Seleccione la incidencia que desee abrir:");
                                    System.out.println("Incidencia Urgente");
                                    System.out.println("Incidencia Ajena");
                                    resp=leer.nextLine();

                                    switch(resp){
                                        case "1":
                                            System.out.println("Introduce la fecha de la incidencia");
                                            fechaIncidencia=leer.nextLine();
                                            System.out.println("introduce la hora de la incidencia");
                                            horaIncidencia=leer.nextLine();
                                            System.out.println("Introduce la matricula propia de la incidencia");
                                            matriculaPropiaIncidencia=leer.nextLine();
                                            System.out.println("introduce la matricula ajena de la incidencia");
                                            matriculaAjenaIncidencia=leer.nextLine();
                                            System.out.println("Introduce la descripcion de la incidencia");
                                            descripcionIncidencia=leer.nextLine();
                                            System.out.println("Introduce los días maximos para resolver el incidente");
                                            diasMaximoIncidencias=leer.nextInt();
                                            cliente2[resp2].altaIncidenciaUrgente(fechaIncidencia, horaIncidencia, matriculaPropiaIncidencia, matriculaAjenaIncidencia, descripcionIncidencia, diasMaximoIncidencias, cliente2[resp2].crearCodigoIncidencia());
                                            break;
                                        case "2":
                                            System.out.println("Introduce la fecha de la incidencia");
                                            fechaIncidencia=leer.nextLine();
                                            System.out.println("introduce la hora de la incidencia");
                                            horaIncidencia=leer.nextLine();
                                            System.out.println("Introduce la matricula propia de la incidencia");
                                            matriculaPropiaIncidencia=leer.nextLine();
                                            System.out.println("introduce la matricula ajena de la incidencia");
                                            matriculaAjenaIncidencia=leer.nextLine();
                                            System.out.println("Introduce la descripcion de la incidencia");
                                            descripcionIncidencia=leer.nextLine();
                                            System.out.println("Introduce el dni del conductor ajeno");
                                            dniAjenoIncidencias=leer.nextLine();
                                            cliente2[resp2].altaIncidenciaAjena(fechaIncidencia, horaIncidencia, matriculaPropiaIncidencia, matriculaAjenaIncidencia, descripcionIncidencia, dniAjenoIncidencias, cliente2[resp2].crearCodigoIncidencia());
                                            break;
                                    }
                                    break;
                                case "2" :
                                    System.out.println(cliente2[resp2].listarIncidencias());
                                    break;
                                case "3":
                                    System.out.println("introduce el codigo de la incidencia que desea borrar");
                                    codigoIncidencia=leer.nextLine();
                                    cliente2[resp2].borrarIncidencia(codigoIncidencia);
                                    break;
                            }
                    }
                    break;
                        default:
                            continuar=false;
                            break;
                    }
            }while (continuar);
        }
    }