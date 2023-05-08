/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.banco;

/**
 *
 * @author mint
 */
public class Deposito extends CuentaBancaria{

    private float interesAnual;

    public Deposito(String dniTitular, String nombre, String email, String telefono, String iban) {
        super(dniTitular, nombre, email, telefono, iban);
        this.interesAnual = 0.4f;
    }

    @Override
    public boolean addOperacion(String fecha, String concepto, byte hora, float cantidad) {
        if(fecha == null || fecha.isEmpty() || concepto == null || concepto.isEmpty() || hora < 0){
            return false;
        }             
        if(cantidad < 0){
            return false;
        }else{
            saldo += cantidad;
        }
        
        Operacion operacion = new Operacion(fecha, concepto, hora, cantidad);
        this.operaciones.add(operacion);
        return true;
    }
    
    public void ajustarInteres(){
        saldo -= interesAnual*saldo;
    }
    
}
