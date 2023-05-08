package com.politecnicomalaga.spaceinvaders;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Fantasma extends ObjetoVolador{

    public Fantasma(float pX, float pY, float vX, float vY, String imgStr, float w, float h) {
        super(pX,pY,vX,vY,imgStr,w,h);
    }

    @Override
    public void render(SpriteBatch sp) {
        Color c = sp.getColor();
        sp.setColor(new Color(c.r,c.g,c.b,0.33f));
        sp.draw(img,posX+(velX*10),posY+(velY*10),width,height);
        sp.setColor(new Color(c.r,c.g,c.b,0.66f));
        sp.draw(img,posX+(velX*5),posY+(velY*5),width,height);
        sp.setColor(new Color(c.r,c.g,c.b,1f));
        sp.draw(img,posX,posY,width,height);
    }
}
