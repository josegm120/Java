/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.banco;

import java.util.ArrayList;

/**
 *
 * @author mint
 */
public class CuentaBancaria {
    
    protected String dniTitular, nombre, email, telefono, iban;
    protected float saldo;
    protected ArrayList<Operacion> operaciones;

    public CuentaBancaria(String dniTitular, String nombre, String email, String telefono, String iban) {
        this.dniTitular = dniTitular;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.iban = iban;
        this.saldo = 0;
        this.operaciones = new ArrayList<>();
    }
    
    public boolean addOperacion(String fecha, String concepto, byte hora, float cantidad){
        if(fecha == null || fecha.isEmpty() || concepto == null || concepto.isEmpty() || hora < 0){
            return false;
        }             
        if(cantidad < 0){
            saldo -= cantidad;
        }else{
            saldo += cantidad;
        }
        
        Operacion operacion = new Operacion(fecha, concepto, hora, cantidad);
        this.operaciones.add(operacion);
        return true;
    }

    public String getDniTitular() {
        return dniTitular;
    }

    public void setDniTitular(String dniTitular) {
        this.dniTitular = dniTitular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }            
}
