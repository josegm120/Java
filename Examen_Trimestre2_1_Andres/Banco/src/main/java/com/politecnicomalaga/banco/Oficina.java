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
public class Oficina {
    
    private String direccion, codOficina, telefono, email, cp, ciudad;
    private ArrayList<CuentaBancaria> cuentasBancarias;

    public Oficina(String direccion, String codOficina, String telefono, String email, String cp, String ciudad) {
        this.direccion = direccion;
        this.codOficina = codOficina;
        this.telefono = telefono;
        this.email = email;
        this.cp = cp;
        this.ciudad = ciudad;
        this.cuentasBancarias = new ArrayList<>();
    }
    
    public boolean addCuentaBancaria(CuentaBancaria cuenta){
        this.cuentasBancarias.add(cuenta);
        return true;
    }
    
    public ArrayList<CuentaBancaria> listarCuentasBancarias(){
        
        return cuentasBancarias;
    }
    
    public CuentaBancaria buscarCuentaBancaria(String iban){
        for(int i = 0; i < cuentasBancarias.size(); i++){
            CuentaBancaria cuenta = cuentasBancarias.get(i);         
            if(cuenta.getIban().equals(iban)){
                return cuenta;
            }
        }
        return null;
    }
    
    public boolean deleteCuentaBancaria(String iban){
        for(int i = 0; i < cuentasBancarias.size(); i++){
            CuentaBancaria cuenta = cuentasBancarias.get(i); 
            if(cuenta.getIban().equals(iban)){
                if(cuenta.getSaldo() < 0){
                    return false;
                }else{
                    cuentasBancarias.remove(i);
                    return true;
                }                
            }
        }
        return false;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodOficina() {
        return codOficina;
    }

    public void setCodOficina(String codOficina) {
        this.codOficina = codOficina;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<CuentaBancaria> getCuentasBancarias() {
        return cuentasBancarias;
    }

    public void setCuentasBancarias(ArrayList<CuentaBancaria> cuentasBancarias) {
        this.cuentasBancarias = cuentasBancarias;
    }
    
}
