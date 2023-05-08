package com.politecnicomalaga.spaceinvaders;

public class NaveEspacial extends ObjetoVolador {

    //ESTADO

    //COMPORTAMIENTO
    //Constructor
    public NaveEspacial(float pX, float pY, float vX, String imgStr, float w, float h) {
        super(pX,pY,vX,0,imgStr,w,h);
    }

    @Override
    public void setVelY(float velY) {


    }

    @Override
    public void moverse() {
        posX += velX;
    }
}
