/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga.banco;

/**
 *
 * @author mint
 */
public class Operacion {
    
    private String fecha, concepto;
    private byte hora;
    private float cantidad;

    public Operacion(String fecha, String concepto, byte hora, float cantidad) {
        this.fecha = fecha;
        this.concepto = concepto;
        this.hora = hora;
        this.cantidad = cantidad;
    }
    
    
}
