package com.politecnicomalaga.spaceinvaders;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.ArrayList;
import java.util.Random;

public class GDXSpaceInvaders extends ApplicationAdapter {

	//ESTADO
	private SpriteBatch batch;
	private ObjetoVolador ovni;
	//private NaveEspacial player;
	//private ArrayList<DisparoAmigo> rafagaAmiga;
	//private ArrayList<NaveEnemiga> escuadron;
	//private int pasos;
	//private int zonaDerecha;
	//private int zonaIzq;


	//COMPORTAMIENTO

	//RESTO COMPORTAMIENTOS

	//¿CONSTRUCTOR? NO TENGO, pero me dicen que create hace las veces de contructor
	@Override
	public void create () {
		int x,y;
		Random r = new Random();

		batch = new SpriteBatch();
		ovni = new ObjetoVolador(r.nextInt(50)+50,r.nextInt(100)+100,0,0,"nave.png",60,60);







	}

	@Override
	public void render () {

		Random r = new Random();

		//Controlar lo que pasa
		ovni.acelX(0.002f);
		ovni.acelY(0.002f);
		ovni.moverse();
		//dibujar despues
		ScreenUtils.clear(0f, 0f, 0f, 1);

		batch.begin();
		ovni.render(batch);
		batch.end();


	}
	
	@Override
	public void dispose () {
		batch.dispose();

	}

}
