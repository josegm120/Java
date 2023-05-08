package com.politecnicomalaga.spaceinvaders;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Enemigo extends ObjetoVolador {

    private static final float VEL_ENEMIGO = 3f;

    public Enemigo(float pX, float pY, String img) {
        super(pX, pY, VEL_ENEMIGO, 0, img, 60, 60);
    }

    @Override
    public void moverse() {
        super.moverse();
        if (posX - Gdx.graphics.getWidth() / 2 >= Gdx.graphics.getWidth() / 2 - 60) {
            velX = -VEL_ENEMIGO;
        } else if (posX < 0) {
            velX = VEL_ENEMIGO;
        }
    }

    @Override
    public void render(SpriteBatch sp) {
        super.render(sp);
    }
}