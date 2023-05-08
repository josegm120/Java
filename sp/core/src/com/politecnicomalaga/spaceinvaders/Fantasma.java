package com.politecnicomalaga.spaceinvaders;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Fantasma extends ObjetoVolador{

    private int anchoPantalla;
    private int altoPantalla;
    public Fantasma(int anchoPantalla, int altoPantalla, float pX, float pY, float vX, float vY, String imgStr, float w, float h) {
        super(pX,pY,vX,vY,imgStr,w,h);
        this.anchoPantalla = anchoPantalla;
        this.altoPantalla = altoPantalla;
    }

    public void render(SpriteBatch sp) {
        Color c = sp.getColor();
        sp.setColor(new Color(c.r,c.g,c.b,0.33f));
        sp.draw(img,posX-velX*10,posY-velY*10,width,height);
        sp.setColor(new Color(c.r,c.g,c.b,0.66f));
        sp.draw(img,posX-velX*5,posY-velY*5,width,height);
        sp.setColor(new Color(c.r,c.g,c.b,1f));
        sp.draw(img,posX,posY,width,height);
    }

    @Override
    public void moverse() {
        posX += velX;
        posY += velY;

        //¿Se habrá tocado alguna nave el borde de la pantalla?
        if(posX < 0 || posX + 80 > anchoPantalla) {
            //cambiar la velocidad de todos
            velX = velX * -1;
        }

        if(posY < 0 || posY + 80 > altoPantalla) {
            //cambiar la velocidad de todos
            velY = velY * -1;
        }
    }
}
