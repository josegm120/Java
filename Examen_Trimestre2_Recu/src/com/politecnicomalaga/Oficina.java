package com.politecnicomalaga;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Oficina {
    //atributos
    private String cod_oficina;
    private String nombre;
    private String direccion;
    private String ciudad;
    private String cp_oficina;
    private String telf;
    private String email;
    private LinkedList<Cliente> clientes;

    //constructor
    public Oficina(String cod_oficina, String nombre, String direccion, String ciudad, String cp_oficina, String telf, String email) {
        this.cod_oficina = cod_oficina;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.cp_oficina = cp_oficina;
        this.telf = telf;
        this.email = email;
        this.clientes = new LinkedList<>();
    }

    //metodos

    public boolean altaCliente(String dni, String cod_poliza, String nombre, String apellidos, String direccion, String email, String telf){
        for(int i = 0; i < clientes.size(); i++){
            if(clientes.get(i).getDni().equalsIgnoreCase(dni)){
                System.out.println("Cliente existente");
                return false;
            }else {
                Cliente cuenta = new Cliente(dni, cod_poliza, nombre, apellidos, direccion, email, telf);
                clientes.add(cuenta);
                return true;
            }
        }
        return false;
    }

    public String[] listarClientes(){
        String[] listaClientes = new String[clientes.size()];
        for(int i = 0; i < clientes.size(); i++){
            listaClientes[i] = clientes.get(i).toString();
        }
        return listaClientes;
    }

    public Cliente borrarCliente(String dni){
        clientes.removeIf(cliente -> cliente.getDni().equalsIgnoreCase(dni));
        return null;
    }

    public Cliente actualizarCliente(String dni, String cod_poliza, String nombre, String apellidos, String direccion, String email, String telf){
        for(Cliente cliente : clientes){
            if(cliente.getDni().equalsIgnoreCase(dni)){
                cliente.setCod_poliza(cod_poliza);
                cliente.setNombre(nombre);
                cliente.setApellidos(apellidos);
                cliente.setDireccion(direccion);
                cliente.setEmail(email);
                cliente.setTelf(telf);
            }else {
                System.out.println("No se ha podido actualizar");
            }
        }
        return null;
    }

    public Cliente buscarClientePorDni(String dni){
        for(int i = 0; i < clientes.size(); i++){
            Cliente cliente = clientes.get(i);
            if(cliente.getDni().equalsIgnoreCase(dni)){
                return cliente;
            }
        }
        return null;
    }

    public Cliente buscarClientePorApellido(String apellido){
        for(int i = 0; i < clientes.size(); i++){
            Cliente cliente = clientes.get(i);
            if(cliente.getDni().equalsIgnoreCase(apellido)){
                return cliente;
            }
        }
        return null;
    }

    public String getCod_oficina() {
        return cod_oficina;
    }

    public void setCod_oficina(String cod_oficina) {
        this.cod_oficina = cod_oficina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCp_oficina() {
        return cp_oficina;
    }

    public void setCp_oficina(String cp_oficina) {
        this.cp_oficina = cp_oficina;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Oficina{" +
                "cod_oficina='" + cod_oficina + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", cp_oficina='" + cp_oficina + '\'' +
                ", telf='" + telf + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
