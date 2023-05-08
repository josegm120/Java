package com.politecnicomalaga;

public class CocheMain {
    public static void main(String[] args) {

        String coche = "alfa romeo";
        Coche cocheObj = new CocheHibrido();

        Coche cocheObj2 = new CocheElectrico("rojo", "honda", "civic", 143.45, 5.4, "motor");

        cocheObj2.acelerar(50);

        System.out.println(cocheObj2);

        cocheObj2.peso = 1350.8;

        System.out.println(cocheObj2);

        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico = "Ejemplo motor";
        cocheElectrico.color = "verde";
        cocheElectrico.fabricante = "Honda";
        cocheElectrico.modelo = "civic";

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2 = new CocheElectrico("azul", "alfa", "romeo", 1500d, 4.99, "TXZ");

        System.out.println(cocheElectrico2);

        cocheElectrico2.acelerar(50);

        System.out.println(cocheElectrico2);
    }
}