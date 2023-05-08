package com.politecnicomalaga.interfaces;

import com.politecnicomalaga.Coche;

public class InterfacesMain {
    public static void main(String[] args) {

        CocheService service = new CocheServiceClassicImpl();

        Coche coche1 = service.crearCocheDemo();
    }
}