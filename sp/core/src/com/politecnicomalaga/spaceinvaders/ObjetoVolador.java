package com.politecnicomalaga.spaceinvaders;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class ObjetoVolador {

    //Atributos

    protected float posX, posY;
    protected Texture img;
    protected float velX, velY;
    protected float width, height;

    protected float anchoDiv2, altoDiv2;

    //Métodos
    //Constructor
    public ObjetoVolador(float pX, float pY, float vX, float vY, String imgStr, float w, float h) {
        img = new Texture(imgStr);
        this.init(pX,pY,vX,vY,w,h);
    }

    public ObjetoVolador(float pX, float pY, float vX, float vY, Texture img, float w, float h) {
        this.img = img;
        this.init(pX,pY,vX,vY,w,h);
    }

    private void init(float pX, float pY, float vX, float vY, float w, float h) {
        posX = pX;
        posY = pY;
        velX = vX;
        velY = vY;
        width = w;
        height = h;
    }

    //Resto de Métodos
    public void render(SpriteBatch sp) {

        sp.draw(img,posX,posY,width,height);
    }

    public void moverse() {
        posX += velX;
        posY += velY;
    }

    public float getPosX() {
        return posX;
    }

    public float getPosY() {
        return posY;
    }

    public float getVelX() {
        return velX;
    }

    public float getVelY() {
        return velY;
    }

    public void setVelX(float velX) {
        this.velX = velX;
    }

    public void setVelY(float velY) {
        this.velY = velY;
    }

    public void acelX(float acelX) {
        velX += acelX;
    }

    public void acelY(float acelY) {
        velY += acelY;
    }

    public void dispose() {
        if (img != null) {
            img.dispose();
        }
    }

    public float getAnchoDiv2() {
        return anchoDiv2;
    }

    public float getAltoDiv2() {
        return altoDiv2;
    }

    //Colisiones
    public boolean colisiona(ObjetoVolador otro) {
        //Columnas
        boolean resultado,colisionX,colisionY;
        colisionX = (Math.abs(posX - otro.getPosX()) <= (anchoDiv2 + otro.getAnchoDiv2()));
        colisionY = (Math.abs(posY - otro.getPosY()) <= (altoDiv2 + otro.getAltoDiv2()));
        resultado = colisionX && colisionY;

        return resultado;
    }
}