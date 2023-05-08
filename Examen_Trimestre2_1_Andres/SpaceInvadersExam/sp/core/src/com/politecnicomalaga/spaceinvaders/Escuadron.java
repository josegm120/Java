package com.politecnicomalaga.spaceinvaders;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Escuadron {

    //Estado
    //posicion
    private int posX;
    private int posY;

    //velocidad
    private float velX;
    //tamaño de las naves
    private int w; //ancho de las naves
    private int h; //alto de las naves
    private int seg; //separación entre naves

    private String imgStr; //nombre del fichero que contiene la imagen de las naves



    //tamaño del escuadron
    private int anchoEscuadron;
    //Tamaño de la pantalla
    private int anchoPantalla;
    //cantidad de naves
    private int cantidadNaves;
    //Arrays con las naves
    private NaveEspacial[] malvadosAsociados;


    //Comportamiento
    //Constructor
    public Escuadron(int anchoPantalla, int posY, int w, int h, int anchoDisponible, String imgStr, float velX, int cantidadNaves) {
        this.cantidadNaves = cantidadNaves;
        this.anchoEscuadron = anchoDisponible;
        this.anchoPantalla = anchoPantalla;

        // -----*pX***************----- pX la mitad después de quitar al total el disponible
        //para mi escuadrón
        this.posX = (anchoPantalla-anchoDisponible)/2;

        malvadosAsociados = new NaveEspacial[cantidadNaves];
        this.velX = velX;

        //Tengo que crear 'cantidadNaves' naves...
        for(int i = 0;i<cantidadNaves;i++) {
            //float pX, float pY, float velX, String imgStr, float w, float h
            //primero cogemos la lista de naves y añadimos una nave por cada iteración
            malvadosAsociados[i] = new NaveEspacial(posX, posY, this.velX,imgStr,w,h);
            posX += (anchoDisponible/(cantidadNaves-1));

        }

        this.posX = (anchoPantalla-anchoDisponible)/2;

    }


    //Resto de comportamientos
    public void moverse() {
        //con un bucle recorremos el array de naves y les pedimos que se muevan
        for(NaveEspacial variable: this.malvadosAsociados) {
            variable.moverse();
        }

        posX += velX;

        //¿Se habrá tocado alguna nave el borde de la pantalla?
        if(posX < 0 || (posX + anchoEscuadron) >= anchoPantalla) {
            //cambiar la velocidad de todos
            velX = velX * -1;
            for(NaveEspacial variable: this.malvadosAsociados) {
                variable.setVelX(velX);
            }
        }
    }

    public void render(SpriteBatch sp) {
        for(NaveEspacial variable: this.malvadosAsociados) {
            variable.render(sp);
        }
    }

    public void dispose() {
        for(NaveEspacial variable: this.malvadosAsociados) {
            variable.dispose();
        }
    }





}
