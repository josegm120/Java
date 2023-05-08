/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.politecnicomalaga.banco;

import java.util.Scanner;

/**
 *
 * @author mint
 */
public class Banco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean menu = true;
        String opcion;        
        
        //Oficina
        String direccion = "", codOficina = "", telefonoOf = "", emailOf = "", cp = "", ciudad = "";
        Oficina oficina = new Oficina(direccion, codOficina, telefonoOf, emailOf, cp, ciudad);
        
        //CuentaBancaria
        String dniTitular, nombre, emailTitular, telefonoTitular, iban;
        float hipotecaMensual;
        
        //Operacion
        String fecha, concepto;
        byte hora;
        float cantidad;
        
        while(menu){
            System.out.println("-------------------------------------------------");
            System.out.println("Programa prototipo de gestión bancaria:");
            System.out.println("");            
            System.out.println("0. SALIR.");
            System.out.println("1. Crear Oficina/Modificar datos de oficina.");
            System.out.println("2. Dar de alta una cuenta.");
            System.out.println("3. Cerrar una cuenta.");
            System.out.println("4. Buscar una cuenta.");
            System.out.println("5. Listar todas las cuentas.");            
            System.out.println("");
            System.out.println("Introduzca la opción que desee ejecutar:");
            
            opcion = sc.next();
            sc.reset();
            
            System.out.println("-------------------------------------------------");
            
            switch (opcion) {
                case "1":
                    System.out.println("Introduzca direccion:");
                    direccion = sc.next();
                    oficina.setDireccion(direccion);
                    sc.reset();
                    
                    System.out.println("Introduzca codigo oficina:");
                    codOficina = sc.next();
                    oficina.setCodOficina(codOficina);
                    sc.reset();
                    
                    System.out.println("Introduzca telefono:");
                    telefonoOf = sc.next();
                    oficina.setTelefono(telefonoOf);
                    sc.reset();
                    
                    System.out.println("Introduzca email:");
                    emailOf = sc.next();
                    oficina.setEmail(emailOf);
                    sc.reset();
                    
                    System.out.println("Introduzca código postal:");
                    cp = sc.next();
                    oficina.setCp(cp);
                    sc.reset();
                    
                    System.out.println("Introduzca ciudad:");
                    ciudad = sc.next();
                    oficina.setCiudad(ciudad);
                    sc.reset();
                    
                break;
                                                            
                case "2":                    
                        System.out.println("-------------------------------------------------");
                        System.out.println("");
                        System.out.println("Elija el tipo de cuenta que desee abrir:");
                        System.out.println("1. Ahorro.");
                        System.out.println("2. Hipoteca.");
                        System.out.println("3. Deposito.");
                        System.out.println("Otra tecla: Volver atrás.");
                        System.out.println("");
                        System.out.println("-------------------------------------------------");

                        opcion = sc.next();
                        sc.reset();

                        System.out.println("-------------------------------------------------");
                        
                        switch (opcion){
                            case "1":
                                System.out.println("Introduzca DNI:");
                                dniTitular = sc.next();
                                sc.reset();

                                System.out.println("Introduzca nombre:");
                                nombre = sc.next();
                                sc.reset();

                                System.out.println("Introduzca email:");
                                emailTitular = sc.next();
                                sc.reset();

                                System.out.println("Introduzca telefono:");
                                telefonoTitular = sc.next();
                                sc.reset();

                                System.out.println("Introduzca iban:");
                                iban = sc.next();
                                sc.reset();
                                
                                
                                Ahorro cuentaAhorro = new Ahorro(dniTitular, nombre, emailTitular, telefonoTitular, iban);                                
                                oficina.addCuentaBancaria(cuentaAhorro);
                                
                                break;
                                
                            case "2":
                                System.out.println("Introduzca DNI:");
                                dniTitular = sc.next();
                                sc.reset();

                                System.out.println("Introduzca nombre:");
                                nombre = sc.next();
                                sc.reset();

                                System.out.println("Introduzca email:");
                                emailTitular = sc.next();
                                sc.reset();

                                System.out.println("Introduzca telefono:");
                                telefonoTitular = sc.next();
                                sc.reset();

                                System.out.println("Introduzca iban:");
                                iban = sc.next();
                                sc.reset();
                                
                                System.out.println("Introduzca hipoteca mensual:");
                                hipotecaMensual = sc.nextFloat();
                                sc.reset();
                                                                
                                Hipoteca cuentaHipoteca = new Hipoteca(dniTitular, nombre, emailTitular, telefonoTitular, iban, hipotecaMensual);                                
                                oficina.addCuentaBancaria(cuentaHipoteca);
                                
                                break;
                            
                            case "3":
                                System.out.println("Introduzca DNI:");
                                dniTitular = sc.next();
                                sc.reset();

                                System.out.println("Introduzca nombre:");
                                nombre = sc.next();
                                sc.reset();

                                System.out.println("Introduzca email:");
                                emailTitular = sc.next();
                                sc.reset();

                                System.out.println("Introduzca telefono:");
                                telefonoTitular = sc.next();
                                sc.reset();

                                System.out.println("Introduzca iban:");
                                iban = sc.next();
                                sc.reset();
                                
                                
                                Deposito cuentaDeposito = new Deposito(dniTitular, nombre, emailTitular, telefonoTitular, iban);                                
                                oficina.addCuentaBancaria(cuentaDeposito);
                                
                                break;                                
                                
                            default:                                
                                break;
                        
                    }
                    break;
                    
                case "3":
                    System.out.println("Introduzca iban de la cuenta que desea cerrar:");
                    iban = sc.next();
                    sc.reset();
                    
                    if(oficina.deleteCuentaBancaria(iban)){
                        System.out.println("La cuenta se ha cerrado.");
                    }else{
                        System.out.println("La cuenta no existe o está en saldo negativo, no se puede cerrar.");
                    }
                    
                    break;

                case "4":
                    System.out.println("Introduzca iban de la cuenta que desea buscar:");
                    iban = sc.next();
                    sc.reset();
                    CuentaBancaria cuenta = oficina.buscarCuentaBancaria(iban);
                    System.out.println("IBAN: " + cuenta.getIban() + " Saldo: " + cuenta.getSaldo());
                    
                        System.out.println("");
                        System.out.println("Operación a realizar:");
                        System.out.println("0. Volver atrás.");
                        System.out.println("1. Retirar dinero de nuestra cuenta.");
                        System.out.println("2. Ingresar dinero en nuestra cuenta.");
                        System.out.println("3. Transferir dinero de nuestra cuenta a otra.");
                        System.out.println("4. Recibir dinero de otra cuenta a la nuestra..");
                        System.out.println("5. Ajustar intereses");
                        System.out.println("6. Calcular retención mensual hipoteca");
                        System.out.println("-------------------------------------------------");

                        opcion = sc.next();
                        sc.reset();

                        System.out.println("-------------------------------------------------");
                        
                        switch(opcion){
                            case "1":
                                System.out.println("Introduzca fecha:");
                                fecha = sc.next();
                                sc.reset();

                                concepto = "efectivo";

                                System.out.println("Introduzca hora:");
                                hora = sc.nextByte();
                                sc.reset();

                                System.out.println("Introduzca cantidad:");
                                cantidad = sc.nextFloat();
                                sc.reset();
                                
                                if(cuenta.addOperacion(fecha, concepto, hora, cantidad)){
                                    System.out.println("Operación realizada con éxito.");
                                }else{
                                    System.out.println("Alguno de los datos introducidos es erróneo.");
                                }
                                
                            break;
                            
                            case "2":
                                System.out.println("Introduzca fecha:");
                                fecha = sc.next();
                                sc.reset();

                                concepto = "efectivo";

                                System.out.println("Introduzca hora:");
                                hora = sc.nextByte();
                                sc.reset();

                                System.out.println("Introduzca cantidad:");
                                cantidad = sc.nextFloat();
                                sc.reset();
                                
                                if(cuenta.addOperacion(fecha, concepto, hora, cantidad)){
                                    System.out.println("Operación realizada con éxito.");
                                }else{
                                    System.out.println("Alguno de los datos introducidos es erróneo.");
                                }
                                
                            break;
                            
                            case "3":
                                System.out.println("Introduzca fecha:");
                                fecha = sc.next();
                                sc.reset();

                                System.out.println("Introduzca el iban de la cuenta a la que se va a hacer el ingreso:");
                                concepto = sc.next();
                                sc.reset();

                                System.out.println("Introduzca hora:");
                                hora = sc.nextByte();
                                sc.reset();

                                System.out.println("Introduzca cantidad:");
                                cantidad = sc.nextFloat();
                                sc.reset();
                                
                                if(cuenta.addOperacion(fecha, concepto, hora, cantidad)){
                                    System.out.println("Operación realizada con éxito.");
                                }else{
                                    System.out.println("Alguno de los datos introducidos es erróneo.");
                                }
                                
                            break;
                            
                            case "4":
                                System.out.println("Introduzca fecha:");
                                fecha = sc.next();
                                sc.reset();

                                System.out.println("Introduzca el iban de la cuenta a la que se va a hacer el ingreso:");
                                concepto = sc.next();
                                sc.reset();

                                System.out.println("Introduzca hora:");
                                hora = sc.nextByte();
                                sc.reset();

                                System.out.println("Introduzca cantidad:");
                                cantidad = sc.nextFloat();
                                sc.reset();
                                
                                if(cuenta.addOperacion(fecha, concepto, hora, cantidad)){
                                    System.out.println("Operación realizada con éxito.");
                                }else{
                                    System.out.println("Alguno de los datos introducidos es erróneo.");
                                }
                                
                            break;
                            
                            case "5":
                                if("class com.politecnicomalaga.banco.Ahorro".equals(cuenta.getClass().toString())){
                                    Ahorro miA = (Ahorro) cuenta;
                                    miA.ajustarInteres();
                                    System.out.println("Listo");  
                                    System.out.println("Saldo actual: " + miA.getSaldo());
                                }else if("class com.politecnicomalaga.banco.Deposito".equals(cuenta.getClass().toString())){
                                    Deposito miD = (Deposito) cuenta;
                                    miD.ajustarInteres();
                                    System.out.println("Listo");
                                    System.out.println("Saldo actual: " + miD.getSaldo());
                                }else{
                                    System.out.println("No se puede con este tipo de cuenta");
                                }   
                            break;
                            
                            case "6":
                                if("class com.politecnicomalaga.banco.Hipoteca".equals(cuenta.getClass().toString())){
                                    Hipoteca miH = (Hipoteca) cuenta;
                                    miH.cobrarHipoteca();
                                    System.out.println("Listo");  
                                    System.out.println("Saldo actual: " + miH.getSaldo());
                                }else{
                                    System.out.println("No se puede con este tipo de cuenta");
                                }   
                            break;
                            
                            default:
                                break;
                                
                    }
                    break;

                case "5":
                    if(oficina.listarCuentasBancarias().size() < 1){
                        System.out.println("No hay ninguna cuenta registrada.");
                    }else{
                        for(int i = 0; i < oficina.listarCuentasBancarias().size(); i++){
                            CuentaBancaria miC = oficina.listarCuentasBancarias().get(i); 
                            
                            System.out.println("[" + miC.getDniTitular() + ", " + miC.getNombre() + ", " + miC.getTelefono() + ", " + miC.getEmail() + ", " + miC.getIban() + "]");
                        }
                    }
                        
                    break;
                    
                default:
                    sc.close(); //Cierro la entrada de teclado.
                    menu = false;
                    break;
            }
        }
    }
}
