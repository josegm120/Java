package com.politecnicomalaga.interfaces;

import com.politecnicomalaga.Coche;
import com.politecnicomalaga.CocheElectrico;
import com.politecnicomalaga.interfaces.CocheService;

public class CocheServiceClassicImpl implements CocheService {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("creando coche clasico");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruyendo coche");
    }
}