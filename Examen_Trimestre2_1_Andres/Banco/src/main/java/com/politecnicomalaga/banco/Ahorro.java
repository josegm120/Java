/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.banco;

/**
 *
 * @author mint
 */
public class Ahorro extends CuentaBancaria{

    private float interesAnual;
    
    public Ahorro(String dniTitular, String nombre, String email, String telefono, String iban) {
        super(dniTitular, nombre, email, telefono, iban);
        this.interesAnual = 0.1f;
    }
    
    public void ajustarInteres(){
        saldo -= interesAnual*saldo;
    }
    
}
