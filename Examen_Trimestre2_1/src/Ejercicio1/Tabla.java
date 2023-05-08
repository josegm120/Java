package Ejercicio1;

import java.util.Random;

public class Tabla {

    //Atributos
    private double[][] tabla;
    private int numFilas;
    private int numColumnas;
    private double numMaximo;
    private double numMinimo;
    private int posMaxFila;
    private int posMaxColumna;
    private int posMinFila;
    private int posMinColumna;

    //Constructor
    public Tabla(int numFilas, int numColumnas) {
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;
        this.tabla = new double[numFilas][numColumnas];
    }

    //Métodos
    public void inicializarTabla() {
        Random rand = new Random();
        numMaximo = Double.MIN_VALUE;
        numMinimo = Double.MAX_VALUE;

        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                tabla[i][j] = rand.nextDouble() * 1000.0;
                if (tabla[i][j] > numMaximo) {
                    numMaximo = tabla[i][j];
                    posMaxFila = i;
                    posMaxColumna = j;
                }
                if (tabla[i][j] < numMinimo) {
                    numMinimo = tabla[i][j];
                    posMinFila = i;
                    posMinColumna = j;
                }
            }
        }
    }


    public void imprimirTabla() {
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                System.out.printf("%.2f ", tabla[i][j]);
            }
            System.out.println();
        }
    }

    public void imprimirValorMaximo() {
        System.out.println("El valor máximo generado es " + numMaximo + " en la posición [" + posMaxFila + "," + posMaxColumna + "]");
    }

    public void imprimirValorMinimo() {
        System.out.println("El valor mínimo generado es " + numMinimo + " en la posición [" + posMinFila + "," + posMinColumna + "]");
    }
}
